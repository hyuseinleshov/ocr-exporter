package com.hyuseinlesho.ocrexporterapi.repository;

import com.hyuseinlesho.ocrexporterapi.model.OcrResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcrResultRepository extends JpaRepository<OcrResult, Long> {
}