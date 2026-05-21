package co.edu.uniquindio.poo.programacion1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import co.edu.uniquindio.poo.programacion1.model.Visitante;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import co.edu.uniquindio.poo.programacion1.model.TicketGeneral;
import javafx.scene.control.ComboBox;
import co.edu.uniquindio.poo.programacion1.model.Ticket;
import co.edu.uniquindio.poo.programacion1.model.TicketFastPass;
import co.edu.uniquindio.poo.programacion1.model.TicketFamiliar;


public class HelloController {

    private ObservableList<Visitante> listaVisitantes =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        colEstatura.setCellValueFactory(new PropertyValueFactory<>("estatura"));
        colTicket.setCellValueFactory(new PropertyValueFactory<>("tieneTicket"));
        colTipoTicket.setCellValueFactory(
                new PropertyValueFactory<>("tipoTicket"));

        comboTipoTicket.getItems().addAll(
                "General",
                "Fast Pass",
                "Familiar"
        );

        tablaVisitantes.setItems(listaVisitantes);
    }

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEstatura;

    @FXML
    private TextField txtBuscarDocumento;

    @FXML
    private TableView<Visitante> tablaVisitantes;

    @FXML
    private TableColumn<Visitante, String> colNombre;

    @FXML
    private TableColumn<Visitante, String> colDocumento;

    @FXML
    private TableColumn<Visitante, Integer> colEdad;

    @FXML
    private TableColumn<Visitante, Double> colEstatura;
    @FXML
    private TableColumn<Visitante, Boolean> colTicket;
    @FXML
    private TableColumn<Visitante, String> colTipoTicket;
    @FXML
    private ComboBox<String> comboTipoTicket;

    @FXML
    private void registrarVisitante() {

        if (txtNombre.getText().isEmpty() ||
                txtDocumento.getText().isEmpty() ||
                txtEdad.getText().isEmpty() ||
                txtEstatura.getText().isEmpty()) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText(null);
            alerta.setContentText("Todos los campos son obligatorios");
            alerta.showAndWait();

            return;
        }
        try {

            String nombre = txtNombre.getText();
            String documento = txtDocumento.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            double estatura = Double.parseDouble(txtEstatura.getText());

            Visitante visitante = new Visitante(
                    nombre,
                    documento,
                    edad,
                    estatura,
                    0,
                    false
            );

            listaVisitantes.add(visitante);


            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Registro exitoso");
            alerta.setHeaderText(null);
            alerta.setContentText("Visitante registrado correctamente");
            alerta.showAndWait();
            System.out.println(listaVisitantes);

            txtNombre.clear();
            txtDocumento.clear();
            txtEdad.clear();
            txtEstatura.clear();
        } catch (NumberFormatException e) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText(null);
            alerta.setContentText("Edad y estatura deben ser números");
            alerta.showAndWait();


        }

    }

    @FXML
    private void comprarTicket() {

        String documento = txtBuscarDocumento.getText();

        Visitante visitanteEncontrado = null;

        for (Visitante v : listaVisitantes) {

            if (v.getDocumento().equals(documento)) {

                visitanteEncontrado = v;
                break;
            }
        }

        if (visitanteEncontrado == null) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText(null);
            alerta.setContentText("Visitante no encontrado");
            alerta.showAndWait();

            return;
        }

        String tipoTicket = comboTipoTicket.getValue();

        Ticket ticket = null;

        if(tipoTicket.equals("General")){

            ticket = new TicketGeneral(
                    1,
                    50000,
                    true,
                    10
            );
        } else if(tipoTicket.equals("Fast Pass")){

            ticket = new TicketFastPass(
                    2,
                    80000,
                    true,
                    true
            );

        } else if(tipoTicket.equals("Familiar")){

            ticket = new TicketFamiliar(
                    3,
                    100000,
                    true,
                    4,
                    0.10
            );
        }
        visitanteEncontrado.setTicket(ticket);
        tablaVisitantes.refresh();
        visitanteEncontrado.setTicket(ticket);
        tablaVisitantes.refresh();

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Compra exitosa");
        alerta.setHeaderText(null);
        alerta.setContentText("Ticket comprado correctamente");
        alerta.showAndWait();
    }
}