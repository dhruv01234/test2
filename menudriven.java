import java.util.Scanner;
class prime{
    public String p(){
        System.out.print("enter the value to check it is prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0 || n==1){
            return "not prime";
        }
        else{
            for(int i=3;i<n;i++){
                if(n%i==0){
                    return "not prime";
                }
            }
            return "prime";
        }
    }
}

class factorial{
    public int fac(){
int ans = 1;
System.out.print("enter the value to find its factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=1){
            ans *= n;
            n -= 1;
        }
        return ans;
    }
}

class fabonacci{
    public void fab(){
    int a=0;
    int b = 1;
    int c;
    System.out.print("enter the value to print fabonacci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    if(n==1){
        System.out.println(a);
        
    }
    else{
        System.out.print(a+" "+b);
    
        for (int i = 3; i<=n; i++) {
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
        System.out.println();
    }}
}

public class newproject1 {
    public static void main(String[] args) {
        int y = 1;
        while(y==1){
        System.out.println("enter the value :-\n1 -> prime number\n2 -> factorial\n3 -> fabonacci\n4 -> exit");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        prime p1 = new prime();
        factorial f1= new factorial();
        fabonacci fab1 = new fabonacci();
        if(n1==1){
            System.out.println(p1.p());
        }
        else if(n1==2){
            System.out.println(f1.fac());
        }
        else if(n1==3){
            fab1.fab();
        }
        else if(n1==4){
            y = 0;
        }
        else{
            System.out.println("input only from 1/2/3/4");
        }
    }}
}
