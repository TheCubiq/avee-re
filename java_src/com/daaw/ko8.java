package com.daaw;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class ko8 implements Handler.Callback {
    public final /* synthetic */ vp8 p;

    public /* synthetic */ ko8(vp8 vp8Var, mm8 mm8Var) {
        this.p = vp8Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.p.f;
            synchronized (hashMap) {
                rh8 rh8Var = (rh8) message.obj;
                hashMap2 = this.p.f;
                zj8 zj8Var = (zj8) hashMap2.get(rh8Var);
                if (zj8Var != null && zj8Var.i()) {
                    if (zj8Var.j()) {
                        zj8Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.p.f;
                    hashMap3.remove(rh8Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.p.f;
            synchronized (hashMap4) {
                rh8 rh8Var2 = (rh8) message.obj;
                hashMap5 = this.p.f;
                zj8 zj8Var2 = (zj8) hashMap5.get(rh8Var2);
                if (zj8Var2 != null && zj8Var2.a() == 3) {
                    String valueOf = String.valueOf(rh8Var2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName b = zj8Var2.b();
                    if (b == null) {
                        b = rh8Var2.b();
                    }
                    if (b == null) {
                        String d = rh8Var2.d();
                        ry0.j(d);
                        b = new ComponentName(d, "unknown");
                    }
                    zj8Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
