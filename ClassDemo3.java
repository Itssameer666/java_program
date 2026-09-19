class Number{
    void isEven(){
        System.out.println("Even method");
    }
    void isPrime(){
        System.out.println("Prime method");
    }
    void isPalindrome(){
        System.out.println("Palindrome method");
    }
}
public class ClassDemo3 {
    public static void main(String[] args) {
        Number n=new Number();
        n.isEven();
        n.isPrime();
        n.isPalindrome();
    }
    
}
