package com.daaw;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class iy6 {

    /* renamed from: a */
    public final String f14118a;

    /* renamed from: b */
    public final hy6 f14119b;

    /* renamed from: c */
    public hy6 f14120c;

    public /* synthetic */ iy6(String str, gy6 gy6Var) {
        hy6 hy6Var = new hy6(null);
        this.f14119b = hy6Var;
        this.f14120c = hy6Var;
        Objects.requireNonNull(str);
        this.f14118a = str;
    }

    /* renamed from: a */
    public final iy6 m19259a(@CheckForNull Object obj) {
        hy6 hy6Var = new hy6(null);
        this.f14120c.f13062b = hy6Var;
        this.f14120c = hy6Var;
        hy6Var.f13061a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f14118a);
        sb.append('{');
        hy6 hy6Var = this.f14119b.f13062b;
        String str = "";
        while (hy6Var != null) {
            Object obj = hy6Var.f13061a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            hy6Var = hy6Var.f13062b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
