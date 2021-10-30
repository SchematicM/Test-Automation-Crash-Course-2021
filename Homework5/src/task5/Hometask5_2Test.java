package task5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Hometask5_2Test
{
    private Dog [] dogs;
    @Before
    public void setupDogs() {
        Dog d1 = new Dog("Mark",Breeds.YORK,12);
        Dog d2 = new Dog("Mark1",Breeds.BULLDOG ,1);
        Dog d3 = new Dog("Huka",Breeds.HASKI,7);
        Dog d4 = new Dog("Alibaba",Breeds.MALTZE,5);
        Dog d5 = new Dog("Kaut",Breeds.YORK,2);
        Dog d6 = new Dog("Boll",Breeds.MASTYF,13);
        dogs = new Dog[]{d1,d2,d3,d4,d5,d6};
    }

    @Test
    public void testMaxAge() {
        System.out.print("Test max dog age");
        assertEquals(13, Hometask5_2.MaxAge(dogs));
    }

    @Test
    public void testCheck_sameName() {
        System.out.print("Test same names");
        assertEquals(false, Hometask5_2.Check_sameName(dogs));
    }

}
