package com.daaw;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class rh7 {
    @Nullable
    public ArrayList a = new ArrayList();
    public oh7 b = oh7.b;
    @Nullable
    public Integer c = null;

    public final rh7 a(v87 v87Var, int i, l97 l97Var) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            arrayList.add(new th7(v87Var, i, l97Var, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final rh7 b(oh7 oh7Var) {
        if (this.a != null) {
            this.b = oh7Var;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final rh7 c(int i) {
        if (this.a != null) {
            this.c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final vh7 d() {
        if (this.a != null) {
            Integer num = this.c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((th7) arrayList.get(i)).a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            vh7 vh7Var = new vh7(this.b, Collections.unmodifiableList(this.a), this.c, null);
            this.a = null;
            return vh7Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
