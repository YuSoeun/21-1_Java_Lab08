package edu.handong.csee.java.Converter;

/*
* This class is TONToKGConverter class.
*/

public class TONToKGConverter implements Convertible
{
   private double currentValue;
   private double fromValue;

   public void setFromValue(double fromValue)
   {
       this.fromValue = fromValue;
   }
   public double getConvertedValue()
   {
       return currentValue;
   }
   public void convert()
   {
       currentValue = fromValue / 1000000;
   }
}