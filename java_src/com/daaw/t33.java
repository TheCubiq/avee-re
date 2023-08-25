package com.daaw;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbei;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class t33 {
    @GuardedBy("lock")

    /* renamed from: a */
    public j33 f26956a;
    @GuardedBy("lock")

    /* renamed from: b */
    public boolean f26957b;

    /* renamed from: c */
    public final Context f26958c;

    /* renamed from: d */
    public final Object f26959d = new Object();

    public t33(Context context) {
        this.f26958c = context;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m9602e(t33 t33Var) {
        synchronized (t33Var.f26959d) {
            j33 j33Var = t33Var.f26956a;
            if (j33Var == null) {
                return;
            }
            j33Var.disconnect();
            t33Var.f26956a = null;
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: c */
    public final Future m9604c(zzbei zzbeiVar) {
        n33 n33Var = new n33(this);
        r33 r33Var = new r33(this, zzbeiVar, n33Var);
        s33 s33Var = new s33(this, n33Var);
        synchronized (this.f26959d) {
            j33 j33Var = new j33(this.f26958c, zzt.zzt().zzb(), r33Var, s33Var);
            this.f26956a = j33Var;
            j33Var.checkAvailabilityAndConnect();
        }
        return n33Var;
    }
}
