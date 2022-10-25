package principal;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		
		int width = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		contentPane.add(tabbedPane);
		
		JPanel home = new JPanel();
		home.setBackground(new Color(0, 37, 86));
		tabbedPane.addTab("Home", null, home, null);
		home.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Interface.class.getResource("/img/Logo.png")));
		lblNewLabel.setBounds(width/2 - 250, height/2 - 250, 500, 500);
		home.add(lblNewLabel);
		
		JPanel transporte = new JPanel();
		transporte.setBackground(new Color(0, 37, 86));
		tabbedPane.addTab("Transporte", null, transporte, null);
		transporte.setLayout(null);
		
		JButton addTranporte = new JButton("Adicionar");
		addTranporte.setBounds((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight(), 100, 25);
		transporte.add(addTranporte);
		
		JButton delTransporte = new JButton("apagar");
		delTransporte.setBounds((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight(), 100, 25);
		transporte.add(delTransporte);
		
		JButton updTransporte = new JButton("editar");
		updTransporte.setBounds(0, 0, 100, 25);
		transporte.add(updTransporte);
		
		JButton lisTransporte = new JButton("ver");
		lisTransporte.setBounds(435, 207, 100, 25);
		transporte.add(lisTransporte);
		
		JPanel destino = new JPanel();
		destino.setBackground(new Color(0, 37, 86));
		tabbedPane.addTab("Destino", null, destino, null);
		
		JPanel viagem = new JPanel();
		viagem.setBackground(new Color(0, 37, 86));
		tabbedPane.addTab("Viagem", null, viagem, null);
		
		JPanel fuso = new JPanel();
		fuso.setBackground(new Color(0, 37, 86));
		tabbedPane.addTab("Fuso Horário", null, fuso, null);
		
		JPanel turistico = new JPanel();
		turistico.setBackground(new Color(0, 37, 86));
		tabbedPane.addTab("Ponto Turístico", null, turistico, null);
	}
}

		
		
		

	
	
	
