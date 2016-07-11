package edu.dsu_academy_desu.cookie;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is executed whrn the user clicks eat cookie
     * first we change the default image into the after cookie image
     * then we change the text to I am not feeling good.
     * @param view what the aps displays in the app
     */

    public void eatCookie(View view)
    {
        // image
        ImageView image = (ImageView)findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.after_cookie);
        // text
        TextView status = (TextView)findViewById(R.id.status_text_view);
        status.setText("I am not feeling good");
    }

    /**
     * This is executed when we need to purge the cookie
     * First we change the image to the before cookie image
     * Then we change the text to Feed me!!!
     * @param view
     */

    public void purgeCookie(View view)
    {
        // image
        ImageView image2 = (ImageView)findViewById(R.id.android_cookie_image_view);
        image2.setImageResource(R.drawable.before_cookie);
        // text
        TextView status2 = (TextView)findViewById(R.id.status_text_view);
        status2.setText("feed me!!!");
    }
}