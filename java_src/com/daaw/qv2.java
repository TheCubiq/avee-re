package com.daaw;

import android.net.Uri;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class qv2 {
    public final ns2[] a;
    public final os2 b;
    public ns2 c;

    public qv2(ns2[] ns2VarArr, os2 os2Var) {
        this.a = ns2VarArr;
        this.b = os2Var;
    }

    public final void a() {
        if (this.c != null) {
            this.c = null;
        }
    }

    public final ns2 b(ms2 ms2Var, Uri uri) {
        ns2 ns2Var = this.c;
        if (ns2Var != null) {
            return ns2Var;
        }
        ns2[] ns2VarArr = this.a;
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
                ms2Var.e();
                throw th;
            }
            if (ns2Var2.b(ms2Var)) {
                this.c = ns2Var2;
                ms2Var.e();
                break;
            }
            continue;
            ms2Var.e();
            i++;
        }
        ns2 ns2Var3 = this.c;
        if (ns2Var3 != null) {
            ns2Var3.c(this.b);
            return this.c;
        }
        String k = pz2.k(this.a);
        throw new sw2("None of the available extractors (" + k + ") could read the stream.", uri);
    }
}
