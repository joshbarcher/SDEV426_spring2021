package test;

import java.time.LocalDate;

public class TestFactoryMethods
{
    public static void main(String[] args)
    {
        //These are factory methods...
        LocalDate date = LocalDate.of(2021, 3, 2);
        String number = String.valueOf(10);

        Color gray = Color.grayscale(128);
        System.out.println(gray);
    }
}
