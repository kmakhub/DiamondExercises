/**
 * Created by kulanimakhubele on 15/04/15.
 */
public class Diamond {

    public static void main (String[] args){


        CreateDiamondHead(3);
        CreateDiamondBottom(3);

    }

    public static void printAsterisk(int num){
        String str = "";
        for (int i = 0; i < num; i++)
        {
            str += "*";
        }
        System.out.print( str );
    }

    public static void printEmptySpace(int num){
        String str = "";
        for (int i = 0; i < num; i++)
        {
            str += " ";
        }
        System.out.print( str );
    }

    private static void CreateDiamondHead(int n) {

        for (int i = 1; i < n*2; i+=2 ) {
            for (int j = n - 1; j >= 0; j--) {
                printEmptySpace(j);
                printAsterisk(i);
                printEmptySpace(j);
                System.out.println();
                i += 2;
            }
        }
    }

    private static void CreateDiamondBottom(int n) {
        int j = 1;
        for (int i = n; i  >= 0; i -= 2 ) {
                printEmptySpace(j);
                printAsterisk(i);
                printEmptySpace(j);
                System.out.println();
            j++;
        }
    }

}
