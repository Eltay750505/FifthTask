package ru.mail.gasimov.task5;

import ru.mail.gasimov.task5.util.PropertyUtil;


public class App 
{
    public static void main( String[] args )
    {
        PropertyUtil propertyUtil = new PropertyUtil();
        String property = propertyUtil.getProperty("van.count");
        System.out.println("Van.count = " + property);
    }
}
