public class ASCENDING {
    public static void main(String[] args) {
       int  a[]={11,122,3,41,6,5};
       int max=0;

       for(int i=0;i<a.length;i++)
       {
           if(a[i]>max && max<a[i])
           {
               System.out.println(a[i]);
           }
       }



    }
}
