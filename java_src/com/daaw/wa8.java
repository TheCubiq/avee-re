package com.daaw;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
/* loaded from: classes.dex */
public final class wa8 {
    public final Context a;
    public final Handler b;
    public final la8 c;
    public final AudioManager d;
    public ta8 e;
    public int f;
    public int g;
    public boolean h;

    public wa8(Context context, Handler handler, la8 la8Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = la8Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        uo4.b(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = g(audioManager, 3);
        this.h = i(audioManager, this.f);
        ta8 ta8Var = new ta8(this, null);
        try {
            it5.a(applicationContext, ta8Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = ta8Var;
        } catch (RuntimeException e) {
            s95.f("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static /* bridge */ /* synthetic */ void d(wa8 wa8Var) {
        wa8Var.h();
    }

    public static int g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            s95.f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public static boolean i(AudioManager audioManager, int i) {
        return it5.a >= 23 ? audioManager.isStreamMute(i) : g(audioManager, i) == 0;
    }

    public final int a() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public final int b() {
        if (it5.a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public final void e() {
        ta8 ta8Var = this.e;
        if (ta8Var != null) {
            try {
                this.a.unregisterReceiver(ta8Var);
            } catch (RuntimeException e) {
                s95.f("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    public final void f(int i) {
        wa8 wa8Var;
        final is8 M;
        is8 is8Var;
        k65 k65Var;
        if (this.f == 3) {
            return;
        }
        this.f = 3;
        h();
        y48 y48Var = (y48) this.c;
        wa8Var = y48Var.p.y;
        M = j58.M(wa8Var);
        is8Var = y48Var.p.b0;
        if (M.equals(is8Var)) {
            return;
        }
        y48Var.p.b0 = M;
        k65Var = y48Var.p.k;
        k65Var.d(29, new c35() { // from class: com.daaw.m48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).L(is8.this);
            }
        });
        k65Var.c();
    }

    public final void h() {
        k65 k65Var;
        final int g = g(this.d, this.f);
        final boolean i = i(this.d, this.f);
        if (this.g == g && this.h == i) {
            return;
        }
        this.g = g;
        this.h = i;
        k65Var = ((y48) this.c).p.k;
        k65Var.d(30, new c35() { // from class: com.daaw.j48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).Q(g, i);
            }
        });
        k65Var.c();
    }
}
