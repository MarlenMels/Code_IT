public abstract class Car {
    private String mark;
    private Double engineVolume;
    private Integer maxSpeed;

    public Car() {
    }

    public Car(String mark, Double engineVolume, Integer maxSpeed) {
        this.mark = mark;
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void signal(){
        System.out.println("Beeeep-beeeep");
    }

    public abstract void move();
}
