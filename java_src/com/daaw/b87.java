package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class b87 {

    /* renamed from: a */
    public final InputStream f4548a;

    public b87(InputStream inputStream) {
        this.f4548a = inputStream;
    }

    /* renamed from: b */
    public static b87 m26326b(byte[] bArr) {
        return new b87(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public final dn7 m26327a() {
        try {
            return dn7.m24203P(this.f4548a, vr7.m6834a());
        } finally {
            this.f4548a.close();
        }
    }
}
