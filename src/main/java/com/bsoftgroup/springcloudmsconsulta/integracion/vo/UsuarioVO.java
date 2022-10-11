package com.bsoftgroup.springcloudmsconsulta.integracion.vo;

public class UsuarioVO {
	private String login;
	private String password;
	private String token;

	public UsuarioVO() {
	}

	public UsuarioVO(String login, String password, String token) {
		this.login = login;
		this.password = password;
		this.token = token;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
