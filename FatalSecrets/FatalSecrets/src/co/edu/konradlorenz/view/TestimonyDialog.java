package co.edu.konradlorenz.view;


import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;

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
        lblDeclaracion.setBounds(30,44,322,209);
        lblDeclaracion.setBorder(new javax.swing.border.LineBorder(Color.RED, 1));
        lblDeclaracion.setHorizontalAlignment(SwingConstants.LEFT);
        getContentPane().add(lblDeclaracion);
        
        JLabel lblNombre = new JLabel(titulo);
        lblNombre.setForeground(new Color(0, 255, 64));
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNombre.setBounds(30, 11, 105, 23);
        getContentPane().add(lblNombre);
        
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(333, 44, 17, 209);
        getContentPane().add(scrollBar);

        
        
        setModal(true);
        //setVisible(true);
	}
}
