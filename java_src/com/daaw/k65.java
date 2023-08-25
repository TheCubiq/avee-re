package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class k65 {

    /* renamed from: a */
    public final xp4 f15708a;

    /* renamed from: b */
    public final vz4 f15709b;

    /* renamed from: c */
    public final e45 f15710c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f15711d;

    /* renamed from: e */
    public final ArrayDeque f15712e;

    /* renamed from: f */
    public final ArrayDeque f15713f;

    /* renamed from: g */
    public boolean f15714g;

    public k65(Looper looper, xp4 xp4Var, e45 e45Var) {
        this(new CopyOnWriteArraySet(), looper, xp4Var, e45Var);
    }

    public k65(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xp4 xp4Var, e45 e45Var) {
        this.f15708a = xp4Var;
        this.f15711d = copyOnWriteArraySet;
        this.f15710c = e45Var;
        this.f15712e = new ArrayDeque();
        this.f15713f = new ArrayDeque();
        this.f15709b = xp4Var.mo4854a(looper, new Handler.Callback() { // from class: com.daaw.x05
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                k65.m18017g(k65.this, message);
                return true;
            }
        });
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m18017g(k65 k65Var, Message message) {
        Iterator it = k65Var.f15711d.iterator();
        while (it.hasNext()) {
            ((h55) it.next()).m21019b(k65Var.f15710c);
            if (k65Var.f15709b.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final k65 m18023a(Looper looper, e45 e45Var) {
        return new k65(this.f15711d, looper, this.f15708a, e45Var);
    }

    /* renamed from: b */
    public final void m18022b(Object obj) {
        if (this.f15714g) {
            return;
        }
        this.f15711d.add(new h55(obj));
    }

    /* renamed from: c */
    public final void m18021c() {
        if (this.f15713f.isEmpty()) {
            return;
        }
        if (!this.f15709b.zzf(0)) {
            vz4 vz4Var = this.f15709b;
            vz4Var.mo5891d(vz4Var.mo5894a(0));
        }
        boolean isEmpty = this.f15712e.isEmpty();
        this.f15712e.addAll(this.f15713f);
        this.f15713f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.f15712e.isEmpty()) {
            ((Runnable) this.f15712e.peekFirst()).run();
            this.f15712e.removeFirst();
        }
    }

    /* renamed from: d */
    public final void m18020d(final int i, final c35 c35Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f15711d);
        this.f15713f.add(new Runnable() { // from class: com.daaw.z15
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                c35 c35Var2 = c35Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((h55) it.next()).m21020a(i2, c35Var2);
                }
            }
        });
    }

    /* renamed from: e */
    public final void m18019e() {
        Iterator it = this.f15711d.iterator();
        while (it.hasNext()) {
            ((h55) it.next()).m21018c(this.f15710c);
        }
        this.f15711d.clear();
        this.f15714g = true;
    }

    /* renamed from: f */
    public final void m18018f(Object obj) {
        Iterator it = this.f15711d.iterator();
        while (it.hasNext()) {
            h55 h55Var = (h55) it.next();
            if (h55Var.f12069a.equals(obj)) {
                h55Var.m21018c(this.f15710c);
                this.f15711d.remove(h55Var);
            }
        }
    }
}
