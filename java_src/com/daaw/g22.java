package com.daaw;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class g22 {

    /* renamed from: a */
    public final C1370g6<C2396o3<?>, ConnectionResult> f10179a;

    /* renamed from: b */
    public final C1370g6<C2396o3<?>, String> f10180b;

    /* renamed from: c */
    public final tj1<Map<C2396o3<?>, String>> f10181c;

    /* renamed from: d */
    public int f10182d;

    /* renamed from: e */
    public boolean f10183e;

    /* renamed from: a */
    public final Set<C2396o3<?>> m22059a() {
        return this.f10179a.keySet();
    }

    /* renamed from: b */
    public final void m22058b(C2396o3<?> c2396o3, ConnectionResult connectionResult, String str) {
        this.f10179a.put(c2396o3, connectionResult);
        this.f10180b.put(c2396o3, str);
        this.f10182d--;
        if (!connectionResult.m1205u()) {
            this.f10183e = true;
        }
        if (this.f10182d == 0) {
            if (!this.f10183e) {
                this.f10181c.m9080c(this.f10180b);
                return;
            }
            this.f10181c.m9081b(new C3516x9(this.f10179a));
        }
    }
}
