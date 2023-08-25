package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ol3 {

    /* renamed from: a */
    public final Object f21635a = new Object();

    /* renamed from: b */
    public final Object f21636b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c */
    public xl3 f21637c;
    @GuardedBy("lockService")

    /* renamed from: d */
    public xl3 f21638d;

    /* renamed from: c */
    public static final Context m14176c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final xl3 m14178a(Context context, zzchu zzchuVar, vo6 vo6Var) {
        xl3 xl3Var;
        synchronized (this.f21635a) {
            if (this.f21637c == null) {
                this.f21637c = new xl3(m14176c(context), zzchuVar, (String) zzba.zzc().m23658b(g93.f10621a), vo6Var);
            }
            xl3Var = this.f21637c;
        }
        return xl3Var;
    }

    /* renamed from: b */
    public final xl3 m14177b(Context context, zzchu zzchuVar, vo6 vo6Var) {
        xl3 xl3Var;
        synchronized (this.f21636b) {
            if (this.f21638d == null) {
                this.f21638d = new xl3(m14176c(context), zzchuVar, (String) ob3.f21247b.m16137e(), vo6Var);
            }
            xl3Var = this.f21638d;
        }
        return xl3Var;
    }
}
