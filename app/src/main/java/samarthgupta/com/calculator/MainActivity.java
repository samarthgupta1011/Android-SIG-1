package samarthgupta.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btAdd, btSubs, btMult, btDiv;
    TextView tvResult;
    EditText et1, et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show();

        btAdd = (Button) findViewById(R.id.bt_add);
        btSubs = (Button) findViewById(R.id.bt_subs);
        btMult = (Button) findViewById(R.id.bt_mult);
        btDiv = (Button) findViewById(R.id.bt_div);
        tvResult = (TextView) findViewById(R.id.tv_result);
        et1 = (EditText) findViewById(R.id.et_num1);
        et2 = (EditText) findViewById(R.id.et_num2);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                int res = a+b;
                tvResult.setText("Result = "+res);

            }
        });

        btSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(et1.getText().toString())-Integer.parseInt(et2.getText().toString());
                tvResult.setText("Result = "+res);
            }
        });

        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(et1.getText().toString())*Integer.parseInt(et2.getText().toString());
                tvResult.setText("Result = "+res);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                float res = Float.parseFloat(et1.getText().toString())/Integer.parseInt(et2.getText().toString());
//                tvResult.setText("Result = "+res);

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
