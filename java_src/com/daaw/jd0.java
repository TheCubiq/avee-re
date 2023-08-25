package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class jd0 {

    /* renamed from: a */
    public String f14999a;

    /* renamed from: b */
    public ArrayList<id0> f15000b = new ArrayList<>();

    public jd0(String str) {
        this.f14999a = str;
    }

    /* renamed from: a */
    public void m18603a(id0 id0Var) {
        this.f15000b.add(id0Var);
    }

    /* renamed from: b */
    public void m18602b() {
        this.f15000b.clear();
    }

    /* renamed from: c */
    public List<id0> m18601c() {
        return this.f15000b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jd0 jd0Var = (jd0) obj;
            ArrayList<id0> arrayList = this.f15000b;
            if (arrayList == null) {
                if (jd0Var.f15000b != null) {
                    return false;
                }
            } else if (!arrayList.equals(jd0Var.f15000b)) {
                return false;
            }
            String str = this.f14999a;
            String str2 = jd0Var.f14999a;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        ArrayList<id0> arrayList = this.f15000b;
        int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        String str = this.f14999a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return this.f14999a + ": " + this.f15000b.size();
    }
}
