package factory;

import excel.ExcelDocument;
import excel.ExcelDocumentImplementation;

public class ExcelDocumentFactory extends DocumentFactory {
    public ExcelDocument createDocument(){
        return new ExcelDocumentImplementation();
    }
}
