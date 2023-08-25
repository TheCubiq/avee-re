package com.daaw;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes.dex */
public class g31 {
    public long b;
    public h0 c = null;
    public Handler a = new Handler(new a());

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2) {
                return false;
            }
            g31 g31Var = g31.this;
            h0 h0Var = g31Var.c;
            g31Var.c = null;
            if (h0Var != null) {
                h0Var.a();
                return false;
            }
            return false;
        }
    }

    public g31(long j) {
        this.b = j;
    }

    public void a(h0 h0Var) {
        gr1.c();
        this.c = h0Var;
        if (this.a.hasMessages(2)) {
            return;
        }
        this.a.sendMessageDelayed(this.a.obtainMessage(2, h0Var), this.b);
    }
}
