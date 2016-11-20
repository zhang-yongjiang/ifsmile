package app.ifsmile.com.ifsmile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SmileActivity extends AppCompatActivity {

    private Button start;
    private Button noChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);
        start=(Button)findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmileActivity.this,"欢迎来到IfSmile",Toast.LENGTH_SHORT).show();
            }
        });
        noChoice=(Button)findViewById(R.id.without_choice);
        noChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SmileActivity.this,"你没有做出任何选择",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
