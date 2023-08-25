package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class es3 {

    /* renamed from: a */
    public Object f8729a;

    /* renamed from: b */
    public boolean f8730b = false;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2527pa f8731c;

    public es3(AbstractC2527pa abstractC2527pa, Object obj) {
        this.f8731c = abstractC2527pa;
        this.f8729a = obj;
    }

    /* renamed from: a */
    public abstract void mo16239a(Object obj);

    /* renamed from: b */
    public abstract void mo16238b();

    /* renamed from: c */
    public final void m23234c() {
        Object obj;
        synchronized (this) {
            obj = this.f8729a;
            if (this.f8730b) {
                String obj2 = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Callback proxy ");
                sb.append(obj2);
                sb.append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo16239a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f8730b = true;
        }
        m23232e();
    }

    /* renamed from: d */
    public final void m23233d() {
        synchronized (this) {
            this.f8729a = null;
        }
    }

    /* renamed from: e */
    public final void m23232e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m23233d();
        arrayList = this.f8731c.f22753r;
        synchronized (arrayList) {
            arrayList2 = this.f8731c.f22753r;
            arrayList2.remove(this);
        }
    }
}
