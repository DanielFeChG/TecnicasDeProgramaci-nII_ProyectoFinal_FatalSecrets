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

public class Floor1_CafeteriaScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	private ImageIcon characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/NPCs/WifeImg.png"));
	private JLabel lblTite;
	private JButton btnGoBack;
	private JButton btnGoElevator;
	private JButton botonPersonaje;

	/**
	 * Constructor del panel.
	 */
	public Floor1_CafeteriaScreen(GameWindow gameWindow) {

		setSize(1004, 734);
		setLayout(null);

		lblTite = new JLabel("Cafetería");
		lblTite.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
		lblTite.setForeground(Color.BLACK);
		lblTite.setBounds(426, 666, 161, 58);
		add(lblTite);

		btnGoBack = new JButton("Salir del edificio");
		btnGoBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		btnGoBack.setBounds(64, 653, 243, 58);
		btnGoBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getCentralBuilding());
			}
		});
		add(btnGoBack);

		btnGoElevator = new JButton("Entrar al ascensor");
		btnGoElevator.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		btnGoElevator.setBounds(703, 653, 243, 58);
		btnGoElevator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getElevator());
			}
		});
		add(btnGoElevator);

		// Personaje como botón
		botonPersonaje = new JButton();
		botonPersonaje.setBounds(734, 302, 223, 432);
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
        lblCharacterImage.setBounds(547, 291, 215, 443);
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

		try {
			// Cargar la imagen desde un archivo
			backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor1_CafeteriaImg.jpg"));
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

	public JLabel getLblTite() {
		return lblTite;
	}

	public void setLblTite(JLabel lblTite) {
		this.lblTite = lblTite;
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
