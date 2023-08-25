package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class op8 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public op8(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == op8.class) {
            op8 op8Var = (op8) obj;
            if (TextUtils.equals(this.a, op8Var.a) && this.b == op8Var.b && this.c == op8Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}
