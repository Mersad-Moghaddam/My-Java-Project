package MyPackage.Season1;

import java.util.Random;
import java.util.Scanner;
public class RandomTest {
    public static void main(String[] args){
        Random rand=new Random();
        System.out.print("Enter Range of Number : ");
        try (Scanner reader = new Scanner(System.in)) {
            int range= reader.nextInt();
            System.out.print("How Many Number : ");
            int row= reader.nextInt();
            int key=1;
            while (key!=0){
                for (int i=0;i<row;i++){
                    int number1= rand.nextInt(range);
                    System.out.println(number1);
                }
                System.out.print("Do you want to continue 1/0 : ");
                key= reader.nextInt();
            }
        }
        System.out.println("GOOD LUCK !!!");
    }
}
