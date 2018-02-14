package com.wisdom.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "DemoBean")
@ViewScoped
public class DemoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String firstname;
	private String surname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void savePerson(ActionEvent actionEvent) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Welcome " + firstname + " " + surname + "!"));
	}
}