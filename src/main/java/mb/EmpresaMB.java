package mb;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;



@ManagedBean(value = "EmpresaMB")
@ViewScoped
public class EmpresaMB implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init(){
		System.out.println(" Bean EmpresaMB... ");
	}
	

}
