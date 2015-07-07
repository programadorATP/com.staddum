package dao;

import javax.persistence.EntityManager;

import entidade.Usuario;

public class UsuarioDao {

	 private EntityManager entityManager;

	  /**
	   * Construtor da classe DAO que chama os m�todos do EntityManager.
	   * @param entityManager
	   */
	  public UsuarioDao(EntityManager entityManager) {
	    this.entityManager = entityManager;
	  }

	  /**
	   * M�todo para salvar ou atualizar o usuario.
	   * @param usuario
	   * @return
	   * @throws java.lang.Exception
	   */
	  public Usuario salvar(Usuario usuario) throws Exception {
	   // System.out.println("usuario o livro " + usuario.getLivro().getTitulo() + " para a pessoa " + usuario.getPessoa().getNome());
	    /* Verifica se o usuario ainda n�o est� salvo no banco de dados. */
	    if(usuario.getId() == null) {
	      /* Salva o usuario no banco de dados. */
	      this.entityManager.persist(usuario);
	    } else {
	      /* Verifica se o usuario n�o est� no estado managed. */
	      if(!this.entityManager.contains(usuario)) {
	        /* Se o usuario n�o est� no estado managed verifica se ele existe na base. */
	        if (consultarPorId(usuario.getId()) == null) {
	          throw new Exception("Livro n�o existe!");
	        }
	      }
	      /* Faz uma atualiza��o do Usuario. */
	      return entityManager.merge(usuario);
	    }

	    /* Retorna o Usuario que foi salvo, este retorno ocorre para modemos ter o id que foi salvo. */
	    return usuario;
	  }

	  /**
	   * M�todo que exclui o usuario do banco de dados.
	   * @param id
	   */
	  public void excluir(Long id) {
	    /* Consulta o usuario na base de dados atrav�s de seu ID. */
		  Usuario usuario = consultarPorId(id);
	    System.out.println("Excluindo o usuario: " + usuario.getId());
	    /* Remove o usuario da base de dados. */
	    entityManager.remove(usuario);
	  }

	  /**
	   * M�todo que consulta um Usaruio atrav�s do Id.
	   * @param id
	   * @return
	   */
	  public Usuario consultarPorId(Long id) {
	    return entityManager.find(Usuario.class, id);
	  }
	}

