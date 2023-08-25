package com.daaw;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
/* loaded from: classes.dex */
public final class jq6 extends ContentObserver {

    /* renamed from: a */
    public final Context f15337a;

    /* renamed from: b */
    public final AudioManager f15338b;

    /* renamed from: c */
    public final hq6 f15339c;

    /* renamed from: d */
    public float f15340d;

    /* renamed from: e */
    public final rq6 f15341e;

    public jq6(Handler handler, Context context, hq6 hq6Var, rq6 rq6Var, byte[] bArr) {
        super(handler);
        this.f15337a = context;
        this.f15338b = (AudioManager) context.getSystemService("audio");
        this.f15339c = hq6Var;
        this.f15341e = rq6Var;
    }

    /* renamed from: a */
    public final void m18338a() {
        this.f15340d = m18336c();
        m18335d();
        this.f15337a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void m18337b() {
        this.f15337a.getContentResolver().unregisterContentObserver(this);
    }

    /* renamed from: c */
    public final float m18336c() {
        int streamVolume = this.f15338b.getStreamVolume(3);
        int streamMaxVolume = this.f15338b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: d */
    public final void m18335d() {
        this.f15341e.m11058d(this.f15340d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float m18336c = m18336c();
        if (m18336c != this.f15340d) {
            this.f15340d = m18336c;
            m18335d();
        }
    }
}
