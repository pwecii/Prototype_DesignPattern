public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("default.pdf", "Unknown", 0, "Default PDF");

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("default.txt", "UTF-8", 0);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount, String name) {
        PdfDocument clone = pdfPrototype.clone();
        clone.setFileName(fileName);
        clone.setAuthor(author);
        clone.setPageCount(pageCount);
        clone.setName(name);
        return clone;
    }

    public TextDocument createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument clone = textDocumentPrototype.clone();
        clone.setFilePath(filePath);
        clone.setEncoding(encoding);
        clone.setWordCount(wordCount);
        return clone;
    }

    public SpreadsheetDocument createSpreadsheet(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument clone = spreadsheetPrototype.clone();
        clone.setSpreadsheetName(spreadsheetName);
        clone.setRowCount(rowCount);
        clone.setColumnCount(columnCount);
        return clone;
    }
}