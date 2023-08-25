package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class jd0 {
    public String a;
    public ArrayList<id0> b = new ArrayList<>();

    public jd0(String str) {
        this.a = str;
    }

    public void a(id0 id0Var) {
        this.b.add(id0Var);
    }

    public void b() {
        this.b.clear();
    }

    public List<id0> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jd0 jd0Var = (jd0) obj;
            ArrayList<id0> arrayList = this.b;
            if (arrayList == null) {
                if (jd0Var.b != null) {
                    return false;
                }
            } else if (!arrayList.equals(jd0Var.b)) {
                return false;
            }
            String str = this.a;
            String str2 = jd0Var.a;
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
        ArrayList<id0> arrayList = this.b;
        int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return this.a + ": " + this.b.size();
    }
}
