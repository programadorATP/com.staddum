package mb;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import entidade.Usuario;




//exomplo01
@ManagedBean(value = "mbUsuario")
@ViewScoped
public class MbUsuario implements Serializable {

	
	@PostConstruct
    public void init() {
//        showQuestions = true;
//        UUID uuid = UUID.randomUUID();
//        CookieHelper ch = new CookieHelper();
//        ch.setCookie("COOKIE_UUID_SURVEY", uuid.toString(), 60 * 60 * 24 * 365 * 10);
    }
	
}