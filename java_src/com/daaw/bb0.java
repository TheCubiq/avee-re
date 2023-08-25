package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public class bb0 extends C2716qj implements za0 {

    /* renamed from: w0 */
    public C2716qj[] f4590w0 = new C2716qj[4];

    /* renamed from: x0 */
    public int f4591x0 = 0;

    @Override // com.daaw.za0
    /* renamed from: a */
    public void mo2579a() {
        this.f4591x0 = 0;
        Arrays.fill(this.f4590w0, (Object) null);
    }

    @Override // com.daaw.za0
    /* renamed from: b */
    public void mo2578b(C2865rj c2865rj) {
    }

    @Override // com.daaw.za0
    /* renamed from: c */
    public void mo2577c(C2716qj c2716qj) {
        if (c2716qj == this || c2716qj == null) {
            return;
        }
        int i = this.f4591x0 + 1;
        C2716qj[] c2716qjArr = this.f4590w0;
        if (i > c2716qjArr.length) {
            this.f4590w0 = (C2716qj[]) Arrays.copyOf(c2716qjArr, c2716qjArr.length * 2);
        }
        C2716qj[] c2716qjArr2 = this.f4590w0;
        int i2 = this.f4591x0;
        c2716qjArr2[i2] = c2716qj;
        this.f4591x0 = i2 + 1;
    }
}
