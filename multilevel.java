
class animal{

    void run()
    {
        System.out.println("Animal is Running");
    }
}

class dog extends animal{

    void eating()
    {
        System.out.println("Dog is Eating");
    }
}

class babydog extends dog{

    void bark()
        {
            System.out.println("BabyDog is Barking");
        }
    
}

public class multilevel {
    public static void main(String args[])
    {
           babydog b=new babydog();

           b.run();
           b.eating();
           b.bark();

    }
}
