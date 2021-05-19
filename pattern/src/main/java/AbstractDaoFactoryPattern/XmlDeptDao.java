package AbstractDaoFactoryPattern;

public class XmlDeptDao implements Dao {
  @Override
  public void save() {
    System.out.println("saving department to xml");
  }
}
