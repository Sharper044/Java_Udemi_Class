/**
 * Flow
 */
import java.util.Scanner;

public class Flow {

  public static void main(String[] args) {
    printSquareStar(20);
  }

  public static void printNumberInWord(int number) {
    switch (number) {
      case 0:
        System.out.println("ZERO");
        break;
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default: 
        System.out.println("OTHER");
    }
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

  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12 || year < 1 || year > 9999) {
      return -1;
    }

    switch (month) {
      case 2:
        return isLeapYear(year) ? 29 : 28;
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        return 31;
      default:
        return 30;
    }
  }

  public static boolean isOdd(int x) {
    return x > 0 && x % 2 == 1;
  }

  public static int sumOdd(int start, int end) {
    if (start > end || start < 1 || end < 1) {
      return -1;
    }

    int i = isOdd(start) ? start : start + 1;
    int sum = 0;

    for (; i <= end; i += 2) {
      sum += i;
    }

    return sum;
  }

  public static boolean isPalindrome(int x0) {
    int reverse = 0;
    int x1 = x0;
    while(true) {
      reverse = (reverse * 10) + (x1 % 10);
      x1 /= 10;
      if (x1 == 0) break;
    }
    return x0 == reverse;
  }

  public static int sumFirstAndLastDigit(int x0) {
    if (x0 < 0) {
      return -1;
    }

    int first = x0 % 10;

    int willBeLast = x0;
    while(true) {
      if (willBeLast / 10 == 0) break;
      willBeLast /= 10;
    }
    return first + willBeLast;
  }

  public static int getEvenDigitSum(int x0) {
    if (x0 < 0) {
      return -1;
    }

    int sum = 0;
    int x1 = x0;

    while(true) {
      if (x1 % 10 % 2 == 0) sum += x1 % 10;
      x1 /= 10;
      if (x1 == 0) break;
    }
    return sum;
  }

  public static boolean hasSharedDigit(int x, int y) {
    if (x < 10 || x > 99 || y < 10 || y > 99) return false;

    int a = x % 10;
    int b = x / 10;
    int c = y % 10;
    int d = y / 10;

    return a == c || a == d || b == c || b == d;
  }

  public static boolean hasSameLastDigit(int x, int y, int z) {
    if (!isValid(x) || !isValid(y) || !isValid(z)) return false;

    int xf = x % 10;
    int yf = y % 10;
    int zf = z % 10;

    return xf == yf || yf == zf || zf == xf;
  }

  public static boolean isValid(int x) {
    return x >= 10 && x <= 1000;
  }

  public static int getGreatestCommonDivisor(int x, int y) {
    if (x < 10 || y < 10) return -1;

    int gcd = x < y ? x : y;
    while (x % gcd != 0 || y % gcd != 0) {
      gcd--;
    }
    return gcd;
  }

  public static void printFactors(int x) {
    if (x < 1) {
      System.out.println("Invalid Value");
    } else {
      for (int i = 1; i <= x; i++) {
        if (x % i == 0) {
          System.out.println(i);
        }
      }
    }
  }

  public static boolean isPerfectNumber(int x) {
    if (x < 1) return false;

    int sum = 0;

    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        sum += i;
      }
    }

    return sum == x;
  }

  public static void numberToWords(int x) {
    if (x < 0) {
      System.out.println("Invalid Value");
    } else {
      int length = getDigitCount(x);
      int x1 = reverse(x);

      for (int i = 0; i < length; i++) {
        switch (x1 % 10) {
          case 0:
            System.out.println("Zero");
            break;
          case 1:
            System.out.println("One");
            break;
          case 2:
            System.out.println("Two");
            break;
          case 3:
            System.out.println("Three");
            break;
          case 4:
            System.out.println("Four");
            break;
          case 5:
            System.out.println("Five");
            break;
          case 6:
            System.out.println("Six");
            break;
          case 7:
            System.out.println("Seven");
            break;
          case 8:
            System.out.println("Eight");
            break;
          case 9:
            System.out.println("Nine");
            break;
          default: 
            System.out.println("OTHER");
        }
        x1 /= 10;
      }
    }
  }

  public static int reverse(int x0) {
    int reverse = 0;
    int x1 = x0;
    while(true) {
      reverse = (reverse * 10) + (x1 % 10);
      x1 /= 10;
      if (x1 == 0) break;
    }
    return reverse;
  }

  public static int getDigitCount(int x) {
    if (x < 0) return -1;

    int count = 0;
    int x1 = x;
    while (true) {
      if (x1 / 10 == 0) break;
      count++;
      x1 /= 10;
    }
    return count;
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

    int goalDevidedByFive = goal / 5;
    int bigBagsUsed = bigCount > goalDevidedByFive ? goalDevidedByFive : bigCount;
    int remainingFlour = goal - (bigBagsUsed * 5);
    return smallCount >= remainingFlour;
  }

  public static int getLargestPrime(int x) {
    if (x <= 1) return -1;
    if (x == 2) return 2;

    for (int i = x; i > 0; i--) {

      if (x % i == 0) {
        boolean isPrime = true;
        for (int j = 2; j <= (int) Math.sqrt(i); j++) {
          if (i % j == 0) {
            isPrime = false;
          }
        }
        if (isPrime) {
          return i;
        } else {
          isPrime = true;
        }
      }
    }
    return -1;
  }

  public static void printSquareStar(int x) {
    if (x < 5) {
      System.out.println("Invalid Value");
    } else {
      String space = " ";
      String star = "*";
      String line = "";
      String solid = "";
      for (int i = 0; i < x; i++) {
        solid += star;
      }

      int end = x - 2;
      int start = 1;
  
      System.out.println(solid);
      for (int j = 1; j < x - 1; j++) {
        for (int k = 0; k < x; k++) {
          if (k == 0 || k == end || k == start || k == x - 1) {
            line += star;
          } else {
            line += space;
          }
        }
        System.out.println(line); 
        line = "";
        end--;
        start++;
      }
      System.out.println(solid);
    }
  }

  public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int count = 0;

    while(scanner.hasNextInt()) {
      sum += scanner.nextInt();
      count++;
    }
    long avg = count == 0 ? 0 : Math.round((double) sum / (double) count);
    System.out.println("SUM = " + sum + " AVG = " + avg);
    scanner.close();
  }

  public static int getBucketCount(double w, double h, double apb, int extraBuckets) {
    if (w <= 0 || h <= 0 || apb <= 0 || extraBuckets < 0) return -1;

    return (int) Math.ceil(((w * h) / apb) - (double) extraBuckets);
  }

  public static int getBucketCount(double w, double h, double apb) {
    if (w <= 0 || h <= 0 || apb <= 0) return -1;

    return (int) Math.ceil((w * h) / apb);
  }

  public static int getBucketCount(double a, double apb) {
    if (a <= 0 || apb <= 0) return -1;

    return (int) Math.ceil(a / apb);
  }
}