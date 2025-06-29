package ar.edu.unlam.crafteando;
import java.util.Map;

public class Main {
	
	public static void mostrarReceta(ObjetoComponente componente, int cantidad, int nivel, boolean soloPrimerNivel) {
	    String indentacion = "    ".repeat(nivel);
	    System.out.println(indentacion + "Ingrediente: " + componente.getNombre());
	    System.out.println(indentacion + "Cantidad: " + cantidad);

	    if (!soloPrimerNivel && componente instanceof ObjetoCompuesto) {
	        ObjetoCompuesto compuesto = (ObjetoCompuesto) componente;
	        for (Map.Entry<ObjetoComponente, Integer> entry : compuesto.obtener().entrySet()) {
	            mostrarReceta(entry.getKey(), entry.getValue(), nivel + 1, false);
	        }
	    }
	}
//	public static void mostrarReceta(ObjetoComponente componente, int cantidad, int nivel) {
//	    // Indentación
//	    String indent = "  ".repeat(nivel);
//
//	    // Mostrar nombre y cantidad
//	    System.out.println(indent + "Ingrediente: " + componente.getNombre());
//	    System.out.println(indent + "Cantidad: " + cantidad);
//
//	    // Obtener subcomponentes
//	    Map<ObjetoComponente, Integer> subcomponentes = componente.obtener();
//
//	    // Si no es básico (es decir, tiene más componentes que él mismo)
//	    if (subcomponentes.size() > 1 || !subcomponentes.containsKey(componente)) {
//	        for (Map.Entry<ObjetoComponente, Integer> entry : subcomponentes.entrySet()) {
//	            mostrarReceta(entry.getKey(), entry.getValue(), nivel + 1);
//	        }
//	    }
//	}
	
	public static void main(String[] args) {
		ObjetoCompuesto espada = new ObjetoCompuesto("Espada");
		
		ObjetoCompuesto baston= new ObjetoCompuesto("Bastón");
		ObjetoBasico madera = new ObjetoBasico("Madera");
		baston.agregar(madera);
		
		
		ObjetoCompuesto cuerdaReforzada = new ObjetoCompuesto("Cuerda Reforzada");
		ObjetoBasico cuerdaComun = new ObjetoBasico("Cuerda Común");
		cuerdaReforzada.agregar(cuerdaComun);
		cuerdaReforzada.agregar(cuerdaComun);
		cuerdaReforzada.agregar(cuerdaComun);
		cuerdaReforzada.agregar(cuerdaComun);
		
		ObjetoCompuesto cuerdaSubReforzada = new ObjetoCompuesto("Cuerda SubReforzada");
		ObjetoBasico cuerdaComun2 = new ObjetoBasico("Cuerda Común");
		cuerdaSubReforzada.agregar(cuerdaComun2);
		
		cuerdaReforzada.agregar(cuerdaSubReforzada);
		
		
		ObjetoBasico hierro = new ObjetoBasico("Hierro");
		espada.agregar(baston);
		espada.agregar(hierro);
		espada.agregar(cuerdaReforzada);
		
		
		Map<ObjetoComponente, Integer> elementosDeEspada = espada.obtener();
		
//		for (Map.Entry<ObjetoComponente, Integer> ingrediente : elementosDeEspada.entrySet()) {
//		    System.out.println("Ingrediente: " + ingrediente.getKey().getNombre());
//		    System.out.println("Cantidad: " + ingrediente.getValue());
//		    
//		    Map<ObjetoComponente, Integer> elementosDeBaston = ingrediente.getKey().obtener();
//		    for (Map.Entry<ObjetoComponente, Integer> elemento : elementosDeBaston.entrySet()) {
//			    System.out.println("Ingrediente: " + elemento.getKey().getNombre());
//			    System.out.println("Cantidad: " + elemento.getValue());
//		    }
//		}
		
//		System.out.println("DESCOMPOSICIÓN DE ESPADA:");
//		for (Map.Entry<ObjetoComponente, Integer> ingrediente : elementosDeEspada.entrySet()) {
//		    System.out.println("Ingrediente: " + ingrediente.getKey().getNombre());
//		    System.out.println("Cantidad: " + ingrediente.getValue());
//
//		    // Solo si el ingrediente es compuesto, tiene más objetos adentro
//		    Map<ObjetoComponente, Integer> subcomponentes = ingrediente.getKey().obtener();
//		    if (subcomponentes.size() > 1 || !subcomponentes.containsKey(ingrediente.getKey())) {
//		        for (Map.Entry<ObjetoComponente, Integer> sub : subcomponentes.entrySet()) {
//		            System.out.println("  Subingrediente: " + sub.getKey().getNombre());
//		            System.out.println("  Cantidad: " + sub.getValue());
//		        }
//		    }
//		}
		
		
		
		
		
		
//		for (Map.Entry<ObjetoComponente, Integer> entry : espada.obtener().entrySet()) {
//		    mostrarReceta(entry.getKey(), entry.getValue(), 1, false);
//		}
		
		
		
		espada.mostrarConstruccion(false);
//		ObjetoCompuesto o = new ObjetoCompuesto("Objeto de prueba");
//		o.mostrarConstruccion(true);
//		madera.mostrarConstruccion(false);
		
//		espada.descomponerEnBasicos();
		
	}
//    public static void main(String[] args) {
//    	Recetario recetario = new Recetario();
//        ObjetoBasico madera = new ObjetoBasico("Madera", 1);
//        ObjetoBasico hierro = new ObjetoBasico("Hierro", 1);
//        ObjetoCompuesto baston = new ObjetoCompuesto("Bastón");
////        ObjetoCompuesto espada = new ObjetoCompuesto("Espada");
//
//        Receta recetaBaston = new Receta("Bastón", 10);
//        recetaBaston.agregarIngrediente(madera, 2);
//        recetario.agregarReceta(recetaBaston);
//
//        Receta recetaEspada = new Receta("Espada", 30);
//        recetaEspada.agregarIngrediente(baston, 1);
//        recetaEspada.agregarIngrediente(hierro, 1);
//        recetario.agregarReceta(recetaEspada);
//        
////        if (1 == recetario.getRecetas().size()) {
////        	System.out.println("DIO BIEN EL PRIMER TEST");
////        }
//        System.out.println(recetaEspada.listarIngredientesDesdeCero(baston));
//
//        
////        recetario.mostrarRecetaDesdeCero("Espada");
////        recetario.mostrarRecetaDesdeCero("Bastón");
////        recetario.mostrarReceta("Bastón");
////        recetario.mostrarReceta("Espada");
//    }
}
