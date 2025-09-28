package com.server.spring.boot.h2.utils;

import com.server.spring.boot.h2.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CsvGeneratorUtil {
    private static final String CSV_HEADER = "ID,Name,Description,Price,Date\n";

    public String generateCsv(List<Product> products) {
        StringBuilder csvContent = new StringBuilder();
        csvContent.append(CSV_HEADER);

        for (Product product : products) {
            csvContent.append(product.getId()).append(",")
                    .append(product.getName()).append(",")
                    .append(product.getDescription()).append(",")
                    .append(product.getPrice()).append(",")
                    .append(product.getCreatedAt()).append("\n");
        }

        return csvContent.toString();
    }
}
