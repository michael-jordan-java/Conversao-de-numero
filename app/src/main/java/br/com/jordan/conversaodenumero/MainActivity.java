package br.com.jordan.conversaodenumero;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtNum;
    private TextView txtSaida;
    private Button btConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum = (EditText) findViewById(R.id.txtNum);
        txtSaida = (TextView) findViewById(R.id.txtSaida);
        btConverter = (Button) findViewById(R.id.btConverter);
        btConverter.setOnClickListener(listenerConverter);
    }

    private View.OnClickListener listenerConverter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtSaida.setText(numero(Integer.parseInt(txtNum.getText().toString())));
        }
    };

    public static String numero(int num) {
        String resultado = "";

        switch (num) {
            case 1:
                resultado += "um";
                break;
            case 2:
                resultado += "dois";
                break;
            case 3:
                resultado += "três";
                break;
            case 4:
                resultado += "quatro";
                break;
            case 5:
                resultado += "cinco";
                break;
            case 6:
                resultado += "seis";
                break;
            case 7:
                resultado += "sete";
                break;
            case 8:
                resultado += "oito";
                break;
            case 9:
                resultado += "nove";
                break;
            case 10:
                resultado += "dez";
                break;
            case 11:
                resultado += "onze";
                break;
            case 12:
                resultado += "doze";
                break;
            case 13:
                resultado += "treze";
                break;
            case 14:
                resultado += "catorze";
                break;
            case 15:
                resultado += "quinze";
                break;
            case 16:
                resultado += "desesseis";
                break;
            case 17:
                resultado += "desessete";
                break;
            case 18:
                resultado += "dezoito";
                break;
            case 19:
                resultado += "dezenove";
                break;
            case 20:
                resultado += "vinte";
                break;
            case 30:
                resultado += "trinta";
                break;
            case 40:
                resultado += "quarenta";
                break;
            case 50:
                resultado += "cinquenta";
                break;
            case 60:
                resultado += "sessenta";
                break;
            case 70:
                resultado += "setenta";
                break;
            case 80:
                resultado += "oitenta";
                break;
            case 90:
                resultado += "noventa";
                break;
            case 100:
                resultado += "cem";
                break;
        }

        if(num > 20 && num < 30){
            resultado += "vinte e " + numero(retornaNumeros(num));
        }else if(num > 30 && num < 40){
            resultado += "trinta e " + numero(retornaNumeros(num));
        }else if(num > 40 && num < 50){
            resultado += "quarenta e " + numero(retornaNumeros(num));
        }else if(num > 50 && num < 60){
            resultado += "cinquenta e " + numero(retornaNumeros(num));
        }else if(num > 60 && num < 70){
            resultado += "sessenta e " + numero(retornaNumeros(num));
        }else if(num > 70 && num < 80){
            resultado += "setenta e " + numero(retornaNumeros(num));
        }else if(num > 80 && num < 90){
            resultado += "oitenta e " + numero(retornaNumeros(num));
        }else if(num > 90 && num < 100){
            resultado += "noventa e " + numero(retornaNumeros(num));
        }else if(num > 100 && num < 200){
            resultado += "cento e " + numero(retornaNumeros(num));
        }else if(num > 200 && num < 300){
            resultado += "duzentos e " + numero(retornaNumeros(num));
        }else if(num > 300 && num < 400){
            resultado += "trezentos e " + numero(retornaNumeros(num));
        }else if(num > 400 && num < 500){
            resultado += "quatrocentos e " + numero(retornaNumeros(num));
        }else if(num > 500 && num < 600){
            resultado += "quinhentos e " + numero(retornaNumeros(num));
        }else if(num > 600 && num < 700){
            resultado += "seiscentos e " + numero(retornaNumeros(num));
        }else if(num > 700 && num < 800){
            resultado += "setecentos e " + numero(retornaNumeros(num));
        }else if(num > 800 && num < 900){
            resultado += "oitocentos e " + numero(retornaNumeros(num));
        }else if(num > 900 && num < 1000){
            resultado += "novecentos e " + numero(retornaNumeros(num));
        }

        return resultado;
    }

    public static int retornaNumeros(int num){
        int digito = 0;

        if(num > 20 && num < 100) {
            digito = num % 10;
        }else if(num > 100 && num < 1000){
            digito = num % 100;
        }

        return digito;
    }



}
