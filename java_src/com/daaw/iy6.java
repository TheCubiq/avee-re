package com.daaw;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class iy6 {
    public final String a;
    public final hy6 b;
    public hy6 c;

    public /* synthetic */ iy6(String str, gy6 gy6Var) {
        hy6 hy6Var = new hy6(null);
        this.b = hy6Var;
        this.c = hy6Var;
        Objects.requireNonNull(str);
        this.a = str;
    }

    public final iy6 a(@CheckForNull Object obj) {
        hy6 hy6Var = new hy6(null);
        this.c.b = hy6Var;
        this.c = hy6Var;
        hy6Var.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        hy6 hy6Var = this.b.b;
        String str = "";
        while (hy6Var != null) {
            Object obj = hy6Var.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            hy6Var = hy6Var.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
