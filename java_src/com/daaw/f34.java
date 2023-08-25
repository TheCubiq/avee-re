package com.daaw;

import android.content.Context;
import android.media.AudioManager;
/* loaded from: classes.dex */
public final class f34 implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager p;
    public final e34 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public float u = 1.0f;

    public f34(Context context, e34 e34Var) {
        this.p = (AudioManager) context.getSystemService("audio");
        this.q = e34Var;
    }

    public final float a() {
        float f = this.t ? 0.0f : this.u;
        if (this.r) {
            return f;
        }
        return 0.0f;
    }

    public final void b() {
        this.s = true;
        f();
    }

    public final void c() {
        this.s = false;
        f();
    }

    public final void d(boolean z) {
        this.t = z;
        f();
    }

    public final void e(float f) {
        this.u = f;
        f();
    }

    public final void f() {
        boolean z = false;
        if (!this.s || this.t || this.u <= 0.0f) {
            if (this.r) {
                AudioManager audioManager = this.p;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.r = z;
                }
                this.q.zzn();
            }
        } else if (this.r) {
        } else {
            AudioManager audioManager2 = this.p;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.r = z;
            }
            this.q.zzn();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.r = i > 0;
        this.q.zzn();
    }
}
