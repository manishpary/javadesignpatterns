package AbstractDaoFactoryPattern;

public class Test {
  public static void main(String[] args) {
    DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce("db");
    Dao dao = daoAbstractFactory.createDao("emp");
    dao.save();
  }
}
