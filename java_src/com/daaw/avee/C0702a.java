package com.daaw.avee;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.daaw.C0645al;
import com.daaw.C2575pq;
import com.daaw.C3866zk;
import com.daaw.DialogInterface$OnCancelListenerC2470ot;
import com.daaw.az0;
import com.daaw.nc0;
import com.daaw.oh1;
import com.daaw.ug0;
import com.daaw.vw1;
/* renamed from: com.daaw.avee.a */
/* loaded from: classes.dex */
public final class C0702a extends DialogInterface$OnCancelListenerC2470ot {

    /* renamed from: H0 */
    public static final C0703a f3789H0 = new C0703a(null);

    /* renamed from: I0 */
    public static boolean f3790I0;

    /* renamed from: G0 */
    public CheckBox f3791G0;

    /* renamed from: com.daaw.avee.a$a */
    /* loaded from: classes.dex */
    public static final class C0703a {
        public C0703a() {
        }

        public /* synthetic */ C0703a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final boolean m26872a() {
            return C0702a.f3790I0;
        }

        /* renamed from: b */
        public final void m26871b(boolean z) {
            C0702a.f3790I0 = z;
        }

        /* renamed from: c */
        public final void m26870c(FragmentManager fragmentManager) {
            ug0.m8268f(fragmentManager, "fragmentManager");
            vw1<Boolean> vw1Var = nc0.f19989g;
            Boolean bool = Boolean.FALSE;
            Boolean m6692a = vw1Var.m6692a(bool);
            ug0.m8269e(m6692a, "isPremium.invoke(false)");
            if (!m6692a.booleanValue() || nc0.f19998p.m6692a(bool).booleanValue() || !new az0().m26589e() || m26872a()) {
                return;
            }
            m26871b(true);
            new C0702a().mo13989U1(fragmentManager, null);
        }
    }

    /* renamed from: com.daaw.avee.a$b */
    /* loaded from: classes.dex */
    public static final class C0704b extends ClickableSpan {
        public C0704b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ug0.m8268f(view, "widget");
            nc0.f19990h.m5753a(new C0645al(view), Boolean.FALSE);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            ug0.m8268f(textPaint, "paint");
            textPaint.setUnderlineText(false);
            textPaint.setColor(C3866zk.m2180c(C0702a.this.m29420o1(), R.color.store_1_feature_light));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: N0 */
    public void mo26875N0(View view, Bundle bundle) {
        ug0.m8268f(view, "view");
        super.mo26875N0(view, bundle);
        this.f3791G0 = (CheckBox) view.findViewById(R.id.checkbox);
        C0704b c0704b = new C0704b();
        TextView textView = (TextView) view.findViewById(R.id.description_tv);
        SpannableString spannableString = new SpannableString(textView.getText());
        String m29463T = m29463T(R.string.legacy_premium_description_clickable);
        ug0.m8269e(m29463T, "getString(R.string.legac…um_description_clickable)");
        int m14291n = oh1.m14291n(spannableString, m29463T, 0, false, 6, null);
        spannableString.setSpan(c0704b, m14291n, m29463T.length() + m14291n, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot
    /* renamed from: N1 */
    public Dialog mo546N1(Bundle bundle) {
        return new Dialog(m29420o1(), R.style.WideDialog);
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ug0.m8268f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        CheckBox checkBox = this.f3791G0;
        if (checkBox != null) {
            new az0().m26588f(!checkBox.isChecked());
        }
        f3790I0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s0 */
    public View mo523s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ug0.m8268f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.dialog_legacy_premium_info, viewGroup, false);
        ug0.m8269e(inflate, "inflater.inflate(R.layou…m_info, container, false)");
        return inflate;
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, androidx.fragment.app.Fragment
    /* renamed from: v0 */
    public void mo13985v0() {
        super.mo13985v0();
        this.f3791G0 = null;
    }
}
