
package co.edu.konradlorenz.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class StartScreen extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	private ImageIcon tituloImg;
	private JLabel lblTituloJuego;
	

    public StartScreen(GameWindow gameWindow) {
    	
    	//CONFIGURACIONES BÁSICAS DEL JFRAME
    	setSize(1004,734);
        setLayout(null);
        
        cargarImagen();
        
        // Label para la imagen del titulo del juego
        lblTituloJuego = new JLabel();
        lblTituloJuego.setBounds(414, 121, 526, 112);
        Image resizedImage = tituloImg.getImage().getScaledInstance(lblTituloJuego.getWidth(), lblTituloJuego.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        lblTituloJuego.setIcon(resizedIcon);
        add(lblTituloJuego);
        
        //JLABEL TITULO
        JLabel lblTitle = new JLabel("Menú Principal");
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(577, 244, 265, 58);
        add(lblTitle); // Agregar al JPanel

        //BOTÓN PLAY GAME
        JButton btnPlayGame;
        btnPlayGame = new JButton("Empezar juego");
        btnPlayGame.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnPlayGame.setBounds(584, 335, 243, 58);
        btnPlayGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getDetectiveOffice());
			}
		});
        add(btnPlayGame);
        
      //BOTÓN CÓMO JUGAR
        JButton btnHowToPlay = new JButton("Cómo jugar");
        btnHowToPlay.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnHowToPlay.setBounds(584, 410, 243, 58);
        btnHowToPlay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getHowToPlayScreen());
			}
		});
        add(btnHowToPlay);
        
       //BOTÓN CRÉDITOS
        JButton btnCredits = new JButton("Créditos");
        btnCredits.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnCredits.setBounds(584, 487, 243, 58);
        add(btnCredits);
        
       //BOTÓN SALIR
        JButton btnExit = new JButton("Salir");
        btnExit.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnExit.setBounds(584, 562, 243, 58);
        btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
        add(btnExit);
        
        
        
        
        
    }
    public void cargarImagen() {
    	try {
            // Cargar la imagen desde un archivo
        	backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Assets/StartScreenImg.jpg"));
        	tituloImg = new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Assets/titleImg.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    }


    
 // SOBREESCRIBIR paintComponent PARA DIBUJAR EL FONDO
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Llamar al método de la superclase para que se pinten los componentes del panel
        if (backgroundImage != null) {
            // Dibujar la imagen de fondo (ajustándola al tamaño del JPanel)
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}