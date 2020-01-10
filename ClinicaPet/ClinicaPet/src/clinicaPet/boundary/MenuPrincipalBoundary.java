package clinicaPet.boundary;

import java.io.FileNotFoundException;
import clinicaPet.interfaces.BoundaryContent;
import clinicaPet.interfaces.Acao;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class MenuPrincipalBoundary implements BoundaryContent, EventHandler<ActionEvent>{
	private Label titulo = new Label("Clinica Pet");
	private Button btnInternacao = new Button("Internação");
	private Button btnCliente = new Button("Clientes");
	private Button btnFuncionario = new Button("Funcionarios");
	private Button btnAnimais = new Button("Animais");
	private VBox box = new VBox();
	private Acao acao;

	public MenuPrincipalBoundary(Acao e) throws FileNotFoundException {
		this.setAcao(e);
		
		box.setAlignment(Pos.CENTER);
		box.setSpacing(20); 
		box.addEventHandler(ActionEvent.ANY, this);

		titulo.setTextAlignment(TextAlignment.CENTER);
		titulo.setFont(Font.font("Arial", FontWeight.BLACK, 30));
		titulo.setTextFill(Color.GREEN);
		box.getChildren().add(titulo);
 
		DefBtn(btnInternacao);
		btnInternacao.addEventHandler(ActionEvent.ANY, this);
		DefBtn(btnCliente);
		btnCliente.addEventHandler(ActionEvent.ANY, this);
		DefBtn(btnFuncionario);
		btnFuncionario.addEventHandler(ActionEvent.ANY, this);
		DefBtn(btnAnimais);
		btnAnimais.addEventHandler(ActionEvent.ANY, this);
		
		
	}
	

	
	@Override
	public Pane gerarTela() {
		
		return box;
	}

	private void DefBtn(Button btn) {
		btn.setPrefSize(180, 50);
		btn.setTextAlignment(TextAlignment.CENTER);
		box.getChildren().add(btn);
	}
	
	@Override
	public void setAcao(Acao e) {
		this.acao = e;
	}

	@Override
	public Acao getAcao() {
		return this.acao;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
