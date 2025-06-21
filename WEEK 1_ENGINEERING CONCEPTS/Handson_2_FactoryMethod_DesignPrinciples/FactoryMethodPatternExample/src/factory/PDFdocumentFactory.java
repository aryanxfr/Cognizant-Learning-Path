package factory;

import pdf.PDFdocument;
import pdf.PDFdocumentImplementation;

public class PDFdocumentFactory extends DocumentFactory {
    public PDFdocument createDocument(){
        return new PDFdocumentImplementation();
    }
}
