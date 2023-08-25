package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
/* loaded from: classes.dex */
public final class gz3 implements Runnable {
    public final /* synthetic */ Context p;
    public final /* synthetic */ e14 q;

    public gz3(hz3 hz3Var, Context context, e14 e14Var) {
        this.p = context;
        this.q = e14Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.q.b(AdvertisingIdClient.getAdvertisingIdInfo(this.p));
        } catch (a80 | IOException | IllegalStateException e) {
            this.q.c(e);
            k04.zzh("Exception while getting advertising Id info", e);
        }
    }
}
