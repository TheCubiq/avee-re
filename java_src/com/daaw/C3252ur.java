package com.daaw;

import com.daaw.ri1;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* renamed from: com.daaw.ur */
/* loaded from: classes.dex */
public class C3252ur implements q81 {

    /* renamed from: f */
    public static final Logger f29456f = Logger.getLogger(xn1.class.getName());

    /* renamed from: a */
    public final py1 f29457a;

    /* renamed from: b */
    public final Executor f29458b;

    /* renamed from: c */
    public final InterfaceC0828ba f29459c;

    /* renamed from: d */
    public final InterfaceC2134ly f29460d;

    /* renamed from: e */
    public final ri1 f29461e;

    public C3252ur(Executor executor, InterfaceC0828ba interfaceC0828ba, py1 py1Var, InterfaceC2134ly interfaceC2134ly, ri1 ri1Var) {
        this.f29458b = executor;
        this.f29459c = interfaceC0828ba;
        this.f29457a = py1Var;
        this.f29460d = interfaceC2134ly;
        this.f29461e = ri1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m7795d(sn1 sn1Var, AbstractC0896by abstractC0896by) {
        this.f29460d.mo11612v(sn1Var, abstractC0896by);
        this.f29457a.mo7556a(sn1Var, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m7794e(final sn1 sn1Var, ao1 ao1Var, AbstractC0896by abstractC0896by) {
        try {
            rn1 mo13246a = this.f29459c.mo13246a(sn1Var.mo6336b());
            if (mo13246a == null) {
                String format = String.format("Transport backend '%s' is not registered", sn1Var.mo6336b());
                f29456f.warning(format);
                ao1Var.mo21970a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC0896by mo11155b = mo13246a.mo11155b(abstractC0896by);
            this.f29461e.mo11287q(new ri1.InterfaceC2864a() { // from class: com.daaw.rr
                @Override // com.daaw.ri1.InterfaceC2864a
                /* renamed from: a */
                public final Object mo1807a() {
                    Object m7795d;
                    m7795d = C3252ur.this.m7795d(sn1Var, mo11155b);
                    return m7795d;
                }
            });
            ao1Var.mo21970a(null);
        } catch (Exception e) {
            Logger logger = f29456f;
            logger.warning("Error scheduling event " + e.getMessage());
            ao1Var.mo21970a(e);
        }
    }

    @Override // com.daaw.q81
    /* renamed from: a */
    public void mo7798a(final sn1 sn1Var, final AbstractC0896by abstractC0896by, final ao1 ao1Var) {
        this.f29458b.execute(new Runnable() { // from class: com.daaw.sr
            @Override // java.lang.Runnable
            public final void run() {
                C3252ur.this.m7794e(sn1Var, ao1Var, abstractC0896by);
            }
        });
    }
}
