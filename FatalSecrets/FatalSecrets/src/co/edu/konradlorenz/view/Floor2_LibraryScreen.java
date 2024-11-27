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

public class Floor2_LibraryScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	private ImageIcon characterImage;
	private ImageIcon leftBackImage;
	Image imagenEscalada;
	
	//Delcaracion de elementos
	private JButton btnGoBack, botonPersonaje;

	public Floor2_LibraryScreen(GameWindow gameWindow) {
		
		cargarImagen();
		
		setSize(1004,734);
        setLayout(null);
        JLabel lblTitle = new JLabel("Biblioteca");
        lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setOpaque(true);
	    lblTitle.setBackground(new Color(0, 0, 0, 128));
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(20, 10, 135, 30);
        add(lblTitle);
        
        
        btnGoBack = new JButton();
        btnGoBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoBack.setBounds(20, 631, 106, 78);
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
        
        
        //Personaje como boton
        botonPersonaje = new JButton();
        botonPersonaje.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        botonPersonaje.setBounds(480, 199, 259, 535);
        Image imagenEscalada = characterImage.getImage().getScaledInstance(botonPersonaje.getWidth(), botonPersonaje.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        botonPersonaje.setIcon(iconoEscalado);
        botonPersonaje.setBorderPainted(false); // Quitar el borde
        botonPersonaje.setContentAreaFilled(false); // Hacer el fondo transparente
        // Añadir el botón al JFrame
        add(botonPersonaje);
        
        // Label para la imagen del fondo ELIMINAR CUANDO SE TERMINE DE AJUSTAR
        ImageIcon echaracterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor2_LibraryImg.jpg"));
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
    	backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor2_LibraryImg.jpg"));
    	characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/NPCs/LibrarianImg.png"));
    	leftBackImage= new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/leftBackImg.png"));
		} catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public JButton getBtnGoBack() {
		return btnGoBack;
	}



	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}



	public JButton getBotonPersonaje() {
		return botonPersonaje;
	}



	public void setBotonPersonaje(JButton botonPersonaje) {
		this.botonPersonaje = botonPersonaje;
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
