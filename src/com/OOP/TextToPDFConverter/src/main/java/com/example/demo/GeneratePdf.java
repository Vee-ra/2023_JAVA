package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class GeneratePdf {

	public static void main(String[] args) throws FileNotFoundException {

		List<Map<String, String>> data = new ArrayList();

		Map<String, String> record1 = new LinkedHashMap();
		record1.put("Column 1", "data1");
		record1.put("Column 2", "data2");
		record1.put("Column 3", "data3");
		record1.put("Column 4", "data4");
		record1.put("Column 5", "data5");
		record1.put("Column 6", "data6");
		record1.put("Status", "Pass");
		data.add(record1);

		Map<String, String> record2 = new LinkedHashMap();
		record2.put("Column 1", "data7");
		record2.put("Column 2", "data8");
		record2.put("Column 3", "data9");
		record2.put("Column 4", "data10");
		record2.put("Column 5", "data11");
		record2.put("Column 6", "data12");
		record2.put("Status", "Fail");
		data.add(record2);

		Map<String, String> record3 = new LinkedHashMap();
		record3.put("Column 1", "data13");
		record3.put("Column 2", "data14");
		record3.put("Column 3", "data15");
		record3.put("Column 4", "data16");
		record3.put("Column 5", "data17");
		record3.put("Column 6", "data18");
		record3.put("Status", "Null");
		data.add(record3);

		String path = "output.pdf";

		PdfWriter pdfWriter = new PdfWriter(path);
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.setDefaultPageSize(PageSize.A4);
		Document document = new Document(pdfDocument);
		// document.add(new Paragraph("Hello Coding error"));

		// Load the NSimSun font
		PdfFont nsimSunFont = null;
		try {
			nsimSunFont = PdfFontFactory.createFont("C:\\MyFiles\\FCC\\workspace\\demo\\simsun.ttf",
					PdfFontFactory.EmbeddingStrategy.PREFER_EMBEDDED);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Add a title to the document with NSimSun font
		document.add(new Paragraph("Data Table").setFont(nsimSunFont).setBold().setFontSize(20));

		Table table = new Table(7);

		for (String header : data.get(0).keySet()) {
			table.addHeaderCell(new Cell().add(new Paragraph(header).setFont(nsimSunFont).setBold().setFontSize(18)));
		}

		// Add rows from the data list
		for (Map<String, String> record : data) {
            for (Map.Entry<String, String> entry : record.entrySet()) {
                Cell cell = new Cell().add(new Paragraph(entry.getValue()).setFont(nsimSunFont).setBold().setFontSize(16));
                customizeCellBasedOnStatus(cell, entry.getKey(), entry.getValue());
                table.addCell(cell);
            }
        }

		// Add the table to the document
		document.add(table);

		document.close();

		System.out.println("PDF created successfully.");

	}

	private static void customizeCellBasedOnStatus(Cell cell, String key, String value) {
		
		if ("Status".equals(key)) {
			DeviceRgb color;
			switch (value) {
			case "Pass":
				color = new DeviceRgb(144, 238, 144); // Green color
				break;
			case "Fail":
				color = new DeviceRgb(255, 99, 71); // Red color
				break;
			case "Null":
				color = new DeviceRgb(255, 250, 205); // Lemon color
				break;
			default:
				color = new DeviceRgb(255, 255, 255); // Default to white if none match
				break;
			}
			cell.setBackgroundColor(color);
		}
	}
	
}