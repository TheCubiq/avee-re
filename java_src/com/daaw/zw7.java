package com.daaw;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zw7 extends u28 {

    /* renamed from: a */
    public final Context f35621a;

    /* renamed from: b */
    public final e48 f35622b;

    public zw7(Context context, @Nullable e48 e48Var) {
        Objects.requireNonNull(context, "Null context");
        this.f35621a = context;
        this.f35622b = e48Var;
    }

    @Override // com.daaw.u28
    /* renamed from: a */
    public final Context mo1819a() {
        return this.f35621a;
    }

    @Override // com.daaw.u28
    @Nullable
    /* renamed from: b */
    public final e48 mo1818b() {
        return this.f35622b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u28) {
            u28 u28Var = (u28) obj;
            if (this.f35621a.equals(u28Var.mo1819a())) {
                e48 e48Var = this.f35622b;
                e48 mo1818b = u28Var.mo1818b();
                if (e48Var != null ? e48Var.equals(mo1818b) : mo1818b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f35621a.hashCode() ^ 1000003) * 1000003;
        e48 e48Var = this.f35622b;
        return hashCode ^ (e48Var == null ? 0 : e48Var.hashCode());
    }

    public final String toString() {
        String obj = this.f35621a.toString();
        String valueOf = String.valueOf(this.f35622b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
