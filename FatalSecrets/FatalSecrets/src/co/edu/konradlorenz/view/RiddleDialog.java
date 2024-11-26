package co.edu.konradlorenz.view;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class RiddleDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField respuestaField;
	private JLabel lblTitulo;
	private JLabel lblacertijo;
	private JButton	checkButton;
	private JLabel lblResultado;

	/**
	 * Create the dialog.
	 */
	
	public RiddleDialog(GameWindow gameWindow, String titulo, String acertijo) {
		setTitle("Interacción con NPC");
        setSize(400, 350);
        setLocationRelativeTo(gameWindow);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        lblTitulo = new JLabel(titulo);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(90, 10, 200, 31);
        getContentPane().add(lblTitulo);
        
        respuestaField = new JTextField();
        respuestaField.setBounds(92, 260, 146, 19);
        getContentPane().add(respuestaField);
        respuestaField.setColumns(10);
        
        checkButton = new JButton("Comprobar");
        checkButton.setBounds(248, 259, 98, 21);
        getContentPane().add(checkButton);
        
     // Crear el JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setText(acertijo);
        textArea.setEditable(false);
        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras completas

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(13, 50, 360, 200); // Posición y tamaño
        getContentPane().add(scrollPane);
        
        lblResultado = new JLabel("");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(100, 280, 131, 14);
        getContentPane().add(lblResultado);
	}
	
    public String getAnswer() {
        return respuestaField.getText();
    }
	
    public void setFeedback(String feedback) {
        lblResultado.setText(feedback);
    }
    
    public void addSubmitListener(ActionListener listener) {
        checkButton.addActionListener(listener);
    }
}
