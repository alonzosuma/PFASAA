package com.sjprogramming.restapi.Clase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	@Column(name = "Estudiante_Nombre")
	private String Nombre;
	@Column(name="Estudiante_Porcentaje")
	private float Porcentaje;
	@Column(name="Estudiante_Ram")
	private String Rama;

	public Estudiante() {
	}
	
	
	public Student(String Nombre, float Porcentaje, String Rama) {
		super();
		this.Nombre = Nombre;
		this.Porcentaje = Porcentaje;
		this.Rama = Rama;
	}


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public float getPorcentaje() {
		return Porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.Porcentaje = porcentaje;
	}
	public String getRama() {
		return Rama;
	}
	public void setRama(String rama) {
		this.Rama = rama;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + Nombre + ", percentage=" + Porcentaje + ", branch=" + Rama
				+ "]";
	}

}
