package org.example.abstractFactoryDocument;


import org.example.abstractFactoryDocument.parser.DocumentParser;
import org.example.abstractFactoryDocument.parser.SpreadsheetDocumentParser;
import org.example.abstractFactoryDocument.printer.DocumentPrinter;
import org.example.abstractFactoryDocument.printer.SpreadsheetDocumentPrinter;
import org.example.abstractFactoryDocument.processor.DocumentProcessor;
import org.example.abstractFactoryDocument.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory{
    @Override
    public DocumentType supportsType()
    {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createDocumentParser(String path)
    {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor)
    {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName)
    {
        return new SpreadsheetDocumentProcessor(documentName);
    }

}
