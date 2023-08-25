package com.daaw;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class td1 {

    /* renamed from: f */
    public static sw1<Boolean, Integer, Boolean> f27493f = new sw1<>();

    /* renamed from: g */
    public static pw1 f27494g = new pw1();

    /* renamed from: h */
    public static final Object f27495h = new Object();

    /* renamed from: i */
    public static td1 f27496i = null;

    /* renamed from: a */
    public boolean f27497a = false;

    /* renamed from: b */
    public int f27498b = 0;

    /* renamed from: c */
    public Date f27499c = new Date();

    /* renamed from: d */
    public boolean f27500d = false;

    /* renamed from: e */
    public Timer f27501e = null;

    /* renamed from: com.daaw.td1$a */
    /* loaded from: classes.dex */
    public class C3058a extends TimerTask {
        public C3058a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            td1.this.m9288d();
        }
    }

    public td1() {
        f27493f.m9795a(Boolean.valueOf(this.f27497a), Integer.valueOf(this.f27498b), Boolean.valueOf(this.f27500d));
    }

    /* renamed from: c */
    public static td1 m9289c() {
        td1 td1Var;
        td1 td1Var2 = f27496i;
        if (td1Var2 != null) {
            return td1Var2;
        }
        synchronized (f27495h) {
            if (f27496i == null) {
                f27496i = new td1();
            }
            td1Var = f27496i;
        }
        return td1Var;
    }

    /* renamed from: b */
    public void m9290b(boolean z, int i, Date date, boolean z2) {
        if (i < 0) {
            z = false;
        }
        this.f27497a = z;
        this.f27498b = i;
        this.f27499c = date;
        this.f27500d = z2;
        if (z) {
            Timer timer = this.f27501e;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            this.f27501e = timer2;
            timer2.schedule(new C3058a(), date);
        } else {
            Timer timer3 = this.f27501e;
            if (timer3 != null) {
                timer3.cancel();
            }
            this.f27501e = null;
        }
        f27493f.m9795a(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
    }

    /* renamed from: d */
    public final void m9288d() {
        m9290b(false, this.f27498b, this.f27499c, this.f27500d);
        f27494g.m12990a();
    }

    /* renamed from: e */
    public ud1 m9287e() {
        ud1 ud1Var = new ud1();
        ud1Var.f28893a = this.f27497a;
        ud1Var.f28894b = this.f27498b;
        ud1Var.f28895c = this.f27500d;
        return ud1Var;
    }

    /* renamed from: f */
    public int m9286f() {
        return ((int) (this.f27499c.getTime() - new Date().getTime())) / 1000;
    }

    /* renamed from: g */
    public Date m9285g() {
        return this.f27499c;
    }
}
