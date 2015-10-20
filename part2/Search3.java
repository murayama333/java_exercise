class Search3{
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("args is invalid.");
            System.exit(1);
        }

        int target = Integer.parseInt(args[0]);

        int[] data = {12, 34, 56, 78, 90};
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
