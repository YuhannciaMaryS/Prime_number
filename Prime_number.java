// Time Complexity : O(N)
// Space Complexity : O(1)
public class Main
{
  public static void main (String[]args)
  {
    int n = 23;
      checkPrime (n);
  }

  private static void checkPrime (int n)
  {
    int count = 0;

    // negative numbers, 0 and 1 are not prime
    if (n < 2)
      {
	System.out.println ("The given is number " + n + " is not prime");
	System.exit (0);
      }
    // checking the number of divisors b/w [1, n]
    for (int i = 1; i <= n; i++)
      {
	if (n % i == 0)
	  count += 1;
      }

    // if count of divisors greater than 2 then its not prime 
    if (count > 2)
      System.out.println ("The given is number " + n + " is not prime");

    else
      System.out.println ("The given is number " + n + " is prime");
  }
}
