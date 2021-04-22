/*4. Дано натуральное четырехзначное число.
 Выяснить, является ли оно палиндромом
 (читается одинаково слева направо и справа налево)..*/

package com.company;
import java.util.Scanner;
public class Work4 {

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
                if ((inNumber >= 1000) && (inNumber<= 9999))
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
//---------Сравниваем--------------------------------------------------------------------------------------------
        if ((firstNumber == fourthNumber) && (secondNumber == threeNumber) )
        {
            System.out.println( "This number " +inNumber+ " is a palindrome" );
        }
        else
        {
            System.out.println("This number " +inNumber+ "  is not a palindrome" );
        }


    }
}









