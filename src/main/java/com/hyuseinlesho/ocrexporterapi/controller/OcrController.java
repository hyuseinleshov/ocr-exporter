package com.hyuseinlesho.ocrexporterapi.controller;

import com.hyuseinlesho.ocrexporterapi.service.OcrService;
import org.springframework.web.bind.annotation.*;

@RestController
public class OcrController {
    private final OcrService ocrService;

    public OcrController(OcrService ocrService) {
        this.ocrService = ocrService;
    }

    @PostMapping("/ocr-export")
    public String exportOcrResult(@RequestParam String url,
                                  @RequestParam String format,
                                  @RequestParam String location) {
        String extractedText = ocrService.extractTextFromUrl(url);

        switch (format) {
            case "text":
                ocrService.saveAsText(extractedText, location);
                break;
            case "pdf":
                ocrService.saveAsPdf(extractedText, location);
                break;
            case "word":
                ocrService.saveAsWord(extractedText, location);
                break;
            case "db":
                ocrService.saveToDb(extractedText);
                break;
            default:
                return "Unsupported format!";
        }

        return "OCR export successful!";
    }
}
