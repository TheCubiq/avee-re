package com.daaw;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class td1 {
    public static sw1<Boolean, Integer, Boolean> f = new sw1<>();
    public static pw1 g = new pw1();
    public static final Object h = new Object();
    public static td1 i = null;
    public boolean a = false;
    public int b = 0;
    public Date c = new Date();
    public boolean d = false;
    public Timer e = null;

    /* loaded from: classes.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            td1.this.d();
        }
    }

    public td1() {
        f.a(Boolean.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.d));
    }

    public static td1 c() {
        td1 td1Var;
        td1 td1Var2 = i;
        if (td1Var2 != null) {
            return td1Var2;
        }
        synchronized (h) {
            if (i == null) {
                i = new td1();
            }
            td1Var = i;
        }
        return td1Var;
    }

    public void b(boolean z, int i2, Date date, boolean z2) {
        if (i2 < 0) {
            z = false;
        }
        this.a = z;
        this.b = i2;
        this.c = date;
        this.d = z2;
        if (z) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            this.e = timer2;
            timer2.schedule(new a(), date);
        } else {
            Timer timer3 = this.e;
            if (timer3 != null) {
                timer3.cancel();
            }
            this.e = null;
        }
        f.a(Boolean.valueOf(z), Integer.valueOf(i2), Boolean.valueOf(z2));
    }

    public final void d() {
        b(false, this.b, this.c, this.d);
        g.a();
    }

    public ud1 e() {
        ud1 ud1Var = new ud1();
        ud1Var.a = this.a;
        ud1Var.b = this.b;
        ud1Var.c = this.d;
        return ud1Var;
    }

    public int f() {
        return ((int) (this.c.getTime() - new Date().getTime())) / 1000;
    }

    public Date g() {
        return this.c;
    }
}
