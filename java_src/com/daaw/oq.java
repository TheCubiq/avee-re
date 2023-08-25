package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.daaw.hj;
/* loaded from: classes.dex */
public class oq implements hj {
    public final Context p;
    public final hj.a q;
    public boolean r;
    public boolean s;
    public final BroadcastReceiver t = new a();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = oq.this.r;
            oq oqVar = oq.this;
            oqVar.r = oqVar.n(context);
            if (z != oq.this.r) {
                oq.this.q.a(oq.this.r);
            }
        }
    }

    public oq(Context context, hj.a aVar) {
        this.p = context.getApplicationContext();
        this.q = aVar;
    }

    @Override // com.daaw.qj0
    public void a() {
        o();
    }

    @Override // com.daaw.qj0
    public void h() {
        p();
    }

    public final boolean n(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void o() {
        if (this.s) {
            return;
        }
        this.r = n(this.p);
        this.p.registerReceiver(this.t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.s = true;
    }

    @Override // com.daaw.qj0
    public void onDestroy() {
    }

    public final void p() {
        if (this.s) {
            this.p.unregisterReceiver(this.t);
            this.s = false;
        }
    }
}
