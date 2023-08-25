package com.daaw;

import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes.dex */
public final class d85 implements zg3 {
    public final ce3 a;
    public final u85 b;
    public final qz7 c;

    public d85(u35 u35Var, j35 j35Var, u85 u85Var, qz7 qz7Var) {
        this.a = u35Var.c(j35Var.g0());
        this.b = u85Var;
        this.c = qz7Var;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.a.u0((sd3) this.c.zzb(), str);
        } catch (RemoteException e) {
            k04.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.b.i("/nativeAdCustomClick", this);
    }
}
