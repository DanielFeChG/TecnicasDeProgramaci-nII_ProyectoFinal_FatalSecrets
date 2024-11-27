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

public class Floor7_AisleScreen extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage backgroundImage;
	private ImageIcon ObjectImage;
	private ImageIcon leftBackImage;
	Image imagenEscalada;
	
	private JLabel lblObjectImage;
    private JButton btnGoBack;
    private JLabel lblTitle;
    
    
    public Floor7_AisleScreen(GameWindow gameWindow) {
        setSize(1004, 734);
        setLayout(null);
        cargarImagen();
        
        lblTitle = new JLabel("Pasillo piso 7");
        lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setOpaque(true);
	    lblTitle.setBackground(new Color(0, 0, 0, 128));
        lblTitle.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(20, 10, 170, 30);
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
        
        // Label para la imagen del trapero
        lblObjectImage = new JLabel();
        lblObjectImage.setBounds(0, 303, 56, 232);
        Image resizedImage = ObjectImage.getImage().getScaledInstance(lblObjectImage.getWidth(), lblObjectImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        lblObjectImage.setIcon(resizedIcon);
        add(lblObjectImage);
        
        // Label para la imagen del fondo ELIMINAR CUANDO SE TERMINE DE AJUSTAR
        ImageIcon aecharacterImage = new ImageIcon(Floor2_LibraryScreen.class.getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor7_AisleImg.jpg"));
        JLabel albleCharacterImage = new JLabel();
        albleCharacterImage.setSize(getSize());
        Image aeresizedImage = aecharacterImage.getImage().getScaledInstance(albleCharacterImage.getWidth(), albleCharacterImage.getHeight(), Image.SCALE_SMOOTH);// Redimensionar la imagen al tamaño del JLabel
        ImageIcon aeresizedIcon = new ImageIcon(aeresizedImage);
        albleCharacterImage.setIcon(aeresizedIcon);
        add(albleCharacterImage);
        

        
       
    }
    public void cargarImagen() {
    	 try {
             // Cargar la imagen desde un archivo
             backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/Ubicaciones/Floor7_AisleImg.jpg"));
             ObjectImage = new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/MopImage.png"));
             leftBackImage= new ImageIcon(GameWindow.class.getResource("/co/edu/konradlorenz/view/images/Objetos/leftBackImg.png"));
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

	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}

	public JLabel getLblTite() {
		return lblTitle;
	}

	public void setLblTite(JLabel lblTite) {
		this.lblTitle = lblTite;
	}
    
    
}
