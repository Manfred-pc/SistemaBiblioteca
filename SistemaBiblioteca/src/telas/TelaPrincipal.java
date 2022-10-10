package telas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TelaPrincipal extends JFrame{
	private JPanel panel1, panel2, panel3;
	private JLabel titulo;
	private static JTable tabela;
	private static String [] colunas = {"Número Exemplar","Nome","Editora", "Ação"};
	private static Object [][] dados = {};
	
	
	public TelaPrincipal() {
	
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		titulo = new JLabel("Sistema de Controle de Biblioteca");
		
		
		//panel1
		add(panel1);
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setLayout(null);
		panel1.setBounds(0, 0, 950, 150);
		panel1.add(titulo);
		
		titulo.setBounds(500, 50, 400, 50);
		
		
		//tabela 
		TableModel tableModel = new DefaultTableModel(dados,colunas);
		//tabela = new JTable(dados,colunas);
		tabela = new JTable(tableModel);
		JScrollPane barraRolagem = new JScrollPane(tabela);		
		getContentPane().add(barraRolagem);
		barraRolagem.setBounds(0,600, 980,600);
		
		
		
		
		add(panel2);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setLayout(null);
		panel2.setBounds(0, 230, 950, 150);
		
		
		add(panel3);
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setLayout(null);
		panel3.setBounds(0, 430, 950, 150);

		
		
		//JFrame configuracoes
		setSize(1000, 840);
		
		
		//organizando o layout
		setLayout(null);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		
		new TelaPrincipal();
		
	}
}

