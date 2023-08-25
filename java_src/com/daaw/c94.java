package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class c94 {

    /* renamed from: a */
    public zzchu f5643a;

    /* renamed from: b */
    public Context f5644b;

    /* renamed from: c */
    public WeakReference f5645c;

    /* renamed from: c */
    public final c94 m25484c(Context context) {
        this.f5645c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f5644b = context;
        return this;
    }

    /* renamed from: d */
    public final c94 m25483d(zzchu zzchuVar) {
        this.f5643a = zzchuVar;
        return this;
    }
}
