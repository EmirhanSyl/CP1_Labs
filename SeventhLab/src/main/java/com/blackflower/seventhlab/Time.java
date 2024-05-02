package com.blackflower.seventhlab;

public class Time {
    int hour;
    int second;
    int minute;
    
    public void IncreaseSecond(){
        second++;
        if (second > 59) {
            IncreaseMinute();
            second = 0;
        }
    }
    public void IncreaseMinute(){
        minute++;
        if (minute > 59) {
            IncreaseHour();
            minute = 0;
        }
    }
    public void IncreaseHour(){
        hour++;
        if (hour > 23) {
            hour = 0;
        }
    }
    public void DisplayTime(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
