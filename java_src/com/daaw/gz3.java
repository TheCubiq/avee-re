package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
/* loaded from: classes.dex */
public final class gz3 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ Context f11866p;

    /* renamed from: q */
    public final /* synthetic */ e14 f11867q;

    public gz3(hz3 hz3Var, Context context, e14 e14Var) {
        this.f11866p = context;
        this.f11867q = e14Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f11867q.m23797b(AdvertisingIdClient.getAdvertisingIdInfo(this.f11866p));
        } catch (a80 | IOException | IllegalStateException e) {
            this.f11867q.m23796c(e);
            k04.zzh("Exception while getting advertising Id info", e);
        }
    }
}
