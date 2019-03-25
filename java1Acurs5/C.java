public class C {
    int x = 4;
    
    public void m() {
        int y = 5;
        
        class ClasaLocala {
            int x = 1;
            public void m() {
                //y++;
                System.out.println(y);
                System.out.println(x); // 1
                System.out.println(C.this.x); // 4
                // "this" este static si privat
            }
        }
        
        System.out.println(y);
    }
}