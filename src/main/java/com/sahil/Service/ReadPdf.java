//package com.sahil.Service;
//
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
//import java.io.File;
//import java.io.IOException;
//
//public class ReadPDF {
//    public static void main(String[] args) {
//        String filePath = "DSA.pdf"; // Ensure the correct file path
//
//        try (PDDocument document = PDDocument(new File(filePath))) {
//            if (!document.isEncrypted()) {
//                PDFTextStripper pdfStripper = new PDFTextStripper();
//                String text = pdfStripper.getText(document);
//                System.out.println("PDF Content:\n" + text);
//            } else {
//                System.out.println("PDF is encrypted and cannot be read.");
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading PDF: " + e.getMessage());
//        }
//    }
//}
