import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

    public class AnimalTest {
        @Test
        public void TestDogSound()

        {

            Dog dog = new Dog();
            String results= dog.sound();
            Assert.assertEquals(results,"Barks");
        }


        @Test
        public  void TestDogEats( )
        {
            Dog dog = new Dog();

            String reslt = dog.eat();
            Assert.assertEquals(reslt,"Food");


        }
        @Test
        public void TestCatSound( )
        {
            Cat cat = new Cat();

            String result = cat.sound();
            Assert.assertEquals(result,"Moew");
        }
        @Test
        public void TestCatEat( )
        {
            Cat cat = new Cat();

            String results= cat.eat();
            Assert.assertEquals(results,"Food");

        }

    }

