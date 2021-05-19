package SingleTonPattern;

import java.lang.reflect.Constructor;

public class SingleTonPattern {}

class EagerInitializedSingleton {

  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

  // private constructor to avoid client applications to use constructor
  private EagerInitializedSingleton() {}

  public static EagerInitializedSingleton getInstance() {
    return instance;
  }

  public static void main(String[] args) {
    System.out.println(BillPughSingleton.getInstance());
  }
}

class StaticBlockSingleton {

  private static StaticBlockSingleton instance;

  private StaticBlockSingleton() {}

  // static block initialization for exception handling
  static {
    try {
      instance = new StaticBlockSingleton();
    } catch (Exception e) {
      throw new RuntimeException("Exception occured in creating singleton instance");
    }
  }

  public static StaticBlockSingleton getInstance() {
    return instance;
  }
}

class LazyInitializedSingleton {

  private static LazyInitializedSingleton instance;

  private LazyInitializedSingleton() {}

  public static LazyInitializedSingleton getInstance() {
    if (instance == null) {
      instance = new LazyInitializedSingleton();
    }
    return instance;
  }
}

class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {}

  public static synchronized ThreadSafeSingleton getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }
}

class BillPughSingleton {

  private BillPughSingleton() {}

  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}

class ReflectionSingletonTest {

  public static void main(String[] args) {
    EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
    EagerInitializedSingleton instanceTwo = null;
    try {
      Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        // Below code will destroy the singleton pattern
        constructor.setAccessible(true);
        instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
        break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(instanceOne.hashCode());
    System.out.println(instanceTwo.hashCode());
  }
}

enum EnumSingleton {
  INSTANCE;

  public static void doSomething() {
    // do something
  }
}
