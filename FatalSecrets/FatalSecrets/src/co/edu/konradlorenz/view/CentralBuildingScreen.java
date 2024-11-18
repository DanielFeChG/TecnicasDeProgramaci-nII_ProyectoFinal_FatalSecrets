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
	private ImageIcon characterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/ju.png"));
	
	private JButton btnGoBack, botonPersonaje;
	
	public CentralBuildingScreen(GameWindow gameWindow) {
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
        btnGoGym.setBounds(39, 562, 289, 58);
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
        btnBack.setBounds(39, 640, 243, 58);
        btnBack.setToolTipText("Volver a la Oficina");
        btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getDetectiveOffice());
			}
		});
        add(btnBack); 
        try {
            // Cargar la imagen desde un archivo
        	backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/PruebaEdificioCentral.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Personaje como boton
        botonPersonaje = new JButton();
        botonPersonaje.setBounds(641, 230, 209, 382);
        Image imagenEscalada = characterImage.getImage().getScaledInstance(botonPersonaje.getWidth(), botonPersonaje.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        botonPersonaje.setIcon(iconoEscalado);
        botonPersonaje.setBorderPainted(false); // Quitar el borde
        botonPersonaje.setContentAreaFilled(false); // Hacer el fondo transparente
     // Agregar ActionListener para definir la acción al hacer clic en el botón
        botonPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción al hacer clic en el botón
                //JOptionPane.showMessageDialog(null, "¡Personaje seleccionado!");
                // Aquí puedes agregar la lógica de interacción
            	
            }
        });
        // Añadir el botón al JFrame
        add(botonPersonaje);
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



	public JButton getBotonPersonaje() {
		return botonPersonaje;
	}



	public void setBotonPersonaje(JButton botonPersonaje) {
		this.botonPersonaje = botonPersonaje;
	}
    
    
    
}
