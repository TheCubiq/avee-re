package com.daaw;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
/* loaded from: classes.dex */
public final class kj7 {

    /* renamed from: a */
    public final AudioManager f16420a;

    /* renamed from: b */
    public final eh7 f16421b;

    /* renamed from: c */
    public hi7 f16422c;

    /* renamed from: d */
    public int f16423d;

    /* renamed from: e */
    public float f16424e = 1.0f;

    public kj7(Context context, Handler handler, hi7 hi7Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f16420a = audioManager;
        this.f16422c = hi7Var;
        this.f16421b = new eh7(this, handler);
        this.f16423d = 0;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m17692c(kj7 kj7Var, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                kj7Var.m17688g(3);
                return;
            }
            kj7Var.m17689f(0);
            kj7Var.m17688g(2);
        } else if (i == -1) {
            kj7Var.m17689f(-1);
            kj7Var.m17690e();
        } else if (i == 1) {
            kj7Var.m17688g(1);
            kj7Var.m17689f(1);
        } else {
            s95.m10493e("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    /* renamed from: a */
    public final float m17694a() {
        return this.f16424e;
    }

    /* renamed from: b */
    public final int m17693b(boolean z, int i) {
        m17690e();
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public final void m17691d() {
        this.f16422c = null;
        m17690e();
    }

    /* renamed from: e */
    public final void m17690e() {
        if (this.f16423d == 0) {
            return;
        }
        if (it5.f13991a < 26) {
            this.f16420a.abandonAudioFocus(this.f16421b);
        }
        m17688g(0);
    }

    /* renamed from: f */
    public final void m17689f(int i) {
        int m18844H;
        hi7 hi7Var = this.f16422c;
        if (hi7Var != null) {
            y48 y48Var = (y48) hi7Var;
            boolean zzq = y48Var.f33362p.zzq();
            j58 j58Var = y48Var.f33362p;
            m18844H = j58.m18844H(zzq, i);
            j58Var.m18831U(zzq, i, m18844H);
        }
    }

    /* renamed from: g */
    public final void m17688g(int i) {
        if (this.f16423d == i) {
            return;
        }
        this.f16423d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f16424e == f) {
            return;
        }
        this.f16424e = f;
        hi7 hi7Var = this.f16422c;
        if (hi7Var != null) {
            ((y48) hi7Var).f33362p.m18834R();
        }
    }
}
