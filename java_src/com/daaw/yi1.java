package com.daaw;
/* loaded from: classes.dex */
public class yi1 {
    public final String a;
    public final int b;

    public yi1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi1) {
            yi1 yi1Var = (yi1) obj;
            if (this.b != yi1Var.b) {
                return false;
            }
            return this.a.equals(yi1Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
