package co.edu.konradlorenz.view;

import javax.swing.JDialog;
import javax.swing.JLabel;
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
        setSize(400, 300);
        setLocationRelativeTo(gameWindow);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        
        lblTitulo = new JLabel(titulo);
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(139, 10, 98, 31);
        getContentPane().add(lblTitulo);
        
        respuestaField = new JTextField();
        respuestaField.setBounds(96, 206, 146, 19);
        getContentPane().add(respuestaField);
        respuestaField.setColumns(10);
        
        checkButton = new JButton("Comprobar");
        checkButton.setBounds(252, 206, 98, 21);
        getContentPane().add(checkButton);
        
        lblacertijo = new JLabel("<html><center>"+acertijo+"</html>");
        lblacertijo.setHorizontalAlignment(SwingConstants.CENTER);
        lblacertijo.setBounds(38, 52, 294, 143);
        getContentPane().add(lblacertijo);
        
        lblResultado = new JLabel("");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(106, 236, 131, 14);
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
