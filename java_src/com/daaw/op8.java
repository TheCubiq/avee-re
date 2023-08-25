package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class op8 {

    /* renamed from: a */
    public final String f21812a;

    /* renamed from: b */
    public final boolean f21813b;

    /* renamed from: c */
    public final boolean f21814c;

    public op8(String str, boolean z, boolean z2) {
        this.f21812a = str;
        this.f21813b = z;
        this.f21814c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == op8.class) {
            op8 op8Var = (op8) obj;
            if (TextUtils.equals(this.f21812a, op8Var.f21812a) && this.f21813b == op8Var.f21813b && this.f21814c == op8Var.f21814c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21812a.hashCode() + 31) * 31) + (true != this.f21813b ? 1237 : 1231)) * 31) + (true == this.f21814c ? 1231 : 1237);
    }
}
