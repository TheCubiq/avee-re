package com.daaw;
/* loaded from: classes.dex */
public final class fo2 extends no2 {
    public final StackTraceElement[] i;

    public fo2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(wm2Var, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", hi2Var, i, 45);
        this.i = stackTraceElementArr;
    }

    @Override // com.daaw.no2
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.i;
        if (stackTraceElementArr != null) {
            om2 om2Var = new om2((String) this.f.invoke(null, stackTraceElementArr));
            synchronized (this.e) {
                this.e.x(om2Var.a.longValue());
                if (om2Var.b.booleanValue()) {
                    this.e.V(true != om2Var.c.booleanValue() ? 2 : 1);
                } else {
                    this.e.V(3);
                }
            }
        }
    }
}
