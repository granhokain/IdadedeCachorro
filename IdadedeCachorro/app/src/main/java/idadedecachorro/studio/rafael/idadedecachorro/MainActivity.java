package idadedecachorro.studio.rafael.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que foi digitado
                String textoDigitado = caixaTexto.getText().toString();
                if (textoDigitado.isEmpty()){
                //Exibe mensagem de erro se estiver vazia !
                    resultadoIdade.setText("Nenhum número digitado !");
                }else{
                    //Faz o cálculo !
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int ResultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro é: " + ResultadoFinal + " anos.");
                }
            }
        });

    }
}
