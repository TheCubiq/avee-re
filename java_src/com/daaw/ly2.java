package com.daaw;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class ly2 extends a38 {
    public final /* synthetic */ pa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(pa paVar, Looper looper) {
        super(looper);
        this.a = paVar;
    }

    public static final void a(Message message) {
        es3 es3Var = (es3) message.obj;
        es3Var.b();
        es3Var.e();
    }

    public static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        pa.a aVar;
        pa.a aVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.a.f()) || message.what == 5)) && !this.a.isConnecting()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.a.z = new ConnectionResult(message.arg2);
            if (pa.H(this.a)) {
                pa paVar = this.a;
                z = paVar.A;
                if (!z) {
                    paVar.I(3, null);
                    return;
                }
            }
            pa paVar2 = this.a;
            connectionResult2 = paVar2.z;
            ConnectionResult connectionResult3 = connectionResult2 != null ? paVar2.z : new ConnectionResult(8);
            this.a.p.a(connectionResult3);
            this.a.p(connectionResult3);
        } else if (i2 == 5) {
            pa paVar3 = this.a;
            connectionResult = paVar3.z;
            ConnectionResult connectionResult4 = connectionResult != null ? paVar3.z : new ConnectionResult(8);
            this.a.p.a(connectionResult4);
            this.a.p(connectionResult4);
        } else if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.p.a(connectionResult5);
            this.a.p(connectionResult5);
        } else if (i2 == 6) {
            this.a.I(5, null);
            pa paVar4 = this.a;
            aVar = paVar4.u;
            if (aVar != null) {
                aVar2 = paVar4.u;
                aVar2.D(message.arg2);
            }
            this.a.q(message.arg2);
            pa.G(this.a, 5, 1, null);
        } else if (i2 == 2 && !this.a.isConnected()) {
            a(message);
        } else if (b(message)) {
            ((es3) message.obj).c();
        } else {
            int i3 = message.what;
            Log.wtf("GmsClient", "Don't know how to handle message: " + i3, new Exception());
        }
    }
}
