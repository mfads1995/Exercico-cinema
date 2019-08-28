/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamichael;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Michael
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextArea TAOpiniao;
    @FXML
    private CheckBox CB1;
    @FXML
    private CheckBox CB2;
    @FXML
    private CheckBox CB3;
    @FXML
    private CheckBox CB4;
    @FXML
    private RadioButton RB1;
    @FXML
    private ToggleGroup Filme;
    @FXML
    private RadioButton RB2;
    @FXML
    private RadioButton RB3;
    @FXML
    private Label resposta;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

     @FXML
    private void handleButtonAction(ActionEvent event) {
        
         String m = "";
        
        if(CB1.isSelected()){
            m += "\n" + CB1.getText();
        }
        
        if(CB2.isSelected()){
            m += "\n" + CB2.getText();
        }
        
        if(CB3.isSelected()){
            m += "\n" + CB3.getText();
        }
        
        if(CB4.isSelected()){
            m += "\n" + CB4.getText();
        }
        
        if(RB1.isSelected()){
            m += "\n" + RB1.getText();
        }
        
        if(RB2.isSelected()){
            m += "\n" + RB2.getText();
        }
        
        if(RB3.isSelected()){
            m += "\n" + RB3.getText();
        }
        
        m += "\n" + TAOpiniao.getText();
        
        resposta.setText("Resposta:"+m);
        
    
    }
    

    
    
}
