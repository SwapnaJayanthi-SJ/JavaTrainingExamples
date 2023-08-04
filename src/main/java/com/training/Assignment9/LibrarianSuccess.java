package com.training.Assignment9;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LibrarianSuccess extends JFrame 
{
	private final HashMap<String, Library> librarian;

	private static LibrarianSuccess instance;

	LibrarianSuccess() {
		librarian = new HashMap<>();
	}

	/**
	 * getInstance Method return the Instance of the class
	 * 
	 * @return
	 */
	public static LibrarianSuccess getInstance() {
		if (instance == null) {
			instance = new LibrarianSuccess();
		}
		return instance;
	}

	/**
	 * Add the Librarians to the Map, UserName as Key and Password as Value
	 */
	public void addLibrarian(String name, Library libraria) {
		librarian.put(name, libraria);
	}

	/**
	 * Return the collection of librarian
	 * 
	 * @return
	 */
	public HashMap<String, Library> getLibrarian() {
		return librarian;
	}
}
