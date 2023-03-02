
public class LoopingFor {
   
    public static void main(String[] args) {
        // mencetak angka 1-10
        for(int i=1;i<=10;i++) {
            System.out.println("Nilai i:"+i);
        }
        
        // 10 20 30 - 100
        
        for(int i=10;i<=100;i+=10) {
            System.out.println(i);
        }
        
        for(int i=1;i<=10;i++){
             System.out.println("Nilai i:"+i * 10);
         }
        
        //10 9 8 7 6 4 3 2 1 
        for(int i=10;i>0;i--){
            System.out.println("Nilai i" + i);
            
        }
        
        for(int i=1;i<=10;i++){
            System.out.println("Nilai i:"+(111-i));
        }
        
        // 1 -2 3 -4 5 -6 7 -8 9 -10
        
        int sign =1;
        for (int i=1;i<=10;i++){
            int result = i * sign;
            System.out.print(result+ "");
            sign = sign * -1;
        }
        // Faktorial
        int bil = 4;
        int result=1;
        for(int i=1;i<=bil;i++){
            result= result * i;
            System.out.println(result);
        }
        //System.out.println("\n" +bil + "!="+ result);
        
        int angka = 1000000;
        //int jumlah = 0;
        boolean isPrime= false;
        
        for(int i=1;i<=angka;i++){
            if(angka % i==0){
               isPrime = false;
               break;
            }
         }
        
        if(isPrime){
            System.out.println(angka+"Bukan Prima");
         
        }
        else{
            System.out.println(angka+"Bukan Prima");
        }
    }

}
