package com.daaw;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class rh7 {
    @Nullable

    /* renamed from: a */
    public ArrayList f25301a = new ArrayList();

    /* renamed from: b */
    public oh7 f25302b = oh7.f21564b;
    @Nullable

    /* renamed from: c */
    public Integer f25303c = null;

    /* renamed from: a */
    public final rh7 m11304a(v87 v87Var, int i, l97 l97Var) {
        ArrayList arrayList = this.f25301a;
        if (arrayList != null) {
            arrayList.add(new th7(v87Var, i, l97Var, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final rh7 m11303b(oh7 oh7Var) {
        if (this.f25301a != null) {
            this.f25302b = oh7Var;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final rh7 m11302c(int i) {
        if (this.f25301a != null) {
            this.f25303c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final vh7 m11301d() {
        if (this.f25301a != null) {
            Integer num = this.f25303c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f25301a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((th7) arrayList.get(i)).m9108a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            vh7 vh7Var = new vh7(this.f25302b, Collections.unmodifiableList(this.f25301a), this.f25303c, null);
            this.f25301a = null;
            return vh7Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
