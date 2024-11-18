package co.edu.konradlorenz.view;


import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class TestimonyDialog extends JDialog {

	private static final long serialVersionUID = 1L;


	/**
	 * Create the dialog.
	 */
	public TestimonyDialog(GameWindow gameWindow, String titulo, String declaracion) {
		setTitle("Interacción con NPC");
        setSize(400, 300);
        setLocationRelativeTo(gameWindow);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        JLabel lblDeclaracion = new JLabel("<html><center>"+declaracion+"</html>");
        lblDeclaracion.setBounds(52,62,278,170);
        lblDeclaracion.setBorder(new javax.swing.border.LineBorder(Color.RED, 1));
        lblDeclaracion.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblDeclaracion);
        
        JLabel lblNombre = new JLabel(titulo);
        lblNombre.setForeground(new Color(0, 255, 64));
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNombre.setBounds(51, 39, 80, 13);
        getContentPane().add(lblNombre);

        
        
        setModal(true);
        //setVisible(true);
	}
}
