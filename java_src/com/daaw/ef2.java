package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class ef2 {
    public final String a;
    public final String b;

    public ef2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ef2.class == obj.getClass()) {
            ef2 ef2Var = (ef2) obj;
            if (TextUtils.equals(this.a, ef2Var.a) && TextUtils.equals(this.b, ef2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }
}
