/**
 * Created by Adam on 2017. 04. 12..
 */
public class Monster extends Characters {
  public Monster () {
    super(0,0,"hero.png");
    setMaxHP(2 * rolld6() + rolld6());
    setCurrentHP(getMaxHP());
    setDP(rolld6() + rolld6() / 2);
    setSP(rolld6() + getLvl());
    setLvl(1);
  }
}
