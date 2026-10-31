
class  car {

    int cnumber;
    String model;
    int mile;
    void running()
    {
        System.out.println("Car is Running");
    }

    
}


public class classobj {

    public static void main(String args[])
    {
           car obj=new car();

           int cnumber=obj.cnumber=1234;
           String model=obj.model="Maruti";
           int mile=obj.mile=40;
           System.out.println("Car Number is:"+cnumber);
           System.out.println("Car Model is:"+model);
           System.out.println("Car Milege is"+mile);
           obj.running();
    }
}
