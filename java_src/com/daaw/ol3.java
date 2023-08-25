package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ol3 {
    public final Object a = new Object();
    public final Object b = new Object();
    @GuardedBy("lockClient")
    public xl3 c;
    @GuardedBy("lockService")
    public xl3 d;

    public static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final xl3 a(Context context, zzchu zzchuVar, vo6 vo6Var) {
        xl3 xl3Var;
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new xl3(c(context), zzchuVar, (String) zzba.zzc().b(g93.a), vo6Var);
            }
            xl3Var = this.c;
        }
        return xl3Var;
    }

    public final xl3 b(Context context, zzchu zzchuVar, vo6 vo6Var) {
        xl3 xl3Var;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = new xl3(c(context), zzchuVar, (String) ob3.b.e(), vo6Var);
            }
            xl3Var = this.d;
        }
        return xl3Var;
    }
}
