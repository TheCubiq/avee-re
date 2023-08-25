package com.daaw;

import android.content.Context;
import android.os.Handler;
import com.daaw.avee.comp.playback.InterfaceC0771e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class or0 extends C2468or {

    /* renamed from: e */
    public InterfaceC0771e.InterfaceC0773b f21849e;

    /* renamed from: f */
    public ne0 f21850f;

    /* renamed from: g */
    public int f21851g;

    public or0(InterfaceC0771e.InterfaceC0773b interfaceC0773b, ne0 ne0Var, int i, Context context, int i2) {
        super(context, i2);
        this.f21849e = interfaceC0773b;
        this.f21850f = ne0Var;
        this.f21851g = i;
    }

    @Override // com.daaw.C2468or
    /* renamed from: c */
    public void mo14058c(Context context, InterfaceC3746yu<i40> interfaceC3746yu, InterfaceC2154m7[] interfaceC2154m7Arr, Handler handler, InterfaceC2251n7 interfaceC2251n7, int i, ArrayList<a41> arrayList) {
        arrayList.add(new nr0(this.f21850f, this.f21851g, new WeakReference(null), context, eo0.f8610a, interfaceC3746yu, true, handler, interfaceC2251n7, C1372g7.m21899a(context), interfaceC2154m7Arr));
    }
}
