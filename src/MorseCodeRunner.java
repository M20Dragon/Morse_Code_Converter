import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by timurguler on 5/14/16.
 */
public class MorseCodeRunner extends Application
{
    private TextArea inputText;
    private TextArea getMorse;
    private String toBeConverted = "";
    private String toPlayString;
    public void start(Stage morseApp)
    {
        //INITIALIZE PANE AND SCENE
        StackPane panel = new StackPane();
        morseApp.setTitle("Morse Code Converter v.1.2");
        Scene frontScene = new Scene(panel,800,500);
        
        //LOAD RESOURCES TO SCENE
        inputText = new TextArea();
        inputText.setPrefSize(500,100);
        panel.getChildren().add(inputText);

        getMorse = new TextArea();
        getMorse.setPrefSize(500,100);
        getMorse.setTranslateY(100);
        panel.getChildren().add(getMorse);

        Button startButton = new Button();
        startButton.setPrefSize(90,20);
        startButton.setText("Convert");
        startButton.setTranslateY(200);
        panel.getChildren().add(startButton);

        Button clearButton = new Button();
        clearButton.setPrefSize(90,20);
        clearButton.setText("Clear");
        clearButton.setTranslateX(140);
        clearButton.setTranslateY(200);
        panel.getChildren().add(clearButton);

        Button soundButton = new Button();
        soundButton.setPrefSize(90,20);
        soundButton.setText("Listen");
        soundButton.setTranslateX(-140);
        soundButton.setTranslateY(200);
        panel.getChildren().add(soundButton);

        //SEND RESOURCES AND FRAME TO USER
        morseApp.setResizable(false);
        morseApp.setScene(frontScene);
        morseApp.show();

        //WHEN START BUTTON PRESSED
        startButton.setOnAction(new EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                MorseCode.morseCodeString = "";
                callMorseObject();
            }
        });

        //WHEN CLEAR BUTTON PRESSED
        clearButton.setOnAction(new EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                inputText.clear();
                inputText.setText("");
                getMorse.clear();
                getMorse.setText("");
                MorseCode.morseCodeString = "";

            }
        });

        //WHEN SOUND BUTTON IS PRESSED
        soundButton.setOnAction(new EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                toPlayString = getMorse.getText();
                MorseCode playSound = new MorseCode(toPlayString,getMorse);
                playSound.morseSound(toPlayString,getMorse);
            }
        });
    }
    private void callMorseObject()
    {
        toBeConverted = inputText.getText();
        MorseCode convertToMorse = new MorseCode(toBeConverted,getMorse);
        convertToMorse.theConversion();
    }
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
