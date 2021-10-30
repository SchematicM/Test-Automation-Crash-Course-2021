public class Main {
    public static void main(String[] args) {
        Bird Eagle = new FlyingBird("brown","yes");
        Bird Swallow = new FlyingBird("grey","yes");
        Bird Penguin = new NonflyingBird("black and white","yes");
        Bird Chicken = new NonflyingBird("orange","yes");

        Bird [] birds = new Bird[]{Eagle, Swallow,Penguin,Chicken};

        for(Bird x : birds)
        {
            System.out.println(x.getClass().getName());
            x.fly();
            x.info();
        }


    }
}
