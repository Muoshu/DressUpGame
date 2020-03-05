package browser.green.org.dressupgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cb_arms;
    private CheckBox cb_ears;
    private CheckBox cb_eyebrows;
    private CheckBox cb_eyes;
    private CheckBox cb_hat;
    private CheckBox cb_glasses;
    private CheckBox cb_mouth;
    private CheckBox cb_mustache;
    private CheckBox cb_nose;
    private CheckBox cb_shoes;

    private ImageView iv_arms;
    private ImageView iv_ears;
    private ImageView iv_eyebrows;
    private ImageView iv_eyes;
    private ImageView iv_glasses;
    private ImageView iv_hat;
    private ImageView iv_mouth;
    private ImageView iv_mustache;
    private ImageView iv_nose;
    private ImageView iv_shoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_arms=findViewById(R.id.cb_arms);
        cb_ears=findViewById(R.id.cb_ears);
        cb_eyebrows=findViewById(R.id.cb_eyebrows);
        cb_eyes=findViewById(R.id.cb_eyes);
        cb_glasses=findViewById(R.id.cb_glasses);
        cb_hat=findViewById(R.id.cb_hat);
        cb_mouth=findViewById(R.id.cb_mouth);
        cb_mustache=findViewById(R.id.cb_mustache);
        cb_nose=findViewById(R.id.cb_nose);
        cb_shoes=findViewById(R.id.cb_shoes);

        iv_arms=findViewById(R.id.iv_arms);
        iv_ears=findViewById(R.id.iv_ears);
        iv_eyebrows=findViewById(R.id.iv_eyebrows);
        iv_eyes=findViewById(R.id.iv_eyes);
        iv_glasses=findViewById(R.id.iv_glasses);
        iv_hat=findViewById(R.id.iv_hat);
        iv_mouth=findViewById(R.id.iv_mouth);
        iv_mustache=findViewById(R.id.iv_mustache);
        iv_nose=findViewById(R.id.iv_nose);
        iv_shoes=findViewById(R.id.iv_shoes);

        iv_arms.setVisibility(View.GONE);
        iv_eyebrows.setVisibility(View.GONE);
        iv_mouth.setVisibility(View.GONE);
        iv_eyes.setVisibility(View.GONE);
        iv_ears.setVisibility(View.GONE);
        iv_nose.setVisibility(View.GONE);
        iv_hat.setVisibility(View.GONE);
        iv_glasses.setVisibility(View.GONE);
        iv_shoes.setVisibility(View.GONE);
        iv_mustache.setVisibility(View.GONE);

    }

    public void cd_armsChecked(View view){
        if(cb_arms.isChecked())
            iv_arms.setVisibility(View.VISIBLE);
        else
            iv_arms.setVisibility(View.GONE);
    }

    public void cd_shoesChecked(View view) {
        if(cb_shoes.isChecked())
            iv_shoes.setVisibility(View.VISIBLE);
        else
            iv_shoes.setVisibility(View.GONE);
    }

    public void cd_earsChecked(View view) {
        if(cb_ears.isChecked())
            iv_ears.setVisibility(View.VISIBLE);
        else
            iv_ears.setVisibility(View.GONE);
    }

    public void cd_eyesChecked(View view) {
        if(cb_eyes.isChecked())
            iv_eyes.setVisibility(View.VISIBLE);
        else
            iv_eyes.setVisibility(View.GONE);
    }

    public void cd_hatChecked(View view) {
        if(cb_hat.isChecked())
            iv_hat.setVisibility(View.VISIBLE);
        else
            iv_hat.setVisibility(View.GONE);
    }

    public void cd_galssesChecked(View view) {
        if(cb_glasses.isChecked())
            iv_glasses.setVisibility(View.VISIBLE);
        else
            iv_glasses.setVisibility(View.GONE);
    }

    public void cd_mouthChecked(View view) {
        if(cb_mouth.isChecked())
            iv_mouth.setVisibility(View.VISIBLE);
        else
            iv_mouth.setVisibility(View.GONE);
    }

    public void cd_mustacheChecked(View view) {
        if(cb_mustache.isChecked())
            iv_mustache.setVisibility(View.VISIBLE);
        else
            iv_mustache.setVisibility(View.GONE);
    }

    public void cd_noseChecked(View view) {
        if(cb_nose.isChecked())
            iv_nose.setVisibility(View.VISIBLE);
        else
            iv_nose.setVisibility(View.GONE);
    }

    public void cd_eyebrowsChecked(View view) {
        if(cb_eyebrows.isChecked())
            iv_eyebrows.setVisibility(View.VISIBLE);
        else
            iv_eyebrows.setVisibility(View.GONE);
    }
}
