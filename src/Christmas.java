import java.util.concurrent.TimeUnit;

public class Christmas {
    public static void main(String[] args) throws InterruptedException{

        Tree christmasTree = new Tree("\u2605");

        christmasTree.onScreen(6);
        christmasTree.onScreen(8);
        christmasTree.onScreen(10);
        christmasTree.trunk();

        TimeUnit.SECONDS.sleep(1);
        christmasTree.christmasNote();
    }
}
