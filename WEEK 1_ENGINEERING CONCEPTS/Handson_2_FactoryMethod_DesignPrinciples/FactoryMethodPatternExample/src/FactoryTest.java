import excel.ExcelDocument;
import factory.ExcelDocumentFactory;
import factory.PDFdocumentFactory;
import factory.WordDocumentFactory;
import pdf.PDFdocument;
import word.WordDocument;

public class FactoryTest {
    public static void main(String[] args) {
        WordDocumentFactory word=new WordDocumentFactory();
        WordDocument wordDoc= word.createDocument();
        wordDoc.open();

        PDFdocumentFactory pdf=new PDFdocumentFactory();
        PDFdocument pdfDoc= pdf.createDocument();
        pdfDoc.open();

        ExcelDocumentFactory excel=new ExcelDocumentFactory();
        ExcelDocument excelDoc= excel.createDocument();
        excelDoc.open();
    }
}
