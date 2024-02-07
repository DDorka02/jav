
package tombokhasznalata;


public class TombokHasznalata {


    public static void main(String[] args) {
//        pylista = ["egy", "kettő"];
          String [] tomb = {"egy", "kettő", "három"};
          System.out.println("tomb = " + tomb);
          
          for (int i =0; i<tomb.length; i++){
            System.out.printf("[%d]=%s\n",i, tomb[i]);
          }
          
          tomb = new String[4];
          for (int i =0; i<tomb.length; i++){
            System.out.printf("[%d]=%s\n",i, tomb[i]);
          }
          tomb[2] = "zwie";
          tomb[0] = "null";
          tomb[1] = "Eins";
          tomb[3] = "Drei";
          System.out.println("Németül");
          for (int i =0; i<tomb.length; i++){
            System.out.printf("[%d]=%s\n",i, tomb[i]);
          }
            
          tomb[2] = "two";
          tomb[0] = "null";
          tomb[1] = "one";
          tomb[3] = "three";
          System.out.println("Angolul");
          for (int i =0; i<tomb.length; i++){
            System.out.printf("[%d]=%s\n",i, tomb[i]);
          }
    }
}