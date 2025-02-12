public class TypeConversion {
  public static void main(String[] args) {
    float myFloat = 5;
    // float myFloat = 5L; // implicit conversion from long to float
    // float myFloat = 5d; // cannot convert from double to float
    System.out.println(myFloat); // 5.0

    int newFloat = (int) 5.10f; // explicit conversion or casting
    System.out.println(newFloat); // 5
  }
}
