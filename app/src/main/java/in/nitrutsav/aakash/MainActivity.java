package in.nitrutsav.aakash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.appwidget.*;
import android.text.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cal = (Button) findViewById(R.id.resbtn);
        TextView ash= (TextView) findViewById(R.id.textView2);
        final TextView res = (TextView) findViewById(R.id.resview);
        final EditText name = (EditText) findViewById(R.id.editText);
        final EditText cname = (EditText) findViewById(R.id.editTex2t);
        ash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CSE STUDENT AT NITR  ", Toast.LENGTH_LONG).show();
            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                Editable n = name.getText();
                Editable cn = cname.getText();
                String concat = String.valueOf(n).concat(String.valueOf(cn)).toUpperCase();
                if ((n.toString().trim().length() == 0) || (cn.toString().trim().length() == 0)) {
                    Toast.makeText(MainActivity.this, "Please fill both the fields ", Toast.LENGTH_LONG).show();
                } else {
                    int sum = 0;
                    for (int i = 0; i < concat.length(); i++) {
                        char character = concat.charAt(i);
                        int ascii = (int) character;
                        sum += ascii;
                    }
                    res.setText("The love between " + n + " and " + cn + " is " + sum % 100 + "%");
                }
            }
        });

    }


}
