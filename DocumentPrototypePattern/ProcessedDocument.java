public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        // Create and open a PDF document
        PdfDocument pdf1 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        pdf1.open();

        System.out.println();

        // Create and open a Text document
        TextDocument text1 = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        text1.open();

        System.out.println();

        // Create and open a Spreadsheet document
        SpreadsheetDocument sheet1 = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        sheet1.open();

        System.out.println();

        // Clone PDF with different data (summary report with fewer pages)
        PdfDocument pdf2 = registry.createPdf("summary_report.pdf", "Acme Corp", 30, "Summary Report");
        pdf2.open();
    }
}