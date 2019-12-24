package com.example.midterm2kurashvili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String ran(){
        String Char;
        final int random = new Random().nextInt(3);

        if(random == 0)
            Char = "W";
        else if(random == 1)
            Char = "L";
        else
            Char = "N";

        return  Char;
    }
    int Coins = 100;
    public void  onClick(View v){


        TextView Coin = (TextView)findViewById(R.id.CoinLabel);

        TextView one = (TextView)findViewById(R.id.one);
        String first = ran();
        one.setText(first);


        TextView two = (TextView)findViewById(R.id.two);
        String second = ran();
        two.setText(second);

        TextView three = (TextView)findViewById(R.id.three);
        String third = ran();
        three.setText(third);

        TextView four = (TextView)findViewById(R.id.four);
        String fourth = ran();
        four.setText(fourth);

        TextView five = (TextView)findViewById(R.id.five);
        String fiveth = ran();
        five.setText(fiveth);

        TextView six = (TextView)findViewById(R.id.six);
        String sixth = ran();
        six.setText(sixth);

        TextView seven = (TextView)findViewById(R.id.seven);
        String seventh = ran();
        seven.setText(seventh);

        TextView eight = (TextView)findViewById(R.id.eight);
        String eightth = ran();
        eight.setText(eightth);

        TextView nine = (TextView)findViewById(R.id.nine);
        String nineth = ran();
        nine.setText(nineth);



        EditText number = findViewById(R.id.NumberText);
        String num =  number.getText().toString();
        int finalValue=Integer.parseInt(num);

        if(finalValue == 1){
            if(first == "W") {
                Coins = Coins + 5;
                if(second == "W")
                    Coins = Coins + 5;
                if(fourth == "W")
                    Coins = Coins + 5;
            }
            else if(first == "L") {
                Coins = Coins - 5;
                if(second == "L")
                    Coins = Coins - 5;
                if(fourth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 2){
            if(second == "W"){
                Coins = Coins + 5;
                if(first == "W")
                    Coins = Coins + 5;
                if(third == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
            }

            else if(second == "L"){
                Coins = Coins - 5;
                if(first == "L")
                    Coins = Coins - 5;
                if(third == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
            }

            else
                Coins = Coins - 1;

        }else if(finalValue == 3){
            if(third == "W"){
                Coins = Coins + 5;
                if(second == "W")
                    Coins = Coins + 5;
                if(sixth == "W")
                    Coins = Coins + 5;
            }

            else if(third == "L"){
                Coins = Coins - 5;
                if(second == "L")
                    Coins = Coins - 5;
                if(sixth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 4){
            if(fourth == "W") {
                Coins = Coins + 5;
                if(first == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
                if(seventh == "W")
                    Coins = Coins + 5;
            }
            else if(fourth == "L"){
                Coins = Coins - 5;
                if(first == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
                if(seventh == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 5){
            if(fiveth == "W"){
                Coins = Coins + 5;
                if(second == "W")
                    Coins = Coins + 5;
                if(fourth == "W")
                    Coins = Coins + 5;
                if(sixth == "W")
                    Coins = Coins + 5;
                if(eightth == "W")
                    Coins = Coins + 5;
            }
            else if(fiveth == "L"){
                Coins = Coins - 5;
                if(second == "L")
                    Coins = Coins - 5;
                if(fourth == "L")
                    Coins = Coins - 5;
                if(sixth == "L")
                    Coins = Coins - 5;
                if(eightth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 6){
            if(sixth == "W"){
                Coins = Coins + 5;
                if(third == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
                if(nineth == "W")
                    Coins = Coins + 5;
            }
            else if(sixth == "L"){
                Coins = Coins - 5;
                if(third == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
                if(nineth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 7){
            if(seventh == "W"){
                Coins = Coins + 5;
                if(fourth == "W")
                    Coins = Coins + 5;
                if(eightth == "W")
                    Coins = Coins + 5;
            }
            else if(seventh == "L"){
                Coins = Coins - 5;
                if(fourth == "L")
                    Coins = Coins - 5;
                if(eightth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 8){
            if(eightth == "W"){
                Coins = Coins + 5;
                if(seventh == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
                if(nineth == "W")
                    Coins = Coins + 5;
            }
            else if(eightth == "L"){
                Coins = Coins - 5;
                if(seventh == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
                if(nineth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 9){
            if(nineth == "W"){
                Coins = Coins + 5;
                if(sixth == "W")
                    Coins = Coins + 5;
                if(eightth == "W")
                    Coins = Coins + 5;
            }
            else if(nineth == "L"){
                Coins = Coins - 5;
                if(eightth == "L")
                    Coins = Coins - 5;
                if(sixth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else
            return;

        Coin.setText(Integer.toString(Coins));






    }
}
