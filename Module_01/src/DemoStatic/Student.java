package DemoStatic;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0; //学号计数器，每当new了一个新的对象的时候，计算器++


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public Student() {
        this.id = idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
