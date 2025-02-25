public class Pow{
    public double myPow(double x, int n) {
            if(n==0) return 1;
    
            if(n<0){
                x = 1/x;
                n = -n;
            }
    
            double halfpower = myPow(x,n/2);
            if(n%2==0){
                return halfpower*halfpower;
            }else{
                return x*halfpower*halfpower;
            }
            
    }
    public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.myPow(2.0, -4));
    }
}
    

