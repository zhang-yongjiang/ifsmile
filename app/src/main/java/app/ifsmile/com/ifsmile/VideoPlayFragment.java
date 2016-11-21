package app.ifsmile.com.ifsmile;

import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;

/**
 * Created by zyj on 16-11-21.
 */

public class VideoPlayFragment extends Fragment {


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_add, menu);
    }
}
