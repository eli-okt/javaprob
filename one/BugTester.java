public class BugTester {
  
  public static void main(String[] args) {
    
    Bug bugsy = new Bug(8);
    
    bugsy.move();
    System.out.println(bugsy.getPosition());
    bugsy.turn();
    bugsy.move();
    bugsy.move();
    System.out.println(bugsy.getPosition());
    bugsy.turn();
    bugsy.move();
    bugsy.move();
    bugsy.move();
    bugsy.move();
    System.out.println(bugsy.getPosition());

  }
}
