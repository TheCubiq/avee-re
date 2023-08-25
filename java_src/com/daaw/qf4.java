package com.daaw;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class qf4 implements kf4 {

    /* renamed from: a */
    public final dh5 f23913a;

    public qf4(dh5 dh5Var) {
        this.f23913a = dh5Var;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        char c;
        dh5 dh5Var;
        zg5 zg5Var;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            dh5Var = this.f23913a;
            zg5Var = zg5.SHAKE;
        } else if (c != 1) {
            dh5Var = this.f23913a;
            zg5Var = zg5.NONE;
        } else {
            dh5Var = this.f23913a;
            zg5Var = zg5.FLICK;
        }
        dh5Var.m24400k(zg5Var);
    }
}
