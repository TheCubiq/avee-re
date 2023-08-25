package com.daaw;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class p45 implements View.OnClickListener {
    public final u85 p;
    public final ag q;
    public ve3 r;
    public zg3 s;
    public String t;
    public Long u;
    public WeakReference v;

    public p45(u85 u85Var, ag agVar) {
        this.p = u85Var;
        this.q = agVar;
    }

    public final ve3 a() {
        return this.r;
    }

    public final void b() {
        if (this.r == null || this.u == null) {
            return;
        }
        d();
        try {
            this.r.zze();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void c(final ve3 ve3Var) {
        this.r = ve3Var;
        zg3 zg3Var = this.s;
        if (zg3Var != null) {
            this.p.k("/unconfirmedClick", zg3Var);
        }
        zg3 zg3Var2 = new zg3() { // from class: com.daaw.o45
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                p45 p45Var = p45.this;
                ve3 ve3Var2 = ve3Var;
                try {
                    p45Var.u = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    k04.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                p45Var.t = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (ve3Var2 == null) {
                    k04.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    ve3Var2.f(str);
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.s = zg3Var2;
        this.p.i("/unconfirmedClick", zg3Var2);
    }

    public final void d() {
        View view;
        this.t = null;
        this.u = null;
        WeakReference weakReference = this.v;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.v = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.v;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.t != null && this.u != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.t);
            hashMap.put("time_interval", String.valueOf(this.q.a() - this.u.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.p.g("sendMessageToNativeJs", hashMap);
        }
        d();
    }
}
