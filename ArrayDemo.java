public class ArrayDemo {
   public static void main(String[] args) {
      int LA[] = new int[5];
      System.out.println("Array:");
      for (int i = 0; i < 5; i++) {
         LA[i] = i + 3;
         System.out.println("LA[" + i + "] = " + LA[i]);
      }
      for (int i = 0; i < 5; i++) {
         if (LA[i] == 7)
            System.out.println("Element " + 7 + " is found at index " + i);
      }
   }
}