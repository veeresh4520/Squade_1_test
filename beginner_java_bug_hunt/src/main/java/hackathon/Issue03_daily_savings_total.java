public class Issue03_daily_savings_total {
    public static void main(String[] args) {
        int n = 9, sum = 0;
        
        // Fixed: Use <= n to include day 9, and removed the unnecessary sum++ workaround
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Total: " + sum);
    }
}