package com.hyuseinlesho.ocrexporterapi.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static void writeStringToFile(File file, String data, String encoding) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
        }
    }
}
