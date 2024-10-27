package com.hyuseinlesho.ocrexporterapi.service;

import com.hyuseinlesho.ocrexporterapi.exception.FileStorageException;
import com.hyuseinlesho.ocrexporterapi.model.OcrResult;
import com.hyuseinlesho.ocrexporterapi.repository.OcrResultRepository;
import com.hyuseinlesho.ocrexporterapi.utils.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;

@Service
public class OcrService {

    @Value("${ocr.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    private final OcrResultRepository ocrResultRepository;

    public OcrService(OcrResultRepository ocrResultRepository) {
        this.ocrResultRepository = ocrResultRepository;
    }

    public String extractTextFromUrl(String fileUrl) {
        String apiUrl = "https://api.ocr.space/Parse/Image";

        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", apiKey);

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("url", fileUrl);
        body.add("isOverlayRequired", "false");
        body.add("language", "eng");

        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(body, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(apiUrl, requestEntity, String.class);

        // TODO Extract text from response
        return response.getBody();
    }

    public void saveAsText(String text, String location) {
        try {
            FileUtils.writeStringToFile(new File(location), text, "UTF-8");
        } catch (IOException e) {
            throw new FileStorageException("Could not save text to file: " + location, e);
        }
    }

    public void saveAsPdf(String text, String location) {
        // TODO Implement PDF generation
    }

    public void saveAsWord(String text, String location) {
        // TODO Implement Word generation
    }

    public void saveToDb(String text) {
        OcrResult result = new OcrResult();
        result.setExtractedText(text);
        ocrResultRepository.save(result);
    }
}
