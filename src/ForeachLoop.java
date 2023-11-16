public class ForeachLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int catches : numbers)
        {
            System.out.println("Number " + catches);
        }
        String[] names = {"Vathana","Rothana"};
        for (String name:names)
        {
            System.out.println("Your Name : " + name);
        }
    }
}