package co.edu.konradlorenz.view;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import co.edu.konradlorenz.model.NPC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestimonyDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	
	
	//Constructor para testimonio sin pista
	public TestimonyDialog(GameWindow gameWindow, String nombre, String testimonio, Color colorNombre) {
		setTitle("Interacción con NPC");
        setSize(400, 300);
        setLocationRelativeTo(gameWindow);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        JLabel lblNombre = new JLabel(nombre);
        lblNombre.setForeground(colorNombre);
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNombre.setBounds(12, 10, 195, 37);
        getContentPane().add(lblNombre);
         
        // Crear el JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setText(testimonio);
        textArea.setEditable(false);
        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras completas

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(13, 50, 360, 200); // Posición y tamaño
        getContentPane().add(scrollPane);
 
          
        setModal(true);
	}
	
	//Constructor para testimonio con pista
	/**
	 * @wbp.parser.constructor
	 */
	public TestimonyDialog(GameWindow gameWindow, String nombre, String testimonio, Color colorNombre, String imgPath) {
		
		setTitle("Interacción con NPC");
        setSize(400, 600);
        setLocationRelativeTo(gameWindow);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        JLabel lblNombre = new JLabel(nombre);
        lblNombre.setForeground(colorNombre);
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNombre.setBounds(12, 10, 195, 37);
        getContentPane().add(lblNombre);
         
        // Crear el JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setText(testimonio);
        textArea.setEditable(false);
        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras completas

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(13, 50, 360, 200); // Posición y tamaño
        getContentPane().add(scrollPane);
        
        // Label para el polcía 
        ImageIcon ObjectImage = new ImageIcon(Floor2_LibraryScreen.class.getResource(imgPath));
        JLabel lblObjectImage = new JLabel();
        lblObjectImage.setBounds(12, 260, 360, 292);
        Image resizedImage = ObjectImage.getImage().getScaledInstance(lblObjectImage.getWidth(), lblObjectImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        lblObjectImage.setIcon(resizedIcon);
        getContentPane().add(lblObjectImage);
        
//        JLabel lblDeclaracion = new JLabel("<html><center>"+declaracion+"</html>");
//        lblDeclaracion.setBounds(30,44,322,209);
//        lblDeclaracion.setBorder(new javax.swing.border.LineBorder(Color.RED, 1));
//        lblDeclaracion.setHorizontalAlignment(SwingConstants.LEFT);
//        getContentPane().add(lblDeclaracion);
          
        setModal(true);
	}
}
