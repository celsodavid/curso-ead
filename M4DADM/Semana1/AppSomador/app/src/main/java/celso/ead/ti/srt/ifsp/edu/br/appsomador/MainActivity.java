package celso.ead.ti.srt.ifsp.edu.br.appsomador;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNumero1, etNumero2, etResultado;
    Button btSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero1 = (EditText) findViewById(R.id.etnumero1);
        etNumero2 = (EditText) findViewById(R.id.etnumero2);
        etResultado = (EditText) findViewById(R.id.etresultado);

        btSomar = (Button) findViewById(R.id.btsomar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1, n2, res;

                n1 = Float.parseFloat(etNumero1.getText().toString());
                n2 = Float.parseFloat(etNumero2.getText().toString());
                res = n1 + n2;

                String strResultado = String.valueOf(res);
                etResultado.setText(strResultado);

                AlertDialog.Builder caixaDeAlerta = new AlertDialog.Builder(MainActivity.this);
                caixaDeAlerta.setMessage("Pronto!");
                caixaDeAlerta.show();
            }
        });
    }
}
