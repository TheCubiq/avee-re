package com.daaw;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class g22 {
    public final g6<o3<?>, ConnectionResult> a;
    public final g6<o3<?>, String> b;
    public final tj1<Map<o3<?>, String>> c;
    public int d;
    public boolean e;

    public final Set<o3<?>> a() {
        return this.a.keySet();
    }

    public final void b(o3<?> o3Var, ConnectionResult connectionResult, String str) {
        this.a.put(o3Var, connectionResult);
        this.b.put(o3Var, str);
        this.d--;
        if (!connectionResult.u()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (!this.e) {
                this.c.c(this.b);
                return;
            }
            this.c.b(new x9(this.a));
        }
    }
}
