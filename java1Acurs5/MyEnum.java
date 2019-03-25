public enum MyEnum {
    CT1 {
        @Override
        public void m() {
            
            System.out.println("o metoda care nu mai e abstracta");
        }
    };
    
    
    
    public abstract void m();
}