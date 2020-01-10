package clinicaPet.boundary;

import clinicaPet.control.ClienteControl;
import clinicaPet.entidades.Cliente;
import clinicaPet.interfaces.BoundaryContent;
import clinicaPet.interfaces.Acao;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ClienteBoundary implements BoundaryContent, EventHandler<ActionEvent>{
	private ClienteControl control = new ClienteControl();
	private TextField txtNome = new TextField();
	private TextField txtTelefone = new TextField();
	private TextField txtEndereco = new TextField();
	private TextField txtCpf = new TextField();
	private Acao acao;

	private ComboBox<String> sexo = new ComboBox<>();
	private VBox painelCentral = new VBox();
	private BorderPane painelPrincipal = new BorderPane();
	private GridPane painelCampos = new GridPane();
	private FlowPane painelBotoes = new FlowPane();	
	
	private Button btnIncluir = new Button(" Incluir ");
	private Button btnAlterar = new Button(" Alterar ");
	private Button btnPesquisar = new Button(" Pesquisar ");
	private Button btnApagar = new Button(" Apagar ");
	private Button btnMenu = new Button(" Voltar ");
	private TableView<Cliente> table;
	
	
	@SuppressWarnings("static-access")	
	public ClienteBoundary(Acao e) {
		this.setAcao(e);
		
		ObservableList<String> tipoSexo = FXCollections.observableArrayList("Feminino", "Masculino");
		sexo.setItems(tipoSexo);	

		painelPrincipal.setStyle("-fx-padding:20px");

		Label labtitulo = new Label("GERENCIAR CLIENTES");
		labtitulo.setOpaqueInsets( new Insets(15));
		labtitulo.setUnderline(true);	
		labtitulo.setFont(Font.font("Arial", FontWeight.BLACK, 25));
		
		painelBotoes.setHgap(15);
		painelBotoes.setVgap(10);
		painelCampos.setHgap(8);
		painelCampos.setVgap(25);
		
		painelCampos.add(new Label("Nome"), 0, 0);
		painelCampos.add(txtNome, 1, 0);
		painelCampos.add(new Label("CPF"), 0, 1);
		painelCampos.add(txtCpf, 1, 1);
		painelCampos.add(new Label("Sexo"), 0, 2);
		painelCampos.add(sexo, 1, 2);		
		painelCampos.add(new Label("Telefone"), 0, 3);
		painelCampos.add(txtTelefone, 1, 3);
		painelCampos.add(new Label("Endereco"), 0, 4);
		painelCampos.add(txtEndereco, 1, 4);
		painelCampos.setVgap(20);
		
		painelBotoes.getChildren().addAll(btnIncluir, btnPesquisar,btnAlterar,btnApagar,btnMenu);
		painelBotoes.setMargin(painelBotoes, new Insets(15));
		
		painelCentral.setMargin(painelBotoes, new Insets(15));
		painelCentral.getChildren().addAll(painelCampos,painelBotoes);
		table = generateTable();
		
		
		
		painelPrincipal.setTop(labtitulo);
		painelPrincipal.setCenter(painelCentral);
		painelPrincipal.setBottom(table);
		
		painelPrincipal.setMargin(painelCentral, new Insets(15));
		painelPrincipal.setMargin(labtitulo, new Insets(15));

		btnIncluir.addEventHandler(ActionEvent.ANY, this);
		btnPesquisar.addEventHandler(ActionEvent.ANY, this);
		btnAlterar.addEventHandler(ActionEvent.ANY, this);
		btnApagar.addEventHandler(ActionEvent.ANY, this);
		btnMenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				acao.acao("Menu principal");
			}
		});
	}

	@Override
	public void handle(ActionEvent event) {
		
		if (event.getTarget() == btnIncluir) { 
			control.manterCliente( boundaryEntidade() );
			limpar();
		} else if (event.getTarget() == btnAlterar){
			Cliente clienteSelect = table.getSelectionModel().getSelectedItem();
			control.alterarCliente(boundaryEntidade(),clienteSelect.getCPF());
			
		} else if (event.getTarget() == btnApagar) {
			Cliente clienteSelect = table.getSelectionModel().getSelectedItem();
			control.apagar(clienteSelect.getCPF());
			
		} else if (event.getTarget() == btnPesquisar) {
			String cpfCliente = txtCpf.getText();
			control.buscarCliente(cpfCliente);
		}
	}


	public Cliente boundaryEntidade(){
		Cliente cli = new Cliente();
		String tiposexo = sexo.getSelectionModel().getSelectedItem().toString();
		try {
			cli.setCPF(txtCpf.getText());
			cli.setEndereco(txtEndereco.getText());
			cli.setSexo(tiposexo);
			cli.setNome(txtNome.getText());
			cli.setTelefone(txtTelefone.getText());
			return cli;
		} catch (Exception e) {
			Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
			dialogoErro.setTitle("Erro ao incluir");
			dialogoErro.setHeaderText(e.getMessage());
			dialogoErro.showAndWait();
		}
		return null;
	}
	
	private TableView<Cliente> generateTable() {
		TableView<Cliente> table = new TableView<>();

	
		TableColumn<Cliente, String> coluna1 = new TableColumn<>("Nome");
		coluna1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Nome"));

		TableColumn<Cliente, String> coluna2 = new TableColumn<>("CPF");
		coluna2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("CPF"));
		
		TableColumn<Cliente, String> coluna3 = new TableColumn<>("Sexo");
		coluna3.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Sexo"));
		
		TableColumn<Cliente, String> coluna4 = new TableColumn<>("Telefone");
		coluna4.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Telefone"));
		
		TableColumn<Cliente, String> coluna5 = new TableColumn<>("Endereco");
		coluna5.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Endereco"));
		
		table.getColumns().addAll(coluna1, coluna2, coluna3, coluna4, coluna5);
		table.setItems(control.getLista());
		return table;

	}
	
	
	
	
	private void limpar() {
		table.getSelectionModel().select(null);
		txtNome.setText(null);
		txtEndereco.setText(null);
		txtCpf.setText(null);
		txtTelefone.setText(null);
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
	public Pane gerarTela() {
		limpar();
		
		return painelPrincipal;
	}

}
