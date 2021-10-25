package task5;

public class Dog {
     String name;
     Breeds breed;
     int age;
     public Dog(){}
     public Dog (String name, Breeds breed, int age)
     {
          this.name = name;
          this.breed = breed;
          this.age= age;
     }

     public String getName() {
          return name;
     }

     public Breeds getBreed() {
          return breed;
     }

     public int getAge() {
          return age;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public void setBreed(Breeds breed) {
          this.breed = breed;
     }
}
