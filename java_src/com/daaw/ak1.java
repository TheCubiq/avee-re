package com.daaw;

import android.os.AsyncTask;
import com.daaw.ir1;
/* loaded from: classes.dex */
public class ak1<Result> {
    public String a = null;
    public me0<Result> b = null;

    /* loaded from: classes.dex */
    public class a implements ir1.b<Result> {
        public final /* synthetic */ ir1.b a;

        public a(ir1.b bVar) {
            this.a = bVar;
        }

        @Override // com.daaw.ir1.b
        public void a(Result result, boolean z) {
            ak1.this.b = null;
            ak1.this.a = null;
            this.a.a(result, z);
        }
    }

    public void a() {
        me0<Result> me0Var = this.b;
        if (me0Var != null) {
            me0Var.cancel(true);
        }
        this.b = null;
        this.a = null;
    }

    public void b(String str, me0<Result> me0Var, ir1.b<Result> bVar) {
        a();
        this.b = me0Var;
        this.a = str;
        me0Var.a(new a(bVar));
    }

    public boolean e(String str) {
        me0<Result> me0Var;
        return br1.h(this.a, str) && (me0Var = this.b) != null && me0Var.getStatus() == AsyncTask.Status.RUNNING;
    }
}
