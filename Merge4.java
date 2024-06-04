class countupper
{
    public static void main(String args[])
    {
            String str ="Welcome TO Automation Learning";
            String Upper_let="",Lower_let="";
            int Upper=0,Lower=0;
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    Upper++;
                    Upper_let=ch+Upper_let;
                }
                else
                {
                   
                        Lower++;
                        Lower_let=ch+Lower_let;
                    
                }
            }
            System.out.println("Number of Upper characters : "+Upper +" Letters are : "+Upper_let);
            System.out.println("Number of Upper characters : "+Lower +" Letters are : "+Lower_let);
        }
        
    }


