package org.example.abstractFactoryDocument.printer;

import org.example.abstractFactoryDocument.DocumentType;
import org.example.abstractFactoryDocument.processor.DocumentProcessor;

    public class TextDocumentPrinter extends DocumentPrinter {

        public TextDocumentPrinter(DocumentProcessor processor) {
            super(processor);
        }

        public void printDocument() {
            // Print text document
        }

        @Override
        public DocumentType supportsType() {
            return DocumentType.TEXT;
        }
    }

