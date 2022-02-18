public class FirstOperations {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 10;
        int i3 = 15;
        int i4 = 20;
        int bb1 = i1 + i2;
        int bb2 = i3 + i4;
        System.out.println(bb1 > bb2);

        bb1 += 1;
        bb2 -= 2;
        System.out.println(bb1 > bb2);
        System.out.println(bb1 % 2 == 0 || bb2 % 2 == 0);
    }
}
