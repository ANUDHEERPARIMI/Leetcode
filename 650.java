class Solution {
    public int minSteps(int n) {
        int count = Integer.MAX_VALUE;
        int[] check = new int[n+1];
        Arrays.fill(check,Integer.MAX_VALUE);
        check[1]=0;
        for(int i = 2; i<=n; i++)
        {
            int temp = 1;
            for(int j = 1; j*j<=i; j++)
            {
                if(i%j==0)
                {
                    check[i]=Math.min(check[i],check[j]+i/j);
                    if(i/j!=j)
                    {
                        check[i]=Math.min(check[i],check[i/j]+j);
                    }
                    
                }
                
               
                
            }
        }
        return check[n];
    }
}