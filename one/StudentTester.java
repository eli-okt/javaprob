class StudentTester {
  
  public static void main(String[] args) {
    
    Student student1 = new Student("Elif Oktay");

    student1.addScore(90);
    student1.addScore(95);
    student1.addScore(85);

    System.out.println("Name: " + student1.getName());
    System.out.println("Total score: " + student1.getTotalScore());
    System.out.println("Average score: " + student1.getAverageScore());
    
  }
}
