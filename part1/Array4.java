class Array4{
    public static void main(String[] args) {
        int[] points = {64, 76, 58, 72, 48};
        int min = 100;
        for (int i = 0; i < points.length; i++) {
            if(min > points[i]){
                min = points[i];
            }
        }
        System.out.println(min);
    }
}
