import java.util.Scanner;

public class Scan
{
    public static int num;
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero que se le mostrara su cuadrado");
        num = s.nextInt();
        System.out.println("Ingreso el numero: " + num + " y su cuadrado es: " + num * num);
        
        
        s.close();
    }
}


