package com.daaw;

import android.net.Uri;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class s08 {

    /* renamed from: a */
    public final cd1 f25755a;

    public s08(cd1 cd1Var) {
        this.f25755a = cd1Var;
    }

    @Nullable
    /* renamed from: a */
    public final String m10800a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            cd1 cd1Var = (cd1) this.f25755a.get(uri.toString());
            if (cd1Var == null) {
                return null;
            }
            return (String) cd1Var.get("".concat(String.valueOf(str3)));
        }
        return null;
    }
}
