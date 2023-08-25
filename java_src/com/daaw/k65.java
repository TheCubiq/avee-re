package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class k65 {
    public final xp4 a;
    public final vz4 b;
    public final e45 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public boolean g;

    public k65(Looper looper, xp4 xp4Var, e45 e45Var) {
        this(new CopyOnWriteArraySet(), looper, xp4Var, e45Var);
    }

    public k65(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xp4 xp4Var, e45 e45Var) {
        this.a = xp4Var;
        this.d = copyOnWriteArraySet;
        this.c = e45Var;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = xp4Var.a(looper, new Handler.Callback() { // from class: com.daaw.x05
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                k65.g(k65.this, message);
                return true;
            }
        });
    }

    public static /* synthetic */ boolean g(k65 k65Var, Message message) {
        Iterator it = k65Var.d.iterator();
        while (it.hasNext()) {
            ((h55) it.next()).b(k65Var.c);
            if (k65Var.b.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    public final k65 a(Looper looper, e45 e45Var) {
        return new k65(this.d, looper, this.a, e45Var);
    }

    public final void b(Object obj) {
        if (this.g) {
            return;
        }
        this.d.add(new h55(obj));
    }

    public final void c() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.zzf(0)) {
            vz4 vz4Var = this.b;
            vz4Var.d(vz4Var.a(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((Runnable) this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public final void d(final int i, final c35 c35Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.daaw.z15
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                c35 c35Var2 = c35Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((h55) it.next()).a(i2, c35Var2);
                }
            }
        });
    }

    public final void e() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((h55) it.next()).c(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    public final void f(Object obj) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            h55 h55Var = (h55) it.next();
            if (h55Var.a.equals(obj)) {
                h55Var.c(this.c);
                this.d.remove(h55Var);
            }
        }
    }
}
