package CreationalPattern.AbstractDaoFactoryPattern;

public class DbDaoFactory extends DaoAbstractFactory {
  @Override
  public Dao createDao(String type) {
    Dao dao = null;
    if (type.equals("emp")) {
      dao = new DBEmpDao();
    } else if (type.equals("dept")) {
      dao = new DBDeptDao();
    }

    return dao;
  }
}
