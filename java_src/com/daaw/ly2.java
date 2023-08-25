package com.daaw;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class ly2 extends a38 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2527pa f17908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(AbstractC2527pa abstractC2527pa, Looper looper) {
        super(looper);
        this.f17908a = abstractC2527pa;
    }

    /* renamed from: a */
    public static final void m16374a(Message message) {
        es3 es3Var = (es3) message.obj;
        es3Var.mo16238b();
        es3Var.m23232e();
    }

    /* renamed from: b */
    public static final boolean m16373b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC2527pa.InterfaceC2528a interfaceC2528a;
        AbstractC2527pa.InterfaceC2528a interfaceC2528a2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.f17908a.f22735C.get() != message.arg1) {
            if (m16373b(message)) {
                m16374a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.f17908a.m13556f()) || message.what == 5)) && !this.f17908a.isConnecting()) {
            m16374a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.f17908a.f22761z = new ConnectionResult(message.arg2);
            if (AbstractC2527pa.m13559H(this.f17908a)) {
                AbstractC2527pa abstractC2527pa = this.f17908a;
                z = abstractC2527pa.f22733A;
                if (!z) {
                    abstractC2527pa.m13558I(3, null);
                    return;
                }
            }
            AbstractC2527pa abstractC2527pa2 = this.f17908a;
            connectionResult2 = abstractC2527pa2.f22761z;
            ConnectionResult connectionResult3 = connectionResult2 != null ? abstractC2527pa2.f22761z : new ConnectionResult(8);
            this.f17908a.f22751p.mo13540a(connectionResult3);
            this.f17908a.m13551p(connectionResult3);
        } else if (i2 == 5) {
            AbstractC2527pa abstractC2527pa3 = this.f17908a;
            connectionResult = abstractC2527pa3.f22761z;
            ConnectionResult connectionResult4 = connectionResult != null ? abstractC2527pa3.f22761z : new ConnectionResult(8);
            this.f17908a.f22751p.mo13540a(connectionResult4);
            this.f17908a.m13551p(connectionResult4);
        } else if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f17908a.f22751p.mo13540a(connectionResult5);
            this.f17908a.m13551p(connectionResult5);
        } else if (i2 == 6) {
            this.f17908a.m13558I(5, null);
            AbstractC2527pa abstractC2527pa4 = this.f17908a;
            interfaceC2528a = abstractC2527pa4.f22756u;
            if (interfaceC2528a != null) {
                interfaceC2528a2 = abstractC2527pa4.f22756u;
                interfaceC2528a2.mo5044D(message.arg2);
            }
            this.f17908a.m13550q(message.arg2);
            AbstractC2527pa.m13560G(this.f17908a, 5, 1, null);
        } else if (i2 == 2 && !this.f17908a.isConnected()) {
            m16374a(message);
        } else if (m16373b(message)) {
            ((es3) message.obj).m23234c();
        } else {
            int i3 = message.what;
            Log.wtf("GmsClient", "Don't know how to handle message: " + i3, new Exception());
        }
    }
}
