import java.util.Scanner; 
 class AverageOfThree {
    public static void main(String[] args) {
        
        double num1, num2, num3, average;
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble(); 
        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble(); 
        
        System.out.println("Enter the third number:");
        num3 = scanner.nextDouble(); 
        
        

        average = (num1 + num2 + num3) / 3.0; 
        
       
        System.out.println("The average of the three numbers is: " + average);
        
        
        scanner.close();
    }
}
