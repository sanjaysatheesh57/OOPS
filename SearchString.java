import java.util.Scanner;

public class SearchString {
   public static void main(String[] var0) {
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      Scanner var6 = new Scanner(System.in);
      System.out.println("Enter no.of elements in an array ");
      int var7 = var6.nextInt();
      String[] var8 = new String[var7];
      System.out.println("Enter" + var7 + "words");

      int var1;
      for(var1 = 0; var1 < var7; ++var1) {
         var8[var1] = var6.next();
      }

      System.out.println("Enter element to be searched:");
      String var9 = var6.next();

      for(var1 = 0; var1 < var7; ++var1) {
         if (var8[var1].equals(var9)) {
            var3 = var1 + 1;
            var5 = true;
            break;
         }
      }

      if (var5) {
         System.out.println("Element found at position=" + var3);
      } else {
         System.out.println("Element not found");
      }

   }
}
