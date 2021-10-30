public class NonflyingBird extends  Bird {

        public NonflyingBird(String feathers, String layEqqs) {
                super(feathers, layEqqs);
        }

        public String getFeathers() {
                return feathers;
        }

        public String getLayEqqs() {
                return layEqqs;
        }

        public void setFeathers(String feathers) {
                this.feathers = feathers;
        }

        public void setLayEqqs(String layEqqs) {
                this.layEqqs = layEqqs;
        }
        public void info()
        {
                System.out.println("Information about NON FLYING Birds  with "
                        + this.feathers + "feathers and can they lay eggs? "+ this.layEqqs);
        }
        @Override
        public String toString() {
                return super.toString();
        }
        public  void fly()
        {
            System.out.println("This bird can NOT fly!");
        }

}
