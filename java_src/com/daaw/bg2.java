package com.daaw;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class bg2 {

    /* renamed from: c */
    public static final boolean f4782c = cg2.f5792a;

    /* renamed from: a */
    public final List f4783a = new ArrayList();

    /* renamed from: b */
    public boolean f4784b = false;

    /* renamed from: a */
    public final synchronized void m26174a(String str, long j) {
        if (this.f4784b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f4783a.add(new ag2(str, j, SystemClock.elapsedRealtime()));
    }

    /* renamed from: b */
    public final synchronized void m26173b(String str) {
        List list;
        long j;
        this.f4784b = true;
        if (this.f4783a.size() == 0) {
            j = 0;
        } else {
            j = ((ag2) this.f4783a.get(list.size() - 1)).f3176c - ((ag2) this.f4783a.get(0)).f3176c;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((ag2) this.f4783a.get(0)).f3176c;
        cg2.m25392a("(%-4d ms) %s", Long.valueOf(j), str);
        for (ag2 ag2Var : this.f4783a) {
            long j3 = ag2Var.f3176c;
            cg2.m25392a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(ag2Var.f3175b), ag2Var.f3174a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.f4784b) {
            return;
        }
        m26173b("Request on the loose");
        cg2.m25391b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
