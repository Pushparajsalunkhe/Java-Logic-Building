
abstract class animal
{
    abstract void show();

    void eat()
    {
        System.out.println("I am Eating");
    }

}

class dog extends animal
{
    void show() {
        {
            System.out.println("i am the Dog class");
        }
    }
}
public class abstractclass 
{
    public static void main(String args[])
    {
        animal a=new dog();

        a.show();
        a.eat();
    }
}
