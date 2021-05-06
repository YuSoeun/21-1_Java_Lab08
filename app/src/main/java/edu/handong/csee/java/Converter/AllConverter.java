package edu.handong.csee.java.Converter;

public class AllConverter {
    private double fromValue;
    private String originalMeasure;

    public AllConverter(){
        fromValue = 0;
        originalMeasure = "";
    }

    public AllConverter setFromValue(double fromValue)
    {
        this.fromValue = fromValue;

        return this;
    }
    public AllConverter setOriginalMeasure(String originalMeasure)
    {
        this.originalMeasure = originalMeasure;

        return this;
    }
    public void convertAndPrintOut()
    {
        if (originalMeasure == "KM") {
            KMToMConverter myMConverter = new KMToMConverter();
            KMToMILEConverter myMILEConverter = new KMToMILEConverter();

            myMConverter.setFromValue(fromValue);
            myMConverter.convert();

            myMILEConverter.setFromValue(fromValue);
            myMILEConverter.convert();

            System.out.println(fromValue + " " + originalMeasure + " is " + myMConverter.getConvertedValue() + " M and " + myMILEConverter.getConvertedValue() + " KM!");

        } else if (originalMeasure == "TON") {
            TONToGConverter myGConverter = new TONToGConverter();
            TONToKGConverter myKGConverter = new TONToKGConverter();

            myGConverter.setFromValue(fromValue);
            myGConverter.convert();

            myKGConverter.setFromValue(fromValue);
            myKGConverter.convert();

            System.out.println(fromValue + " " + originalMeasure + " is " + myGConverter.getConvertedValue() + " M and " + myKGConverter.getConvertedValue() + " KM!");
        }
    }
}