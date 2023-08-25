package com.daaw;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.dv1;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.ResponseInfo;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class fv1 extends DialogFragment {

    /* renamed from: p */
    public ProgressBar f9988p;

    /* renamed from: q */
    public TextView f9989q;

    /* renamed from: r */
    public TextView f9990r;

    /* renamed from: s */
    public List<Object> f9991s = new LinkedList();

    /* renamed from: com.daaw.fv1$a */
    /* loaded from: classes.dex */
    public class DialogC1333a extends Dialog {
        public DialogC1333a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            fv1.this.m22247d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22245f(View view) {
        m22247d();
    }

    /* renamed from: g */
    public static fv1 m22244g() {
        return new fv1();
    }

    /* renamed from: c */
    public final void m22248c(View view) {
        MainActivity.f3720m0.m12016c(this.f9991s);
        AdView adView = (AdView) view.findViewById(R.id.adView);
        AdView adView2 = (AdView) view.findViewById(R.id.adViewHorizontal);
        if (getResources().getConfiguration().orientation == 2) {
            adView.setVisibility(8);
            adView = adView2;
        } else {
            adView2.setVisibility(8);
        }
        az0 az0Var = new az0();
        if (nc0.f19989g.m6692a(Boolean.FALSE).booleanValue() && az0Var.m26590d()) {
            adView.setVisibility(8);
            return;
        }
        adView.setVisibility(0);
        if (m22246e(adView)) {
            return;
        }
        MobileAds.initialize(getActivity());
        adView.loadAd(C0563a1.f2690a.m27751b());
    }

    /* renamed from: d */
    public final void m22247d() {
        dv1.f7839N.m12990a();
    }

    /* renamed from: e */
    public final boolean m22246e(AdView adView) {
        ResponseInfo responseInfo = adView.getResponseInfo();
        if (responseInfo == null) {
            return false;
        }
        for (AdapterResponseInfo adapterResponseInfo : responseInfo.getAdapterResponses()) {
            if (adapterResponseInfo.getAdError() != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void m22243h(dv1.C1145f c1145f) {
        TextView textView = this.f9990r;
        if (textView == null) {
            return;
        }
        if (c1145f.f7896b) {
            textView.setVisibility(0);
            this.f9990r.setText(R.string.vis_export_status_loading);
            if (!TextUtils.isEmpty(this.f9989q.getText())) {
                return;
            }
        } else {
            textView.setVisibility(8);
        }
        this.f9988p.getProgressDrawable().setColorFilter(gr1.m21321n(this.f9988p, R.attr.colorAccent), PorterDuff.Mode.SRC_IN);
        this.f9988p.setMax(c1145f.f7898d);
        this.f9988p.setProgress(c1145f.f7897c);
        float f = c1145f.f7897c / c1145f.f7898d;
        TextView textView2 = this.f9989q;
        float f2 = f * 100.0f;
        textView2.setText(textView2.getResources().getQuantityString(R.plurals.vis_progress_x, (int) f2, Float.valueOf(f2)));
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m22248c(getView());
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        DialogC1333a dialogC1333a = new DialogC1333a(getActivity(), C2407o5.m14554a(getActivity()));
        Window window = dialogC1333a.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogC1333a;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_export_vis_progress, viewGroup, false);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f9988p.setProgress(0);
        this.f9989q.setText("");
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        xs1.m4692w0((ViewGroup) view.findViewById(R.id.progressBarRenderGroup), ColorStateList.valueOf(gr1.m21322m(getActivity().getTheme(), R.attr.dialogBackground)));
        this.f9990r = (TextView) view.findViewById(R.id.txtRender);
        this.f9988p = (ProgressBar) view.findViewById(R.id.progressBarRender);
        this.f9989q = (TextView) view.findViewById(R.id.txtRenderValue);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnStopExport);
        imageButton.setColorFilter(gr1.m21322m(getActivity().getTheme(), R.attr.colorAccent));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ev1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fv1.this.m22245f(view2);
            }
        });
        m22248c(view);
    }
}
