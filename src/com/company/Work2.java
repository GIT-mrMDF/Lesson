/*2. Дано двухзначное число. Определить:
а) входят ли в него цифры 3 и 7;
б) входят ли в него цифры ( 4 и 8) или цифра 9.*/
package com.company;
import java.util.Scanner;
public class Work2 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
//---Получаем число для поиска и проверяем его на правильность ввода-------------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter a 2-digit string to search");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() ) {
                inNumber = scanner.nextInt();
                if ((inNumber >= 10) && (inNumber<= 99))
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
//---------Проверка на число 3 и 7---------------------------------------------------------------------------------------------
        if ((firstNumber == 3 || secondNumber == 7) && (firstNumber == 7 || secondNumber == 3) )
        {
            System.out.println(" The number 3 and 7 is in the string");
        }
        else
        {
            System.out.println(" The number 3 and 7  is not in the string");
        }
//---------Проверка на число 4 и 8 или цифра 9---------------------------------------------------------------------------------------------
        if (((firstNumber == 4 || secondNumber == 8) && (firstNumber == 8 || secondNumber == 4)) || ((firstNumber == 9 || secondNumber == 9)) )
        {
            System.out.println(" The number 4 and 8 or 9 is in the string");
        }
        else
        {
            System.out.println(" The number 4 and 8 or 9 is not in the string");
        }
    }
}









