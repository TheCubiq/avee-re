package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class tu2 {

    /* renamed from: a */
    public final String f28070a;

    /* renamed from: b */
    public final boolean f28071b;

    public tu2(String str, boolean z) {
        this.f28070a = str;
        this.f28071b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == tu2.class) {
            tu2 tu2Var = (tu2) obj;
            if (TextUtils.equals(this.f28070a, tu2Var.f28070a) && this.f28071b == tu2Var.f28071b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28070a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f28071b ? 1237 : 1231);
    }
}
