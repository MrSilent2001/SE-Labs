package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int num1 = 25;
        int num2 = 40;

        int sum = Calculator.add(num1, num2);
        System.out.println(sum);

        String appName = System.getProperty("app.name");
        System.out.println("App Name: " + appName);
    } 
}
