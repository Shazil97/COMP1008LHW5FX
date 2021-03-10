package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import models.*;
import models.DeckOfCards;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class CardViewController implements Initializable {
    @FXML
    private Label facenamelabel;


    @FXML
    private Label suitlabel;

    @FXML
    private ImageView imageView;


    private DeckOfCards deckOfCards;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deckOfCards = new DeckOfCards();   //Intializing the constructor

    }

    @FXML //Put this method in Button --> Code area in ACTION id

    private void showNextCard() {
        Card card = deckOfCards.dealTopCard();
        if (card != null) {
            //set method for facenamelabel
            facenamelabel.setText(card.getFaceName()); //call method setText, this set method will accept the string which
            // update the string called Facename

            // setmethod for suitlabel
            suitlabel.setText(card.getSuit());
            imageView.setImage(card.getImage());
        }
    }
}