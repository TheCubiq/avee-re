package com.daaw.avee;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.daaw.ActivityC2508p3;
import com.daaw.avee.SplashActivity;
import com.daaw.lz1;
/* loaded from: classes.dex */
public class SplashActivity extends ActivityC2508p3 {

    /* renamed from: M */
    public SurfaceView f3785M;

    /* renamed from: N */
    public SurfaceHolder f3786N;

    /* renamed from: O */
    public MediaPlayer f3787O;

    /* renamed from: com.daaw.avee.SplashActivity$a */
    /* loaded from: classes.dex */
    public class SurfaceHolder$CallbackC0701a implements SurfaceHolder.Callback {
        public SurfaceHolder$CallbackC0701a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SplashActivity.this.f3787O.setDisplay(surfaceHolder);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* renamed from: V */
    public final void m26876V() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, com.daaw.ActivityC3839zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        this.f3785M = (SurfaceView) findViewById(R.id.surface_view);
        this.f3787O = new MediaPlayer();
        try {
            SurfaceHolder holder = this.f3785M.getHolder();
            this.f3786N = holder;
            holder.setFormat(-3);
            this.f3786N.addCallback(new SurfaceHolder$CallbackC0701a());
            this.f3787O.setDataSource(this, new Uri.Builder().scheme("android.resource").authority(getPackageName()).appendPath("2131689510").build());
            this.f3787O.setLooping(true);
            this.f3787O.prepare();
            this.f3787O.start();
        } catch (Exception e) {
            lz1.m16364b(e, "splash webm fail");
            this.f3785M.setVisibility(8);
            findViewById(R.id.image_view).setVisibility(0);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.daaw.qe1
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity.this.m26876V();
            }
        }, 1333L);
    }

    @Override // com.daaw.ActivityC2508p3, com.daaw.p30, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f3787O;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f3787O.release();
            this.f3787O = null;
        }
        this.f3785M = null;
        this.f3786N = null;
    }
}
