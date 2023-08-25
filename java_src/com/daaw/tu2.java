package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class tu2 {
    public final String a;
    public final boolean b;

    public tu2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == tu2.class) {
            tu2 tu2Var = (tu2) obj;
            if (TextUtils.equals(this.a, tu2Var.a) && this.b == tu2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.b ? 1237 : 1231);
    }
}
