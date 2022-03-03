public class Main
{
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;
    //----------------------------------------------------------
    // Creates an array, fills it with various integer values,
    // modifies one value, then prints them out.
    //----------------------------------------------------------

    public static void main (String[] args)
    {
        System.out.println ("Alexa Torres, Classwork 6.0");
        System.out.println ();

        int[] list = new int[LIMIT];

        //Initialize the array values
        for (int index = 0; index < LIMIT; index++)
        {
            list[index] = index * MULTIPLE;
        }//End for loop

        list[5] = 999; //Change array value
        for (int index = 0; index < LIMIT; index++)
        {
            System.out.println (list[index] + " ");
        }//End for loop
        System.out.println ();
    }//End main method
}//End class Main
