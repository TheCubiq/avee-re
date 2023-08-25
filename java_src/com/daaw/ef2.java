package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class ef2 {

    /* renamed from: a */
    public final String f8442a;

    /* renamed from: b */
    public final String f8443b;

    public ef2(String str, String str2) {
        this.f8442a = str;
        this.f8443b = str2;
    }

    /* renamed from: a */
    public final String m23524a() {
        return this.f8442a;
    }

    /* renamed from: b */
    public final String m23523b() {
        return this.f8443b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ef2.class == obj.getClass()) {
            ef2 ef2Var = (ef2) obj;
            if (TextUtils.equals(this.f8442a, ef2Var.f8442a) && TextUtils.equals(this.f8443b, ef2Var.f8443b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8442a.hashCode() * 31) + this.f8443b.hashCode();
    }

    public final String toString() {
        String str = this.f8442a;
        String str2 = this.f8443b;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }
}
