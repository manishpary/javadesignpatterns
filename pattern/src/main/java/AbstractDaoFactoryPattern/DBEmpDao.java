package AbstractDaoFactoryPattern;

public class DBEmpDao implements Dao {
  @Override
  public void save() {
    System.out.println("saving employee to DB");
  }
}
