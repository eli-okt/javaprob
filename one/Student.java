public class Student {

  private String name;
  private double totalScore;
  private int numQuizzes;

  public Student(String studentName) {
    name = studentName;
    totalScore = 0;
    numQuizzes = 0;
  }
  
  public String getName() {
    return name;
  }
  
  public void addScore(double score) {
    totalScore += score;
    numQuizzes++;
  }
  
  public double getTotalScore() {
    return totalScore;
  }
  
  public double getAverageScore() {
    return (double) totalScore / numQuizzes;
  }
  
}
