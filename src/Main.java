//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        int inteiros[][] = new int[3][3];

        inteiros[0][0] = 1;
        inteiros[0][1] = 2;
        inteiros[0][2] = 3;
        inteiros[1][0] = 4;
        inteiros[1][1] = 5;
        inteiros[1][2] = 6;
        inteiros[2][0] = 7;
        inteiros[2][1] = 8;
        inteiros[2][2] = 9;

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.print("Array " + (i+1) + ": " + inteiros[i][j] + " ");
            }
        }
    }
}