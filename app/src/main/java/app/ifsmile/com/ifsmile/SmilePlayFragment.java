package app.ifsmile.com.ifsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by zyj on 16-11-21.
 */

public class SmilePlayFragment extends Fragment {


    private Button mButtonVideo;
    private Button mButtonMusic;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_main_list,group);


        mButtonVideo=(Button)view.findViewById(R.id.my_video_button);
        mButtonMusic=(Button)view.findViewById(R.id.my_music_button);


        mButtonVideo.setOnClickListener(new View.OnClickListener() {        //本地视频
            @Override
            public void onClick(View v) {
                Intent toVideo=new Intent(getActivity(),VideoListActivity.class);
                startActivity(toVideo);
                //选择本地视频
            }
        });
        mButtonMusic.setOnClickListener(new View.OnClickListener() {        //本地音乐
            @Override
            public void onClick(View v) {
                Intent toMusic=new Intent(getActivity(),MusicListActivity.class);
                startActivity(toMusic);

                //选择本地音乐
            }
        });

        return view;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_add, menu);
    }
}
