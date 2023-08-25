package com.daaw;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class p45 implements View.OnClickListener {

    /* renamed from: p */
    public final u85 f22605p;

    /* renamed from: q */
    public final InterfaceC0623ag f22606q;

    /* renamed from: r */
    public ve3 f22607r;

    /* renamed from: s */
    public zg3 f22608s;

    /* renamed from: t */
    public String f22609t;

    /* renamed from: u */
    public Long f22610u;

    /* renamed from: v */
    public WeakReference f22611v;

    public p45(u85 u85Var, InterfaceC0623ag interfaceC0623ag) {
        this.f22605p = u85Var;
        this.f22606q = interfaceC0623ag;
    }

    /* renamed from: a */
    public final ve3 m13637a() {
        return this.f22607r;
    }

    /* renamed from: b */
    public final void m13636b() {
        if (this.f22607r == null || this.f22610u == null) {
            return;
        }
        m13634d();
        try {
            this.f22607r.zze();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void m13635c(final ve3 ve3Var) {
        this.f22607r = ve3Var;
        zg3 zg3Var = this.f22608s;
        if (zg3Var != null) {
            this.f22605p.m8423k("/unconfirmedClick", zg3Var);
        }
        zg3 zg3Var2 = new zg3() { // from class: com.daaw.o45
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                p45 p45Var = p45.this;
                ve3 ve3Var2 = ve3Var;
                try {
                    p45Var.f22610u = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    k04.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                p45Var.f22609t = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (ve3Var2 == null) {
                    k04.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    ve3Var2.mo4816f(str);
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.f22608s = zg3Var2;
        this.f22605p.m8425i("/unconfirmedClick", zg3Var2);
    }

    /* renamed from: d */
    public final void m13634d() {
        View view;
        this.f22609t = null;
        this.f22610u = null;
        WeakReference weakReference = this.f22611v;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f22611v = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f22611v;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f22609t != null && this.f22610u != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f22609t);
            hashMap.put("time_interval", String.valueOf(this.f22606q.mo15860a() - this.f22610u.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f22605p.m8427g("sendMessageToNativeJs", hashMap);
        }
        m13634d();
    }
}
