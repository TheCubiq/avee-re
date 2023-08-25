package com.daaw;

import java.io.File;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class jl2 implements au6 {

    /* renamed from: a */
    public final /* synthetic */ zr6 f15179a;

    public jl2(ll2 ll2Var, zr6 zr6Var) {
        this.f15179a = zr6Var;
    }

    @Override // com.daaw.au6
    /* renamed from: a */
    public final boolean mo18435a(File file) {
        try {
            return this.f15179a.m1962a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
