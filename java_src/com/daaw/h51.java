package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class h51 {

    /* renamed from: a */
    public boolean f12062a;

    /* renamed from: b */
    public final Handler f12063b = new Handler(Looper.getMainLooper(), new C1506b());

    /* renamed from: com.daaw.h51$b */
    /* loaded from: classes.dex */
    public static class C1506b implements Handler.Callback {
        public C1506b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((z41) message.obj).mo2827c();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m21022a(z41<?> z41Var) {
        tq1.m8869b();
        if (this.f12062a) {
            this.f12063b.obtainMessage(1, z41Var).sendToTarget();
            return;
        }
        this.f12062a = true;
        z41Var.mo2827c();
        this.f12062a = false;
    }
}
