public class MoreVariablesAndPrinting
{
  public static void main( String[] args )
  {
    String Name, Eyes, Teeth, Hair;
    int Age, Height, Weight;
    Name= "Aidan Winter";
    Age = 17;/* not a lie */
    Height = 68;/* inches*/
    Weight = 130;/* lbs*/
    Eyes = "Blue";
    Teeth = "White";
    Hair = "Brown";

    //Conversions//
    Weight=(int) (Weight * 0.453592);
    Height=(int) (Height * 2.54);

    //Prints//

    System.out.println("Let's talk about " + Name + "." );
    System.out.println("He's " + Height +" centimeters tall." );
    System.out.println("He's " + Weight + " kilograms heavy." );
    System.out.println("Actually, that's not too heavy." );
    System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair." );
    System.out.println("His teeth are usually " + Teeth + " depending on the coffee." );
    /* This line is tricky;
     * try to get it exactly right.*/
    System.out.println("If I add "+Age+", "+Height+", and "+Weight+" I get "+(Age+Height+Weight)+".");
    }
  }
