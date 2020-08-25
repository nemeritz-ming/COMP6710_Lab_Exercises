package comp1110.lab3;

public class Bucket {
    private double content = 0;
    private double capacity;
    public Bucket(double capacity){
        this.capacity= capacity;
    }
    public double getCapacity(){
        return capacity;
    }
    public double getContents(){
        return content;
    }
    public double empty(){
       double a = content;
       content = 0;
       return a;
    }
    public void add(double amount){
        if (amount <= capacity - content ){
            content += amount;
        }
        else{content = capacity;}
    }
    public static void main(String[] args) {
        Bucket big = new Bucket(10.0);
        Bucket small = new Bucket(1.0);
        big.add(20);
        small.add(20);
        System.out.println(big.getContents());
        System.out.println(small.getContents());
        big.empty();
        System.out.println(big.getContents());
        big.add(small.empty());
        System.out.println(small.getContents());
        System.out.println(big.getContents());
    }
}
