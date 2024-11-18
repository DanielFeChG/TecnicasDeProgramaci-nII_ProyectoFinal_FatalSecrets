package co.edu.konradlorenz.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Floor7_AisleScreen extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage backgroundImage;

    private JButton btnGoBack;
    private JLabel lblTite;
    
    
    public Floor7_AisleScreen(GameWindow gameWindow) {
        setSize(1004, 734);
        setLayout(null);
        
        lblTite = new JLabel("Pasillo");
        lblTite.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
        lblTite.setForeground(Color.BLACK);
        lblTite.setBounds(406, 666, 130, 58);
        add(lblTite);
        
        btnGoBack = new JButton("Volver al ascensor");
        btnGoBack.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        btnGoBack.setBounds(54, 653, 243, 58);
        btnGoBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.updateScreen(gameWindow.getElevator());
            }
        });
        add(btnGoBack);
        
        try {
            // Cargar la imagen desde un archivo
            backgroundImage = ImageIO.read(getClass().getResource("/co/edu/konradlorenz/view/images/PruebaTerraza.jpg"));
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
		return lblTite;
	}

	public void setLblTite(JLabel lblTite) {
		this.lblTite = lblTite;
	}
    
    
}
