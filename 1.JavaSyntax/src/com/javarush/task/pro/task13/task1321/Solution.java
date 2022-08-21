package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String ruLower = ru.toLowerCase();
        if(ruLower.equals("понедельник")){
            return "Monday";
        }
        else if(ruLower.equals("вторник")){
            return "Tuesday";
        }
        else if(ruLower.equals("среда")){
            return "Wednesday";
        }
        else if(ruLower.equals("четверг")){
            return "Thursday";
        }
        else if(ruLower.equals("пятница")){
            return "Friday";
        }
        else if(ruLower.equals("суббота")){
            return "Saturday";
        }
        else if(ruLower.equals("воскресенье")){
            return "Sunday";
        } else {
            return "Недействительный день недели";
        }
    }
}
