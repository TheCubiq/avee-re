package com.daaw;

import android.os.AsyncTask;
/* loaded from: classes.dex */
public class t91 {

    /* renamed from: c */
    public static rw1<Integer, String> f27136c = new rw1<>();

    /* renamed from: a */
    public int f27137a = -1;

    /* renamed from: b */
    public AsyncTask f27138b = null;

    /* renamed from: a */
    public void m9427a(boolean z) {
        AsyncTask asyncTask = this.f27138b;
        if (asyncTask == null) {
            return;
        }
        int i = this.f27137a;
        C2691q6.m12752f(asyncTask);
        this.f27138b.cancel(false);
        this.f27138b = null;
        this.f27137a = -1;
        if (z) {
            return;
        }
        f27136c.m10862a(Integer.valueOf(i), "");
    }

    /* renamed from: b */
    public void m9426b(int i) {
        if (this.f27137a == i) {
            m9427a(true);
        }
    }

    /* renamed from: c */
    public boolean m9425c(AsyncTask asyncTask, int i) {
        return this.f27137a == i && this.f27138b != null && !asyncTask.isCancelled() && asyncTask == this.f27138b;
    }

    /* renamed from: d */
    public void m9424d(AsyncTask asyncTask, int i) {
        m9427a(this.f27137a == i);
        this.f27137a = i;
        this.f27138b = asyncTask;
    }
}
