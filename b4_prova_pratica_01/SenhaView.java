package b4_prova_pratica_01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SenhaView extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-99,499
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField jTextNome;
	private JTextField jTextMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SenhaView frame = new SenhaView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SenhaView() {
		setTitle("Entra na Fila");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Para se atentido informe seu Nome e Matricula. Voce entrara na fila!");
		lblNewLabel.setBounds(5, 5, 540, 17);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblQuandoChegarA = new JLabel("Quando chegar a sua vez de ser atendido o  seu nome aparecera no painel.");
		lblQuandoChegarA.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuandoChegarA.setBounds(5, 22, 540, 17);
		contentPane.add(lblQuandoChegarA);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 50, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		jTextNome = new JTextField();
		jTextNome.setBounds(10, 75, 530, 20);
		contentPane.add(jTextNome);
		jTextNome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Matricula:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 106, 70, 14);
		contentPane.add(lblNewLabel_1_1);
		
		jTextMatricula = new JTextField();
		jTextMatricula.setColumns(10);
		jTextMatricula.setBounds(10, 131, 530, 20);
		contentPane.add(jTextMatricula);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(451, 162, 89, 23);
		contentPane.add(btnNewButton);
	}
}
