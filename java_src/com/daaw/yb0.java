package com.daaw;

import android.content.Context;
import java.io.InputStream;
/* loaded from: classes.dex */
public class yb0 implements mq0 {

    /* renamed from: a */
    public final lq0<o70, o70> f33467a;

    /* renamed from: com.daaw.yb0$a */
    /* loaded from: classes.dex */
    public static class C3685a implements nq0<o70, InputStream> {

        /* renamed from: a */
        public final lq0<o70, o70> f33468a = new lq0<>(500);

        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<o70, InputStream> mo3945a(Context context, d60 d60Var) {
            return new yb0(this.f33468a);
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public yb0(lq0<o70, o70> lq0Var) {
        this.f33467a = lq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public InterfaceC1744ip<InputStream> mo3764a(o70 o70Var, int i, int i2) {
        lq0<o70, o70> lq0Var = this.f33467a;
        if (lq0Var != null) {
            o70 m16674a = lq0Var.m16674a(o70Var, 0, 0);
            if (m16674a == null) {
                this.f33467a.m16673b(o70Var, 0, 0, o70Var);
            } else {
                o70Var = m16674a;
            }
        }
        return new xb0(o70Var);
    }
}
