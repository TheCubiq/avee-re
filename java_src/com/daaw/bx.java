package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class bx {
    public final String a;

    public bx(String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public static bx b(String str) {
        return new bx(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bx) {
            return this.a.equals(((bx) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
