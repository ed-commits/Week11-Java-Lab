public class Printer {
    private int sheetsLeft;
    private double toner;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
        this.toner = 1000;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public void print(int numPages, int numCopies) {
        int printCount = numPages * numCopies;

        /*
        if(printCount > this.sheetsLeft) {
            printCount = this.sheetsLeft;
        }
         */

        if(printCount <= this.sheetsLeft) {
            this.sheetsLeft -= printCount;
            this.toner -= 1 * printCount;
        }
        else {
            // no printing happens
        }
    }


}
