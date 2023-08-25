package com.daaw;

import android.content.Context;
import java.io.InputStream;
/* loaded from: classes.dex */
public class lg1 implements mq0 {
    public final String a;

    /* loaded from: classes.dex */
    public static class a implements nq0<byte[], InputStream> {
        @Override // com.daaw.nq0
        public mq0<byte[], InputStream> a(Context context, d60 d60Var) {
            return new lg1();
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public lg1() {
        this("");
    }

    @Deprecated
    public lg1(String str) {
        this.a = str;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<InputStream> a(byte[] bArr, int i, int i2) {
        return new ad(bArr, this.a);
    }
}
