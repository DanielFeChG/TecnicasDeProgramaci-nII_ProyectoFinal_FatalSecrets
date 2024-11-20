package co.edu.konradlorenz.view;

import javax.swing.*;

import java.awt.*;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L; 
	
	//DECLARAR JPANELs DE LUGARES
	
	private JPanel currentScreen; // Panel que mostrará la pantalla actual
	private StartScreen startScreen;
	private DetectiveOfficeScreen detectiveOffice;
	private CentralBuildingScreen centralBuilding;
	private ElevatorScreen elevator;
	private Floor1_CafeteriaScreen floor1_Cafeteria;
	private Floor2_LibraryScreen floor2_Library;
	private Floor3_ComputerRoomScreen floor3_ComputerRoom;
	private Floor4_BathroomScreen floor4_Aisle;
	private Floor5_Classroom501NScreen floor5_Classroom501N;
	private Floor6_TerraceScreen floor6_Terrace;
	private Floor6_KioskScreen floor6_Kiosk;
	private Floor7_AisleScreen floor7_Aisle;
	private Floor8_ReceptionScreen floor8_Reception;
	private GymScreen gym;
	
	
	public GameWindow() {
        initComponents();
	}
	
	private void initComponents() {
		//CREAR JPANELs
		startScreen = new StartScreen(this);
		detectiveOffice = new DetectiveOfficeScreen(this);
		centralBuilding = new CentralBuildingScreen(this);
		elevator = new ElevatorScreen(this);
		floor1_Cafeteria = new Floor1_CafeteriaScreen(this);
		floor2_Library = new Floor2_LibraryScreen(this);
		floor3_ComputerRoom = new Floor3_ComputerRoomScreen(this);
		floor4_Aisle = new Floor4_BathroomScreen(this);
		floor5_Classroom501N = new Floor5_Classroom501NScreen(this);
		floor6_Terrace = new Floor6_TerraceScreen(this);
		floor6_Kiosk = new Floor6_KioskScreen(this);
		floor7_Aisle = new Floor7_AisleScreen(this);
		floor8_Reception = new Floor8_ReceptionScreen(this);
		gym = new GymScreen(this);

		
		// CONFIGURAR VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar la ejecución si se cierra la ventana
		setTitle("Fatal Secrets");
		setSize(1024,768);
		setLocationRelativeTo(null);//Centra la ventana
		setLayout(new BorderLayout());//Desactivar layout automático para usar setBounds()
		setResizable(false);//No permite modificar el tamaño de la ventana
        currentScreen = startScreen;// Inicialmente se carga el panel StartScreen
        add(currentScreen, BorderLayout.CENTER);
	}

	public void updateScreen(JPanel newScreen) {  //Método que actualiza la pantalla al cambiar de lugar, cambia el JPanel que muestra el JFrame
        remove(currentScreen);// Elimina el panel actual
        currentScreen = newScreen;// Asigna el nuevo panel
        add(newScreen, BorderLayout.CENTER);// Agrega el nuevo panel y actualiza la ventana
        revalidate();  // Revalidar el contenedor para que se actualice
        repaint();     // Redibuja el JFrame
    }
	
	public JPanel getCurrentScreen() {
		return currentScreen;
	}

	public void setCurrentScreen(JPanel currentScreen) {
		this.currentScreen = currentScreen;
	}

	public StartScreen getStartScreen() {
		return startScreen;
	}

	public void setStartScreen(StartScreen startScreen) {
		this.startScreen = startScreen;
	}

	public DetectiveOfficeScreen getDetectiveOffice() {
		return detectiveOffice;
	}

	public void setDetectiveOffice(DetectiveOfficeScreen detectiveOffice) {
		this.detectiveOffice = detectiveOffice;
	}

	public CentralBuildingScreen getCentralBuilding() {
		return centralBuilding;
	}

	public void setCentralBuilding(CentralBuildingScreen centralBuilding) {
		this.centralBuilding = centralBuilding;
	}

	public ElevatorScreen getElevator() {
		return elevator;
	}

	public void setElevator(ElevatorScreen elevator) {
		this.elevator = elevator;
	}

	public Floor1_CafeteriaScreen getFloor1_Cafeteria() {
		return floor1_Cafeteria;
	}

	public void setFloor1_Cafeteria(Floor1_CafeteriaScreen floor1_Cafeteria) {
		this.floor1_Cafeteria = floor1_Cafeteria;
	}

	public Floor2_LibraryScreen getFloor2_Library() {
		return floor2_Library;
	}

	public void setFloor2_Library(Floor2_LibraryScreen floor2_Library) {
		this.floor2_Library = floor2_Library;
	}

	public Floor3_ComputerRoomScreen getFloor3_ComputerRoom() {
		return floor3_ComputerRoom;
	}

	public void setFloor3_ComputerRoom(Floor3_ComputerRoomScreen floor3_ComputerRoom) {
		this.floor3_ComputerRoom = floor3_ComputerRoom;
	}

	public Floor4_BathroomScreen getFloor4_Aisle() {
		return floor4_Aisle;
	}

	public void setFloor4_Aisle(Floor4_BathroomScreen floor4_Aisle) {
		this.floor4_Aisle = floor4_Aisle;
	}

	public Floor5_Classroom501NScreen getFloor5_Classroom501N() {
		return floor5_Classroom501N;
	}

	public void setFloor5_Classroom501N(Floor5_Classroom501NScreen floor5_Classroom501N) {
		this.floor5_Classroom501N = floor5_Classroom501N;
	}

	public Floor6_TerraceScreen getFloor6_Terrace() {
		return floor6_Terrace;
	}

	public void setFloor6_Terrace(Floor6_TerraceScreen floor6_Terrace) {
		this.floor6_Terrace = floor6_Terrace;
	}

	public Floor6_KioskScreen getFloor6_Kiosk() {
		return floor6_Kiosk;
	}

	public void setFloor6_Kiosk(Floor6_KioskScreen floor6_Kiosk) {
		this.floor6_Kiosk = floor6_Kiosk;
	}

	public Floor7_AisleScreen getFloor7_Aisle() {
		return floor7_Aisle;
	}

	public void setFloor7_Aisle(Floor7_AisleScreen floor7_Aisle) {
		this.floor7_Aisle = floor7_Aisle;
	}

	public Floor8_ReceptionScreen getFloor8_Reception() {
		return floor8_Reception;
	}

	public void setFloor8_Reception(Floor8_ReceptionScreen floor8_Reception) {
		this.floor8_Reception = floor8_Reception;
	}

	public GymScreen getGym() {
		return gym;
	}

	public void setGym(GymScreen gym) {
		this.gym = gym;
	}
	
	
	
}
