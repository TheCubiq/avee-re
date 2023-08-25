package com.daaw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
/* renamed from: com.daaw.or */
/* loaded from: classes.dex */
public class C2468or implements e41 {

    /* renamed from: a */
    public final Context f21845a;

    /* renamed from: b */
    public final InterfaceC3746yu<i40> f21846b;

    /* renamed from: c */
    public final int f21847c;

    /* renamed from: d */
    public final long f21848d;

    public C2468or(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C2468or(Context context, InterfaceC3746yu<i40> interfaceC3746yu, int i, long j) {
        this.f21845a = context;
        this.f21847c = i;
        this.f21848d = j;
        this.f21846b = interfaceC3746yu;
    }

    @Override // com.daaw.e41
    /* renamed from: a */
    public a41[] mo14064a(Handler handler, rs1 rs1Var, InterfaceC2251n7 interfaceC2251n7, pk1 pk1Var, xp0 xp0Var, InterfaceC3746yu<i40> interfaceC3746yu) {
        InterfaceC3746yu<i40> interfaceC3746yu2 = interfaceC3746yu == null ? this.f21846b : interfaceC3746yu;
        ArrayList<a41> arrayList = new ArrayList<>();
        InterfaceC3746yu<i40> interfaceC3746yu3 = interfaceC3746yu2;
        m14059g(this.f21845a, interfaceC3746yu3, this.f21848d, handler, rs1Var, this.f21847c, arrayList);
        mo14058c(this.f21845a, interfaceC3746yu3, m14063b(), handler, interfaceC2251n7, this.f21847c, arrayList);
        m14060f(this.f21845a, pk1Var, handler.getLooper(), this.f21847c, arrayList);
        m14062d(this.f21845a, xp0Var, handler.getLooper(), this.f21847c, arrayList);
        m14061e(this.f21845a, handler, this.f21847c, arrayList);
        return (a41[]) arrayList.toArray(new a41[arrayList.size()]);
    }

    /* renamed from: b */
    public InterfaceC2154m7[] m14063b() {
        return new InterfaceC2154m7[0];
    }

    /* renamed from: c */
    public void mo14058c(Context context, InterfaceC3746yu<i40> interfaceC3746yu, InterfaceC2154m7[] interfaceC2154m7Arr, Handler handler, InterfaceC2251n7 interfaceC2251n7, int i, ArrayList<a41> arrayList) {
        throw null;
    }

    /* renamed from: d */
    public void m14062d(Context context, xp0 xp0Var, Looper looper, int i, ArrayList<a41> arrayList) {
        arrayList.add(new yp0(xp0Var, looper));
    }

    /* renamed from: e */
    public void m14061e(Context context, Handler handler, int i, ArrayList<a41> arrayList) {
    }

    /* renamed from: f */
    public void m14060f(Context context, pk1 pk1Var, Looper looper, int i, ArrayList<a41> arrayList) {
        arrayList.add(new qk1(pk1Var, looper));
    }

    /* renamed from: g */
    public void m14059g(Context context, InterfaceC3746yu<i40> interfaceC3746yu, long j, Handler handler, rs1 rs1Var, int i, ArrayList<a41> arrayList) {
        arrayList.add(new go0(context, eo0.f8610a, j, interfaceC3746yu, false, handler, rs1Var, 50));
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
