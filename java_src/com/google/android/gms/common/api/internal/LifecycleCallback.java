package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.daaw.cl4;
import com.daaw.ky2;
import com.daaw.nj0;
import com.daaw.pj0;
import com.daaw.ry0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class LifecycleCallback {
    public final pj0 p;

    public LifecycleCallback(pj0 pj0Var) {
        this.p = pj0Var;
    }

    public static pj0 c(Activity activity) {
        return d(new nj0(activity));
    }

    public static pj0 d(nj0 nj0Var) {
        if (nj0Var.d()) {
            return cl4.I1(nj0Var.b());
        }
        if (nj0Var.c()) {
            return ky2.d(nj0Var.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static pj0 getChimeraLifecycleFragmentImpl(nj0 nj0Var) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity f = this.p.f();
        ry0.j(f);
        return f;
    }

    public void e(int i, int i2, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
