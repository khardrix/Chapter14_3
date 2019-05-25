/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 14: Problem 3                                            *****
 *****___________________________________________________________________________________________________________*****
 *****   3. Create several Text objects (each one can have the same String as the others, or they can differ).   *****
 *****                      Draw them each on the Pane but rotate each one by 45 degrees.                        *****
 *****                  That is, each String will appear rotated 45 degrees from the last one.                   *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                     NOTE: import javafx.scene.text.*;                                     *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Chapter14_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Creating the Pane
        Pane pane = new Pane();

        // Creating all the Text objects, their location and their actual text
        Text text1 = new Text(50,250,"Text for Problem 3!");
        Text text2 = new Text(60, 130, "Text for Problem 3!");
        Text text3 = new Text(150, 85, "Text for Problem 3!");
        Text text4 = new Text(240, 120, "Text for Problem 3!");
        Text text5 = new Text(290, 250, "Text for Problem 3!");
        Text text6 = new Text(240, 350, "Text for Problem 3!");
        Text text7 = new Text(130, 400, "Text for Problem 3!");
        Text text8 = new Text(20, 350, "Text for Problem 3!");

        // Setting the colors of the Text objects
        text1.setFill(Color.VIOLET);
        text2.setFill(Color.INDIGO);
        text3.setFill(Color.BLUE);
        text4.setFill(Color.GREEN);
        text5.setFill(Color.YELLOW);
        text6.setFill(Color.ORANGE);
        text7.setFill(Color.RED);
        text8.setFill(Color.HOTPINK);

        // Setting the Font of the Text objects
        text1.setFont(new Font("Chiller", 18));
        text2.setFont(new Font("Comic Sans", 18));
        text3.setFont(new Font("Times New Roman", 18));
        text4.setFont(new Font("Ariel", 18));
        text5.setFont(new Font("Helvetica", 18));
        text6.setFont(new Font("Book Antiqua", 18));
        text7.setFont(new Font("Algerian", 18));
        text8.setFont(new Font("Broadway", 18));

        // Rotating the Text objects
        text2.setRotate(45);
        text3.setRotate(90);
        text4.setRotate(135);
        text5.setRotate(180);
        text6.setRotate(225);
        text7.setRotate(270);
        text8.setRotate(315);

        // Adding the Text objects to the Pane
        pane.getChildren().addAll(text1, text2, text3, text4, text5, text6, text7, text8);

        // Creating the Scene by putting the Pane in the Scene
        Scene scene = new Scene(pane, 500, 500);

        // Setting the Title, setting the Scene and then showing the Scene
        primaryStage.setTitle("Chapter 14, Problem 3: Rotating Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
