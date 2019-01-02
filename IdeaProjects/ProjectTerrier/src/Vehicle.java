public class Vehicle {
    private int location;

    public Vehicle() {
        this(0);
    }

    public Vehicle(int loc) {
        setLocation(loc);
    }


    public void setLocation(int loc) {
        if (loc >= -20 && loc <= 20)
            this.location = loc;
        else
            this.location = 0;
    }

    public void forward() {
        if (!(this.location + 1 > 20))
            this.location++;
    }

    public void backward() {
        if (!(this.location + 1 < -20))
            this.location--;
    }

    public int getLocation() {
        return this.location;
    }

    public String toString() {
        String result = "";
        for (int i = -20; i < getLocation(); i++)
            result += " ";
        return result + "@";
    }


}
