package com.daaw;

import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes.dex */
public final class d85 implements zg3 {

    /* renamed from: a */
    public final ce3 f6608a;

    /* renamed from: b */
    public final u85 f6609b;

    /* renamed from: c */
    public final qz7 f6610c;

    public d85(u35 u35Var, j35 j35Var, u85 u85Var, qz7 qz7Var) {
        this.f6608a = u35Var.m8600c(j35Var.m19116g0());
        this.f6609b = u85Var;
        this.f6610c = qz7Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f6608a.mo11062u0((sd3) this.f6610c.zzb(), str);
        } catch (RemoteException e) {
            k04.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    /* renamed from: b */
    public final void m24600b() {
        if (this.f6608a == null) {
            return;
        }
        this.f6609b.m8425i("/nativeAdCustomClick", this);
    }
}
