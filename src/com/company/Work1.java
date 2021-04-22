/*1. Дано двухзначное число. Определить:
        а) входит ли в него цифра 5;
        б) входит ли в него цифра а.*/
package com.company;
import java.util.Scanner;
public class Work1 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
        int findNumberA = 0;
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
        exit =1;
//---------Получаем число для поиска  в ранее полученной строке-------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter the number to search for in the string");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() ) {
                 findNumberA = scanner.nextInt();
                if ((findNumberA >= 0) && (findNumberA<= 9)) {
                    exit = 0;
                    break;
                }
            }
            System.out.println("Incorrect input");
        }
//---------Выделяем номера-------------------------------------------------------------
      int firstNumber = (inNumber % 10) ;
      int secondNumber = ((inNumber / 10) % 10) ;
//---------Проверка на число 5---------------------------------------------------------------------------------------------
      if (firstNumber == 5 | secondNumber == 5)
         {
             System.out.println(" The number 5 is in the string");
         }
          else
              {
                  System.out.println(" The number 5 is not in the string");
              }

//---------Поиска введено цифры А---------------------------------------------------------------------------------------------
      if (firstNumber == findNumberA | secondNumber == findNumberA)
        {
            System.out.println(" The number "+ findNumberA +" is in the string");
        }
            else
                {
                      System.out.println(" The number "+ findNumberA +"  is not in the string");
                 }
    }
}









