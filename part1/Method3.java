class Method3{

    static String addMark(String str){
        return "*" + str + "*";
    }

    public static void main(String[] args) {
        String result = addMark("onishi");
        System.out.println(result);
    }
}
