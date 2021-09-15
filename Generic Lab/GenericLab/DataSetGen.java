/**
 *Week 2 Generic Lab Assignment
 *@author Huynh Ngo
 *
*/


/**
 * Create generic class, DataSetGen using 
 * Measurable to instantiate generic interface
*/
public class DataSetGen <A extends Measurable> 
{
   private double sum;
   private A maximum;
   private double count;


   /**
    * Constructor for empty data set.
   */
   public DataSetGen()
   {
	  sum = 0;
      count = 0;
      maximum = null;
   }

   /**
    * Adds data value to data set.
    * @param x a data value
   */
   public void add (A x) // how to define a generic non-static method??
   {
	sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }

   /**
    * Gets average of added data.
    * @return average or zero if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum/count;
   }

   /**
    * Gets largest added data.
    * @return associated measurable object, maximum, 
    * or zero if no data has been added
   */
   public A getMaximum()
   {
      return maximum;
   }
}