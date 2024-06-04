class employee
{
    public static void main(String[] args)
    {
        int a[]=[1,2,3,4,5,6,7];
        int even=0,odd=0;
        for(int i=0;i<7;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even number count : "+even);
        System.out.println("Even number count : "+odd);
    }
}