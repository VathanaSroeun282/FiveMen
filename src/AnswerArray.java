public class AnswerArray
{
    public static void main(String[] args) {
        String [][] a = {
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"}
        };
        for (int i = 0; i < 4 ; i++ ) {
            for(int j = 0 ; j < 10 ; j ++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}