package com.daaw;

import com.daaw.C3317v9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class bm1 {

    @AutoValue.Builder
    /* renamed from: com.daaw.bm1$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0872a {
        /* renamed from: a */
        public abstract bm1 mo7323a();

        /* renamed from: b */
        public abstract AbstractC0872a mo7322b(EnumC0873b enumC0873b);

        /* renamed from: c */
        public abstract AbstractC0872a mo7321c(String str);

        /* renamed from: d */
        public abstract AbstractC0872a mo7320d(long j);
    }

    /* renamed from: com.daaw.bm1$b */
    /* loaded from: classes2.dex */
    public enum EnumC0873b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static AbstractC0872a m25997a() {
        return new C3317v9.C3319b().mo7320d(0L);
    }

    /* renamed from: b */
    public abstract EnumC0873b mo7326b();

    /* renamed from: c */
    public abstract String mo7325c();

    /* renamed from: d */
    public abstract long mo7324d();
}
