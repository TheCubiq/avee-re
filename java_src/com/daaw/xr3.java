package com.daaw;
/* loaded from: classes2.dex */
public final class xr3 implements Runnable {
    public final /* synthetic */ rj1 p;
    public final /* synthetic */ wk4 q;

    public xr3(wk4 wk4Var, rj1 rj1Var) {
        this.q = wk4Var;
        this.p = rj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw8 dw8Var;
        dw8 dw8Var2;
        dw8 dw8Var3;
        hl hlVar;
        dw8 dw8Var4;
        dw8 dw8Var5;
        if (this.p.l()) {
            dw8Var5 = this.q.c;
            dw8Var5.s();
            return;
        }
        try {
            hlVar = this.q.b;
            Object a = hlVar.a(this.p);
            dw8Var4 = this.q.c;
            dw8Var4.r(a);
        } catch (n61 e) {
            if (e.getCause() instanceof Exception) {
                dw8Var3 = this.q.c;
                dw8Var3.q((Exception) e.getCause());
                return;
            }
            dw8Var2 = this.q.c;
            dw8Var2.q(e);
        } catch (Exception e2) {
            dw8Var = this.q.c;
            dw8Var.q(e2);
        }
    }
}
