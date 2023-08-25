package com.daaw;

import com.daaw.d8;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class uf {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract uf a();

        public abstract a b(z2 z2Var);

        public abstract a c(b bVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        public final int p;

        b(int i) {
            this.p = i;
        }
    }

    public static a a() {
        return new d8.b();
    }

    public abstract z2 b();

    public abstract b c();
}
