package com.sparta.fw;

public class App {
    public static void main(String[] args) {
        int timeOfDay = 10;
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) { //will return back in STRING
        String message;
        if (timeOfDay >= 1 && timeOfDay < 12) {
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 17) {
            message = "Good Afternoon!";
        } else if (timeOfDay >= 16 && timeOfDay <= 24) {
            message = "Good Evening";
        } else {
            message = "Your selection isn't valid";
        }
        return message;
    }
}
