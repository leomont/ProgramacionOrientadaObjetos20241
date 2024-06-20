package edu.ucaldas.poo.guiMenuStudentManagment;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JDesktopPane;
import java.awt.Color;


public class Empleado extends JFrame {
	public Empleado() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 243, 450, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(62, 28, 117, 29);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(84, 124, 117, 29);
		getContentPane().add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 205, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

	private String NumeroEmpleado;
	private String PerfilEmpleado;
	private float Salario;
	private JTextField textField_1;

	
	
	public String getNumeroEmpleado() {
		return NumeroEmpleado;
	}
	public void setNumeroEmpleado(String numeroEmpleado) {
		NumeroEmpleado = numeroEmpleado;
	}
	public String getPerfilEmpleado() {
		return PerfilEmpleado;
	}
	public void setPerfilEmpleado(String perfilEmpleado) {
		PerfilEmpleado = perfilEmpleado;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	


	public void AsignarPerfil(String NombrePerfil) {
		
		Empleado empleado = new Empleado();
		
		empleado.setPerfilEmpleado(NombrePerfil);	
		
		System.out.println("El perfil asignado al empleado es:" + empleado.getPerfilEmpleado());
		
	}
}
