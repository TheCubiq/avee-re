package com.daaw;

import android.content.Context;
import java.io.InputStream;
/* loaded from: classes.dex */
public class lg1 implements mq0 {

    /* renamed from: a */
    public final String f17379a;

    /* renamed from: com.daaw.lg1$a */
    /* loaded from: classes.dex */
    public static class C2038a implements nq0<byte[], InputStream> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<byte[], InputStream> mo3945a(Context context, d60 d60Var) {
            return new lg1();
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public lg1() {
        this("");
    }

    @Deprecated
    public lg1(String str) {
        this.f17379a = str;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public InterfaceC1744ip<InputStream> mo3764a(byte[] bArr, int i, int i2) {
        return new C0615ad(bArr, this.f17379a);
    }
}
