package com.daaw;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class ef7 implements gf7 {
    public final String a;
    public final dq7 b;
    public final yq7 c;
    public final mm7 d;
    public final zn7 e;
    @Nullable
    public final Integer f;

    public ef7(String str, yq7 yq7Var, mm7 mm7Var, zn7 zn7Var, @Nullable Integer num) {
        this.a = str;
        this.b = pf7.a(str);
        this.c = yq7Var;
        this.d = mm7Var;
        this.e = zn7Var;
        this.f = num;
    }

    public static ef7 a(String str, yq7 yq7Var, mm7 mm7Var, zn7 zn7Var, @Nullable Integer num) {
        if (zn7Var == zn7.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ef7(str, yq7Var, mm7Var, zn7Var, num);
    }

    public final mm7 b() {
        return this.d;
    }

    public final zn7 c() {
        return this.e;
    }

    public final yq7 d() {
        return this.c;
    }

    @Nullable
    public final Integer e() {
        return this.f;
    }

    public final String f() {
        return this.a;
    }

    @Override // com.daaw.gf7
    public final dq7 zzd() {
        return this.b;
    }
}
