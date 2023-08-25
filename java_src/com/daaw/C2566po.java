package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.daaw.avee.R;
/* renamed from: com.daaw.po */
/* loaded from: classes.dex */
public class C2566po {

    /* renamed from: a */
    public ViewGroup f23087a;

    /* renamed from: b */
    public ViewGroup f23088b;

    /* renamed from: com.daaw.po$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2567a implements View.OnClickListener {
        public View$OnClickListenerC2567a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            m20595k.m20597i();
        }
    }

    /* renamed from: com.daaw.po$b */
    /* loaded from: classes.dex */
    public class RunnableC2568b implements Runnable {
        public RunnableC2568b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2566po.this.f23087a.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void m13268b(DialogFragmentC1593ho dialogFragmentC1593ho) {
        this.f23087a.animate().alpha(0.0f).setDuration(dialogFragmentC1593ho.f12718p).withEndAction(new RunnableC2568b());
    }

    /* renamed from: c */
    public boolean m13267c() {
        return this.f23087a.getVisibility() == 0;
    }

    /* renamed from: d */
    public boolean m13266d() {
        return this.f23088b != null;
    }

    /* renamed from: e */
    public void m13265e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity) {
        this.f23087a = (ViewGroup) viewGroup.findViewById(R.id.propertyViewRoot);
        this.f23088b = (ViewGroup) viewGroup.findViewById(R.id.layoutPropertyContent);
        ((ImageButton) viewGroup.findViewById(R.id.btnClose)).setOnClickListener(new View$OnClickListenerC2567a());
    }

    /* renamed from: f */
    public void m13264f(DialogFragmentC1593ho dialogFragmentC1593ho) {
        this.f23087a.setVisibility(0);
        this.f23087a.animate().alpha(1.0f).setDuration(dialogFragmentC1593ho.f12718p);
    }

    /* renamed from: g */
    public void m13263g(C3239un c3239un, String str, w40<InterfaceC1153e0<Object>> w40Var) {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null && m20595k.m20590p() && m13266d()) {
            LayoutInflater from = LayoutInflater.from(m20595k.getActivity());
            if (c3239un == null || str == null) {
                this.f23088b.removeAllViews();
                m13268b(m20595k);
                return;
            }
            this.f23088b.removeAllViews();
            this.f23087a.setAlpha(0.0f);
            m13264f(m20595k);
            c3239un.m7949q(str);
            C2323no.m14924l(m20595k, from, c3239un, this.f23088b, str, true, w40Var);
        }
    }
}
