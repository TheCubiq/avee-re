package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* renamed from: com.daaw.ad */
/* loaded from: classes.dex */
public class C0615ad implements InterfaceC1744ip<InputStream> {

    /* renamed from: a */
    public final byte[] f3089a;

    /* renamed from: b */
    public final String f3090b;

    public C0615ad(byte[] bArr, String str) {
        this.f3089a = bArr;
        this.f3090b = str;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: b */
    public void mo4084b() {
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: c */
    public InputStream mo4085a(dz0 dz0Var) {
        return new ByteArrayInputStream(this.f3089a);
    }

    @Override // com.daaw.InterfaceC1744ip
    public void cancel() {
    }

    @Override // com.daaw.InterfaceC1744ip
    public String getId() {
        return this.f3090b;
    }
}
