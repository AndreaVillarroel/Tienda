package categoria.entity;

import categoria.view.RegistroCategoria;
public class CategoriaNoExistente extends Exception{
	
	private static final long serialVersionUID = 1L;
	public CategoriaNoExistente() {
		super("La categoria no existe!");
	}
		
		
	}


