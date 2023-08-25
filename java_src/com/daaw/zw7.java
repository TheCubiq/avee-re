package com.daaw;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zw7 extends u28 {
    public final Context a;
    public final e48 b;

    public zw7(Context context, @Nullable e48 e48Var) {
        Objects.requireNonNull(context, "Null context");
        this.a = context;
        this.b = e48Var;
    }

    @Override // com.daaw.u28
    public final Context a() {
        return this.a;
    }

    @Override // com.daaw.u28
    @Nullable
    public final e48 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u28) {
            u28 u28Var = (u28) obj;
            if (this.a.equals(u28Var.a())) {
                e48 e48Var = this.b;
                e48 b = u28Var.b();
                if (e48Var != null ? e48Var.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        e48 e48Var = this.b;
        return hashCode ^ (e48Var == null ? 0 : e48Var.hashCode());
    }

    public final String toString() {
        String obj = this.a.toString();
        String valueOf = String.valueOf(this.b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
