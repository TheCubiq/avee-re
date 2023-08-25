package com.daaw;

import java.util.Objects;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class g9 extends ij0 {
    public final String a;
    public final String b;

    public g9(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.b = str2;
    }

    @Override // com.daaw.ij0
    @Nonnull
    public String b() {
        return this.a;
    }

    @Override // com.daaw.ij0
    @Nonnull
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ij0) {
            ij0 ij0Var = (ij0) obj;
            return this.a.equals(ij0Var.b()) && this.b.equals(ij0Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
