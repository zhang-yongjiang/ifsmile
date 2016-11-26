package app.ifsmile.com.ifsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zyj on 16-11-24.
 */

public class VideoListActivity extends AppCompatActivity {

    private Button videoPlayButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_video_list);

        videoPlayButton=(Button)findViewById(R.id.to_play_video);
        videoPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoListActivity.this,VideoPlayActivity.class);
                startActivity(intent);
            }
        });
    }
}
