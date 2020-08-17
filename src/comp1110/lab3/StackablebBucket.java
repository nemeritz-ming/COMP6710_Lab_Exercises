package comp1110.lab3;

class StackableBucket extends Bucket {
    private final String name;
    private StackableBucket innerBucket = null;
    public StackableBucket (double capacity, String name) {
        super(capacity);
        this.name = name;
    }
    public String getInnerBucket(){
        if (innerBucket != null) {return this.innerBucket.name;}
        else {return null;}
    }
    public void setInnerBuckets(StackableBucket smallerBucket){
        if (smallerBucket.getCapacity() >= this.getCapacity()){
            System.out.println("Too large to stack!");
        }
        if (this.innerBucket == null && smallerBucket.getCapacity() <= this.getCapacity()){
            this.innerBucket = smallerBucket;
        }
        else if (this.innerBucket != null){
            this.innerBucket.setInnerBuckets(smallerBucket);
        }
    }
    public void unstackBuckets(){
        if (this.innerBucket != null) {
            this.innerBucket.unstackBuckets();
            this.innerBucket = null;
        }
    }
    public static void main(String[] args) {
        StackableBucket big = new StackableBucket(10.0, "big");
        StackableBucket medium = new StackableBucket(5.0, "medium");
        StackableBucket small = new StackableBucket(1.0, "small");
        medium.setInnerBuckets(big);
        big.setInnerBuckets(medium);
        System.out.println(big.getInnerBucket());
        big.setInnerBuckets(small);
        System.out.println(big.getInnerBucket());
        System.out.println(medium.getInnerBucket());
        big.unstackBuckets();
        System.out.println(big.getInnerBucket());
        System.out.println(medium.getInnerBucket());
    }
}
