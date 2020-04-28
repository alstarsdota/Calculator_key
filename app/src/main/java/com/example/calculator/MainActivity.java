package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Path;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double firstNumber=0;
    double secondNumber=0;
    double res=0;
    char Operation;
    String outp="";
    private boolean isOpClicked=false;
    boolean isNumclicked=false;
    TextView calcscreen,screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcscreen = findViewById(R.id.screen);
        final Button buttonDot = findViewById(R.id.buttonDot);
        final Button buttonEqual = findViewById(R.id.buttonEqual);
        final Button zero = findViewById(R.id.zero);
        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiply = findViewById(R.id.multiply);
        final Button division = findViewById(R.id.division);
        final Button one = findViewById(R.id.one);
        final Button two = findViewById(R.id.two);
        final Button three = findViewById(R.id.three);
        final Button four = findViewById(R.id.four);
        final Button five = findViewById(R.id.five);
        final Button six = findViewById(R.id.six);
        final Button seven = findViewById(R.id.seven);
        final Button eight = findViewById(R.id.eight);
        final Button nine = findViewById(R.id.nine);
        final Button backspace = findViewById(R.id.backspace);
        final Button power = findViewById(R.id.power);
        final Button percent = findViewById(R.id.percent);
        final Button delete = findViewById(R.id.delete);
        final Button Square = findViewById(R.id.Square);
        screen = findViewById(R.id.screen2);

        if(savedInstanceState!=null){
            calcscreen.setText(savedInstanceState.getString("first_val"));
            screen.setText(savedInstanceState.getString("operScreen"));
            Operation=savedInstanceState.getChar("operation");
            isNumclicked=savedInstanceState.getBoolean("isNumClicked");
            isOpClicked=savedInstanceState.getBoolean("isOpClicked");
            firstNumber=savedInstanceState.getDouble("firstnumber");
        }

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id=v.getId();
                switch(id) {
                    case R.id.zero:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        if(calcscreen.getText().toString().isEmpty()){
                            calcscreen.setText("0");
                        }
                        else{
                            char c= calcscreen.getText().toString().charAt(0);
                            if((calcscreen.getText().toString().contains(".") && c=='0') || c!='0'){
                                calcscreen.append("0");}}
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.one:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("1");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.two:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("2");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.three:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("3");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.four:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("4");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.five:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("5");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.six:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("6");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.seven:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("7");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.eight:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("8");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.nine:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        calcscreen.append("9");
                        isOpClicked=false;
                        isNumclicked=true;
                        break;
                    case R.id.buttonDot:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        String s=calcscreen.getText().toString();
                        if(s.isEmpty()){
                            calcscreen.append("0.");
                        }else
                        if(!s.contains(".")){
                            calcscreen.append(".");
                        }
                        break;
                    case R.id.plus:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                            return;
                        }
                        Operation='+';
                        screen.setText("+");
                        if(isNumclicked){
                            if(isOpClicked==false){
                                firstNumber=Double.parseDouble(calcscreen.getText().toString());
                                calcscreen.setText("");}
                            isOpClicked=true;
                            isNumclicked=false;}
                        break;
                    case R.id.minus:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                            return;
                        }
                        Operation='-';
                        screen.setText("-");
                        if(isNumclicked){
                            if(isOpClicked==false){
                                firstNumber=Double.parseDouble(calcscreen.getText().toString());
                                calcscreen.setText("");}
                            isOpClicked=true;
                            isNumclicked=false;}
                        break;
                    case R.id.multiply:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                            return;
                        }
                        Operation='*';
                        screen.setText("*");
                        if(isNumclicked){
                            if(isOpClicked==false){
                                firstNumber=Double.parseDouble(calcscreen.getText().toString());
                                calcscreen.setText("");}
                            isOpClicked=true;
                            isNumclicked=false;}
                        break;


                    case R.id.division:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        Operation='/';
                        screen.setText("/");
                        if(isNumclicked){
                            if(isOpClicked==false){

                                firstNumber=Double.parseDouble(calcscreen.getText().toString());
                                calcscreen.setText("");}
                            isOpClicked=true;
                            isNumclicked=false;
                        }
                        break;
                    case R.id.power:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        Operation='^';
                        screen.setText("^");
                        if(isNumclicked){
                            if(isOpClicked==false){

                                firstNumber=Double.parseDouble(calcscreen.getText().toString());
                                calcscreen.setText("");}
                            isOpClicked=true;
                            isNumclicked=false;
                        }
                        break;
                    case R.id.percent:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        if(isNumclicked){
                            firstNumber= Double.parseDouble(calcscreen.getText().toString());
                            res=firstNumber/100;
                            outp=String.valueOf(res);
                            calcscreen.setText(outp);}
                        break;
                    case R.id.Square:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                        }
                        if(isNumclicked){
                            firstNumber=Double.parseDouble(calcscreen.getText().toString());
                            res=firstNumber*firstNumber;
                            outp=String.valueOf(res);
                            calcscreen.setText(outp);
                        }
                        break;
                    case R.id.buttonEqual:
                        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                            calcscreen.setText("");
                            return;
                        }
                        if(!calcscreen.getText().toString().isEmpty()){
                            secondNumber=Double.parseDouble(calcscreen.getText().toString());
                            if(isNumclicked==true && isOpClicked==false){
                                if(Operation=='+'){
                                    res=firstNumber+secondNumber;
                                }
                                if(Operation=='-'){
                                    res=firstNumber-secondNumber;
                                }
                                if(Operation=='*'){
                                    res=firstNumber*secondNumber;
                                }
                                if(Operation=='/'){
                                    if(secondNumber!=0){
                                        res=firstNumber/secondNumber;}
                                    else{calcscreen.setText("Error");
                                        return;}
                                }
                                if(Operation=='^'){
                                    res=Math.pow(firstNumber, secondNumber);
                                }
                                if(Operation=='n'){
                                    res=Math.pow(firstNumber, 1/secondNumber);
                                }
                            }
                            outp=String.valueOf(res);
                            calcscreen.setText(outp);}
                        break;
                }
            }
        };
        zero.setOnClickListener(calculatorListener);
        one.setOnClickListener(calculatorListener);
        two.setOnClickListener(calculatorListener);
        three.setOnClickListener(calculatorListener);
        four.setOnClickListener(calculatorListener);
        five.setOnClickListener(calculatorListener);
        six.setOnClickListener(calculatorListener);
        seven.setOnClickListener(calculatorListener);
        eight.setOnClickListener(calculatorListener);
        nine.setOnClickListener(calculatorListener);
        buttonDot.setOnClickListener(calculatorListener);
        multiply.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        plus.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        power.setOnClickListener(calculatorListener);
        percent.setOnClickListener(calculatorListener);
        delete.setOnClickListener(calculatorListener);
        backspace.setOnClickListener(calculatorListener);
        Square.setOnClickListener(calculatorListener);
        buttonEqual.setOnClickListener(calculatorListener);


        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                    calcscreen.setText("");
                }
                String displayedElement = calcscreen.getText().toString();
                int length = displayedElement.length();
                if(length>0){
                    displayedElement=displayedElement.substring(0,length-1);
                    calcscreen.setText(displayedElement);
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
                    calcscreen.setText("");
                }
                calcscreen.setText("");
                isNumclicked=false;
                firstNumber=0;
                secondNumber=0;
                isOpClicked=false;
                screen.setText("");

            }
        });
    }
    public void sin(View view) {
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        if(isNumclicked){
            firstNumber=Double.parseDouble(calcscreen.getText().toString());
            res=Math.sin(Math.toRadians(firstNumber));
            outp=String.valueOf(res);
            calcscreen.setText(outp);
        }
    }
    public void cos(View view){
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        if(isNumclicked){
            firstNumber=Double.parseDouble(calcscreen.getText().toString());
            res=Math.cos(Math.toRadians(firstNumber));
            outp=String.valueOf(res);
            calcscreen.setText(outp);
        }
    }
    public void tan(View view){
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        if(isNumclicked){
            firstNumber=Double.parseDouble(calcscreen.getText().toString());
            if(firstNumber%90==0){
                calcscreen.setText("Infinity");
            }
            else{
                res=Math.tan(Math.toRadians(firstNumber));
                outp=String.valueOf(res);
                calcscreen.setText(outp);
            }
        }
    }
    public void ln(View view){
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        if(isNumclicked){
            firstNumber=Double.parseDouble(calcscreen.getText().toString());
            if(firstNumber>0){
                res=Math.log(firstNumber);
                outp=String.valueOf(res);
                calcscreen.setText(outp);
            }
            else{
                calcscreen.setText("Error");
            }
        }
    }
    public void fact(View view){
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        if (isNumclicked) {
            firstNumber=Double.parseDouble(calcscreen.getText().toString());
            if(firstNumber<0 || firstNumber>20){
                calcscreen.setText("Error");
            }
            else {
                long factt=1;
                for(int i=1;i<=firstNumber;i++){
                    factt=factt*i;
                }
                res=factt;
                outp=String.valueOf(res);
                calcscreen.setText(outp);
            }
        }
    }
    public void nthroot(View view){
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        Operation='n';
        screen.setText("NthRootOf");
        if(isNumclicked){
            if(isOpClicked==false){
                firstNumber=Double.parseDouble(calcscreen.getText().toString());
                calcscreen.setText("");}
            isOpClicked=true;
            isNumclicked=false;}
    }
    public void log10(View view){
        if(calcscreen.getText().toString().equals("Error") || calcscreen.getText().toString().equals("Infinity")){
            calcscreen.setText("");
        }
        if(isNumclicked && !calcscreen.getText().toString().isEmpty()){
            firstNumber=Double.parseDouble(calcscreen.getText().toString());
            if(firstNumber>0){
                res=Math.log10(firstNumber);
                outp=String.valueOf(res);
                calcscreen.setText(outp);
            }
            else{
                calcscreen.setText("Error");
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("first_val", calcscreen.getText().toString());
        outState.putString("operScreen", screen.getText().toString());
        outState.putBoolean("isOpClicked", isOpClicked);
        outState.putBoolean("isNumClicked", isNumclicked);
        outState.putChar("operation", Operation);
        outState.putDouble("firstnumber", firstNumber);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("first_val");
        savedInstanceState.getString("operScreen");
        savedInstanceState.getBoolean("isOpClicked");
        savedInstanceState.getBoolean("isNumClicked");
        savedInstanceState.getChar("operation");
        savedInstanceState.getDouble("firstnumber");
    }
}