package com.google.android.exoplayer2.drm;

import com.daaw.InterfaceC2376nz;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.exoplayer2.drm.f */
/* loaded from: classes.dex */
public interface InterfaceC3936f<T extends InterfaceC2376nz> {

    /* renamed from: com.google.android.exoplayer2.drm.f$a */
    /* loaded from: classes.dex */
    public static final class C3937a implements InterfaceC3938b {

        /* renamed from: a */
        public final byte[] f35769a;

        /* renamed from: b */
        public final String f35770b;

        public C3937a(byte[] bArr, String str) {
            this.f35769a = bArr;
            this.f35770b = str;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3936f.InterfaceC3938b
        /* renamed from: a */
        public String mo1653a() {
            return this.f35770b;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3936f.InterfaceC3938b
        /* renamed from: b */
        public byte[] mo1652b() {
            return this.f35769a;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3938b {
        /* renamed from: a */
        String mo1653a();

        /* renamed from: b */
        byte[] mo1652b();
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3939c {
    }

    /* renamed from: a */
    Map<String, String> m1662a(byte[] bArr);

    /* renamed from: b */
    T m1661b(byte[] bArr);

    /* renamed from: c */
    InterfaceC3939c m1660c();

    /* renamed from: d */
    InterfaceC3938b m1659d(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap);

    /* renamed from: e */
    byte[] m1658e();

    /* renamed from: f */
    void m1657f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void m1656g(byte[] bArr);

    /* renamed from: h */
    byte[] m1655h(byte[] bArr, byte[] bArr2);

    /* renamed from: i */
    void m1654i(byte[] bArr);
}
