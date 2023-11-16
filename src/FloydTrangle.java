import java.util.Scanner;

public class FloydTrangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j;
        System.out.print("Enter Number of Row    : ");i = scan.nextInt();
        //System.out.print("Enter Number of Column : ");j = scan.nextInt();
        for(int ii = 0 ;ii < i ; ii ++){
            for (int jj = 0 ; jj < ii ; jj ++){
                System.out.print(jj+1 + " ");
            }
            System.out.println();
        }
    }
}
