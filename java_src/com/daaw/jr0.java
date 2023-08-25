package com.daaw;
/* loaded from: classes2.dex */
public class jr0 {
    public int a;

    public jr0(int i) {
        this.a = i;
    }

    public void a() {
        this.a++;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((jr0) obj).a;
    }

    public int hashCode() {
        return 31 + this.a;
    }
}
