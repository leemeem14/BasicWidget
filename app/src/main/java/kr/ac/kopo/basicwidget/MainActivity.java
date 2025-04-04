package kr.ac.kopo.basicwidget;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        edit1 = findViewById(R.id.edit1);
        textResult = findViewById(R.id.textresult);
        Button btnResult = findViewById(R.id.btnResult);

        text1.setTextSize(20);
        text1.setTextColor(Color.MAGENTA);
        text1.setText("한국폴리텍대학");

        text2.setTextSize(30);
        text2.setTextColor(Color.RED);
        text2.setText("AISW과");

        text3.setTextSize(30);
        text3.setTextColor(Color.BLUE);
        text3.setText("SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성SingleLine속성");
        text3.setSingleLine(true);



        btnResult.setOnClickListener(btnResultListener);
        };
    View.OnClickListener btnResultListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String univName = edit1.getText().toString();
            String result = univName+"에 합격을 하다. 축하하는!";
            textResult.setText(result);
            textResult.setTextColor(Color.rgb(28,71,226));
        }
    };
    }

