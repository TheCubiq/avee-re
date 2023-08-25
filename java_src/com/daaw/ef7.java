package com.daaw;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class ef7 implements gf7 {

    /* renamed from: a */
    public final String f8446a;

    /* renamed from: b */
    public final dq7 f8447b;

    /* renamed from: c */
    public final yq7 f8448c;

    /* renamed from: d */
    public final mm7 f8449d;

    /* renamed from: e */
    public final zn7 f8450e;
    @Nullable

    /* renamed from: f */
    public final Integer f8451f;

    public ef7(String str, yq7 yq7Var, mm7 mm7Var, zn7 zn7Var, @Nullable Integer num) {
        this.f8446a = str;
        this.f8447b = pf7.m13405a(str);
        this.f8448c = yq7Var;
        this.f8449d = mm7Var;
        this.f8450e = zn7Var;
        this.f8451f = num;
    }

    /* renamed from: a */
    public static ef7 m23500a(String str, yq7 yq7Var, mm7 mm7Var, zn7 zn7Var, @Nullable Integer num) {
        if (zn7Var == zn7.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ef7(str, yq7Var, mm7Var, zn7Var, num);
    }

    /* renamed from: b */
    public final mm7 m23499b() {
        return this.f8449d;
    }

    /* renamed from: c */
    public final zn7 m23498c() {
        return this.f8450e;
    }

    /* renamed from: d */
    public final yq7 m23497d() {
        return this.f8448c;
    }

    @Nullable
    /* renamed from: e */
    public final Integer m23496e() {
        return this.f8451f;
    }

    /* renamed from: f */
    public final String m23495f() {
        return this.f8446a;
    }

    @Override // com.daaw.gf7
    public final dq7 zzd() {
        return this.f8447b;
    }
}
