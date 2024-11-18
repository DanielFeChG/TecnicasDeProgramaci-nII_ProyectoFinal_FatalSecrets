package co.edu.konradlorenz.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;



public class GameController implements ActionListener{
	
	
	
	private GameWindow objGameWindow;
	private Case casoJuego;

	
	public GameController() {
		objGameWindow = new GameWindow();
		
		//Agregar todos los listener
		objGameWindow.getCentralBuilding().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor1_Cafeteria().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor2_Library().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor3_ComputerRoom().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor4_Aisle().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor5_Classroom501N().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor6_Terrace().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor7_Aisle().getBotonPersonaje().addActionListener(this);
		objGameWindow.getFloor8_Reception().getBotonPersonaje().addActionListener(this);
		objGameWindow.getGym().getBotonPersonaje().addActionListener(this);

		
	}
	
	public void run() {	
		inicializarCaso();
		objGameWindow.setVisible(true);//Lanzar JFrame
		Player jugador = new Player("DetectiveJugador", casoJuego.getUbicaciones().get(0)); // Oficina del detective);
		
		   // Lógica principal del juego (puedes usar un bucle para el flujo general)
	    boolean gameRunning = true;
	    while (gameRunning) {
	    	
	    }
	}
	
	public void inicializarCaso() {
		// ------------------------------------ CREAR NPCS ------------------------------------
		
		NPC esposa = new Innocent("Karen", "Esposa del decano", "/imgEsposa", "Vine a visitar a mi esposo...", null, null);
		NPC estudiante = new Innocent("Daniel", "Estudiante", "/imgEstudiante", "Fuí a la oficina del decano porque...", null, null, null);
		NPC conserje = new Innocent("Fabian", "Conserje", "/imgConserje", "He estado haciendo el aseo de los baños de todos los pisos...", null, null, null);
		NPC instructura = new Innocent("Natalia", "Instructora del gimnasio", "/imgInstructora", "Como todos los dias he estado unicamente en el giimnasio...", null, null, null);
		NPC bibliotecario = new Innocent("Uriel", "Bibliotecario", "/imgBibliotecario", "Estaba organizando uns libros que devolvieron.. pero kmlkf sdopef eefefmrlk m kefmwkemfkewmo kefmefmwolf oef ef i efmwekmlmewflnwef ked knmlkwefm este es el final", null, null, null);
		NPC profesora = new Innocent("Lucía", "Profesora", "/imgProfesora", "Estaba reemplazando al profesor en la clase de programación pq no llegó...", null, null, null);
		NPC recepcionista = new Innocent("Rocio", "Recepcionista de decanatura", "/imgRecepcionista", "Todo el día he estado en mi puesto de trabajo...", null, null, null);
		NPC vigilante = new Innocent("Adriana", "Vigilante", "/imgVigilante", "Acabo de llegar a mi turno...", null, null, null);
		NPC cocinero = new Murder("Oscar", "Cocinero de la terraza del sexto piso", "/imgCocinero", "Hoy he estado en la caseta durante todo el día...", null, null);
		
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
		
		// ------------------------------------ CREAR ACERTIJOS ------------------------------------
		
		//Todos los acertijos se deben recibir en minúsculas y sin signos de puntuacion
		Riddle act1Estudiante = new Riddle("No recuerdo mi código estudiantil", "506232729");
		Riddle act2Conserje = new Riddle("No recuerdo dóde dejé el trapero", "recepcion decanatura");
		Riddle act3Instructora = new Riddle(null, null);//Con las adivinqanzas de las aulas virtuales
		Riddle act4Bibliotecario = new Riddle("Necesito ubicar este libro en la sección correcta", "ficcion");
		Riddle act5Profesora = new Riddle("Necesito encontrar el color de la llave de este salón", "morado");
		Riddle act6Recepcionista = new Riddle("Yo creo mucho en la suerte, solo hablaré contigo si adivinas el número en el que estoy pensando", "0");//Este numero es Random
		Riddle act7Cocinero = new Riddle("Necesito que ajustes el tiempo del microondas", "");//Tiempo real
		Riddle act8Vigilante = new Riddle("Necesito recordar la clave de acceso al sistema de seguridad de la universidad", "FUKONRADL");	
		
		//  ------------------------------------ ASIGNAR ACERTIJOS A NPCs------------------------------------
		estudiante.setAcertijo(act1Estudiante);
		conserje.setAcertijo(act2Conserje);
		instructura.setAcertijo(act3Instructora);
		bibliotecario.setAcertijo(act4Bibliotecario);
		profesora.setAcertijo(act5Profesora);
		recepcionista.setAcertijo(act6Recepcionista);
		cocinero.setAcertijo(act7Cocinero);
		vigilante.setAcertijo(act8Vigilante);
		
		// ------------------------------------ CREAR CASO Y ASIGNAR UBICACIONES ------------------------------------
		
		 casoJuego = new Case("El día de hoy el decano de la facultad de ingenierías ha sido asesinado", (Murder) cocinero);
		
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
		
		}


	@Override
	public void actionPerformed(ActionEvent e) {

	    if (e.getSource() == objGameWindow.getFloor2_Library().getBotonPersonaje()) {
	        NPC npc = (NPC) casoJuego.getUbicaciones().get(5).getEntidadesLugar().get(0); // Ejemplo: Bibliotecario
	        if (npc.getAcertijo() != null && !npc.getAcertijo().isEstado()) {
	            showRiddleDialog(npc);
	        } else {
	            showTestimonyDialog(npc);
	        }
	    }
		
	}

	public void showRiddleDialog(NPC npc) {
	    Riddle riddle = npc.getAcertijo();
	    RiddleDialog riddleDialog = new RiddleDialog(objGameWindow, npc.getDescripcion(), riddle.getPregunta());
	    riddleDialog.addSubmitListener(e -> {
		    String respuesta = riddleDialog.getAnswer();
		    if (riddle.comprobarRespuesta(respuesta)) {
		    	riddleDialog.setFeedback("¡Correcto!");
		        riddleDialog.setVisible(false);
		        showTestimonyDialog(npc);
		        riddle.setEstado(true);
		    } else {
		        riddleDialog.setFeedback("Respuesta incorrecta. Intenta de nuevo.");
		    }
        });
	    riddleDialog.setVisible(true);
	    
	}

	public void showTestimonyDialog(NPC npc) {
	    TestimonyDialog testimonyDialog = new TestimonyDialog(objGameWindow, npc.getNombre(),npc.getTestimonio());
	    testimonyDialog.setVisible(true);
	}

	
	

}
