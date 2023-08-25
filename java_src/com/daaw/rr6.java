package com.daaw;

import android.os.AsyncTask;
/* loaded from: classes.dex */
public abstract class rr6 extends AsyncTask {
    public sr6 a;
    public final jr6 b;

    public rr6(jr6 jr6Var, byte[] bArr) {
        this.b = jr6Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        sr6 sr6Var = this.a;
        if (sr6Var != null) {
            sr6Var.a(this);
        }
    }

    public final void b(sr6 sr6Var) {
        this.a = sr6Var;
    }
}
