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
    public j33 a;
    @GuardedBy("lock")
    public boolean b;
    public final Context c;
    public final Object d = new Object();

    public t33(Context context) {
        this.c = context;
    }

    public static /* bridge */ /* synthetic */ void e(t33 t33Var) {
        synchronized (t33Var.d) {
            j33 j33Var = t33Var.a;
            if (j33Var == null) {
                return;
            }
            j33Var.disconnect();
            t33Var.a = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future c(zzbei zzbeiVar) {
        n33 n33Var = new n33(this);
        r33 r33Var = new r33(this, zzbeiVar, n33Var);
        s33 s33Var = new s33(this, n33Var);
        synchronized (this.d) {
            j33 j33Var = new j33(this.c, zzt.zzt().zzb(), r33Var, s33Var);
            this.a = j33Var;
            j33Var.checkAvailabilityAndConnect();
        }
        return n33Var;
    }
}
