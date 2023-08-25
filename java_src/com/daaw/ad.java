package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ad implements ip<InputStream> {
    public final byte[] a;
    public final String b;

    public ad(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    @Override // com.daaw.ip
    public void b() {
    }

    @Override // com.daaw.ip
    /* renamed from: c */
    public InputStream a(dz0 dz0Var) {
        return new ByteArrayInputStream(this.a);
    }

    @Override // com.daaw.ip
    public void cancel() {
    }

    @Override // com.daaw.ip
    public String getId() {
        return this.b;
    }
}
