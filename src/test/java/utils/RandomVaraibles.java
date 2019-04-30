package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomVaraibles {

    public static String getRandomString(int size) {
        return RandomStringUtils.randomAlphanumeric(size);
    }

    public static String getRandomGrade(){
        int low=1;
        int high=14;
        String grade = null;
        Random random = new Random();
        int randomint = random.nextInt(high-low)+low;
        switch (randomint){
            case 1:
                grade= "DR - Director";
                break;
            case 2:
                grade= "BD - Business Director";
                break;
            case 3:
                grade= "BM - Business Manager";
                break;
            case 4:
                grade= "SM - Senior Manager";
                break;
            case 5:
                grade= "ML - Manager";
                break;
            case 6:
                grade= "SC - Senior Consultant";
                break;
            case 7:
                grade= "CL - Consultant";
                break;
            case 8:
                grade= "SE - Senior Engineer";
                break;
            case 9:
                grade= "EN - Engineer";
                break;
            case 10:
                grade= "ST - Senior Technician";
                break;
            case 11:
                grade= "TL - Technician";
                break;
            case 12:
                grade= "JT - Junior Technician";
                break;
            case 13:
                grade= "IN - Intern-Bench NC";
                break;
        }
        return grade;
    }

    public static String getRandomPririty(){
        int low=1;
        int high=4;
        String priority = null;
        Random random = new Random();
        int randomint = random.nextInt(high-low)+low;
        switch (randomint){
            case 1:
                priority= "A - High";
                break;
            case 2:
                priority= "B - Medium";
                break;
            case 3:
                priority= "C - Low";
                break;
        }
        return priority;
    }
    //TODO random status
}

