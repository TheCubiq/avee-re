package com.daaw;

import com.google.auto.value.AutoValue;
@AutoValue
/* renamed from: com.daaw.da */
/* loaded from: classes.dex */
public abstract class AbstractC1066da {

    /* renamed from: com.daaw.da$a */
    /* loaded from: classes.dex */
    public enum EnumC1067a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC1066da m24587a() {
        return new C0824b8(EnumC1067a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC1066da m24584d() {
        return new C0824b8(EnumC1067a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC1066da m24583e(long j) {
        return new C0824b8(EnumC1067a.OK, j);
    }

    /* renamed from: f */
    public static AbstractC1066da m24582f() {
        return new C0824b8(EnumC1067a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo24586b();

    /* renamed from: c */
    public abstract EnumC1067a mo24585c();
}
