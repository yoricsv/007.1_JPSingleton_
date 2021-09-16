# 007.1_JPSingleton_

# <p align=center><b>Singleton Classes in Java</b></p>

## What is a Singleton class?

As the name implies, a class is said to be singleton if it limits the number of objects of that class to one.<br/>
We **can’t have more than a single object** for such classes.<br/>
Singleton classes are employed extensively in *concepts like Networking and Database Connectivity*.

## Design Pattern of Singleton classes:
The **constructor of singleton** class would be **private** so there *must be another way to get the instance* of that class. This problem is resolved **using a class member instance** and a **factory method to return the class member**.

#### Example:
```java
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
```

We changed value of a.x, value of b.x also got updated because both **"a"** and **"b"** refer to same object, i.e., they are objects of a singleton class.

---