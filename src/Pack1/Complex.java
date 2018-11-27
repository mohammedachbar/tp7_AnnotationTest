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
   private double réel;
   private double imaginaire;
   
   public Complexe(double r, double i) {
      réel = r;
      imaginaire = i;
   }

   @Override public String toString() {
      return "["+réel+", "+imaginaire+"]";
   }
   
   @Instable 
   @Auteur("KAMAL")
    public double module() { return 0.0; }
   
   @Instable 
   @Auteur("ADIL")
   public double argument() { return 0.0; }
}
