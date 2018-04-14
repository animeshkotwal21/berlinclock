package com.ubs.opsit.interviews;

/**
 * Created by Animesh_Kotwal on 4/14/2018.
 */
public class TimeImpl implements TimeConverter {
    @Override
    public String convertTime(String time) {

        String[] timeElements = time.split(":");

        int divisibleByFive;
        int modulusOfFive;
        int timeUnitValue;

        StringBuffer berlinTime = new StringBuffer();

        berlinTime.append(getBerlinLamps(Integer.parseInt(timeElements[2])));
        berlinTime.append("\r\n");

        timeUnitValue = Integer.parseInt(timeElements[0]);
        divisibleByFive = timeUnitValue / 5;
        modulusOfFive = timeUnitValue % 5;

        berlinTime.append(getBerlinLamps(timeUnitValue, divisibleByFive, MyConstants.RED_LAMP));
        berlinTime.append("\r\n");

        berlinTime.append(getBerlinLamps(timeUnitValue, modulusOfFive,
                MyConstants.RED_LAMP));
        berlinTime.append("\r\n");

        timeUnitValue = Integer.parseInt(timeElements[1]);
        divisibleByFive = timeUnitValue/ 5;
        modulusOfFive = timeUnitValue % 5;


        berlinTime.append(getBerlinLamps(timeUnitValue, divisibleByFive,
                MyConstants.RED_LAMP,
                MyConstants.YELLOW_LAMP));
        berlinTime.append("\r\n");

        berlinTime.append(getBerlinLamps(timeUnitValue, modulusOfFive,
                MyConstants.YELLOW_LAMP));

        return berlinTime.toString();

    }

    @Override
    public String getBerlinLamps(int timeUnitValue) {
        if (timeUnitValue % 2 == 0) {
            return MyConstants.YELLOW_LAMP;
        } else {
            return MyConstants.OFF_LAMP;
        }
    }

    @Override
    public String getBerlinLamps(int timeUnitValue, int numericValue,
                           String red, String yellow) {

        StringBuilder lamps = new StringBuilder(
                MyConstants.ELEVEN_OFF_LAMPS);

        for (int i = 0; i < numericValue; i++) {
            if ((i + 1) % 3 == 0) {
                lamps.replace(i, i + 1, red);
            } else {
                lamps.replace(i, i + 1, yellow);
            }
        }
        return lamps.toString();
    }

    @Override
    public String getBerlinLamps(int timeUnitValue, int numericValue, String lamp) {
        StringBuilder lamps = new StringBuilder(
                MyConstants.FOUR_OFF_LAMPS);
        for (int i = 0; i < numericValue; i++) {
            lamps.replace(i, i + 1, lamp);
        }

        return lamps.toString();

    }
}
