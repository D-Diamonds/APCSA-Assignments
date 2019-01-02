/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

    private int odometer;
    private int speedometer;
    private boolean checkEngine;

    public Dashboard() {
        this(0,0);
    }

    public Dashboard(int o, int s) {
        setMiles(o);
        setSpeed(s);
    }

    public String toString() {
        return ("Speedometer: " + this.speedometer + " MPH\n" +
                "Odometer: " + String.format("%05d", this.odometer)  + "\n" +
                "Check Engine: " +
                ((this.checkEngine) ? "On" : "Off"));
    }

    public void setSpeed(int s) {
        if (s <= 100 && s >= 0)
            this.speedometer = s;
        else {
            this.speedometer = 0;
            this.checkEngine = true;
        }
    }

    public void setMiles(int m) {
        if (m <= 99999 && m >= 0)
            this.odometer = m;
        else {
            this.odometer = 0;
            this.checkEngine = true;
        }
    }

    public void accelerate() {
        setSpeed(this.speedometer + 1);
    }

    public void drive(int n) {
        setMiles(this.odometer += (int) (this.speedometer / 60.0 * n));
    }

}