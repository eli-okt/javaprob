public class RoachPopulation {

  private int numRoaches;

  public RoachPopulation(int initialPopulation) {
    numRoaches = initialPopulation;
  }

  public void breed() {
    numRoaches *= 2;
  }

  public void spray(int percent) {
    numRoaches -= numRoaches * (percent / 100);
  }

  public int getRoaches() {
    return numRoaches;
  }

}
