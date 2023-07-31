/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programation.practice00;

/**
 *
 * @author user
 */
public class Clock {

    private int hour = 12;
    private int minutes;
    private int seconds;
    private boolean vibrate;
    private int day;

    public String showHour() {
        String time = "";

        if (hour < 10) {
            time = time + "0" + hour + ":";
        }
        if (minutes < 10) {
            time = time + "0" + minutes;
        }
        if ((hour > 9) && (minutes > 9)) {
            time = hour + ":" + minutes;
        }

        return time;
    }

    public void setHour(int hour, int minutes, int seconds) {

        this.hour = seconds % 60;
        this.minutes = (minutes + (seconds / 60)) % 60;
        this.seconds = (hour + (minutes + (seconds / 60)) / 60) % 24;

    }

    public void advance() {
        seconds++;
        
    }

    public void vibrate() {

    }

}
