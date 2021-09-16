class MySingleton
{
    static MySingleton instance = null;                 // IMPORTANT!!!
    public int x = 10;

    private MySingleton() {  }                          // PRIVATE CONSTRUCTOR

    static public MySingleton getInstance()             // FACTORY METHOD (can provide the instance)
    {
        if (instance == null)
            instance = new MySingleton();

        return instance;
    }
}

class Main
{
    public static void main(String... args)
    {
        MySingleton a = MySingleton.getInstance();       // GET SINGLETON INSTANCE
        MySingleton b = MySingleton.getInstance();       // get a pointer to the first instance
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);     // Output: 20
        System.out.println("Value of b.x = " + b.x);     // Output: 20
    }
}