public class Robot {
    private int x;
    private int y;

    public void move(int x, int y) {
        this.x = print(this.x, x, "x");
        this.y = print(this.y, y, "y");
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Robot() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else {
            System.out.println("Cannot be less than 0");
        }
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        } else {
            System.out.println("Cannot be less than 0");
        }
    }

    private int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Moving on axis " + axisName + " from " + start + " to " + (++start));
        }

        return start;
    }

}
