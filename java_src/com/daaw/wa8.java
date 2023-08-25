package com.daaw;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
/* loaded from: classes.dex */
public final class wa8 {

    /* renamed from: a */
    public final Context f31107a;

    /* renamed from: b */
    public final Handler f31108b;

    /* renamed from: c */
    public final la8 f31109c;

    /* renamed from: d */
    public final AudioManager f31110d;

    /* renamed from: e */
    public ta8 f31111e;

    /* renamed from: f */
    public int f31112f;

    /* renamed from: g */
    public int f31113g;

    /* renamed from: h */
    public boolean f31114h;

    public wa8(Context context, Handler handler, la8 la8Var) {
        Context applicationContext = context.getApplicationContext();
        this.f31107a = applicationContext;
        this.f31108b = handler;
        this.f31109c = la8Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        uo4.m7876b(audioManager);
        this.f31110d = audioManager;
        this.f31112f = 3;
        this.f31113g = m6256g(audioManager, 3);
        this.f31114h = m6254i(audioManager, this.f31112f);
        ta8 ta8Var = new ta8(this, null);
        try {
            it5.m19405a(applicationContext, ta8Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f31111e = ta8Var;
        } catch (RuntimeException e) {
            s95.m10492f("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m6259d(wa8 wa8Var) {
        wa8Var.m6255h();
    }

    /* renamed from: g */
    public static int m6256g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            s95.m10492f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: i */
    public static boolean m6254i(AudioManager audioManager, int i) {
        return it5.f13991a >= 23 ? audioManager.isStreamMute(i) : m6256g(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final int m6262a() {
        return this.f31110d.getStreamMaxVolume(this.f31112f);
    }

    /* renamed from: b */
    public final int m6261b() {
        if (it5.f13991a >= 28) {
            return this.f31110d.getStreamMinVolume(this.f31112f);
        }
        return 0;
    }

    /* renamed from: e */
    public final void m6258e() {
        ta8 ta8Var = this.f31111e;
        if (ta8Var != null) {
            try {
                this.f31107a.unregisterReceiver(ta8Var);
            } catch (RuntimeException e) {
                s95.m10492f("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f31111e = null;
        }
    }

    /* renamed from: f */
    public final void m6257f(int i) {
        wa8 wa8Var;
        final is8 m18839M;
        is8 is8Var;
        k65 k65Var;
        if (this.f31112f == 3) {
            return;
        }
        this.f31112f = 3;
        m6255h();
        y48 y48Var = (y48) this.f31109c;
        wa8Var = y48Var.f33362p.f14432y;
        m18839M = j58.m18839M(wa8Var);
        is8Var = y48Var.f33362p.f14402b0;
        if (m18839M.equals(is8Var)) {
            return;
        }
        y48Var.f33362p.f14402b0 = m18839M;
        k65Var = y48Var.f33362p.f14418k;
        k65Var.m18020d(29, new c35() { // from class: com.daaw.m48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).mo9159L(is8.this);
            }
        });
        k65Var.m18021c();
    }

    /* renamed from: h */
    public final void m6255h() {
        k65 k65Var;
        final int m6256g = m6256g(this.f31110d, this.f31112f);
        final boolean m6254i = m6254i(this.f31110d, this.f31112f);
        if (this.f31113g == m6256g && this.f31114h == m6254i) {
            return;
        }
        this.f31113g = m6256g;
        this.f31114h = m6254i;
        k65Var = ((y48) this.f31109c).f33362p.f14418k;
        k65Var.m18020d(30, new c35() { // from class: com.daaw.j48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).mo9155Q(m6256g, m6254i);
            }
        });
        k65Var.m18021c();
    }
}
