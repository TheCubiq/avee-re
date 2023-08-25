package com.daaw;

import java.util.Objects;
/* renamed from: com.daaw.bx */
/* loaded from: classes.dex */
public final class C0892bx {

    /* renamed from: a */
    public final String f5240a;

    public C0892bx(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f5240a = str;
    }

    /* renamed from: b */
    public static C0892bx m25779b(String str) {
        return new C0892bx(str);
    }

    /* renamed from: a */
    public String m25780a() {
        return this.f5240a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0892bx) {
            return this.f5240a.equals(((C0892bx) obj).f5240a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5240a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f5240a + "\"}";
    }
}
