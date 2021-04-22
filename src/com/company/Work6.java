/*6. Дано целое число от 1 до 365. Определить, какой день недели выпадает на это число, если 1 января – понедельник.*/

package com.company;
import java.util.Scanner;
public class Work6 {

    public static void main(String[] args)  {
        int exit =1;
        int inNumber =0;
//---Получаем число для поиска и проверяем его на правильность ввода-------------------------------------------------------------------
        while (exit !=0)
        {
            System.out.println("Enter the day");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() ) {
                inNumber = scanner.nextInt();
                if ((inNumber >= 1) && (inNumber<= 365))
                {
                    exit = 0;
                    break;
                }
            }
            System.out.println("Incorrect input");
        }

        int numberDay = (inNumber  % 7) ;
        System.out.println(numberDay );
        switch (numberDay)
        {
            case 0: System.out.println("Воскресенье" ); break;
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println( "Пятница"); break;
            case 6: System.out.println("Суббота"); break;
        }
    }
}
