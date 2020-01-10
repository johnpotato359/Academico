package clinicaPet.boundary;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import clinicaPet.interfaces.BoundaryContent;
import clinicaPet.interfaces.Acao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Principal extends Application implements EventHandler<Event>, Acao {

	private TilePane window = new TilePane();
	private Pane pane = new Pane();
	private Label titulo = new Label("Clinica Pet");
	private String btnCliente = "Clientes";
	private String btnAnimais = "Animais";
	private String btnFuncionario = "Funcionarios";
	private String btnInternacao = "Internação";
	
	
	private Map<String, BoundaryContent> telas = new HashMap<>();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws FileNotFoundException {
		window.setPrefSize(600.0, 450.0);
		window.setAlignment(Pos.CENTER);
		window.addEventHandler(ActionEvent.ANY, this);

		comandoTelas();
		
		
		
		window.getChildren().add(pane);
		Scene scn = new Scene(window);
		stage.setTitle("Clinica Pet");
		stage.setScene(scn);
		stage.show();
		acao("Menu principal");

	}

	
	public void comandoTelas() throws FileNotFoundException {
		// gerar as telas
		telas.put("Menu principal", new MenuPrincipalBoundary(this));
		telas.put(btnFuncionario, new FuncionarioBoundary(this));
		telas.put(btnCliente, new ClienteBoundary(this));
		//telas.put(btnAnimais, new AnimalBoundary(this));
		//telas.put(btnInternacao, new InternacaoBoundary(this));
	}

	@Override
	public void handle(Event event) {
		if (event.getTarget() instanceof Button) {
			Button z = (Button) event.getTarget();
			String comando = z.getText();
			acao(comando);
		}

	}

	

	@Override
	public void acao(String cmd) {
		
		BoundaryContent tela = telas.get(cmd);
		if (tela != null) {
			pane.getChildren().clear();
			pane.getChildren().add(tela.gerarTela());
		}
	}
}
