package andriod.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(4000)
                .withBackgroundColor(Color.WHITE)
                .withBeforeLogoText("Welcome To")
                .withAfterLogoText("SHOPPING !")
                .withLogo(R.drawable.shopping_online);

        config.getBeforeLogoTextView().setTextColor(Color.BLUE);
        config.getAfterLogoTextView().setTextColor(Color.BLUE);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}