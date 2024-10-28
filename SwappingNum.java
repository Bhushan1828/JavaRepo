public class SwappingNum {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        System.out.println("Before Swapping Number");
        System.out.println(a+" "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Number");
        System.out.println(a+" "+b);

    }
    
}
