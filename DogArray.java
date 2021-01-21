public class DogArray
{
 /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
    {
      int youngestIndex = 0;
      int youngestAge = dogs[0].getAge();
      for (int i=0;i<dogs.length;i++) {
        if (dogs[i].getAge()<youngestAge) {
          youngestAge = dogs[i].getAge();
          youngestIndex = i;
        }
      }
      return youngestIndex;
    }

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
      return dogs[getYoungestIndex(dogs)].getName();
    }
}
