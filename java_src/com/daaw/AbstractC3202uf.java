package com.daaw;

import com.daaw.C1059d8;
import com.google.auto.value.AutoValue;
@AutoValue
/* renamed from: com.daaw.uf */
/* loaded from: classes.dex */
public abstract class AbstractC3202uf {

    @AutoValue.Builder
    /* renamed from: com.daaw.uf$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3203a {
        /* renamed from: a */
        public abstract AbstractC3202uf mo8282a();

        /* renamed from: b */
        public abstract AbstractC3203a mo8281b(AbstractC3792z2 abstractC3792z2);

        /* renamed from: c */
        public abstract AbstractC3203a mo8280c(EnumC3204b enumC3204b);
    }

    /* renamed from: com.daaw.uf$b */
    /* loaded from: classes.dex */
    public enum EnumC3204b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: p */
        public final int f29022p;

        EnumC3204b(int i) {
            this.f29022p = i;
        }
    }

    /* renamed from: a */
    public static AbstractC3203a m8285a() {
        return new C1059d8.C1061b();
    }

    /* renamed from: b */
    public abstract AbstractC3792z2 mo8284b();

    /* renamed from: c */
    public abstract EnumC3204b mo8283c();
}
