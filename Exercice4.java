import java.util.*;
class Exercice4 {
    
    public static void main(String [] args) {  

        int a[] = {2,5,3,1,4,-7,6};
        int bigDiff = 0;
        
        for (int i=0; i<(a.length-1); i++) {
            int diff = Math.abs(a[i]-a[i+1]);
            if (diff>bigDiff) {
                bigDiff = diff;
            }
            
        }
        
        System.out.println("Le plus grand ecart entre deux entiers consecutifs dans le tableau {2,5,3,1,4,-7,6} est " + bigDiff);
    }
}