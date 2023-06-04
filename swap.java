class Swapp {
    int a;
    int b;
    int temp;
    
    public void swapping() {
        System.out.println("Function to swap two digits: \nBefore Swapping : ");
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        
        temp = b; // Store the value of 'b' in 'temp'
        b = a;   // Assign the value of 'a' to 'b'
        a = temp; // Assign the original value of 'b' (stored in 'temp') to 'a'
        
        System.out.println("Numbers After Swapping:");
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }
}

public class swap {
    public static void main(String args[]) {
        Swapp s = new Swapp();
        s.a = 5;
        s.b = 3;
        s.swapping();
    }
}