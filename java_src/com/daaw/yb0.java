package com.daaw;

import android.content.Context;
import java.io.InputStream;
/* loaded from: classes.dex */
public class yb0 implements mq0 {
    public final lq0<o70, o70> a;

    /* loaded from: classes.dex */
    public static class a implements nq0<o70, InputStream> {
        public final lq0<o70, o70> a = new lq0<>(500);

        @Override // com.daaw.nq0
        public mq0<o70, InputStream> a(Context context, d60 d60Var) {
            return new yb0(this.a);
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public yb0(lq0<o70, o70> lq0Var) {
        this.a = lq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<InputStream> a(o70 o70Var, int i, int i2) {
        lq0<o70, o70> lq0Var = this.a;
        if (lq0Var != null) {
            o70 a2 = lq0Var.a(o70Var, 0, 0);
            if (a2 == null) {
                this.a.b(o70Var, 0, 0, o70Var);
            } else {
                o70Var = a2;
            }
        }
        return new xb0(o70Var);
    }
}
