package ir.badnava.restswagger.patterns.creational;

public class Singleton {

    private static Singleton instance;

    private int id;

    private Singleton() {
        System.out.println("sample created ");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void setId(int id) {
        this.id = id;
    }
}
