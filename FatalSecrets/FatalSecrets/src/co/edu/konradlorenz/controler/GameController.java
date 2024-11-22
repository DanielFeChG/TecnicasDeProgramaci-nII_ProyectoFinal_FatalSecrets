package co.edu.konradlorenz.controler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;

public class GameController implements ActionListener{
	
	private GameWindow objGameWindow;
	private Case casoJuego;
	private Map<JButton, NPC> buttonNpcMap = new HashMap<>();
	
	public GameController() {
		objGameWindow = new GameWindow();
		
	    // Inicializar el caso y las ubicaciones
	    inicializarCaso();
		
		//Agregar todos los listener
		objGameWindow.getCentralBuilding().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor1_Cafeteria().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor2_Library().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor3_ComputerRoom().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor4_Aisle().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor5_Classroom501N().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor6_Terrace().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor6_Kiosk().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor8_Reception().getBotonPersonaje().addActionListener(this);
		objGameWindow.getGym().getBotonPersonaje().addActionListener(this);
		
		 // Inicializar el mapa de botones y NPCs
	    buttonNpcMap.put(
	        objGameWindow.getCentralBuilding().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(1).getEntidadesLugar().get(0) // NPC del Edificio Central
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor1_Cafeteria().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(4).getEntidadesLugar().get(0) // NPC de la Cafetería
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor2_Library().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(5).getEntidadesLugar().get(0) // NPC de la Biblioteca
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor3_ComputerRoom().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(6).getEntidadesLugar().get(0) // NPC de la Sala de Computadoras
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor4_Aisle().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(7).getEntidadesLugar().get(0) // NPC del Pasillo del Piso 4
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor5_Classroom501N().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(8).getEntidadesLugar().get(0) // NPC del Salón 501N
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor6_Terrace().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(9).getEntidadesLugar().get(0) // NPC de la Terraza
	    );
	    buttonNpcMap.put(
	        objGameWindow.getFloor8_Reception().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(11).getEntidadesLugar().get(0) // NPC de la Recepción
	    );
	    buttonNpcMap.put(
	        objGameWindow.getGym().getBotonPersonaje(),
	        (NPC) casoJuego.getUbicaciones().get(2).getEntidadesLugar().get(0) // NPC del Gimnasio
	    );

	}
	
	public void run() {	
		objGameWindow.setVisible(true);//Lanzar JFrame
		Player jugador = new Player("DetectiveJugador", casoJuego.getUbicaciones().get(0)); // Oficina del detective);
	    boolean gameRunning = true;
	    while (gameRunning) {
	    	
	    	
	    }
	}
	
	public void inicializarCaso() {
		
		// ------------------------------------ CREAR OBJETOS PISTA --------------------------------
		
		ObjectClue studentID = new ObjectClue("Carné estudiantil", "Carné del estudiante del salón de sistemas", "/co/edu/konradlorenz/view/images/Objetos/StudentIDImg.png");
		ObjectClue stickerBook = new ObjectClue("Stiker de libro", "Sticker  para ubicar el libro en la sección correcta", "/co/edu/konradlorenz/view/images/Objetos/StickerBookImg.png");
		ObjectClue keysGuide = new ObjectClue("Guia de llaves 5 piso", "Esta es la guía de las llaves que abren las puertas del quinto piso", "/co/edu/konradlorenz/view/images/Objetos/KeysGuideImg.png");
		ObjectClue b = new ObjectClue(" ", " ", " ");
		ObjectClue c = new ObjectClue(" ", " ", " ");
		
		// ------------------------------------ CREAR ACERTIJOS ------------------------------------
		
		//Todos los acertijos se deben recibir en minúsculas y sin signos de puntuacion
		Riddle act1Estudiante = new Riddle("No recuerdo mi código estudiantil", "506232729");
		Riddle act2Conserje = new Riddle("No recuerdo dóde dejé el trapero", "pasillo 7 piso");
		Riddle act3Instructora = new Riddle("Por asignar...", "solucion");//Con las adivinqanzas de las aulas virtuales
		Riddle act4Bibliotecario = new Riddle("Necesito ubicar este libro en la sección correcta", "psicologia");
		Riddle act5Profesora = new Riddle("Necesito encontrar el número de la llave de este salón", "144");
		Riddle act6Recepcionista = new Riddle("Yo creo mucho en la suerte, solo hablaré contigo si adivinas el número en el que estoy pensando", "0");//Este numero es Random
		Riddle act7Cocinero = new Riddle("Necesito que ajustes el tiempo del microondas", "");//Tiempo real
		Riddle act8Vigilante = new Riddle("Necesito recordar la clave de acceso al sistema de seguridad de la universidad", "FUKONRADL");	
		
		// ------------------------------------ CREAR NPCS -----------------------------------------
		
		NPC esposa = new Innocent("Karen", "Esposa del decano", "Tú - …\r\n"
				+ "Policía – Cuéntenos señora Sandra, ¿qué es lo que sucedió?... \r\n"
				+ "Sandra – Vine a visitar a mi esposo en su oficina, pero al entrar quedé completamente paralizada al verlo tirado en el suelo y sin vida. Luego acudí a el 123 para que vinieran lo más rápido posible. \r\n"
				+ "Policía – Lamento su perdida señora… El cuerpo de policía se encargará de encontrar al culpable de todo esto y hacer justicia, pero para ello necesito que me responda unas preguntas. ¿Le ha informado a alguien más acerca del fallecimiento de su esposo?\r\n"
				+ "Sandra – No, únicamente hice la llamada de emergencia, en el momento no pensé en alertar a alguien más.\r\n"
				+ "Policía – Muy bien, y dígame… ¿Vio usted algo sospechoso o relevante en la escena del crimen?\r\n"
				+ "Sandra – No, solo encontré un carnet estudiantil sobre su escritorio. Es justo este.\r\n"
				+ "", studentID, Color.RED);
		NPC estudiante = new Innocent("Daniel", "Estudiante", "Fuí a la oficina del decano porque...", act1Estudiante, stickerBook, Color.BLUE);
		NPC conserje = new Innocent("Fabian", "Conserje", "He estado haciendo el aseo de los baños de todos los pisos...", act2Conserje, keysGuide, Color.GREEN);
		NPC instructura = new Innocent("Natalia", "Instructora del gimnasio", "Como todos los dias he estado unicamente en el giimnasio...", act3Instructora, null, Color.YELLOW);
		NPC bibliotecario = new Innocent("Uriel", "Bibliotecario", "Estaba organizando uns libros que devolvieron.. pero kmlkf sdopef eefefmrlk m kefmwkemfkewmo kefmefmwolf oef ef i efmwekmlmewflnwef ked knmlkwefm este es el final", act4Bibliotecario, null, Color.PINK);
		NPC profesora = new Innocent("Lucía", "Profesora", "Estaba reemplazando al profesor en la clase de programación pq no llegó...", act5Profesora, null, Color.CYAN);
		NPC recepcionista = new Innocent("Rocio", "Recepcionista de decanatura", "Todo el día he estado en mi puesto de trabajo...", act6Recepcionista, null, Color.MAGENTA);
		NPC vigilante = new Innocent("Adriana", "Vigilante", "Acabo de llegar a mi turno...", act8Vigilante, null, Color.ORANGE);
		NPC cocinero = new Murder("Oscar", "Cocinero de la terraza del sexto piso", "Hoy he estado en la caseta durante todo el día...", act7Cocinero, null, Color.BLACK);
		
		// ------------------------------------ CREAR UBICACIONES ------------------------------------
		
		Location oficinaDetective = new Location("Oficina de detective", true);
		Location edificioCentral = new Location("Edificio central", true);
		Location gimnasio = new Location("Gimnasio", true);
		Location elevador = new Location("Elevador", true);
		Location piso1 = new Location("Cafetería", true);
		Location piso2 = new Location("Biblioteca", true);
		Location piso3 = new Location("Aula de sistemas", true);
		Location piso4 = new Location("Pasillo cuarto piso", true);
		Location piso5 = new Location("Salón 501-N", false);
		Location piso6 = new Location("Terraza sexto piso", true);
		Location piso7 = new Location("Pasillo séptimo piso", true);
		Location piso8 = new Location("Recepción decanatura", true);
		
		// ------------------------------------ CREAR CASO Y ASIGNAR UBICACIONES ------------------------------------
		
		 casoJuego = new Case("Asesinato del decano", (Murder) cocinero);
		
		// Agregar las ubicaciones
		casoJuego.getUbicaciones().add(oficinaDetective); //0
		casoJuego.getUbicaciones().add(edificioCentral); //1
		casoJuego.getUbicaciones().add(gimnasio); //2
		casoJuego.getUbicaciones().add(elevador); //3
		casoJuego.getUbicaciones().add(piso1); //4
		casoJuego.getUbicaciones().add(piso2); //5
		casoJuego.getUbicaciones().add(piso3); //6
		casoJuego.getUbicaciones().add(piso4); //7
		casoJuego.getUbicaciones().add(piso5); //8
		casoJuego.getUbicaciones().add(piso6); //9
		casoJuego.getUbicaciones().add(piso7); //10
		casoJuego.getUbicaciones().add(piso8); //11
		
		// Agregar y ubicar NPCs
		casoJuego.getUbicaciones().get(4).getEntidadesLugar().add(esposa);
		casoJuego.getUbicaciones().get(5).getEntidadesLugar().add(bibliotecario);
		casoJuego.getUbicaciones().get(6).getEntidadesLugar().add(estudiante);
		casoJuego.getUbicaciones().get(7).getEntidadesLugar().add(conserje);
		casoJuego.getUbicaciones().get(8).getEntidadesLugar().add(profesora);
		casoJuego.getUbicaciones().get(9).getEntidadesLugar().add(cocinero);
		casoJuego.getUbicaciones().get(11).getEntidadesLugar().add(recepcionista);		
		casoJuego.getUbicaciones().get(1).getEntidadesLugar().add(vigilante);		
		casoJuego.getUbicaciones().get(2).getEntidadesLugar().add(instructura);		
		
		}

	public void showRiddleDialog(NPC npc) {
	    Riddle riddle = npc.getAcertijo();
	    RiddleDialog riddleDialog = new RiddleDialog(objGameWindow, npc.getDescripcion(), riddle.getPregunta());
	    riddleDialog.addSubmitListener(e -> {
		    String respuesta = riddleDialog.getAnswer();
		    if (riddle.comprobar(respuesta)) {
		    	riddleDialog.setFeedback("¡Correcto!");
		        riddleDialog.setVisible(false);
		        showTestimonyDialog(npc);
		    } else {
		        riddleDialog.setFeedback("Respuesta incorrecta. Intenta de nuevo.");
		    }
        });
	    riddleDialog.setVisible(true);
	}

	public void showTestimonyDialog(NPC npc) {
		if (npc.getPista() != null) {
			TestimonyDialog testimonyDialog = new TestimonyDialog(objGameWindow, npc.getNombre(), npc.getTestimonio(), npc.getColor(), npc.getPista().getImagePath());
			testimonyDialog.setVisible(true);
		}		
		else {
			TestimonyDialog testimonyDialog = new TestimonyDialog(objGameWindow, npc.getNombre(), npc.getTestimonio(), npc.getColor());
			testimonyDialog.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    JButton sourceButton = (JButton) e.getSource();
	    NPC npc = buttonNpcMap.get(sourceButton); // Obtiene el NPC asociado al botón

	    if (npc != null) { // Verifica si el botón tiene un NPC asociado
	        if (npc.getAcertijo() != null && !npc.getAcertijo().isResuelto()) {
	            showRiddleDialog(npc);
	        } else {
	            showTestimonyDialog(npc);
	        }
	    }
	}


	
	

}
