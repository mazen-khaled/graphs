package MyBack;

public class disFunctions {
	disFunctions(){
		
	}
	
	int Bernoulli(double p) {
		int x=(int) ( Math.pow(p, 0) * Math.pow(1-p,1) * 100 );
		return x*=3.2; //3.2 factor of the y-axis
	}
	
	double Binomial(int n, int k, double p)
	{
		double x = (nCr(n, k) * Math.pow(p, k) * Math.pow(1 - p , n - k))*100;
		return x*=3.2; //3.2 factor of the y-axis
	}
	
	double geometric(int k, double p)
    {
		double x = (Math.pow(1-p , k-1) *p)*100;
        return x*=3.2; //3.2 factor of the y-axis
    }
	
	double negativeBinomial(int r,int k, double p)
    {
		double x = nCr(k-1,r-1) * Math.pow(p, r) * Math.pow(1 - p , k - r) * 100;
        return x*=3.2; //3.2 factor of the y-axis
    }
	
	double hypergeometric(int N,int n,int K, int j)
    {
		double x = ((double) (nCr(K,j) * nCr(N-K,n-j)) / (double) nCr(N,n))*100;
		System.out.println(x);
        return x*=3.2; //3.2 factor of the y-axis
    }
	
	static int nCr(int n, int r)
	{
	    return fact(n) / (fact(r) * fact(n - r));
	}
	
	static int fact(int n)
	{
	    int result = 1;
	    for (int i = 2; i <= n; i++)
	        result = result * i;
	    return result;
	}	    	
}
