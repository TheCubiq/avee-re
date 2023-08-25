package com.daaw;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class r32 {

    /* renamed from: a */
    public final SparseBooleanArray f24806a;

    /* renamed from: a */
    public final int m11807a(int i) {
        uo4.m7877a(i, 0, this.f24806a.size());
        return this.f24806a.keyAt(i);
    }

    /* renamed from: b */
    public final int m11806b() {
        return this.f24806a.size();
    }

    /* renamed from: c */
    public final boolean m11805c(int i) {
        return this.f24806a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r32) {
            r32 r32Var = (r32) obj;
            if (it5.f13991a < 24) {
                if (this.f24806a.size() == r32Var.f24806a.size()) {
                    for (int i = 0; i < this.f24806a.size(); i++) {
                        if (m11807a(i) != r32Var.m11807a(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.f24806a.equals(r32Var.f24806a);
        }
        return false;
    }

    public final int hashCode() {
        if (it5.f13991a < 24) {
            int size = this.f24806a.size();
            for (int i = 0; i < this.f24806a.size(); i++) {
                size = (size * 31) + m11807a(i);
            }
            return size;
        }
        return this.f24806a.hashCode();
    }
}
