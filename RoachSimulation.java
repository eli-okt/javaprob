class RoachSimulation {
  
  public static void main(String[] args) {

    RoachPopulation roaches = new RoachPopulation(10);
    
    for (int i = 1; i <= 4; i++) {
      roaches.breed();
      roaches.spray(10);
      System.out.println("Roach count after cycle " + i + ": " + roaches.getRoaches());

    }
  }
}