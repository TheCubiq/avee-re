package com.daaw;

import android.net.Uri;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class qv2 {

    /* renamed from: a */
    public final ns2[] f24517a;

    /* renamed from: b */
    public final os2 f24518b;

    /* renamed from: c */
    public ns2 f24519c;

    public qv2(ns2[] ns2VarArr, os2 os2Var) {
        this.f24517a = ns2VarArr;
        this.f24518b = os2Var;
    }

    /* renamed from: a */
    public final void m12033a() {
        if (this.f24519c != null) {
            this.f24519c = null;
        }
    }

    /* renamed from: b */
    public final ns2 m12032b(ms2 ms2Var, Uri uri) {
        ns2 ns2Var = this.f24519c;
        if (ns2Var != null) {
            return ns2Var;
        }
        ns2[] ns2VarArr = this.f24517a;
        int length = ns2VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ns2 ns2Var2 = ns2VarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                ms2Var.m15800e();
                throw th;
            }
            if (ns2Var2.mo1914b(ms2Var)) {
                this.f24519c = ns2Var2;
                ms2Var.m15800e();
                break;
            }
            continue;
            ms2Var.m15800e();
            i++;
        }
        ns2 ns2Var3 = this.f24519c;
        if (ns2Var3 != null) {
            ns2Var3.mo1913c(this.f24518b);
            return this.f24519c;
        }
        String m12839k = pz2.m12839k(this.f24517a);
        throw new sw2("None of the available extractors (" + m12839k + ") could read the stream.", uri);
    }
}
