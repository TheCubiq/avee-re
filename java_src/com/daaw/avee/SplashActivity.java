package com.daaw.avee;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.daaw.avee.SplashActivity;
import com.daaw.lz1;
import com.daaw.p3;
/* loaded from: classes.dex */
public class SplashActivity extends p3 {
    public SurfaceView M;
    public SurfaceHolder N;
    public MediaPlayer O;

    /* loaded from: classes.dex */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SplashActivity.this.O.setDisplay(surfaceHolder);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    public final void V() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, com.daaw.zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        this.M = (SurfaceView) findViewById(R.id.surface_view);
        this.O = new MediaPlayer();
        try {
            SurfaceHolder holder = this.M.getHolder();
            this.N = holder;
            holder.setFormat(-3);
            this.N.addCallback(new a());
            this.O.setDataSource(this, new Uri.Builder().scheme("android.resource").authority(getPackageName()).appendPath("2131689510").build());
            this.O.setLooping(true);
            this.O.prepare();
            this.O.start();
        } catch (Exception e) {
            lz1.b(e, "splash webm fail");
            this.M.setVisibility(8);
            findViewById(R.id.image_view).setVisibility(0);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.daaw.qe1
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity.this.V();
            }
        }, 1333L);
    }

    @Override // com.daaw.p3, com.daaw.p30, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.O;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.O.release();
            this.O = null;
        }
        this.M = null;
        this.N = null;
    }
}
