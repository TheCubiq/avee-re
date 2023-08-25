package com.daaw;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class ko8 implements Handler.Callback {

    /* renamed from: p */
    public final /* synthetic */ vp8 f16606p;

    public /* synthetic */ ko8(vp8 vp8Var, mm8 mm8Var) {
        this.f16606p = vp8Var;
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
            hashMap = this.f16606p.f30428f;
            synchronized (hashMap) {
                rh8 rh8Var = (rh8) message.obj;
                hashMap2 = this.f16606p.f30428f;
                zj8 zj8Var = (zj8) hashMap2.get(rh8Var);
                if (zj8Var != null && zj8Var.m2184i()) {
                    if (zj8Var.m2183j()) {
                        zj8Var.m2186g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f16606p.f30428f;
                    hashMap3.remove(rh8Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.f16606p.f30428f;
            synchronized (hashMap4) {
                rh8 rh8Var2 = (rh8) message.obj;
                hashMap5 = this.f16606p.f30428f;
                zj8 zj8Var2 = (zj8) hashMap5.get(rh8Var2);
                if (zj8Var2 != null && zj8Var2.m2192a() == 3) {
                    String valueOf = String.valueOf(rh8Var2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName m2191b = zj8Var2.m2191b();
                    if (m2191b == null) {
                        m2191b = rh8Var2.m11299b();
                    }
                    if (m2191b == null) {
                        String m11297d = rh8Var2.m11297d();
                        ry0.m10830j(m11297d);
                        m2191b = new ComponentName(m11297d, "unknown");
                    }
                    zj8Var2.onServiceDisconnected(m2191b);
                }
            }
            return true;
        }
    }
}
