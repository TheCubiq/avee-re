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
import com.daaw.al;
import com.daaw.az0;
import com.daaw.nc0;
import com.daaw.oh1;
import com.daaw.ot;
import com.daaw.pq;
import com.daaw.ug0;
import com.daaw.vw1;
import com.daaw.zk;
/* loaded from: classes.dex */
public final class a extends ot {
    public static final C0040a H0 = new C0040a(null);
    public static boolean I0;
    public CheckBox G0;

    /* renamed from: com.daaw.avee.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0040a {
        public C0040a() {
        }

        public /* synthetic */ C0040a(pq pqVar) {
            this();
        }

        public final boolean a() {
            return a.I0;
        }

        public final void b(boolean z) {
            a.I0 = z;
        }

        public final void c(FragmentManager fragmentManager) {
            ug0.f(fragmentManager, "fragmentManager");
            vw1<Boolean> vw1Var = nc0.g;
            Boolean bool = Boolean.FALSE;
            Boolean a = vw1Var.a(bool);
            ug0.e(a, "isPremium.invoke(false)");
            if (!a.booleanValue() || nc0.p.a(bool).booleanValue() || !new az0().e() || a()) {
                return;
            }
            b(true);
            new a().U1(fragmentManager, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ug0.f(view, "widget");
            nc0.h.a(new al(view), Boolean.FALSE);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            ug0.f(textPaint, "paint");
            textPaint.setUnderlineText(false);
            textPaint.setColor(zk.c(a.this.o1(), R.color.store_1_feature_light));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(View view, Bundle bundle) {
        ug0.f(view, "view");
        super.N0(view, bundle);
        this.G0 = (CheckBox) view.findViewById(R.id.checkbox);
        b bVar = new b();
        TextView textView = (TextView) view.findViewById(R.id.description_tv);
        SpannableString spannableString = new SpannableString(textView.getText());
        String T = T(R.string.legacy_premium_description_clickable);
        ug0.e(T, "getString(R.string.legac…um_description_clickable)");
        int n = oh1.n(spannableString, T, 0, false, 6, null);
        spannableString.setSpan(bVar, n, T.length() + n, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Override // com.daaw.ot
    public Dialog N1(Bundle bundle) {
        return new Dialog(o1(), R.style.WideDialog);
    }

    @Override // com.daaw.ot, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ug0.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        CheckBox checkBox = this.G0;
        if (checkBox != null) {
            new az0().f(!checkBox.isChecked());
        }
        I0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ug0.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.dialog_legacy_premium_info, viewGroup, false);
        ug0.e(inflate, "inflater.inflate(R.layou…m_info, container, false)");
        return inflate;
    }

    @Override // com.daaw.ot, androidx.fragment.app.Fragment
    public void v0() {
        super.v0();
        this.G0 = null;
    }
}
