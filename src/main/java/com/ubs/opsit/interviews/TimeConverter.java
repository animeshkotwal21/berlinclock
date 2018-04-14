package com.ubs.opsit.interviews;

public interface TimeConverter {

    String convertTime(String aTime);
    String getBerlinLamps(int timeUnit);
    String getBerlinLamps(int timeUnitValue, int numericValue,
                          String red, String yellow);
    String getBerlinLamps(int timeUnitValue, int numericValue, String lamp);

}
