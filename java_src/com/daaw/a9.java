package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a9 extends en {
    public final Context a;
    public final cg b;
    public final cg c;
    public final String d;

    public a9(Context context, cg cgVar, cg cgVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(cgVar, "Null wallClock");
        this.b = cgVar;
        Objects.requireNonNull(cgVar2, "Null monotonicClock");
        this.c = cgVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.d = str;
    }

    @Override // com.daaw.en
    public Context b() {
        return this.a;
    }

    @Override // com.daaw.en
    public String c() {
        return this.d;
    }

    @Override // com.daaw.en
    public cg d() {
        return this.c;
    }

    @Override // com.daaw.en
    public cg e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof en) {
            en enVar = (en) obj;
            return this.a.equals(enVar.b()) && this.b.equals(enVar.e()) && this.c.equals(enVar.d()) && this.d.equals(enVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
