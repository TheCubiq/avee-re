package com.daaw;
/* loaded from: classes.dex */
public class yi1 {

    /* renamed from: a */
    public final String f33687a;

    /* renamed from: b */
    public final int f33688b;

    public yi1(String str, int i) {
        this.f33687a = str;
        this.f33688b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi1) {
            yi1 yi1Var = (yi1) obj;
            if (this.f33688b != yi1Var.f33688b) {
                return false;
            }
            return this.f33687a.equals(yi1Var.f33687a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33687a.hashCode() * 31) + this.f33688b;
    }
}
