
public class Issue01_even_or_odd_check {

    public static void main(String[] args) {
        int n = 12;
        String result = (n % 2 == 0) ? "Even" : "Odd";
        if (n == 0) {
            result = "Even";
        
        }System.out.println("Result: " + result);
    }
}
