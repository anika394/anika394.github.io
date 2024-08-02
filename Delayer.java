public class Delayer {
    private int delay;

    public Delayer(int delay) {
        this.delay = delay;
    }

    public int delay(int delay) {
        int temp = this.delay;
        this.delay = delay;
        return temp;
    }

    public boolean equals(Delayer delaytwo) {
        if (this.delay == delaytwo.delay)
            return true;
        else
            return false;
    }

    public String toString() {
        return "delaying " + this.delay;
    }
}
