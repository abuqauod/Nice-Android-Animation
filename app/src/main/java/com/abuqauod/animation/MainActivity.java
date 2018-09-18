package com.abuqauod.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.abuqauod.animation.animations.FlipAnimation;
import com.abuqauod.animation.animations.PulseAnimation;
import com.abuqauod.animation.animations.RotateAnimation;
import com.abuqauod.animation.animations.ShakeAnimation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView = findViewById(R.id.image_view);

        findViewById(R.id.shake_btn).setOnClickListener(this);
        findViewById(R.id.flip_btn).setOnClickListener(this);
        findViewById(R.id.rotate_btn).setOnClickListener(this);
        findViewById(R.id.pulse_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shake_btn:
                ShakeAnimation.create().with(mView).setDuration(2000).setRepeatMode(ShakeAnimation.RESTART).setRepeatCount(ShakeAnimation.INFINITE).start();
                break;
            case R.id.flip_btn:
                FlipAnimation.create().with(mView).setDuration(3600).setRepeatCount(FlipAnimation.INFINITE).start();
                break;
            case R.id.rotate_btn:
                RotateAnimation.create().with(mView).setRepeatCount(RotateAnimation.INFINITE).setRepeatMode(RotateAnimation.RESTART).setDuration(2000).start();
                break;
            case R.id.pulse_btn:
                PulseAnimation.create().with(mView).setDuration(310).setRepeatCount(PulseAnimation.INFINITE).setRepeatMode(PulseAnimation.REVERSE).start();
                break;
        }
    }
}
