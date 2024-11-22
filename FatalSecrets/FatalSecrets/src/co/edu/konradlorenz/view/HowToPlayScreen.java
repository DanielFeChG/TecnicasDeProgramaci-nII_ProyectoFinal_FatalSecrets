package co.edu.konradlorenz.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class HowToPlayScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private BufferedImage backgroundImage;
	
	public HowToPlayScreen(GameWindow gameWindow) {
		
		
    	//CONFIGURACIONES BÁSICAS DEL JFRAME
    	setSize(1004,734);
        setLayout(null);
        
        cargarImagen();
        
        //JLABEL TITULO
        JLabel lblTitle = new JLabel("¿Como Jugar?");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(341, 42, 319, 79);
        add(lblTitle); // Agregar al JPanel
        
        
        JButton btnGoBack;
		btnGoBack = new JButton("Volver");
		btnGoBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		btnGoBack.setBounds(54, 661, 143, 50);
		btnGoBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getStartScreen());
			}
		});
		add(btnGoBack);
		
		
		String texto = "¡Bienvenido al juego de escape ambientado en la Universidad Konrad Lorenz! Tu objetivo es resolver el caso del asesinato del decano y descubrir al culpable. Para lograrlo, deberás explorar las diferentes ubicaciones de la universidad, interactuar con personajes, resolver acertijos y recolectar pistas. Aquí te explicamos cómo jugar:\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Inicio del juego\r\n"
				+ "\r\n"
				+ "1. Pantalla inicial: Haz clic en \"Empezar juego\" para comenzar tu aventura.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "2. El juego te llevará automáticamente a la oficina del detective, donde podrás orientarte y decidir tu próximo movimiento.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Exploración\r\n"
				+ "\r\n"
				+ "Navega entre las distintas ubicaciones usando los botones de navegación en pantalla.\r\n"
				+ "\r\n"
				+ "Las ubicaciones incluyen:\r\n"
				+ "\r\n"
				+ "Elevador: Conecta todos los pisos.\r\n"
				+ "\r\n"
				+ "Cafetería, Biblioteca, Aula de Sistemas, Pasillo, Recepción y Terraza: Cada una podría contener pistas o personajes importantes.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Interacción con personajes\r\n"
				+ "\r\n"
				+ "Al encontrar un personaje, puedes interactuar con él seleccionando su ícono o acercándote en el mapa.\r\n"
				+ "\r\n"
				+ "Los personajes te ofrecerán:\r\n"
				+ "\r\n"
				+ "Acertijos: Resuélvelos para obtener pistas.\r\n"
				+ "\r\n"
				+ "Testimonios: Reúne información clave para identificar al culpable.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Cada interacción con un NPC se realiza en una ventana emergente (JDialog) con opciones para resolver el acertijo o leer el testimonio.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Recolección de pistas\r\n"
				+ "\r\n"
				+ "Explora las ubicaciones y busca objetos interactivos (como carpetas, notas, o elementos visuales destacados).\r\n"
				+ "\r\n"
				+ "Al hacer clic en un objeto, recibirás información o pistas que podrían ser esenciales para resolver el caso.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Resolver acertijos\r\n"
				+ "\r\n"
				+ "Algunos personajes te plantearán acertijos. Tendrás que escribir la respuesta correcta para desbloquear su testimonio o una pista.\r\n"
				+ "\r\n"
				+ "Si no aciertas, puedes intentar de nuevo o explorar más para encontrar la solución.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Progresar en la investigación\r\n"
				+ "\r\n"
				+ "1. Usa las pistas y testimonios para analizar qué personaje podría ser el culpable.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "2. Algunas pistas estarán ocultas detrás de acertijos difíciles o en ubicaciones menos obvias.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Finalizar el juego\r\n"
				+ "\r\n"
				+ "Una vez que estés seguro de quién es el culpable, regresa a la oficina del detective y selecciona al sospechoso en el menú de opciones.\r\n"
				+ "\r\n"
				+ "Si aciertas, ¡habrás resuelto el caso y ganado el juego!\r\n"
				+ "\r\n"
				+ "Si fallas, podrás seguir investigando para intentarlo de nuevo.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Consejos útiles\r\n"
				+ "\r\n"
				+ "1. Habla con todos los personajes; cada uno puede tener información valiosa.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "2. Explora todas las ubicaciones en busca de pistas.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "3. Si un acertijo parece complicado, recuerda que la respuesta puede estar en las pistas que ya encontraste.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "4. Sé paciente: ¡resolver un misterio requiere tiempo y atención!\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "¿Te gustaría agregar detalles específicos sobre los acertijos, los personajes o cómo se muestra la interfaz en este \"Cómo jugar\"?";
		
		// Crear el JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textArea.setText(texto);
        textArea.setEditable(false);
        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras completas

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(221, 143, 565, 485); // Posición y tamaño
        add(scrollPane);

	}
	public void cargarImagen () {
		try {
            // Cargar la imagen desde un archivo
        	backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Assets/comoJugar.Img"));
		} catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	 // Sobrescribir el método paintComponent para dibujar el fondo
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Llamar al método de la superclase para que se pinten los componentes del panel
        if (backgroundImage != null) {
            // Dibujar la imagen de fondo (ajustándola al tamaño del JPanel)
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
	

}
