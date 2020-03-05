package br.unitins.books.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.books.model.Usuario;

@Named
@ViewScoped
public class UsuarioController implements Serializable{

private static final long serialVersionUID = -563227102506849534L;
	
	private Usuario usuario;
	private List<Usuario> listaUsuario;
	
	public List<Usuario> getListaUsuario() {
		if(listaUsuario == null)
			listaUsuario = new ArrayList<Usuario>();
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public void incluir() {
		listaUsuario.add(this.getUsuario());
		limpar();
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void excluir() {
		listaUsuario.remove(this.getUsuario());
	}
	public void limpar() {
		usuario = null;
	}
	public void editar(Usuario user) {
		this.setUsuario(user);
	}
	
	public void alterar() {
		
	}
}
