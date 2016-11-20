package app.ifsmile.com.ifsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class SmileActivity extends AppCompatActivity {

    private Button start;
    private Button noChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_smile);


        start=(Button)findViewById(R.id.start_button);
        noChoice=(Button)findViewById(R.id.without_choice);

        //设置开始按钮事件
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toStartActivity=new Intent(SmileActivity.this,StartSmileActivity.class);
                startActivity(toStartActivity);
                Toast.makeText(SmileActivity.this,"欢迎来到IfSmile",Toast.LENGTH_SHORT).show();
            }
        });

        //设置下一步按钮事件
        noChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toStartActivity=new Intent(SmileActivity.this,StartSmileActivity.class);
                startActivity(toStartActivity);
                Toast.makeText(SmileActivity.this,"你没有做出任何选择",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
