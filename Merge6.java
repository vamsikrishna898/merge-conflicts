class duplicatechar
{
    public static void main(String[] args)
    {
        String str ="Vamsi krishna";
        int count=0;
       char[] str1=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str1[i]==str1[j])
                {
                    count++;
                }
            }
        }
        System.out.println("Number of duplicate characters : "+count);
    }
}