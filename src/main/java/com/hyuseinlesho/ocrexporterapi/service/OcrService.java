package com.hyuseinlesho.ocrexporterapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OcrService {

    @Value("${ocr.api.key}")
    private String ocrApiKey;


}
