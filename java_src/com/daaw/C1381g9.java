package com.daaw;

import java.util.Objects;
import javax.annotation.Nonnull;
/* renamed from: com.daaw.g9 */
/* loaded from: classes.dex */
public final class C1381g9 extends ij0 {

    /* renamed from: a */
    public final String f10353a;

    /* renamed from: b */
    public final String f10354b;

    public C1381g9(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f10353a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f10354b = str2;
    }

    @Override // com.daaw.ij0
    @Nonnull
    /* renamed from: b */
    public String mo19757b() {
        return this.f10353a;
    }

    @Override // com.daaw.ij0
    @Nonnull
    /* renamed from: c */
    public String mo19756c() {
        return this.f10354b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ij0) {
            ij0 ij0Var = (ij0) obj;
            return this.f10353a.equals(ij0Var.mo19757b()) && this.f10354b.equals(ij0Var.mo19756c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f10353a.hashCode() ^ 1000003) * 1000003) ^ this.f10354b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f10353a + ", version=" + this.f10354b + "}";
    }
}
