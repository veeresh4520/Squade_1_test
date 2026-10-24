public class Issue02_three_number_champion { 
    public static void main(String[] args) { 
        int x=9, y=4, z=8; 
        int largest=x; 
        if(y>largest) largest=y; 
        if(z>largest) largest=z;  
        System.out.println("Largest: "+largest); 
    } 
}
