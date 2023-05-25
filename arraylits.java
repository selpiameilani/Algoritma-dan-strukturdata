
 import java.util.ArrayList;     
 
public class arraylits {
    
    static ArrayList <String> nama = new ArrayList<String>();
    
    public static void main (String [] args){
        nama.add("Budi");
        nama.add("Deni");
        
        System.out.println(nama.get(0));
        
        nama.add(0,"Reni");
        
        System.out.println(nama.get(0));
        
        nama.set(1, "Adi");
        nama.remove(0);
        nama.clear();
        System.out.println(nama);//output dalam bentuk arraylist
        
    }
    
}
