package com.daaw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class or implements e41 {
    public final Context a;
    public final yu<i40> b;
    public final int c;
    public final long d;

    public or(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public or(Context context, yu<i40> yuVar, int i, long j) {
        this.a = context;
        this.c = i;
        this.d = j;
        this.b = yuVar;
    }

    @Override // com.daaw.e41
    public a41[] a(Handler handler, rs1 rs1Var, n7 n7Var, pk1 pk1Var, xp0 xp0Var, yu<i40> yuVar) {
        yu<i40> yuVar2 = yuVar == null ? this.b : yuVar;
        ArrayList<a41> arrayList = new ArrayList<>();
        yu<i40> yuVar3 = yuVar2;
        g(this.a, yuVar3, this.d, handler, rs1Var, this.c, arrayList);
        c(this.a, yuVar3, b(), handler, n7Var, this.c, arrayList);
        f(this.a, pk1Var, handler.getLooper(), this.c, arrayList);
        d(this.a, xp0Var, handler.getLooper(), this.c, arrayList);
        e(this.a, handler, this.c, arrayList);
        return (a41[]) arrayList.toArray(new a41[arrayList.size()]);
    }

    public m7[] b() {
        return new m7[0];
    }

    public void c(Context context, yu<i40> yuVar, m7[] m7VarArr, Handler handler, n7 n7Var, int i, ArrayList<a41> arrayList) {
        throw null;
    }

    public void d(Context context, xp0 xp0Var, Looper looper, int i, ArrayList<a41> arrayList) {
        arrayList.add(new yp0(xp0Var, looper));
    }

    public void e(Context context, Handler handler, int i, ArrayList<a41> arrayList) {
    }

    public void f(Context context, pk1 pk1Var, Looper looper, int i, ArrayList<a41> arrayList) {
        arrayList.add(new qk1(pk1Var, looper));
    }

    public void g(Context context, yu<i40> yuVar, long j, Handler handler, rs1 rs1Var, int i, ArrayList<a41> arrayList) {
        arrayList.add(new go0(context, eo0.a, j, yuVar, false, handler, rs1Var, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            arrayList.add(size, (a41) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, rs1.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j), handler, rs1Var, 50));
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating VP9 extension", e);
        }
    }
}
