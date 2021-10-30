public abstract class Bird {
    protected String feathers;
    protected String layEqqs;
    public Bird(String feathers, String layEqqs) {
        this.feathers = feathers;
        this.layEqqs = layEqqs;
    }


    public abstract void info();

    public abstract void fly();
}
