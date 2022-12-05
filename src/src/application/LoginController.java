package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;


public class LoginController {
	
	ArrayList<String> usernamesList = new ArrayList<String>(Arrays.asList("Aly", "Mohamed", "Maged", "Dalia", "Yasmeen", "Ahmed", "ٌRazan", "Joury", "Hassan", "Sawsan"));
	ArrayList<String> passwordsList = new ArrayList<String>(Arrays.asList("yellow", "blue", "8888", "123444", "89303", "29403", "Blue", "Orange", "roses", "flowers"));
	
    @FXML
    private Text message_text;
    
    @FXML
    private ImageView background_img;

    @FXML
    private Button login_button;

    @FXML
    private AnchorPane main_anchor;

    @FXML
    private PasswordField password_passwordfield;

    @FXML
    private Text password_text;

    @FXML
    private Text title_text;

    @FXML
    private Text username_text;

    @FXML
    private TextField username_textfield;

    @FXML
    void login_function(ActionEvent event) {
    	
    	//////
    	String username = username_textfield.getText().toString();
    	String password = password_passwordfield.getText().toString();
    	
    	//if any of the fields is left blank
    	if(username.equals("") | password.equals("")) {
    		
    		message_text.setText("Please fill all the required fields!");
    	}else{
    		//if both fields contain text
    		//THEN...
    		
    		//Check that the username exists in ArrayList
        	if(usernamesList.contains(username)) {
        		//if username exists
        		//THEN check password is correct by checking corresponding password in ArrayList
        		
        		int index = usernamesList.indexOf(username);
        			//if password correct...
        		if(passwordsList.get(index).equals(password)) 
        			message_text.setText("Access granted!!!");
        			//if password is incorrect
        		else
        			message_text.setText("Wrong password!!!");
        		
        	}else 
        		//if username does not exist
        		message_text.setText("This username does not exist!");
    
        	
    	}
    	
    }
    
}
