public class MainForCar {

    public static void main(String[] args) {
        Car myFerrari = new Car();
        System.out.println(myFerrari); //araba çalıştırılmadı
        System.out.println();

        myFerrari.start(); //çalışmaya başladı
        for(int i = 0; i<5; i++)
        {
            
            myFerrari.pushAccelerate((i+1)*5); //hızlanıyor
            System.out.println(myFerrari);
        }
        System.out.println();
        myFerrari.stop(); //araba halen durmadı
        System.out.println(myFerrari);
    
        for(int i = 0; i<5; i++)
        {
        myFerrari.pushBreak((i+1)*5);
        System.out.println(myFerrari);
        }
        
        myFerrari.stop();
        System.out.println(myFerrari);
        
    }

}
