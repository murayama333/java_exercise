class Method2{

    static String checkAge(int age){
        if (age >= 20) {
            return "OK";
        } else {
            return "NG";
        }
    }

    public static void main(String[] args) {
        String result = checkAge(20);
        System.out.println(result);
    }
}
