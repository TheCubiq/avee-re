package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class c94 {
    public zzchu a;
    public Context b;
    public WeakReference c;

    public final c94 c(Context context) {
        this.c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.b = context;
        return this;
    }

    public final c94 d(zzchu zzchuVar) {
        this.a = zzchuVar;
        return this;
    }
}
