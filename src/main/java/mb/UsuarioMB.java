package mb;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;




//exomplo01
@ManagedBean(value = "usuarioMB")
@ViewScoped
public class UsuarioMB implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init(){
		System.out.println(" Bean UsuarioMB... ");
	}
	
	public String getMessage(){
		return "Hello World JSF!";
	}


	
	
	
}