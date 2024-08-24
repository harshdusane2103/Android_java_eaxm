public class Largest_element {
    static public void main(String args[])
    {
        int a[]={1,10,50,100,110,120,150};

        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Largest element is: "+max);
    }
}
