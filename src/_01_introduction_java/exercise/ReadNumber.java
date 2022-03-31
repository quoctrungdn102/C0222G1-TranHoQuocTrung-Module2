package _01_introduction_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.println("nhap so cua ban ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDonVi = (number % 100) % 10;

        String string = "";
        String string1 = "";
        String string2 = "";
       if(number>15||number<10){
           switch (hangTram) {
               case 1:
                   string += "one hundred";
                   break;
               case 2:
                   string += "tow hundred";
                   break;
               case 3:
                   string += "three hundred";
                   break;
               case 4:
                   string += "four hundred";
                   break;
               case 5:
                   string += "five hundred";
                   break;
               case 6:
                   string += "six hundred";
                   break;
               case 7:
                   string += "seven hundred";
                   break;
               case 8:
                   string += "eight hundred";
                   break;
               case 9:
                   string += "nine hundred";
                   break;
           }
           switch(hangChuc){

               case 1:
                   string1 += "";
                   break;
               case 2:
                   string1 += "twenty";
                   break;
               case 3:
                   string1 += "thirty";
                   break;
               case 4:
                   string1 += "forty";
                   break;
               case 5:
                   string1 += "fifty";
                   break;
               case 6:
                   string1 += "sixty";
                   break;
               case 7:
                   string1 += "seventy";
                   break;
               case 8:
                   string1 += "eighty";
                   break;
               case 9:
                   string1 += "ninety";
                   break;

           }
           switch(hangDonVi)
           {
               case 1:
                   string2 += "one";
                   break;
               case 2:
                   string2 += "two";
                   break;
               case 3:
                   string2 += "three";
                   break;
               case 4:
                   string2 += "for";
                   break;
               case 5:
                   string2 += "five";
                   break;
               case 6:
                   string2 += "six";
                   break;
               case 7:
                   string2 += "seven";
                   break;
               case 8:
                   string2 += "eight";
                   break;
               case 9:
                   string2 += "nine";
                   break;

           }  if(number<20&&number>15){
               string2+="teen";
           }
           System.out.println(string +" " + string1 + " " + string2);

       } if(number>0&&number<=15) {
           switch (hangDonVi){
               case 0:
                   System.out.println("ten");
                   break;
               case 1:
                   System.out.println("elven");
               case 2:
                   System.out.println("twelve");
               case 3:
                   System.out.println("thirteen");
               case 4:
                   System.out.println("fourteen");
               case 5:
                   System.out.println("fifteen");
           }
       }if (number==0){
            System.out.println("zero");
        }
    }
}
