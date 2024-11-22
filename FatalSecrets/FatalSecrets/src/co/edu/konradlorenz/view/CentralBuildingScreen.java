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

public class CentralBuildingScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	private ImageIcon characterImage; 
	private ImageIcon leftBackImage;
	private ImageIcon leftImage ;
	Image imagenEscalada;
	
	private JButton btnGoBack, botonPersonaje;
	
	
	
	
	public CentralBuildingScreen(GameWindow gameWindow) {
		
		cargarImagenes();
		
		setSize(1004,734);
        setLayout(null);
        JLabel lblTite = new JLabel("Edificio central");
        lblTite.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
        lblTite.setForeground(Color.BLACK);
        lblTite.setBounds(351, 676, 265, 58);
        add(lblTite); // Agregar al JPanel
        
        
        JButton btnGoCafeteria;
        btnGoCafeteria = new JButton("Entrar a la universidad");
        btnGoCafeteria.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoCafeteria.setBounds(693, 640, 289, 58);
        btnGoCafeteria.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor1_Cafeteria());
			}
		});
        add(btnGoCafeteria); 
        
        
        JButton btnGoGym;
        btnGoGym = new JButton("");
        btnGoGym.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoGym.setBounds(27, 354, 98, 44);
        imagenEscalada = leftImage.getImage().getScaledInstance(btnGoGym.getWidth(), btnGoGym.getHeight(), Image.SCALE_SMOOTH);
        leftImage = new ImageIcon(imagenEscalada);
        btnGoGym.setIcon(leftImage);
        btnGoGym.setBorderPainted(false);
        btnGoGym.setContentAreaFilled(false);
        btnGoGym.setToolTipText("Gimnasio");
        btnGoGym.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getGym());
			}
		});
        add(btnGoGym); 
        
        
        JButton btnBack;
        btnBack = new JButton();
        btnBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnBack.setBounds(100, 646, 106, 78);
        imagenEscalada = leftBackImage.getImage().getScaledInstance(btnBack.getWidth(), btnBack.getHeight(), Image.SCALE_SMOOTH);
        leftBackImage = new ImageIcon(imagenEscalada);
        btnBack.setIcon(leftBackImage);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setToolTipText("Volver a la Oficina");
        btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getDetectiveOffice());
			}
		});
        add(btnBack); 
        
        //Personaje como boton
        botonPersonaje = new JButton();
        botonPersonaje.setBounds(831, 420, 113, 246);
        imagenEscalada = characterImage.getImage().getScaledInstance(botonPersonaje.getWidth(), botonPersonaje.getHeight(), Image.SCALE_SMOOTH);
        characterImage = new ImageIcon(imagenEscalada);
        botonPersonaje.setIcon(characterImage);
        botonPersonaje.setBorderPainted(false); // Quitar el borde
        botonPersonaje.setContentAreaFilled(false); // Hacer el fondo transparente
        add(botonPersonaje);
        
        // Label para la imagen del fondo ELIMINAR CUANDO SE TERMINE DE AJUSTAR
        ImageIcon characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/Ubicaciones/CentralBuildingImg.jpg"));
        JLabel lblCharacterImage = new JLabel();
        lblCharacterImage.setSize(getSize());
        Image resizedImage = characterImage.getImage().getScaledInstance(lblCharacterImage.getWidth(), lblCharacterImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        lblCharacterImage.setIcon(resizedIcon);
        add(lblCharacterImage);
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

    public void cargarImagenes() {
    	try {
            // Cargar la imagen desde un archivo
        	backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/CentralBuildingImg.jpg"));
        	characterImage = new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/NPCs/securityGuardImg.png"));
        	leftBackImage= new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/leftBackImg.png"));
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
    
    
    
}
