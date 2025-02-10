public class GroveTester {
    public static void main(String[] args) {
        Grove grove1 = new Grove("Grove 1");

        System.out.println(grove1);

        for (int i = 0; i < 6; i++) {
            grove1.plant(new Tree(i + 1, 37, "Spruce"));
        }

        System.out.println(grove1);

        grove1.remove(3);
        grove1.remove(5);

        System.out.println(grove1);

        grove1.plant(new Tree(42, 13, "Maple"));

        System.out.println(grove1);
    }
}
