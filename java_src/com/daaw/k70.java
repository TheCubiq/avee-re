package com.daaw;

import android.content.Context;
import com.daaw.ut;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class k70 {
    public final Context a;
    public fx b;
    public bc c;
    public ep0 d;
    public ExecutorService e;
    public ExecutorService f;
    public cq g;
    public ut.a h;

    public k70(Context context) {
        this.a = context.getApplicationContext();
    }

    public e70 a() {
        if (this.e == null) {
            this.e = new r00(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f == null) {
            this.f = new r00(1);
        }
        fp0 fp0Var = new fp0(this.a);
        if (this.c == null) {
            this.c = new ul0(fp0Var.a());
        }
        if (this.d == null) {
            this.d = new yl0(fp0Var.c());
        }
        if (this.h == null) {
            this.h = new rg0(this.a);
        }
        if (this.b == null) {
            this.b = new fx(this.d, this.h, this.f, this.e);
        }
        if (this.g == null) {
            this.g = cq.s;
        }
        return new e70(this.b, this.d, this.c, this.a, this.g);
    }
}
