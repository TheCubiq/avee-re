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

    /* renamed from: p */
    public final pj0 f36613p;

    public LifecycleCallback(pj0 pj0Var) {
        this.f36613p = pj0Var;
    }

    /* renamed from: c */
    public static pj0 m1181c(Activity activity) {
        return m1180d(new nj0(activity));
    }

    /* renamed from: d */
    public static pj0 m1180d(nj0 nj0Var) {
        if (nj0Var.m15151d()) {
            return cl4.m25246I1(nj0Var.m15153b());
        }
        if (nj0Var.m15152c()) {
            return ky2.m17348d(nj0Var.m15154a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static pj0 getChimeraLifecycleFragmentImpl(nj0 nj0Var) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m1183a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m1182b() {
        Activity mo13331f = this.f36613p.mo13331f();
        ry0.m10830j(mo13331f);
        return mo13331f;
    }

    /* renamed from: e */
    public void mo1179e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo1178f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m1177g() {
    }

    /* renamed from: h */
    public void mo1176h() {
    }

    /* renamed from: i */
    public void mo1175i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo1174j() {
    }

    /* renamed from: k */
    public void mo1173k() {
    }
}
