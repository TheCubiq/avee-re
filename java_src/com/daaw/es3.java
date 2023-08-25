package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class es3 {
    public Object a;
    public boolean b = false;
    public final /* synthetic */ pa c;

    public es3(pa paVar, Object obj) {
        this.c = paVar;
        this.a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.a;
            if (this.b) {
                String obj2 = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Callback proxy ");
                sb.append(obj2);
                sb.append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.c.r;
        synchronized (arrayList) {
            arrayList2 = this.c.r;
            arrayList2.remove(this);
        }
    }
}
