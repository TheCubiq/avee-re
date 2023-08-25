package com.daaw;
/* loaded from: classes.dex */
public final class au8 {
    public static final au8 d = new au8(new r84[0]);
    public static final th8 e = new th8() { // from class: com.daaw.zt8
    };
    public final int a;
    public final y17 b;
    public int c;

    public au8(r84... r84VarArr) {
        this.b = y17.t(r84VarArr);
        this.a = r84VarArr.length;
        int i = 0;
        while (i < this.b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.b.size(); i3++) {
                if (((r84) this.b.get(i)).equals(this.b.get(i3))) {
                    s95.c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final int a(r84 r84Var) {
        int indexOf = this.b.indexOf(r84Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final r84 b(int i) {
        return (r84) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && au8.class == obj.getClass()) {
            au8 au8Var = (au8) obj;
            if (this.a == au8Var.a && this.b.equals(au8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }
}
