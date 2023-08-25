package com.daaw;
/* loaded from: classes2.dex */
public final class xr3 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ rj1 f32896p;

    /* renamed from: q */
    public final /* synthetic */ wk4 f32897q;

    public xr3(wk4 wk4Var, rj1 rj1Var) {
        this.f32897q = wk4Var;
        this.f32896p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw8 dw8Var;
        dw8 dw8Var2;
        dw8 dw8Var3;
        InterfaceC1587hl interfaceC1587hl;
        dw8 dw8Var4;
        dw8 dw8Var5;
        if (this.f32896p.mo11238l()) {
            dw8Var5 = this.f32897q.f31297c;
            dw8Var5.m23854s();
            return;
        }
        try {
            interfaceC1587hl = this.f32897q.f31296b;
            Object mo2139a = interfaceC1587hl.mo2139a(this.f32896p);
            dw8Var4 = this.f32897q.f31297c;
            dw8Var4.m23855r(mo2139a);
        } catch (n61 e) {
            if (e.getCause() instanceof Exception) {
                dw8Var3 = this.f32897q.f31297c;
                dw8Var3.m23856q((Exception) e.getCause());
                return;
            }
            dw8Var2 = this.f32897q.f31297c;
            dw8Var2.m23856q(e);
        } catch (Exception e2) {
            dw8Var = this.f32897q.f31297c;
            dw8Var.m23856q(e2);
        }
    }
}
