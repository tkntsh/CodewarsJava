public class Kata 
{
    public static boolean collinearity(int x1, int y1, int x2, int y2) 
    {
        //if either vector is (0, 0), it is collinear with any vector
        if((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0)) 
        {
            return true;
        }
        //checking collinearity using cross-product: x1*y2 - y1*x2 == 0
        return x1 * y2 == y1 * x2;
    }
}
