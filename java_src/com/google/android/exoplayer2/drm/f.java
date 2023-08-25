package com.google.android.exoplayer2.drm;

import com.daaw.nz;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public interface f<T extends nz> {

    /* loaded from: classes.dex */
    public static final class a implements b {
        public final byte[] a;
        public final String b;

        public a(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        @Override // com.google.android.exoplayer2.drm.f.b
        public String a() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.drm.f.b
        public byte[] b() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a();

        byte[] b();
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    Map<String, String> a(byte[] bArr);

    T b(byte[] bArr);

    c c();

    b d(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap);

    byte[] e();

    void f(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    byte[] h(byte[] bArr, byte[] bArr2);

    void i(byte[] bArr);
}
