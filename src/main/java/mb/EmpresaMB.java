package mb;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;



@ManagedBean(value = "EmpresaMB")
@ViewScoped
public class EmpresaMB {
	
	
	
	@PostConstruct
	public void init(){
		System.out.println(" Bean EmpresaMB... ");
	}
	

}
