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

public class DetectiveOfficeScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage backgroundImage;
	private ImageIcon rightImage;
	Image imagenEscalada;
	/**
	 * Create the panel.
	 */
	public DetectiveOfficeScreen(GameWindow gameWindow) {
		
		cargarImagen();
		
		setSize(1004,734);
        setLayout(null);
        
        JLabel lblTitle = new JLabel("Oficina de detective");
        lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setOpaque(true);
	    lblTitle.setBackground(new Color(0, 0, 0, 128));
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(20, 10, 258, 30);
        add(lblTitle);
        
        JButton btnGoBuilding;
        btnGoBuilding = new JButton();
        btnGoBuilding.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoBuilding.setBounds(878, 316, 98, 44);
        imagenEscalada = rightImage.getImage().getScaledInstance(btnGoBuilding.getWidth(), btnGoBuilding.getHeight(), Image.SCALE_SMOOTH);
        rightImage = new ImageIcon(imagenEscalada);
        btnGoBuilding.setIcon(rightImage);
        btnGoBuilding.setBorderPainted(false);
        btnGoBuilding.setContentAreaFilled(false);
        btnGoBuilding.setToolTipText("Konrad Lorenz");
        btnGoBuilding.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameWindow.updateScreen(gameWindow.getCentralBuilding());
			}
		});
        add(btnGoBuilding); 
    }
    
	public void cargarImagen(){
		try {
			backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/detectiveOfficeImg.jpg"));
        	rightImage =  new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/RightImg.png"));
			
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