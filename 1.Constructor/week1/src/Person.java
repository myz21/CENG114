public class Person {
    
    final String name;
    final String surname;
    final boolean isFemale;

    //ilk constructor
    Person(String p_name, String p_surname)
    {
        name = p_name;
        surname = p_surname;
        isFemale = false;
    }

    //ikinci genişletilmiş constructor
    Person(String p_name, String p_surname,boolean p_isFemale)
    {
        name = p_name;
        surname = p_surname;
        isFemale = p_isFemale;
    }
    
    public String getFullName ()
    {
        return name+" "+surname;
    }
    

    //sınıfın metin olarak yazdırılmasını sağlayan, yeniden düzenlediğimiz toString metodu
    public String toString()
    {
        return getFullName()+ " : " + (isFemale ? "Female" : "Male");
    }
    
    
    /* constructor olmadan önce bu yöntemleri main'den teker teker çağırmamız gerekiyordu.
    String askGender()
    {
        return isFemale ? "Female" : "Male";
    }
    public String toString()
    {
        return name + " " + surname + " : " +askGender();
    }
    

    public String greet() {
        return "Hello, " + name + "!";
    }*/
}
