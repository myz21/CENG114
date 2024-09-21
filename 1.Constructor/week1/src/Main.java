public class Main {

public static void main(String[] args)
{
    Person ali = new Person("Ali", "Gurbuz");
    
    Person unknown = new Person(null, null);

    System.out.println(ali);

    //final nitelemi kullandığımız için ismi sadece yapıcı method içinde değiştirebiliriz.
    //ali.name = "Arda"; 
} 

}