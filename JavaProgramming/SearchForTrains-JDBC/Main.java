import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // fill your code here
    TrainManagementSystem tms = new TrainManagementSystem();

    System.out.println("Enter the source");
    String source = sc.nextLine();
    System.out.println("Enter the destination");
    String dest = sc.nextLine();
    System.out.println("Enter the coach type");
    String coachType = sc.nextLine();

    Pattern pattern = Pattern.compile("^(?i)(ac1|ac2|ac3|sleeper|seater)$");
    Matcher matcher = pattern.matcher(coachType);

    if (matcher.matches()) {
      List<Train> trains = tms.viewTrain(coachType, source, dest);
      if (trains.isEmpty()) {
        System.out.println("No trains found");
      } else {
        for (Train train : trains) {
          System.out.println(
            train.getTrainNumber() + " " + train.getTrainName()
          );
        }
      }
    } else {
      System.out.println("Invalid Coach Type");
    }
  }
}
