package CreationalPattern.AbstractDaoFactoryPattern;

public class DBDeptDao implements Dao {
  @Override
  public void save() {
    System.out.println("saving Department to DB");
  }
}
