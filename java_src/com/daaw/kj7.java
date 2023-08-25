package com.daaw;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
/* loaded from: classes.dex */
public final class kj7 {
    public final AudioManager a;
    public final eh7 b;
    public hi7 c;
    public int d;
    public float e = 1.0f;

    public kj7(Context context, Handler handler, hi7 hi7Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.a = audioManager;
        this.c = hi7Var;
        this.b = new eh7(this, handler);
        this.d = 0;
    }

    public static /* bridge */ /* synthetic */ void c(kj7 kj7Var, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                kj7Var.g(3);
                return;
            }
            kj7Var.f(0);
            kj7Var.g(2);
        } else if (i == -1) {
            kj7Var.f(-1);
            kj7Var.e();
        } else if (i == 1) {
            kj7Var.g(1);
            kj7Var.f(1);
        } else {
            s95.e("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    public final float a() {
        return this.e;
    }

    public final int b(boolean z, int i) {
        e();
        return z ? 1 : -1;
    }

    public final void d() {
        this.c = null;
        e();
    }

    public final void e() {
        if (this.d == 0) {
            return;
        }
        if (it5.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        g(0);
    }

    public final void f(int i) {
        int H;
        hi7 hi7Var = this.c;
        if (hi7Var != null) {
            y48 y48Var = (y48) hi7Var;
            boolean zzq = y48Var.p.zzq();
            j58 j58Var = y48Var.p;
            H = j58.H(zzq, i);
            j58Var.U(zzq, i, H);
        }
    }

    public final void g(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e == f) {
            return;
        }
        this.e = f;
        hi7 hi7Var = this.c;
        if (hi7Var != null) {
            ((y48) hi7Var).p.R();
        }
    }
}
