package singleton;

public class Singleton {
    private static Singleton singleton = null;

    private String name = "";

    private Singleton() {
        super();
    }

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

    public static Singleton getInstance(String name) {
        if(singleton == null) {
            singleton = new Singleton(name);
            return singleton;
        }
        return singleton;
    }

    public String add(String newName) {
        return name + newName;
    }

    public void afficher() {
        System.out.println("I am an instance and my value is: " + name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
