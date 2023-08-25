package com.daaw;
/* loaded from: classes2.dex */
public class eq0 implements ef1 {

    /* renamed from: a */
    public final int f8674a;

    /* renamed from: b */
    public final ef1[] f8675b;

    /* renamed from: c */
    public final fq0 f8676c;

    public eq0(int i, ef1... ef1VarArr) {
        this.f8674a = i;
        this.f8675b = ef1VarArr;
        this.f8676c = new fq0(i);
    }

    @Override // com.daaw.ef1
    /* renamed from: a */
    public StackTraceElement[] mo9614a(StackTraceElement[] stackTraceElementArr) {
        ef1[] ef1VarArr;
        if (stackTraceElementArr.length <= this.f8674a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (ef1 ef1Var : this.f8675b) {
            if (stackTraceElementArr2.length <= this.f8674a) {
                break;
            }
            stackTraceElementArr2 = ef1Var.mo9614a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f8674a ? this.f8676c.mo9614a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
