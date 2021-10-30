package task5;

public class Hometask5_2 {
     static int getCount(Dog[] a, String b) {
        int count =0;
        for(Dog i : a)
            if(i.getName() == b) count++;
        return count;
    }
static  boolean Check_sameName(Dog [] mas)
    {
        boolean ch = false;
        int count = 0;
        for(Dog dog : mas) {
            if (getCount(mas, dog.getName()) > 1) {count++;
                System.out.println("We have dogs with the same names");
                ch = true;
                break;
            }
        }
        if(count == 0)
            System.out.println("All names are unique!");
        return ch;
    }
    static int MaxAge(Dog[] dogs)
    {
        int max = dogs[0].getAge();
        for (int i = 0; i<dogs.length; i++)
        {
            for(int j = 0; j<dogs.length; j++)
            {
                if(dogs[i].getAge() < dogs[j].getAge())
                {
                    max= dogs[j].getAge();
                }
            }
        }
        for (Dog dog: dogs)
        {
            if(dog.getAge()==max)
            {
                System.out.println(dog.getName() + "  "+dog.getBreed()+" is the oldest dog");
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Mark",Breeds.YORK,12);
        Dog d2 = new Dog("Mark1",Breeds.BULLDOG ,1);
        Dog d3 = new Dog("Huka",Breeds.HASKI,7);
        Dog d4 = new Dog("Alibaba",Breeds.MALTZE,5);
        Dog d5 = new Dog("Kaut",Breeds.YORK,2);
        Dog d6 = new Dog("Boll",Breeds.MASTYF,13);
        Dog [] dogs = new Dog[]{d1,d2,d3,d4,d5,d6};

        Check_sameName(dogs);
        MaxAge(dogs);

    }
}
