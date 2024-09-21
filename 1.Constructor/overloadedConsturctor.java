class car 
{
    int age;
    String brand;
    String model;

    public car(int x, String y) 
    {
        age = x;
        brand= y;
    }
    
    void show()
    {
        System.err.printf("%d %s %s %n",age,brand,model);
    }
    public car(int x, String y, String z) 
    {
        age = x;
        brand =  y;
        model = z;
    }
    public static void main(String[] args) {
           car arac1 = new car(3,"Clio");  
        car arac2 = new car(5,"Gtr","Nissan");

        arac1.show();
        arac2.show();
    }

}