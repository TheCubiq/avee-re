package com.daaw;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class bg2 {
    public static final boolean c = cg2.a;
    public final List a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new ag2(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        List list;
        long j;
        this.b = true;
        if (this.a.size() == 0) {
            j = 0;
        } else {
            j = ((ag2) this.a.get(list.size() - 1)).c - ((ag2) this.a.get(0)).c;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((ag2) this.a.get(0)).c;
        cg2.a("(%-4d ms) %s", Long.valueOf(j), str);
        for (ag2 ag2Var : this.a) {
            long j3 = ag2Var.c;
            cg2.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(ag2Var.b), ag2Var.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        cg2.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
