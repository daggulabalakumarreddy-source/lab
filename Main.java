class Calculator{
 public int add(int a ,int b){
  return(a + b);}
  
  protected int add(int a , int b , int c){
   return(a + b + c) ;}
   
   private double add(double a, double b){
   return (a + b);}
   public void displayDecimalSum(double x, double y) {
        double result = add(x, y);  
        System.out.println("Sum of decimals: " + result);
    }
}

   public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));

        
        System.out.println("Sum of 3 integers: " + calc.add(2, 3, 4));

        
        calc.displayDecimalSum(5.5, 2.3);
    }
}