import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //E1
        //  longestWord();


        //E2
        //  countNumber();


        //E3
        // largestNumber();


        //E4
        // reversed();


        //E5
        //menu();


        //E6
      // random();


        //E7
        //checksPassword();


        // E8
      //  Fibonacci();


    }



    //E1
//    public static void  longestWord (){
//        String[] array = {"cat", "dog", "red", "is", "am"};
//        String temp= array[0];
//
//        ArrayList<String> array1 = new ArrayList<String>();
//        for (int i =0; i< array.length; i++){
//            if(array[i].length() >= temp.length())
//                array1.add(array[i]);
//        }
//        System.out.println(array1);
//
//    }



    //E2
//    public static void countNumber() {
//
//        Scanner S = new Scanner(System.in);
//        int[] array = {1, 1, 1, 3, 3, 5};
//        System.out.println("please enter any number");
//        int num = S.nextInt();
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == num) {
//                count++;
//
//            }
//        }
//        System.out.println(num + " occurs " + count + " times");
//    }


    //3
//        public static void largestNumber() {
//
//           Scanner S = new Scanner(System.in);
//
//           int[] array = {1, 4, 17, 7, 25, 3, 100};
//           System.out.println("enter any number");
//
//           int num =S.nextInt();
//           Arrays.sort(array);
//
//           System.out.println(Arrays.toString(array));
//           for( int i = array.length-1 ; i>=array.length-num; i--){
//
//               System.out.println(array[i]);
//
//        }


    //E4
//    public static void reversed() {
//        int[] array = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(array));
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
//    }


//    E5
//    public static void menu() {
//        Scanner S = new Scanner(System.in);
//        System.out.println("Enter the  Size elements of the array: ");
//        int sizearray = S.nextInt();
//        int[] array = new int[sizearray];
//        System.out.println("1. Accept elements of an array");
//
//        System.out.println("2. Display elements of an array");
//        System.out.println("3. Search the element within array");
//        System.out.println("4. Sort the array");
//        System.out.println("5. To Stop");
//        int menu = S.nextInt();
//
//        while (menu != 5) {
//
//
//            switch (menu) {
//
//                case 1:
//                    System.out.println("Enter the elements of the array: ");
//                    for (int i = 0; i < sizearray; i++) {
//                        int elements = S.nextInt();
//                        array[i] = elements;
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("Display elements of an array");
//
//                        System.out.println(Arrays.toString(array) + " ");
//
//                    break;
//                case 3:
//                    System.out.println("Enter a number to search");
//                    int search = S.nextInt();
//                    for (int i = 0; i < array.length; i++) {
//                        if (array[i] == search) {
//                            System.out.println("Yes I found number " + search);
//                            break;
//                        } else System.out.println("No found the number " + search);
//                        break;
//                    }
//                    break;
//                case 4:
//                    System.out.println(" Sort the array");
//                    Arrays.sort(array);
//                    for (int i = 0; i < array.length; i++)
//                    {
//                        System.out.println(array[i]);
//                    }
//                    break;
//                default:
//                    System.out.println("Choose a correct number from the menu from number 1 to number 5 ");
//
//            }
//
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop");
//            menu = S.nextInt();
//        }
//    }



                     //E6
//    public static void random(){
//        Scanner S = new Scanner(System.in);
//        Random rand = new Random();
//        System.out.println("Enter the minimum value of the range: ");
//        int minimum =S.nextInt();
//        System.out.println("Enter the maximum value of the range: ");
//        int maximum =S.nextInt();
//        System.out.println("Enter the number of random numbers to generate");
//        int random =S.nextInt();
//
//        for (int i =0 ; i<random; i++){
//            System.out.println(rand.nextInt(  maximum - minimum) + minimum);
//        }
//
//    }



                 //E7
//    public static void checksPassword(){
//
//    }


                     //E8
//        public static void Fibonacci(){
//            Scanner S = new Scanner(System.in);
//            System.out.println("Enter the number of Fibonacci terms to generate: ");
//            int number =S.nextInt();
//            int num0=0;
//            int num1=1;
//            int sum =0;
//
//
//
//            System.out.print(num0+ " , ");
//            System.out.print(num1);
//            for (int i = 2; i<number; i++){
//               sum =  num0 + num1;
//                System.out.print(" , " + sum);
//                num0 =num1;
//                num1 = sum;
//            }
//          //  System.out.println( sum);
//        }





}














