/**
 * Created by kulanimakhubele on 15/04/15.
 */
public class IsoscelesTriangle {
    public static void main (String[] args){


        CreateIsoscelesTriangle(3);

    }

    public static String printAsterisk(int num){
        String str = "";
        for (int i = 0; i < num; i++)
        {
            str += "*";
        }
       return str;
    }

    public static String printEmptySpace(int num){
        String str = "";
        for (int i = 0; i < num; i++)
        {
            str += " ";
        }
        return str;
    }

    private static void CreateIsoscelesTriangle(int n) {

        int i = n-1, j = 1;

            while(i >= 0)
            {
                System.out.print(printEmptySpace(i) + printAsterisk(j) + printEmptySpace(i));
                System.out.println();
                i--;j +=2;
            }
        }

}
