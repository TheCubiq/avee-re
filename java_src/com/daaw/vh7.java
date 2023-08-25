package com.daaw;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class vh7 {

    /* renamed from: a */
    public final oh7 f30235a;

    /* renamed from: b */
    public final List f30236b;
    @Nullable

    /* renamed from: c */
    public final Integer f30237c;

    public /* synthetic */ vh7(oh7 oh7Var, List list, Integer num, uh7 uh7Var) {
        this.f30235a = oh7Var;
        this.f30236b = list;
        this.f30237c = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vh7) {
            vh7 vh7Var = (vh7) obj;
            if (this.f30235a.equals(vh7Var.f30235a) && this.f30236b.equals(vh7Var.f30236b)) {
                Integer num = this.f30237c;
                Integer num2 = vh7Var.f30237c;
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
        return Arrays.hashCode(new Object[]{this.f30235a, this.f30236b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f30235a, this.f30236b, this.f30237c);
    }
}
