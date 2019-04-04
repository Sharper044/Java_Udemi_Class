package testfile.bob;
/**
 * Variables
 */
public class Variables {

  public static void main(String[] args) {
    printYearsAndDays(minutes); 
  }

  public static long toMilesPerHour(double kilometersPerHour) {
    if(kilometersPerHour < 0) {
        return -1;
    }
    return Math.round(kilometersPerHour / 1.609);
  }

  public static void printConversion(double kilometersPerHour) {
    if(kilometersPerHour < 0) {
        System.out.println("Invalid Value");
    } else {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
        System.out.println("Invalid Value");
    } else {
        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
    }
  }

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24))) {
        return true;
    }
    return false;
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
        return false;
    }
    
    if (year % 4 == 0) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } 
        return true;
    } else {
        return false;
    }
  }

  public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
    int x1 = (int) (x * 1000);
    int y1 = (int) (y * 1000);
    return x1 == y1;
  }

  public static boolean hasEqualSum(int x, int y, int sum) {
    return x + y == sum;
  }

  public static boolean hasTeen(int x, int y, int z) {
    return isTeen(x) || isTeen(y) || isTeen(z);
  }

  public static boolean isTeen(int x) {
    return x > 12 && x < 20;
  }

  public static double area(double radius) {
    if (radius < 0) {
      return -1.0;
    }
    return Math.PI * radius * radius;
  }

  public static double area(double x, double y) {
    if (x < 0 || y < 0) {
      return -1.0;
    }
    return x * y;
  }

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
    } else {
      int minutesPerYear = 60 * 24 * 365;
      int years = (int) minutes / minutesPerYear;
      int days = (int) (minutes % minutesPerYear) / (60 * 24);

      System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
  }

  public static void printEqual(int x, int y, int z) {
    if (x < 0 || y < 0 || z < 0) {
      System.out.println("Invalid Value");
    } else if (x == y && y == z) {
      System.out.println("All numbers are equal");
    } else if (x == y || y == z || z == x) {
      System.out.println("Neither all are equal or different");
    } else {
      System.out.println("All numbers are different");
    }
  }

  public static boolean isCatPlaying(boolean summer, int temp) {
    return summer ? (temp > 24 && temp < 46) : (temp > 24 && temp < 36);
  }

}