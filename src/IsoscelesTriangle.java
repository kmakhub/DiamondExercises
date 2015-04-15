/**
 * Created by kulanimakhubele on 15/04/15.
 */
public class IsoscelesTriangle {
    public static void main (String[] args){


        CreateIsoscelesTriangle(3);

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

    private static void CreateIsoscelesTriangle(int n) {

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

}
