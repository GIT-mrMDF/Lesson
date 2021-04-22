/*8. Дано трехзначное число. Определить:
а) является ли произведение его цифр больше числа b;
б) кратна ли сумма его цифр трем.*/
package com.company;
import java.util.Scanner;
public class Work8 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
        int findNumberB=0;
//---Получаем число для поиска и проверяем его на правильность ввода-------------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter a three-digit number");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() ) {
                inNumber = scanner.nextInt();
                if ((inNumber >= 100) && (inNumber<= 999))
                {
                    exit = 0;
                    break;
                }
            }
            System.out.println("Incorrect input");
        }
        exit =1;
//---------Получаем число B для поиска  в ранее полученной строке-------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter a number to compare");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() )
            {
                findNumberB = scanner.nextInt();
                exit = 0;
                break;
            }
            System.out.println("Incorrect input");
        }

        //---------Выделяем номера-------------------------------------------------------------
        int firstNumber = (inNumber % 10) ;
        int secondNumber = ((inNumber / 10) % 10) ;
        int threeNumber = ((inNumber / 100) % 10) ;

//---------Определяем является ли является ли произведение его цифр больше числа b -------------------------------------------------------------------------------------------
        if ((firstNumber * secondNumber * threeNumber) > findNumberB  )
        {
            System.out.println( "the multiplication of its digits " +(firstNumber * secondNumber * threeNumber)+ " greater than the number b =" +findNumberB );
        }
        else
        {
            System.out.println("the multiplication of its digits " +(firstNumber * secondNumber * threeNumber)+ " not greater than the number b =" +findNumberB   );
        }
        //---------Определяем кратна ли сумма его цифр трем -------------------------------------------------------------------------------------------
        if (((firstNumber + secondNumber + threeNumber) %3 ) == 0  )
        {
            System.out.println( "Yes! the sum of its digits" + (firstNumber + secondNumber + threeNumber) + " is a multiple of  3" );
        }
        else
        {
            System.out.println("No!the sum of its digits " + (firstNumber + secondNumber + threeNumber) + " is not a multiple of  3"  );
        }
    }
}
