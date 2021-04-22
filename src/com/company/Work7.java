/*7. Дано трехзначное число. Определить:
а) является ли сумма его цифр двухзначным числом;
б) является ли произведение его цифр трехзначным числом.*/
package com.company;
import java.util.Scanner;
public class Work7 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
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
 //---------Выделяем номера-------------------------------------------------------------
        int firstNumber = (inNumber % 10) ;
        int secondNumber = ((inNumber / 10) % 10) ;
        int threeNumber = ((inNumber / 100) % 10) ;
 //---------Определяем является ли сумма его цифр двухзначным числом -------------------------------------------------------------------------------------------
        if (((firstNumber + secondNumber + threeNumber) >= 10) && ((firstNumber + secondNumber + threeNumber) <= 99) )
        {
            System.out.println( "the sum of its digits is a two-digit number =" +(firstNumber + secondNumber + threeNumber) );
        }
        else
        {
            System.out.println("the sum of its digits is  not a two-digit number =" +(firstNumber + secondNumber + threeNumber)  );
        }
//---------Определяем является ли произведение его цифр трехзначным числом -------------------------------------------------------------------------------------------
        if (((firstNumber * secondNumber * threeNumber) >= 100) && ((firstNumber * secondNumber * threeNumber) <= 999) )
        {
            System.out.println( "the sum of its digits is a three-digit number =" +(firstNumber * secondNumber * threeNumber) );
        }
        else
        {
            System.out.println("the sum of its digits is  not a three-digit number =" +(firstNumber * secondNumber * threeNumber)  );
        }

    }
}
