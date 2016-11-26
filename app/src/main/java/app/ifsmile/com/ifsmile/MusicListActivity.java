package app.ifsmile.com.ifsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zyj on 16-11-24.
 */

public class MusicListActivity extends AppCompatActivity {

    private Button musicPlayButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_music_list);

        musicPlayButton=(Button)findViewById(R.id.to_play_music);
        musicPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMusicPlayIntent=new Intent(MusicListActivity.this,MusicPlayActivity.class);
                startActivity(toMusicPlayIntent);
            }
        });
    }
}
