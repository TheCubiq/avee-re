package com.daaw;
/* loaded from: classes.dex */
public final class au8 {

    /* renamed from: d */
    public static final au8 f3666d = new au8(new r84[0]);

    /* renamed from: e */
    public static final th8 f3667e = new th8() { // from class: com.daaw.zt8
    };

    /* renamed from: a */
    public final int f3668a;

    /* renamed from: b */
    public final y17 f3669b;

    /* renamed from: c */
    public int f3670c;

    public au8(r84... r84VarArr) {
        this.f3669b = y17.m4261t(r84VarArr);
        this.f3668a = r84VarArr.length;
        int i = 0;
        while (i < this.f3669b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f3669b.size(); i3++) {
                if (((r84) this.f3669b.get(i)).equals(this.f3669b.get(i3))) {
                    s95.m10495c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final int m26966a(r84 r84Var) {
        int indexOf = this.f3669b.indexOf(r84Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: b */
    public final r84 m26965b(int i) {
        return (r84) this.f3669b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && au8.class == obj.getClass()) {
            au8 au8Var = (au8) obj;
            if (this.f3668a == au8Var.f3668a && this.f3669b.equals(au8Var.f3669b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3670c;
        if (i == 0) {
            int hashCode = this.f3669b.hashCode();
            this.f3670c = hashCode;
            return hashCode;
        }
        return i;
    }
}
