package co.edu.konradlorenz.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Floor8_ReceptionScreen extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage backgroundImage;
    private ImageIcon characterImage;
    private ImageIcon leftBackImage;
	Image imagenEscalada;

    // Declaración de elementos fuera del constructor
    private JButton btnGoBack;
    private JLabel lblTitle;
    private JButton botonPersonaje;
    
    public Floor8_ReceptionScreen(GameWindow gameWindow) {
        setSize(1004, 734);
        setLayout(null);
        cargarImagen();

        // Inicialización de elementos en el constructor
        lblTitle = new JLabel("Recepción");
        lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setOpaque(true);
	    lblTitle.setBackground(new Color(0, 0, 0, 128));
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(20, 10, 130, 39);
        add(lblTitle);
        
        btnGoBack = new JButton();
        btnGoBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoBack.setBounds(862, 633, 106, 78);
        imagenEscalada = leftBackImage.getImage().getScaledInstance(btnGoBack.getWidth(), btnGoBack.getHeight(), Image.SCALE_SMOOTH);
        leftBackImage = new ImageIcon(imagenEscalada);
        btnGoBack.setIcon(leftBackImage);
        btnGoBack.setBorderPainted(false);
        btnGoBack.setContentAreaFilled(false);
        btnGoBack.setToolTipText("Volver al elevador");
        btnGoBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getElevator());
			}
		});
        add(btnGoBack);
        
        // Personaje como botón
        botonPersonaje = new JButton();
        botonPersonaje.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        botonPersonaje.setBounds(378, 63, 186, 290);
        Image imagenEscalada = characterImage.getImage().getScaledInstance(botonPersonaje.getWidth(), botonPersonaje.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        botonPersonaje.setIcon(iconoEscalado);
        botonPersonaje.setBorderPainted(false); // Quitar el borde
        botonPersonaje.setContentAreaFilled(false); // Hacer el fondo transparente
        // Añadir el botón al JFrame
        add(botonPersonaje);
        
        // Label para la imagen del fondo ELIMINAR CUANDO SE TERMINE DE AJUSTAR
        ImageIcon echaracterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor8_ReceptionImg.jpg"));
        JLabel lbleCharacterImage = new JLabel();
        lbleCharacterImage.setSize(getSize());
        Image eresizedImage = echaracterImage.getImage().getScaledInstance(lbleCharacterImage.getWidth(), lbleCharacterImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon eresizedIcon = new ImageIcon(eresizedImage);
        lbleCharacterImage.setIcon(eresizedIcon);
        add(lbleCharacterImage);
        
       
    }
    public void cargarImagen() {
    	 try {
             // Cargar la imagen desde un archivo
             backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor8_ReceptionImg.jpg"));
             characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/NPCs/ReceptionistImg.png"));
             leftBackImage= new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/rightBackImg.png"));
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

	public BufferedImage getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(BufferedImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public ImageIcon getCharacterImage() {
		return characterImage;
	}

	public void setCharacterImage(ImageIcon characterImage) {
		this.characterImage = characterImage;
	}

	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}

	public JLabel getLblTite() {
		return lblTitle;
	}

	public void setLblTite(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JButton getBotonPersonaje() {
		return botonPersonaje;
	}

	public void setBotonPersonaje(JButton botonPersonaje) {
		this.botonPersonaje = botonPersonaje;
	}

}
