package com.daaw;

import java.io.File;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class jl2 implements au6 {
    public final /* synthetic */ zr6 a;

    public jl2(ll2 ll2Var, zr6 zr6Var) {
        this.a = zr6Var;
    }

    @Override // com.daaw.au6
    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
