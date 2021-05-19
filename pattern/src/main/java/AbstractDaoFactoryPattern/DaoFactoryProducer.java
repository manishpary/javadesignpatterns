package AbstractDaoFactoryPattern;

public class DaoFactoryProducer {
  public static DaoAbstractFactory produce(String factoryType) {
    DaoAbstractFactory daoAbstractFactory = null;
    if (factoryType.equals("xml")) {
      return new XmlDaoFactory();
    } else if (factoryType.equals("db")) {
      return new DbDaoFactory();
    }

    return daoAbstractFactory;
  }
}
