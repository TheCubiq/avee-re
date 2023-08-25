package com.daaw;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class vh7 {
    public final oh7 a;
    public final List b;
    @Nullable
    public final Integer c;

    public /* synthetic */ vh7(oh7 oh7Var, List list, Integer num, uh7 uh7Var) {
        this.a = oh7Var;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vh7) {
            vh7 vh7Var = (vh7) obj;
            if (this.a.equals(vh7Var.a) && this.b.equals(vh7Var.b)) {
                Integer num = this.c;
                Integer num2 = vh7Var.c;
                if (num == num2) {
                    return true;
                }
                if (num != null && num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
