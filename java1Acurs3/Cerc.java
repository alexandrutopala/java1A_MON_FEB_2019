public class Cerc {
    Punct centru;
    int r;
    
    
    Cerc(Punct centru, int r) {
        this.centru = centru;
        this.r = r;
    }
    
    double getArie() {
        return Math.PI * r * r;
    }
    
    boolean isInside(Punct p) {
        double dist = centru.getDistance(p);
        return dist <= r;
        
        /*
         * if (dist <= r) {
         *      return true;   
         *  } else {
         *      return false;   
         *  }
         */
    }
    
    
    
    
    
    
    
    
    
    
    
}