package edu.ucaldas.poo.guiMenuStudentManagment;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;

public class Team extends JFrame{
	public Team() {
		
		JLabel lblNewLabel = new JLabel("Realizar Apuesta");
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

}
