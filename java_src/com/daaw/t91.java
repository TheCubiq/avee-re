package com.daaw;

import android.os.AsyncTask;
/* loaded from: classes.dex */
public class t91 {
    public static rw1<Integer, String> c = new rw1<>();
    public int a = -1;
    public AsyncTask b = null;

    public void a(boolean z) {
        AsyncTask asyncTask = this.b;
        if (asyncTask == null) {
            return;
        }
        int i = this.a;
        q6.f(asyncTask);
        this.b.cancel(false);
        this.b = null;
        this.a = -1;
        if (z) {
            return;
        }
        c.a(Integer.valueOf(i), "");
    }

    public void b(int i) {
        if (this.a == i) {
            a(true);
        }
    }

    public boolean c(AsyncTask asyncTask, int i) {
        return this.a == i && this.b != null && !asyncTask.isCancelled() && asyncTask == this.b;
    }

    public void d(AsyncTask asyncTask, int i) {
        a(this.a == i);
        this.a = i;
        this.b = asyncTask;
    }
}
