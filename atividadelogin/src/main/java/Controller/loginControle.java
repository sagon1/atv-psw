package Controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;



	@Named

	@RequestScoped

	public class loginControle implements Serializable {

		String usuario;

		String senha;

		

		public String validarAcesso() {

			if("Guilherme".equals(usuario) && "123".equals(senha)) {



			return "menu";	

			}

			else {

			return "login";

		}

		}

		

		public String getUsuario() {

			return usuario;	

		



	}

		public void setUsuario(String usuario) {

			this.usuario = usuario;

		}



		public String getSenha() {

			return senha;

			

		}

		

		public void setSenha(String senha) {

			this.senha = senha;

		}




}


