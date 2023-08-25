package com.daaw;
/* loaded from: classes.dex */
public final class fo2 extends no2 {

    /* renamed from: i */
    public final StackTraceElement[] f9738i;

    public fo2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(wm2Var, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", hi2Var, i, 45);
        this.f9738i = stackTraceElementArr;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        StackTraceElement[] stackTraceElementArr = this.f9738i;
        if (stackTraceElementArr != null) {
            om2 om2Var = new om2((String) this.f20529f.invoke(null, stackTraceElementArr));
            synchronized (this.f20528e) {
                this.f20528e.m20737x(om2Var.f21654a.longValue());
                if (om2Var.f21655b.booleanValue()) {
                    this.f20528e.m20770V(true != om2Var.f21656c.booleanValue() ? 2 : 1);
                } else {
                    this.f20528e.m20770V(3);
                }
            }
        }
    }
}
