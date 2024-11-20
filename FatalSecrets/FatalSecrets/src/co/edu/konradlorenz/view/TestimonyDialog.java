package co.edu.konradlorenz.view;

import javax.swing.JDialog;
import javax.swing.JLabel;
import co.edu.konradlorenz.model.NPC;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestimonyDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	public TestimonyDialog(GameWindow gameWindow, NPC npc) {
		setTitle("Interacción con NPC");
        setSize(400, 300);
        setLocationRelativeTo(gameWindow);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        JLabel lblNombre = new JLabel(npc.getNombre());
        lblNombre.setForeground(npc.getColor());
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNombre.setBounds(12, 10, 195, 37);
        getContentPane().add(lblNombre);
         
        // Crear el JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setText(npc.getTestimonio());
        textArea.setEditable(false);
        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras completas

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(13, 50, 360, 200); // Posición y tamaño
        getContentPane().add(scrollPane);
        
//        JLabel lblDeclaracion = new JLabel("<html><center>"+declaracion+"</html>");
//        lblDeclaracion.setBounds(30,44,322,209);
//        lblDeclaracion.setBorder(new javax.swing.border.LineBorder(Color.RED, 1));
//        lblDeclaracion.setHorizontalAlignment(SwingConstants.LEFT);
//        getContentPane().add(lblDeclaracion);
          
        setModal(true);
	}
}
