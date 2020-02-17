import java.util.ArrayList;

public class Home {
    ArrayList<Animal> pets = new ArrayList<Animal>();
    public void adoptPet(Animal animal)
    {

        pets.add(animal);

    }
    public  void MakeAllSound()
    {
        for(Animal animal : pets) {
            animal.sound();
        }

    }
}
