package com.example.Controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;

import static com.example.Model.mediaPlayerMain.mediaPlayer;

public class winMenuController {
    @FXML
    private ImageView toBeDestroyed;
    public void initialize(){
        //Initialising path of the media file, replace this with your file path
        String path = "src/main/resources/victoryTheme.mp3";

        //Instantiating Media class
        Media media = new Media(new File(path).toURI().toString());

        mediaPlayer.stop();

        //Instantiating MediaPlayer class
        mediaPlayer = new MediaPlayer(media);

        //by setting this property to true, the audio will be played
        mediaPlayer.setAutoPlay(true);

        mediaPlayer.setOnEndOfMedia(new Runnable() {
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
            }
        });
        mediaPlayer.play();
    }

    @FXML
    void goToCreddits(MouseEvent event) {
        toBeDestroyed.setVisible(false);
    }
}
