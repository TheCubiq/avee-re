package com.daaw;
/* loaded from: classes2.dex */
public class eq0 implements ef1 {
    public final int a;
    public final ef1[] b;
    public final fq0 c;

    public eq0(int i, ef1... ef1VarArr) {
        this.a = i;
        this.b = ef1VarArr;
        this.c = new fq0(i);
    }

    @Override // com.daaw.ef1
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        ef1[] ef1VarArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (ef1 ef1Var : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = ef1Var.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
