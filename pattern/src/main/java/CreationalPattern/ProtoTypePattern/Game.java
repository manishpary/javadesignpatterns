package CreationalPattern.ProtoTypePattern;

public class Game implements Cloneable {
  private int id;
  private String name;
  private MemberShip memberShip;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Game clone() throws CloneNotSupportedException {
    return (Game) super.clone();
  }

  public MemberShip getMemberShip() {
    return memberShip;
  }

  public void setMemberShip(MemberShip memberShip) {
    this.memberShip = memberShip;
  }

  @Override
  public String toString() {
    return "Game{" + "id=" + id + ", name='" + name + '\'' + ", memberShip=" + memberShip + '}';
  }
}
