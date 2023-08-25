package com.daaw;

import android.content.Context;
import com.daaw.InterfaceC3255ut;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class k70 {

    /* renamed from: a */
    public final Context f15728a;

    /* renamed from: b */
    public C1336fx f15729b;

    /* renamed from: c */
    public InterfaceC0832bc f15730c;

    /* renamed from: d */
    public ep0 f15731d;

    /* renamed from: e */
    public ExecutorService f15732e;

    /* renamed from: f */
    public ExecutorService f15733f;

    /* renamed from: g */
    public EnumC0988cq f15734g;

    /* renamed from: h */
    public InterfaceC3255ut.InterfaceC3256a f15735h;

    public k70(Context context) {
        this.f15728a = context.getApplicationContext();
    }

    /* renamed from: a */
    public e70 m18009a() {
        if (this.f15732e == null) {
            this.f15732e = new r00(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f15733f == null) {
            this.f15733f = new r00(1);
        }
        fp0 fp0Var = new fp0(this.f15728a);
        if (this.f15730c == null) {
            this.f15730c = new ul0(fp0Var.m22432a());
        }
        if (this.f15731d == null) {
            this.f15731d = new yl0(fp0Var.m22430c());
        }
        if (this.f15735h == null) {
            this.f15735h = new rg0(this.f15728a);
        }
        if (this.f15729b == null) {
            this.f15729b = new C1336fx(this.f15731d, this.f15735h, this.f15733f, this.f15732e);
        }
        if (this.f15734g == null) {
            this.f15734g = EnumC0988cq.f6073s;
        }
        return new e70(this.f15729b, this.f15731d, this.f15730c, this.f15728a, this.f15734g);
    }
}
