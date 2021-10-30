public class FlyingBird extends Bird {

    public FlyingBird(String feathers, String layEqqs) {
        super(feathers, layEqqs);
    }

    public String getFeathers() {
        return this.feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayEqqs(String layEqqs) {
        this.layEqqs = layEqqs;
    }

    public String getLayEqqs() {
        return layEqqs;
    }
    public void info()
    {
        System.out.println("Information about FLYING Birds with "
                + this.getFeathers() + "feathers and can they lay eggs? "+ this.getLayEqqs());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public  void fly()
    {
        System.out.println("This bird can fly!");
    }
}
