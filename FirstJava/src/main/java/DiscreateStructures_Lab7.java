
/**
 *
 * @author emirs
 */
public class DiscreateStructures_Lab7 {

    public static void main(String[] args) {
        System.out.println(calculateSum());
        
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += 2*Math.pow(3, i);
        }
        System.out.println(sum);
        
        System.out.println(calculateSummation(2, 3, 6));
    }
    
    public static double calculateSum(){
        double sum = 0;
        
        for (int i = 3; i <= 99; i+=2) {
            sum += (double)(i - 2) / i;
        }
        return sum;
    }
    
    public static double calculateSummation(int a, int r, int n){
        if (r == 1) {
            return (n+1) * a;
        }
        
        return (a * Math.pow(r, n+1) - a) / (r - 1);
    }
}
