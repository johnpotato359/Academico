package clinicaPet.boundary;



import javax.swing.JOptionPane;
import clinicaPet.control.FuncionarioControl;
import clinicaPet.entidades.Cliente;
import clinicaPet.entidades.Funcionario;
import clinicaPet.interfaces.BoundaryContent;
import clinicaPet.interfaces.Acao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class FuncionarioBoundary implements BoundaryContent, EventHandler<ActionEvent>{
	private FuncionarioControl control = new FuncionarioControl();
	private BorderPane painelPrincipal = new BorderPane();
	private GridPane painelCampos = new GridPane();
	private FlowPane painelBotoes = new FlowPane();	
	private TextField txtNome = new TextField();
	private TextField txtTelefone = new TextField();
	private TextField txtEndereco = new TextField();
	private TextField txtCpf = new TextField();
	private TextField txtData = new TextField();
	private ComboBox<String> sexo = new ComboBox<>();
	private Button btnAdicionar = new Button("Incluir");
	private Button btnAlterar = new Button("Alterar");
	private Button btnPesquisar = new Button("Pesquisar");
	private Button btnMenu = new Button("Voltar");
	private Acao acao;
	
	
	public Funcionario boundaryEntidade(){
		Funcionario func = new Funcionario();
		func.setNome(txtNome.getText());
		func.setCPF(txtCpf.getText());
		func.setEndereco(txtEndereco.getText());
		func.setData(txtData.getText());
		func.setTelefone(txtTelefone.getText());
		String tiposexo = sexo.getSelectionModel().getSelectedItem().toString();
		try {
			func.setCPF(txtCpf.getText());
			func.setEndereco(txtEndereco.getText());
			func.setSexo(tiposexo);
			func.setNome(txtNome.getText());
			func.setTelefone(txtTelefone.getText());
			return func;
		} catch (Exception e) {
			Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
			dialogoErro.setTitle("Erro ao incluir");
			dialogoErro.setHeaderText(e.getMessage());
			dialogoErro.showAndWait();
		}
		
		return func;
	}
	
	
	
	@SuppressWarnings("static-access")	
	public FuncionarioBoundary(Acao e) {
		this.setAcao(e);
		
		painelPrincipal.setStyle("-fx-padding:5px");
		
		Label labtitulo = new Label("REGISTRO DE FUNCIONARIO");
		labtitulo.setFont(Font.font("Arial", FontWeight.BLACK, 25));
		
		painelBotoes.setHgap(15);
		painelCampos.setHgap(5);
		painelCampos.setVgap(25);
		
		ObservableList<String> tipoSexo = FXCollections.observableArrayList("Feminino", "Masculino");
		sexo.setItems(tipoSexo);
		
		
		painelCampos.add(new Label("Nome"), 1, 1);
		painelCampos.add(txtNome, 2, 1);
		painelCampos.add(new Label("CPF"), 1, 2);
		painelCampos.add(txtCpf, 2, 2);
		painelCampos.add(new Label("Sexo"), 1, 3);
		painelCampos.add(sexo, 2, 3);
		painelCampos.add(new Label("Telefone"), 1, 4);
		painelCampos.add(txtTelefone, 2, 4);
		painelCampos.add(new Label("Endereco"), 1, 5);
		painelCampos.add(txtEndereco, 2, 5);
		painelCampos.add(new Label("Data de Admissão"), 1, 6);
		painelCampos.add(txtData, 2, 6);
		
		
		
		painelBotoes.getChildren().addAll(btnAdicionar, btnPesquisar,btnAlterar,btnMenu);
		
		painelPrincipal.setMargin(painelBotoes, new Insets(15));
		painelPrincipal.setTop(labtitulo);
		painelPrincipal.setCenter(painelCampos);
		painelPrincipal.setBottom(painelBotoes);
		
		btnAdicionar.addEventHandler(ActionEvent.ANY, this);
		btnPesquisar.addEventHandler(ActionEvent.ANY, this);
		btnAlterar.addEventHandler(ActionEvent.ANY, this);
		
		btnMenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				acao.acao("Menu principal");
			}
		});

	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getTarget() == btnAdicionar) { 
			control.manterFuncioario( boundaryEntidade() );
		} else if (event.getTarget() == btnPesquisar) {
			String cpfFuncionario = txtCpf.getText();
			//Funcionario func = control.buscarFuncionario(cpfFuncionario);
			//JOptionPane.showMessageDialog(null, func);
		}
		
	}
		
	
	@Override
	public Pane gerarTela() {
		
		return painelPrincipal;
	}


	@Override
	public void setAcao(Acao e) {
		this.acao = e;
	}
	
	@Override
	public Acao getAcao() {
		return this.acao;
	}


}

