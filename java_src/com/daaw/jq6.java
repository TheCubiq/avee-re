package com.daaw;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
/* loaded from: classes.dex */
public final class jq6 extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public final hq6 c;
    public float d;
    public final rq6 e;

    public jq6(Handler handler, Context context, hq6 hq6Var, rq6 rq6Var, byte[] bArr) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = hq6Var;
        this.e = rq6Var;
    }

    public final void a() {
        this.d = c();
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    public final float c() {
        int streamVolume = this.b.getStreamVolume(3);
        int streamMaxVolume = this.b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void d() {
        this.e.d(this.d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float c = c();
        if (c != this.d) {
            this.d = c;
            d();
        }
    }
}
