import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Emner;
import model.Sporgsmaal;


public class LaeringsmaalController {

    private int i = 0;
    private int j = 0;
    private int start = 0;
    Emner emner = new Emner();
    Sporgsmaal q = new Sporgsmaal();

    @FXML
    TextField emneTextField;

    @FXML
    TextArea spoergsmaalTextArea;

    @FXML
    private void indlaesStart() {
        start = 1;
        emneTextField.setText(emner.getEmne(i));
        spoergsmaalTextArea.setText(q.getSporgsmaal(i, 0) + "\n");
    }

    @FXML
    private void indlaes() {
        System.out.println(emner.getEmne(i));
        emneTextField.setText(emner.getEmne(i));
        j = 0;
        spoergsmaalTextArea.setText(q.getSporgsmaal(i, j) + "\n");
    }

    @FXML
    private void gem() {
        q.setSporgsmaal(i, j, spoergsmaalTextArea.getText());
    }

    @FXML
    private void naeste() {
        if (i != 10) {
            i++;
            indlaes();
        }
    }

    @FXML
    private void forrige() {
        if (i != 0) {
            i--;
            indlaes();
        }
    }

    @FXML
    private void naesteSporgsmaal() {
        if (j != q.getLastIndexOf(i) && q.getSporgsmaal(i, j + 1) != null && start != 0) {
            j++;
            spoergsmaalTextArea.setText(q.getSporgsmaal(i, j) + "\n");
        }
    }

    @FXML
    private void forrigeSporgsmaal() {
        if (j != 0 && start != 0) {
            j--;
            spoergsmaalTextArea.setText(q.getSporgsmaal(i, j) + "\n");
        }
    }


}
