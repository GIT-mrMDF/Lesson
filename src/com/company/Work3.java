/*3. Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет
к нему слово "копейка" в правильной форме.
Например, 1 копейка, 5 копеек, 42 копейки .*/

package com.company;
import java.util.Scanner;
public class Work3 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
//---Получаем число для поиска и проверяем его на правильность ввода-------------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter the number of kopecks");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() ) {
                inNumber = scanner.nextInt();
                if ((inNumber >= 1) && (inNumber<= 99))
                {
                    exit = 0;
                    break;
                }
            }
            System.out.println("Incorrect input");
        }


//---------Выбор окончания---------------------------------------------------------------------------------------------
        if ((inNumber % 10) == 1 )
        {
            System.out.println( inNumber+ " копейка");
        }
        else if ((inNumber % 10 == 2 || inNumber % 10 == 3 || inNumber % 10 == 4) && inNumber / 10 != 1 )
        {
            System.out.println(inNumber+ " копейки");
        }
        else
        {
            System.out.println(inNumber+ " копеек");
        }

    }
}









