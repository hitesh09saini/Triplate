public class triplate {
    public static void name(int a[]) {
        int n = a.length;
        int r = 0, c = 0;
        int x=-1,y=-1,z=-1;
        for (int i = 0; i < n; i++) {
            r = a[i];
            for (int j = 1+i; j < n; j++) {
                r += a[j];
                for (int k = j+1; k < n; k++) {
                    r += a[k];
                     System.out.print("["+i+","+j+","+k+"] \n\n");
                    if (r == 0) {
                      x=i;
                      y=j;
                      z=k;
                     System.out.print("["+a[x]+","+a[y]+","+a[z]+"] ");
                        c++;x--;y--;z--;
                        
                      
                    }

                    r -= a[k];

                } 
                
                r -= a[j];
              
            }
           
            r -= a[i];
            
        }
        System.out.println("\n\nTriplate numbers : " + c);
       
    }

    public static void main(String[] args) {
        int a[] = { -1, 0, 1, 2, -1, -4 };
        name(a);
    }
}
