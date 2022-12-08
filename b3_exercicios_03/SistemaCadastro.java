package b3_exercicios_03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SistemaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaCadastro frame = new SistemaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	
	private MaskFormatter ftmTelefone;
	private MaskFormatter ftmCpf;
	private String[] TiposSanguineos = {"A","B","AB","O"};
	private String[] Rh = {"+","-"};
	private String[] Cursos = {"Ciencia da Computacao", "Engenharia da Computacao", "Engenharia Civil", "Medicina", "Arquitetura", "Psicologia"};
	private JTextField textField_2;
	
	public SistemaCadastro() throws ParseException {
		setTitle("Sistema de cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ftmTelefone = new MaskFormatter("(##)#########");
		ftmCpf = new MaskFormatter("###.###.###-##");
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 106, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(192, 8, 204, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 39, 204, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Endereco");
		lblNewLabel_1.setBounds(10, 42, 129, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(10, 77, 141, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setBounds(10, 114, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(ftmTelefone);
		formattedTextField.setFocusLostBehavior(JFormattedTextField.REVERT);
		formattedTextField.setBounds(192, 74, 204, 20);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(ftmCpf);
		formattedTextField_1.setFocusLostBehavior(JFormattedTextField.REVERT);
		formattedTextField_1.setBounds(192, 111, 204, 20);
		contentPane.add(formattedTextField_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tipo sanguineo");
		lblNewLabel_3_1.setBounds(10, 146, 106, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Curso");
		lblNewLabel_3_1_1.setBounds(10, 182, 46, 14);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Contato de emergencia");
		lblNewLabel_3_1_2.setBounds(10, 217, 141, 14);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefone");
		lblNewLabel_2_1.setBounds(10, 251, 76, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox comboBox = new JComboBox(TiposSanguineos);
		comboBox.setBounds(192, 142, 54, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(Rh);
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(344, 142, 54, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Fator RH");
		lblNewLabel_3_1_3.setBounds(271, 146, 63, 14);
		contentPane.add(lblNewLabel_3_1_3);
		
		JComboBox comboBox_2 = new JComboBox(Cursos);
		comboBox_2.setBounds(192, 175, 205, 22);
		contentPane.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 214, 204, 20);
		contentPane.add(textField_2);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(ftmTelefone);
		formattedTextField_2.setFocusLostBehavior(JFormattedTextField.REVERT);
		formattedTextField_2.setBounds(192, 248, 204, 20);
		contentPane.add(formattedTextField_2);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(86, 286, 135, 48);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(220, 286, 129, 48);
		contentPane.add(btnCancelar);
	}
}
