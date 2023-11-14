public class PersonMain {
    public static void main(String[] args) {
        Person per1 = new Person("Krzysztof",88.0f, 177.0f);
        Person per2 = new Person("Anna",100.0f, 160.0f);
        Person per3 = new Person("Tom",50.0f, 159.0f);

        per1.displayRecord();
        System.out.println();
        per2.displayRecord();
        System.out.println();
        per3.displayRecord();
    }
}
