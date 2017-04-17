package cz.cvut.fit.kosapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_layout);
        ImageView image = (ImageView) findViewById(R.id.imageView4);
        image.setImageDrawable(getResources().getDrawable(R.drawable.cvut_logo));
    }
}
