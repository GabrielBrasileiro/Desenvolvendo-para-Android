package universodoandroid.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao01, botao02, botao03, botao04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao01 = (Button) findViewById(R.id.botao_01);
        botao02 = (Button) findViewById(R.id.botao_02);
        botao03 = (Button) findViewById(R.id.botao_03);
        botao04 = (Button) findViewById(R.id.botao_04);

        botao01.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botao01Activity();

            }

        });

        botao02.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botao02Activity();

            }

        });

        botao03.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                botao03Activity();

            }


        });

        botao04.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                botao04Activity();

            }

        });


    }

    private void botao01Activity() {

        startActivity(new Intent(MainActivity.this, tela01.class));

    }

    private void botao02Activity() {

        startActivity(new Intent(MainActivity.this, tela02.class));

    }

    private void botao03Activity() {

        startActivity(new Intent(MainActivity.this, tela03.class));

    }

    private void botao04Activity() {

        startActivity(new Intent(MainActivity.this, tela04.class));

    }
}
