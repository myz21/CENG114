import java.util.Scanner;

public class Cons
{
    int sayi;

    public Cons(int i)
    {
        sayi = i;
    }
    void show()
    {
        System.out.println("girilen sayı: "+sayi);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı gir: ");
        int n = sc.nextInt();

        Cons con = new Cons(n);
        con.show();    
    }
}