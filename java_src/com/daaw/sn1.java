package com.daaw;

import android.util.Base64;
import com.daaw.C3408w9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class sn1 {

    @AutoValue.Builder
    /* renamed from: com.daaw.sn1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2958a {
        /* renamed from: a */
        public abstract sn1 mo6333a();

        /* renamed from: b */
        public abstract AbstractC2958a mo6332b(String str);

        /* renamed from: c */
        public abstract AbstractC2958a mo6331c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC2958a mo6330d(cz0 cz0Var);
    }

    /* renamed from: a */
    public static AbstractC2958a m10151a() {
        return new C3408w9.C3410b().mo6330d(cz0.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo6336b();

    /* renamed from: c */
    public abstract byte[] mo6335c();

    /* renamed from: d */
    public abstract cz0 mo6334d();

    /* renamed from: e */
    public boolean m10150e() {
        return mo6335c() != null;
    }

    /* renamed from: f */
    public sn1 m10149f(cz0 cz0Var) {
        return m10151a().mo6332b(mo6336b()).mo6330d(cz0Var).mo6331c(mo6335c()).mo6333a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo6336b();
        objArr[1] = mo6334d();
        objArr[2] = mo6335c() == null ? "" : Base64.encodeToString(mo6335c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
