import static java.lang.System.out;

public abstract class Automaton {

   public abstract boolean accept(String w);
   
   public void test(String w) {
      header(w); 
      boolean result = accept(w);
      out.printf("  %s", (result ? "Accept" : "Reject"));
      out.println();
   }
   
   static void header(String w) {
      for (int j=0; j<w.length(); j++) 
          out.printf("%8s", w.charAt(j));
      out.println();
   }
   static void test(Automaton a, String[] args) {
      if (args.length==0)  //default strings for testing
          args = new String[] {"10", "0101", "01001010"};
      for (String w: args) {
          a.test(w); out.println();
      }
   }
}