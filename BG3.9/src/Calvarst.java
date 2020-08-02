import java.util.*; 
  
class Calvarst
{ 
  
    static double variance(double a[],  
                           int n) 
    { 
        
        double sum = 0; 
          
        for (int i = 0; i < n; i++) 
            sum += a[i]; 
        double mean = (double)sum /  
                      (double)n; 
      
        
        double sqDiff = 0; 
        for (int i = 0; i < n; i++)  
            sqDiff += (a[i] - mean) *  
                      (a[i] - mean); 
          
        return (double)sqDiff / n; 
    } 
      
    static double standardDeviation(double arr[],  
                                    int n) 
    { 
        return Math.sqrt(variance(arr, n)); 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of entries");
    int num= sc.nextInt();
    double arr[]= new double[num];
    for(int i=0; i<num;i++) {
    System.out.println("Enter the elements");
    double element= sc.nextDouble();
    arr[i]= element;
    }
    int n = arr.length; 
      
    System.out.println( "Variance: " +  
                         variance(arr, n)); 
    System.out.println ("Standard Deviation: " +  
                         standardDeviation(arr, n));  
    sc.close();
      
    } 
} 