class Method5{

    static int maxValue(int[] points){
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            if (max < points[i]) {
                max = points[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] points = {20, 42, 15};
        int result = maxValue(points);
        System.out.println(result);
    }
}
