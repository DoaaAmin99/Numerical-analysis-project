
package bisection.project;

import java.util.Scanner;


public class BisectionProject {
    
//    The function
    public static double f(double x){
        double result = Math.pow(x,3)+(4*Math.pow(x,2))-10;
        return result;
    }
    
//        Solution function 
    public static void getSolution(double a , double b, double e){
        
//        Number Of Iteration
    int n = (int)Math.round((Math.log(b-a)-Math.log(e))/Math.log(2));
    
//    Table variables
    double pos,neg,p=0;
    
//    Defining positive & negative part
    if(f(a)>0){
        pos=a;
        neg=b;
    }else{
        pos=b;
        neg=a;
    }
    
//    Calculating p 
    for(int i=0 ; i<n;i++){
        p=(pos+neg)/2;
        System.out.println("p"+(i+1)+" = "+p);
        if(f(p)>0){
            pos=p;
        }else{
            neg=p;
        }
    }
        System.out.println("The final solution is: "+p);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//       Taking input from user
        System.out.println("Please Enter the interval start (a): ");
        double a =sc.nextDouble();
        System.out.println("Please Enter the interval end (b): ");
        double b =sc.nextDouble();
//        Checking the inputs
        while(f(a)*f(b)>=0){
            System.out.println("Please Re-Enter the interval because the previous interval didn't have solution");
            System.out.println("Please Enter the interval start (a): ");
             a =sc.nextDouble();
            System.out.println("Please Enter the interval end (b): ");
             b =sc.nextDouble();
        }
        System.out.println("Please Enter The Accuracy (e)");
        double e = sc.nextDouble();
//        Calculating the final solution
        getSolution(a,b,e);    
    }
    
}
