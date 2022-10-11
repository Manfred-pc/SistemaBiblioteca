package Telas; //MODIFICdo

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TelaPrincipal extends JFrame {
	private JPanel panel1, panel2, panel3, panel4;
	private JLabel titulo, subtitulo, subtitulo2, subtitulo3, subtitulo4;
	private static JTable tabela;
	private static String[] colunas = { "Número Exemplar", "Nome", "Editora", "Ação" };
	private static Object[][] dados = {};

	Font tituto = new Font("Arial", Font.BOLD, 20);

	JButton bt1, bt2, bt3, bt4;
	JLabel rotulo1, rotulo2, rotulo3, rotul4;
	JButton bt5;

	Font subtexto = new Font("Arial", Font.BOLD, 13);
	Font subtexto2 = new Font("Arial", Font.BOLD, 10);
	JTextField texto, texto2, texto3;
	Color roxo = new Color(81, 48, 110);
	Border borda = BorderFactory.createLineBorder(Color.black, 3);

	public TelaPrincipal() {

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		titulo = new JLabel("Sistema de Controle de Biblioteca");
		subtitulo = new JLabel("AAA");
		subtitulo2 = new JLabel("Emprestar livros");
		subtitulo3 = new JLabel("Dados do aluno");
		subtitulo4 = new JLabel("Dados do livro");

		// panel1
		add(panel1);
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setBorder(borda);
		panel1.setBackground(roxo);
		panel1.setLayout(null);
		panel1.setBounds(0, 0, 1000, 150);
		panel1.add(titulo);
		panel1.add(subtitulo);
		panel1.add(subtitulo2);

		titulo.setBounds(370, 50, 400, 50);
		titulo.setFont(tituto);
		titulo.setForeground(Color.white);

		subtitulo.setBounds(20, 10, 100, 100);
		subtitulo.setFont(subtexto);
		subtitulo.setForeground(Color.WHITE);

		subtitulo2.setBounds(20, 70, 150, 100);
		subtitulo2.setFont(subtexto);
		subtitulo2.setForeground(Color.white);

		// tabela
		TableModel tableModel = new DefaultTableModel(dados, colunas);
		// tabela = new JTable(dados,colunas);
		tabela = new JTable(tableModel);
		JScrollPane barraRolagem = new JScrollPane(tabela);
		getContentPane().add(barraRolagem);
		barraRolagem.setBounds(0, 600, 980, 600);

		add(panel2);

		rotulo1 = new JLabel("Matricula");
		panel2.add(rotulo1);
		rotulo1.setBounds(50, 8, 100, 40);
		rotulo1.setForeground(Color.white);
		rotulo1.setFont(subtexto);

		texto = new JTextField();
		panel2.add(texto);
		texto.setBounds(30, 40, 100, 40);

		bt1 = new JButton("pesquisar");
		panel2.add(bt1);
		bt1.setBounds(160, 40, 100, 40);

		bt2 = new JButton("limpar");
		panel2.add(bt2);
		bt2.setBounds(800, 40, 100, 40);

		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBorder(borda);
		panel2.setBackground(roxo);
		panel2.setLayout(null);
		panel2.setBounds(0, 230, 1000, 125);
		add(subtitulo3);
		subtitulo3.setBounds(20, 120, 100, 100);
		subtitulo3.setFont(subtexto);

		add(panel3);

		rotulo2 = new JLabel("Número Exemplar");
		panel3.add(rotulo2);
		rotulo2.setBounds(25, 8, 120, 40);
		rotulo2.setForeground(Color.white);
		rotulo2.setFont(subtexto);

		texto = new JTextField();
		panel3.add(texto);
		texto.setBounds(30, 40, 100, 40);

		bt3 = new JButton("pesquisar");
		panel3.add(bt3);
		bt3.setBounds(160, 40, 100, 40);

		bt4 = new JButton("Limpar");
		panel3.add(bt4);
		bt4.setBounds(800, 40, 100, 40);

		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setBorder(borda);
		panel3.setBackground(roxo);
		panel3.setLayout(null);
		panel3.setBounds(0, 430, 1000, 125);

		subtitulo4.setBounds(20, 325, 100, 100);
		subtitulo4.setFont(subtexto);

		add(panel4);

		bt5 = new JButton("salvar");
		panel4.add(bt5);
		bt5.setBounds(0, 40, 100, 40);

		// aumentando texto
		Font font = new Font("Arial", 0, 22);
		texto.setFont(font);
		//texto2.setFont(font);
		//texto3.setFont(font);

		// JFrame configuracoes
		setSize(1000, 840);

		// organizando o layout
		setLayout(null);

		setVisible(true);

	}

	public static void main(String[] args) {

		new TelaPrincipal();

	}
}
