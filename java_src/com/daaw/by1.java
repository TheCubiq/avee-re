package com.daaw;

import com.daaw.ri1;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class by1 {

    /* renamed from: a */
    public final Executor f5270a;

    /* renamed from: b */
    public final InterfaceC2134ly f5271b;

    /* renamed from: c */
    public final py1 f5272c;

    /* renamed from: d */
    public final ri1 f5273d;

    public by1(Executor executor, InterfaceC2134ly interfaceC2134ly, py1 py1Var, ri1 ri1Var) {
        this.f5270a = executor;
        this.f5271b = interfaceC2134ly;
        this.f5272c = py1Var;
        this.f5273d = ri1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m25736d() {
        for (sn1 sn1Var : this.f5271b.mo11621o()) {
            this.f5272c.mo7556a(sn1Var, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m25735e() {
        this.f5273d.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.zx1
            @Override // com.daaw.ri1.InterfaceC2864a
            /* renamed from: a */
            public final Object mo1807a() {
                Object m25736d;
                m25736d = by1.this.m25736d();
                return m25736d;
            }
        });
    }

    /* renamed from: c */
    public void m25737c() {
        this.f5270a.execute(new Runnable() { // from class: com.daaw.ay1
            @Override // java.lang.Runnable
            public final void run() {
                by1.this.m25735e();
            }
        });
    }
}
