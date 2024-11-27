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

public class Floor1_CafeteriaScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	private ImageIcon characterImage; 
	private ImageIcon rightBackImage;
	private ImageIcon leftImage;
	private JLabel lblTitle;
	private JButton btnGoBack;
	private JButton btnGoElevator;
	private JButton botonPersonaje;
	Image imagenEscalada;
	/**
	 * Constructor del panel.
	 */
	public Floor1_CafeteriaScreen(GameWindow gameWindow) {
		
		cargarImagen();
		
		setSize(1004, 734);
		setLayout(null);

		lblTitle = new JLabel("Cafetería");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setOpaque(true);
	    lblTitle.setBackground(new Color(0, 0, 0, 128));
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(20, 10, 118, 30);
        add(lblTitle);

		btnGoBack = new JButton();
		btnGoBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		btnGoBack.setBounds(888, 646, 106, 78);
		imagenEscalada = rightBackImage.getImage().getScaledInstance(btnGoBack.getWidth(), btnGoBack.getHeight(), Image.SCALE_SMOOTH);
		rightBackImage = new ImageIcon(imagenEscalada);
        btnGoBack.setIcon(rightBackImage);
        btnGoBack.setBorderPainted(false);
        btnGoBack.setContentAreaFilled(false);
        btnGoBack.setToolTipText("Salir del edificio");
		btnGoBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getCentralBuilding());
			}
		});
		add(btnGoBack);

		btnGoElevator = new JButton();
		btnGoElevator.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		btnGoElevator.setBounds(10, 364, 98, 44);
		imagenEscalada = leftImage.getImage().getScaledInstance(btnGoElevator.getWidth(), btnGoElevator.getHeight(), Image.SCALE_SMOOTH);
        leftImage = new ImageIcon(imagenEscalada);
        btnGoElevator.setIcon(leftImage);
        btnGoElevator.setBorderPainted(false);
        btnGoElevator.setContentAreaFilled(false);
        btnGoElevator.setToolTipText("Entrar al ascensor");
		btnGoElevator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getElevator());
			}
		});
		add(btnGoElevator);

		// Personaje como botón
		botonPersonaje = new JButton();
		botonPersonaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonPersonaje.setBounds(504, 302, 223, 432);
		Image imagenEscalada = characterImage.getImage().getScaledInstance(botonPersonaje.getWidth(), botonPersonaje.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
		botonPersonaje.setIcon(iconoEscalado);
		botonPersonaje.setBorderPainted(false); // Quitar el borde
		botonPersonaje.setContentAreaFilled(false); // Hacer el fondo transparente

		// Añadir el botón al JPanel
		add(botonPersonaje);
		
        // Label para el polcía 
        ImageIcon characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/NPCs/PoliceManImg.png"));
        JLabel lblCharacterImage = new JLabel();
        lblCharacterImage.setBounds(279, 291, 215, 443);
        Image resizedImage = characterImage.getImage().getScaledInstance(lblCharacterImage.getWidth(), lblCharacterImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        lblCharacterImage.setIcon(resizedIcon);
        add(lblCharacterImage);
		
        // Label para la imagen del fondo ELIMINAR CUANDO SE TERMINE DE AJUSTAR
        ImageIcon echaracterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor1_CafeteriaImg.jpg"));
        JLabel lbleCharacterImage = new JLabel();
        lbleCharacterImage.setSize(getSize());
        Image eresizedImage = echaracterImage.getImage().getScaledInstance(lbleCharacterImage.getWidth(), lbleCharacterImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon eresizedIcon = new ImageIcon(eresizedImage);
        lbleCharacterImage.setIcon(eresizedIcon);
        add(lbleCharacterImage);

		
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
    
	public void cargarImagen(){
		try {
			// Cargar la imagen desde un archivo
			backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor1_CafeteriaImg.jpg"));
			characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/NPCs/WifeImg.png"));
			rightBackImage= new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/rightBackImg.png"));
        	leftImage =  new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/leftImg.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
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

	public JLabel getLblTite() {
		return lblTitle;
	}

	public void setLblTite(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}

	public JButton getBtnGoElevator() {
		return btnGoElevator;
	}

	public void setBtnGoElevator(JButton btnGoElevator) {
		this.btnGoElevator = btnGoElevator;
	}

	public JButton getBotonPersonaje() {
		return botonPersonaje;
	}

	public void setBotonPersonaje(JButton botonPersonaje) {
		this.botonPersonaje = botonPersonaje;
	}
    
    
    
}
