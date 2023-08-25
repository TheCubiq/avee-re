package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class il2 implements ServiceConnection {

    /* renamed from: a */
    public final Object f13766a = new Object();

    /* renamed from: b */
    public boolean f13767b = false;

    /* renamed from: c */
    public InterfaceC2929sb f13768c;

    /* renamed from: d */
    public final /* synthetic */ C2842rb f13769d;

    public /* synthetic */ il2(C2842rb c2842rb, InterfaceC2929sb interfaceC2929sb, ek2 ek2Var) {
        this.f13769d = c2842rb;
        this.f13768c = interfaceC2929sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m19665a() {
        Bundle bundle;
        int i;
        synchronized (this.f13766a) {
            if (this.f13767b) {
                return null;
            }
            if (TextUtils.isEmpty(null)) {
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putString("accountName", null);
            }
            int i2 = 3;
            try {
                String packageName = C2842rb.m11509v(this.f13769d).getPackageName();
                int i3 = 17;
                i = 3;
                while (true) {
                    if (i3 < 3) {
                        i3 = 0;
                        break;
                    }
                    if (bundle == null) {
                        try {
                            i = C2842rb.m11543B(this.f13769d).mo7773c0(i3, packageName, "subs");
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            yx2.m3093m("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                            C2842rb.m11539F(this.f13769d, 0);
                            C2842rb.m11520k(this.f13769d, null);
                            i = i2;
                            m19662d(i != 0 ? uz2.f29678l : uz2.f29667a);
                            return null;
                        }
                    } else {
                        i = C2842rb.m11543B(this.f13769d).mo7780G2(i3, packageName, "subs", bundle);
                    }
                    if (i == 0) {
                        break;
                    }
                    i3--;
                }
                boolean z = true;
                C2842rb.m11519l(this.f13769d, i3 >= 5);
                C2842rb.m11518m(this.f13769d, i3 >= 3);
                if (i3 < 3) {
                    yx2.m3095k("BillingClient", "In-app billing API does not support subscription on this device.");
                }
                int i4 = 17;
                while (true) {
                    if (i4 < 3) {
                        break;
                    }
                    i = bundle == null ? C2842rb.m11543B(this.f13769d).mo7773c0(i4, packageName, "inapp") : C2842rb.m11543B(this.f13769d).mo7780G2(i4, packageName, "inapp", bundle);
                    if (i == 0) {
                        C2842rb.m11538G(this.f13769d, i4);
                        break;
                    }
                    i4--;
                }
                C2842rb c2842rb = this.f13769d;
                C2842rb.m11532M(c2842rb, C2842rb.m11510u(c2842rb) >= 17);
                C2842rb c2842rb2 = this.f13769d;
                C2842rb.m11533L(c2842rb2, C2842rb.m11510u(c2842rb2) >= 16);
                C2842rb c2842rb3 = this.f13769d;
                C2842rb.m11534K(c2842rb3, C2842rb.m11510u(c2842rb3) >= 15);
                C2842rb c2842rb4 = this.f13769d;
                C2842rb.m11535J(c2842rb4, C2842rb.m11510u(c2842rb4) >= 14);
                C2842rb c2842rb5 = this.f13769d;
                C2842rb.m11536I(c2842rb5, C2842rb.m11510u(c2842rb5) >= 12);
                C2842rb c2842rb6 = this.f13769d;
                C2842rb.m11537H(c2842rb6, C2842rb.m11510u(c2842rb6) >= 10);
                C2842rb c2842rb7 = this.f13769d;
                C2842rb.m11521j(c2842rb7, C2842rb.m11510u(c2842rb7) >= 9);
                C2842rb c2842rb8 = this.f13769d;
                C2842rb.m11530O(c2842rb8, C2842rb.m11510u(c2842rb8) >= 8);
                C2842rb c2842rb9 = this.f13769d;
                if (C2842rb.m11510u(c2842rb9) < 6) {
                    z = false;
                }
                C2842rb.m11531N(c2842rb9, z);
                if (C2842rb.m11510u(this.f13769d) < 3) {
                    yx2.m3094l("BillingClient", "In-app billing API version 3 is not supported on this device.");
                }
                if (i == 0) {
                    C2842rb.m11539F(this.f13769d, 2);
                } else {
                    C2842rb.m11539F(this.f13769d, 0);
                    C2842rb.m11520k(this.f13769d, null);
                }
            } catch (Exception e2) {
                e = e2;
            }
            m19662d(i != 0 ? uz2.f29678l : uz2.f29667a);
            return null;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m19664b() {
        C2842rb.m11539F(this.f13769d, 0);
        C2842rb.m11520k(this.f13769d, null);
        m19662d(uz2.f29680n);
    }

    /* renamed from: c */
    public final void m19663c() {
        synchronized (this.f13766a) {
            this.f13768c = null;
            this.f13767b = true;
        }
    }

    /* renamed from: d */
    public final void m19662d(C3518xb c3518xb) {
        synchronized (this.f13766a) {
            InterfaceC2929sb interfaceC2929sb = this.f13768c;
            if (interfaceC2929sb != null) {
                interfaceC2929sb.mo6232a(c3518xb);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yx2.m3095k("BillingClient", "Billing service connected.");
        C2842rb.m11520k(this.f13769d, tk4.m9045D(iBinder));
        C2842rb c2842rb = this.f13769d;
        if (C2842rb.m11540E(c2842rb, new Callable() { // from class: com.daaw.vh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                il2.this.m19665a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.zi2
            @Override // java.lang.Runnable
            public final void run() {
                il2.this.m19664b();
            }
        }, C2842rb.m11506y(c2842rb)) == null) {
            m19662d(C2842rb.m11505z(this.f13769d));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yx2.m3094l("BillingClient", "Billing service disconnected.");
        C2842rb.m11520k(this.f13769d, null);
        C2842rb.m11539F(this.f13769d, 0);
        synchronized (this.f13766a) {
            InterfaceC2929sb interfaceC2929sb = this.f13768c;
            if (interfaceC2929sb != null) {
                interfaceC2929sb.mo6231b();
            }
        }
    }
}
