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
    public ProgressBar p;
    public TextView q;
    public TextView r;
    public List<Object> s = new LinkedList();

    /* loaded from: classes.dex */
    public class a extends Dialog {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            fv1.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        d();
    }

    public static fv1 g() {
        return new fv1();
    }

    public final void c(View view) {
        MainActivity.m0.c(this.s);
        AdView adView = (AdView) view.findViewById(R.id.adView);
        AdView adView2 = (AdView) view.findViewById(R.id.adViewHorizontal);
        if (getResources().getConfiguration().orientation == 2) {
            adView.setVisibility(8);
            adView = adView2;
        } else {
            adView2.setVisibility(8);
        }
        az0 az0Var = new az0();
        if (nc0.g.a(Boolean.FALSE).booleanValue() && az0Var.d()) {
            adView.setVisibility(8);
            return;
        }
        adView.setVisibility(0);
        if (e(adView)) {
            return;
        }
        MobileAds.initialize(getActivity());
        adView.loadAd(a1.a.b());
    }

    public final void d() {
        dv1.N.a();
    }

    public final boolean e(AdView adView) {
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

    public void h(dv1.f fVar) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        if (fVar.b) {
            textView.setVisibility(0);
            this.r.setText(R.string.vis_export_status_loading);
            if (!TextUtils.isEmpty(this.q.getText())) {
                return;
            }
        } else {
            textView.setVisibility(8);
        }
        this.p.getProgressDrawable().setColorFilter(gr1.n(this.p, R.attr.colorAccent), PorterDuff.Mode.SRC_IN);
        this.p.setMax(fVar.d);
        this.p.setProgress(fVar.c);
        float f = fVar.c / fVar.d;
        TextView textView2 = this.q;
        float f2 = f * 100.0f;
        textView2.setText(textView2.getResources().getQuantityString(R.plurals.vis_progress_x, (int) f2, Float.valueOf(f2)));
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getView());
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        a aVar = new a(getActivity(), o5.a(getActivity()));
        Window window = aVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return aVar;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_export_vis_progress, viewGroup, false);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.p.setProgress(0);
        this.q.setText("");
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        xs1.w0((ViewGroup) view.findViewById(R.id.progressBarRenderGroup), ColorStateList.valueOf(gr1.m(getActivity().getTheme(), R.attr.dialogBackground)));
        this.r = (TextView) view.findViewById(R.id.txtRender);
        this.p = (ProgressBar) view.findViewById(R.id.progressBarRender);
        this.q = (TextView) view.findViewById(R.id.txtRenderValue);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnStopExport);
        imageButton.setColorFilter(gr1.m(getActivity().getTheme(), R.attr.colorAccent));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ev1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fv1.this.f(view2);
            }
        });
        c(view);
    }
}
