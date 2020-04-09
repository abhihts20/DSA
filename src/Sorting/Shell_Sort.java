package Sorting;

class ArrayShell{
    private long[] a;
    private int nElems;
    public ArrayShell(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    } //-------------------------------------------------------------

    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    } //-------------------------------------------------------------

    public void display()             // displays array contents
    {
        for (int j = 0; j < nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }

    public void ShellSort(){
        int inner,outer;
        long temp;
        int h=1;
        while (h<=nElems/3)
            h=h*3+1;
        while (h>0){
            for (outer=h;outer<nElems;outer++){
                temp=a[outer];
                inner=outer;
                while (inner>h-1&&a[inner-1]>=temp){
                    a[inner]=a[inner-h];
                    inner-=h;
                }
                a[inner]=temp;
            }
            h=(h-1)/3;
        }
    }
}

public class Shell_Sort {
    public static void main(String[] args) {
        int max=10;
        ArrayShell arrayShell=new ArrayShell(max);
        for (int i=0;i<max;i++){
            long n=(int)(Math.random()*99);
            arrayShell.insert(n);
        }

    }
}
