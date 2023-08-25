package com.daaw;

import android.content.Context;
import android.media.AudioManager;
/* loaded from: classes.dex */
public final class f34 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: p */
    public final AudioManager f9058p;

    /* renamed from: q */
    public final e34 f9059q;

    /* renamed from: r */
    public boolean f9060r;

    /* renamed from: s */
    public boolean f9061s;

    /* renamed from: t */
    public boolean f9062t;

    /* renamed from: u */
    public float f9063u = 1.0f;

    public f34(Context context, e34 e34Var) {
        this.f9058p = (AudioManager) context.getSystemService("audio");
        this.f9059q = e34Var;
    }

    /* renamed from: a */
    public final float m22942a() {
        float f = this.f9062t ? 0.0f : this.f9063u;
        if (this.f9060r) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void m22941b() {
        this.f9061s = true;
        m22937f();
    }

    /* renamed from: c */
    public final void m22940c() {
        this.f9061s = false;
        m22937f();
    }

    /* renamed from: d */
    public final void m22939d(boolean z) {
        this.f9062t = z;
        m22937f();
    }

    /* renamed from: e */
    public final void m22938e(float f) {
        this.f9063u = f;
        m22937f();
    }

    /* renamed from: f */
    public final void m22937f() {
        boolean z = false;
        if (!this.f9061s || this.f9062t || this.f9063u <= 0.0f) {
            if (this.f9060r) {
                AudioManager audioManager = this.f9058p;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f9060r = z;
                }
                this.f9059q.zzn();
            }
        } else if (this.f9060r) {
        } else {
            AudioManager audioManager2 = this.f9058p;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f9060r = z;
            }
            this.f9059q.zzn();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f9060r = i > 0;
        this.f9059q.zzn();
    }
}
