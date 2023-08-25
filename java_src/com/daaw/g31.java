package com.daaw;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes.dex */
public class g31 {

    /* renamed from: b */
    public long f10227b;

    /* renamed from: c */
    public InterfaceC1492h0 f10228c = null;

    /* renamed from: a */
    public Handler f10226a = new Handler(new C1359a());

    /* renamed from: com.daaw.g31$a */
    /* loaded from: classes.dex */
    public class C1359a implements Handler.Callback {
        public C1359a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2) {
                return false;
            }
            g31 g31Var = g31.this;
            InterfaceC1492h0 interfaceC1492h0 = g31Var.f10228c;
            g31Var.f10228c = null;
            if (interfaceC1492h0 != null) {
                interfaceC1492h0.mo3002a();
                return false;
            }
            return false;
        }
    }

    public g31(long j) {
        this.f10227b = j;
    }

    /* renamed from: a */
    public void m22052a(InterfaceC1492h0 interfaceC1492h0) {
        gr1.m21332c();
        this.f10228c = interfaceC1492h0;
        if (this.f10226a.hasMessages(2)) {
            return;
        }
        this.f10226a.sendMessageDelayed(this.f10226a.obtainMessage(2, interfaceC1492h0), this.f10227b);
    }
}
