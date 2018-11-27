package Pack1;

import java.lang.reflect.Method;

public class Main {
	  public static void main(String[] args) throws NoSuchMethodException {
	      Class classe = Complexe.class;
	      Method méthode = classe.getMethod("module");
	      boolean instable = méthode.isAnnotationPresent(Instable.class);
	      String auteur = méthode.getAnnotation(Auteur.class).value();
	      System.out.println(auteur);
	  }
	}
