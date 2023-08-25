package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public class bb0 extends qj implements za0 {
    public qj[] w0 = new qj[4];
    public int x0 = 0;

    @Override // com.daaw.za0
    public void a() {
        this.x0 = 0;
        Arrays.fill(this.w0, (Object) null);
    }

    @Override // com.daaw.za0
    public void b(rj rjVar) {
    }

    @Override // com.daaw.za0
    public void c(qj qjVar) {
        if (qjVar == this || qjVar == null) {
            return;
        }
        int i = this.x0 + 1;
        qj[] qjVarArr = this.w0;
        if (i > qjVarArr.length) {
            this.w0 = (qj[]) Arrays.copyOf(qjVarArr, qjVarArr.length * 2);
        }
        qj[] qjVarArr2 = this.w0;
        int i2 = this.x0;
        qjVarArr2[i2] = qjVar;
        this.x0 = i2 + 1;
    }
}
