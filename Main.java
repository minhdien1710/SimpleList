public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println(listInteger.get(3));
        System.out.println(listInteger.get(4));
        System.out.println(listInteger.get(1));
        

    }
}
