/*5. Определить, является ли шестизначное число "счастливым"
(сумма первых трех цифр равна сумме последних трех цифр).*/

package com.company;
import java.util.Scanner;
public class Work5 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
//---Получаем число для поиска и проверяем его на правильность ввода-------------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter a four-digit number");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() ) {
                inNumber = scanner.nextInt();
                if ((inNumber >= 100000) && (inNumber<= 999999))
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
        int fourthNumber = ((inNumber / 1000) % 10) ;
        int fiveNumber = ((inNumber / 10000) % 10) ;
        int sixNumber = ((inNumber / 100000) % 10) ;
//---------Сравниваем--------------------------------------------------------------------------------------------
        if ((firstNumber + secondNumber + threeNumber) == (fourthNumber + fiveNumber + sixNumber)  )
        {
            System.out.println( "This number " +inNumber+ " is a happy" );
        }
        else
        {
            System.out.println("This number " +inNumber+ "  is not a happy" );
        }


    }
}
