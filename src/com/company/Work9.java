/*9. Дано трехзначное число. Определить:
а) верно ли, что все его цифры одинаковые;
б) есть ли среди его цифр одинаковые.*/
package com.company;
import java.util.Scanner;
public class Work9 {

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

//---------Определяем верно ли, что все его цифры одинаковые  или есть сопадения-------------------------------------------------------------------------------------------
        if ((firstNumber == secondNumber) && (firstNumber == threeNumber))
        {
            System.out.println( "all the numbers match" );
        }
        else if ((firstNumber == secondNumber) || (firstNumber == threeNumber) || (secondNumber == threeNumber))
        {
            System.out.println("the two digits match" );
        }
        else
        {
            System.out.println("there are no matches" );
        }

    }
}
