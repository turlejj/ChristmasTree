import java.util.concurrent.TimeUnit;

public class Tree {
    private String symbol;
    private int limit;

    //constructor
    public Tree(String symbol) {
        this.symbol = symbol;
    }

    //ending note
    public static void christmasNote() {
        System.out.println("\n  \u2744\u2744 Ho Ho Ho Merry Christmas everyone! \u2744\u2744\n\n");
    }

    //christmas tree on screen
    public void onScreen(int limit) throws InterruptedException{
        this.limit = limit;

        for (int i = 1; i < this.limit; i += 2) {

            for (int k = 0; k < (4 - i / 2); k++)
                System.out.print("\t ");

            for (int j = 0; j < i; j++)
                System.out.print("\t" + this.symbol); TimeUnit.MILLISECONDS.sleep(500);

            System.out.println("\t");
        }
    }
    //trunk
    public void trunk() {
        for (int i = 0; i < 3; i++)
            System.out.println("\t\t\t\t\t\u07bb");
    }

}
