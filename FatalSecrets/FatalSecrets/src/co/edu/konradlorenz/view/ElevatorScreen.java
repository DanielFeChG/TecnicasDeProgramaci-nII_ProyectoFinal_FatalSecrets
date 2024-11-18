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
import java.awt.Rectangle;

public class ElevatorScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	/**
	 * Create the panel.
	 */
	public ElevatorScreen(GameWindow gameWindow) {
		setSize(1004,734);
        setLayout(null);
        // Crear y configurar el título
        JLabel lblTite = new JLabel("Elevador");
        lblTite.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
        lblTite.setForeground(Color.BLACK);
        lblTite.setBounds(436, 676, 155, 58); // Establecer la posición del título
        add(lblTite); // Agregar al JPanel
        
        JButton btnGoF1;
        btnGoF1 = new JButton("");
        btnGoF1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF1.setOpaque(false);
        btnGoF1.setContentAreaFilled(false);
        btnGoF1.setBorderPainted(false);
        btnGoF1.setBounds(384, 339, 92, 65);
        btnGoF1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor1_Cafeteria());
			}
		});
        add(btnGoF1);
        
        
        JButton btnGoF2;
        btnGoF2 = new JButton("");
        btnGoF2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF2.setOpaque(false);
        btnGoF2.setContentAreaFilled(false);
        btnGoF2.setBorderPainted(false);
        btnGoF2.setBounds(384, 245, 92, 65);
        btnGoF2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor2_Library());
			}
		});
        add(btnGoF2);
        
        JButton btnGoF3;
        btnGoF3 = new JButton("");
        btnGoF3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF3.setOpaque(false);
        btnGoF3.setContentAreaFilled(false);
        btnGoF3.setBorderPainted(false);
        btnGoF3.setBounds(384, 146, 92, 65);
        btnGoF3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor3_ComputerRoom());
			}
		});
        add(btnGoF3);
	
        JButton btnGoF4;
        btnGoF4 = new JButton("");
        btnGoF4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF4.setOpaque(false);
        btnGoF4.setContentAreaFilled(false);
        btnGoF4.setBorderPainted(false);
        btnGoF4.setBounds(557, 431, 92, 65);
        btnGoF4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor4_Aisle());
			}
		});
        add(btnGoF4);
        
        JButton btnGoF5;
        btnGoF5 = new JButton("");
        btnGoF5.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF5.setOpaque(false);
        btnGoF5.setContentAreaFilled(false);
        btnGoF5.setBorderPainted(false);
        btnGoF5.setBounds(557, 339, 92, 65);
        btnGoF5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor5_Classroom501N());
			}
		});
        add(btnGoF5);
        
        JButton btnGoF6;
        btnGoF6 = new JButton("");
        btnGoF6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF6.setOpaque(false);
        btnGoF6.setContentAreaFilled(false);
        btnGoF6.setBorderPainted(false);
        btnGoF6.setBounds(557, 245, 92, 65);
        btnGoF6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor6_Terrace());
			}
		});
        add(btnGoF6);
        
        JButton btnGoF7;
        btnGoF7 = new JButton("");
        btnGoF7.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF7.setOpaque(false);
        btnGoF7.setContentAreaFilled(false);
        btnGoF7.setBorderPainted(false);
        btnGoF7.setBounds(557, 146, 92, 65);
        btnGoF7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor7_Aisle());
			}
		});
        add(btnGoF7);
        
        JButton btnGoF8;
        btnGoF8 = new JButton("");
        btnGoF8.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoF8.setOpaque(false);
        btnGoF8.setContentAreaFilled(false);
        btnGoF8.setBorderPainted(false);
        btnGoF8.setBounds(557, 39, 92, 65);
        btnGoF8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getFloor8_Reception());
			}
		});
        add(btnGoF8);
        
       
        
        try {
            // Cargar la imagen desde un archivo
        	backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/PruebaAscensor.jpg"));
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
