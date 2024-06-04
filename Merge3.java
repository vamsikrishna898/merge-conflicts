class wordbyword
{
    public static void main(String[] args)
    {
        String str="TestNG,Maven,BDD,Git,Git-hub";
        String[] arrofstr = str.split(",",5);
        for(String a: arrofstr)
          System.out.println(a);
    }
}