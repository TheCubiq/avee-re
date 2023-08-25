package com.daaw;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class r32 {
    public final SparseBooleanArray a;

    public final int a(int i) {
        uo4.a(i, 0, this.a.size());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r32) {
            r32 r32Var = (r32) obj;
            if (it5.a < 24) {
                if (this.a.size() == r32Var.a.size()) {
                    for (int i = 0; i < this.a.size(); i++) {
                        if (a(i) != r32Var.a(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.a.equals(r32Var.a);
        }
        return false;
    }

    public final int hashCode() {
        if (it5.a < 24) {
            int size = this.a.size();
            for (int i = 0; i < this.a.size(); i++) {
                size = (size * 31) + a(i);
            }
            return size;
        }
        return this.a.hashCode();
    }
}
