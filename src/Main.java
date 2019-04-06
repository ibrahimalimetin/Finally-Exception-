
public class Main {
    public static void main(String[] args) {
        
        
        try {
            
            int a = 100 / 0;
            
            
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez..");
        }
        finally {
            
            System.out.println("Finally bloğu çalışıyor....");
        }
        System.out.println("Burası Çalışıyor....");
        
        
    }
}
