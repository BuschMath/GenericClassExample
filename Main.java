public class Main {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>(10);
        MyList<String> stringList = new MyList<>(10);

        intList.set(0, 1);
        stringList.set(0, "hello");

        int firstInt = intList.get(0);
        String firstString = stringList.get(0);

        System.out.println(firstInt);
        System.out.println(firstString);
    }
}

