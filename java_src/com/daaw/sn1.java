package com.daaw;

import android.util.Base64;
import com.daaw.w9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class sn1 {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract sn1 a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(cz0 cz0Var);
    }

    public static a a() {
        return new w9.b().d(cz0.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract cz0 d();

    public boolean e() {
        return c() != null;
    }

    public sn1 f(cz0 cz0Var) {
        return a().b(b()).d(cz0Var).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
