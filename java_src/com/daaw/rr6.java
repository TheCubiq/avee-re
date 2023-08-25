package com.daaw;

import android.os.AsyncTask;
/* loaded from: classes.dex */
public abstract class rr6 extends AsyncTask {

    /* renamed from: a */
    public sr6 f25541a;

    /* renamed from: b */
    public final jr6 f25542b;

    public rr6(jr6 jr6Var, byte[] bArr) {
        this.f25542b = jr6Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        sr6 sr6Var = this.f25541a;
        if (sr6Var != null) {
            sr6Var.m9937a(this);
        }
    }

    /* renamed from: b */
    public final void m11046b(sr6 sr6Var) {
        this.f25541a = sr6Var;
    }
}
