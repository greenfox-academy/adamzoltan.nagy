package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    return LocalDate.parse(str);
    // TODO - return with the parsed date; format is: yyyy-MM-dd
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    return date.format(DateTimeFormatter.ofPattern("MM. dd."));
    // TODO - return the date formatted: month & day (MM. dd.)
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    return (LocalDate.now() == date);
    // TODO - return with true if today is the same month+day as date
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    return LocalDate.now().getYear() - birthday.getYear();
    // TODO - return how many years age the input date 'birthday' was
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    int num = (LocalDate.now().getDayOfYear() - date.getDayOfYear());
    return num ;
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}
