package Pack1;

import java.lang.reflect.Method;

public class Main {
	  public static void main(String[] args) throws NoSuchMethodException {
	      Class classe = Complexe.class;
	      Method m�thode = classe.getMethod("module");
	      boolean instable = m�thode.isAnnotationPresent(Instable.class);
	      String auteur = m�thode.getAnnotation(Auteur.class).value();
	      System.out.println(auteur);
	  }
	}
