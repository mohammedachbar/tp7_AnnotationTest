package Pack1;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Instable {}

@Retention(RetentionPolicy.RUNTIME)
@interface Auteur {
   String value();
}

class Complexe {
   private double r�el;
   private double imaginaire;
   
   public Complexe(double r, double i) {
      r�el = r;
      imaginaire = i;
   }

   @Override public String toString() {
      return "["+r�el+", "+imaginaire+"]";
   }
   
   @Instable 
   @Auteur("KAMAL")
    public double module() { return 0.0; }
   
   @Instable 
   @Auteur("ADIL")
   public double argument() { return 0.0; }
}
