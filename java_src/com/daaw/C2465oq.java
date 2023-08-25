package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.daaw.InterfaceC1539hj;
/* renamed from: com.daaw.oq */
/* loaded from: classes.dex */
public class C2465oq implements InterfaceC1539hj {

    /* renamed from: p */
    public final Context f21815p;

    /* renamed from: q */
    public final InterfaceC1539hj.InterfaceC1540a f21816q;

    /* renamed from: r */
    public boolean f21817r;

    /* renamed from: s */
    public boolean f21818s;

    /* renamed from: t */
    public final BroadcastReceiver f21819t = new C2466a();

    /* renamed from: com.daaw.oq$a */
    /* loaded from: classes.dex */
    public class C2466a extends BroadcastReceiver {
        public C2466a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = C2465oq.this.f21817r;
            C2465oq c2465oq = C2465oq.this;
            c2465oq.f21817r = c2465oq.m14091n(context);
            if (z != C2465oq.this.f21817r) {
                C2465oq.this.f21816q.mo11758a(C2465oq.this.f21817r);
            }
        }
    }

    public C2465oq(Context context, InterfaceC1539hj.InterfaceC1540a interfaceC1540a) {
        this.f21815p = context.getApplicationContext();
        this.f21816q = interfaceC1540a;
    }

    @Override // com.daaw.qj0
    /* renamed from: a */
    public void mo3969a() {
        m14090o();
    }

    @Override // com.daaw.qj0
    /* renamed from: h */
    public void mo3966h() {
        m14089p();
    }

    /* renamed from: n */
    public final boolean m14091n(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: o */
    public final void m14090o() {
        if (this.f21818s) {
            return;
        }
        this.f21817r = m14091n(this.f21815p);
        this.f21815p.registerReceiver(this.f21819t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f21818s = true;
    }

    @Override // com.daaw.qj0
    public void onDestroy() {
    }

    /* renamed from: p */
    public final void m14089p() {
        if (this.f21818s) {
            this.f21815p.unregisterReceiver(this.f21819t);
            this.f21818s = false;
        }
    }
}
