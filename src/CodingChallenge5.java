import java.util.Scanner;

public class CodingChallenge5 {

    public static void main(String[] args) {
        // write your code here

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int cumulativeNumber = input.nextInt();

        int result = 0;

        for (int i = 1 ;i <= cumulativeNumber ;i++){
//            result = result + (result-1);
//            result = result + i;
            result = result + i;
//            System.out.println("The final result is " + cumulativeNumber);
        }

        System.out.println("The final result is " + result);
//        calculation(cumulativeNumber);

    }
//    public function int calculation(int number){
//
//        for (int i=0;i>number;i--){
//            int cumulativeNumber = number;
//                 }
//        return cumulativeNumber;
//    }


}
