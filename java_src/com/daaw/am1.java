package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class am1 extends DialogFragment {

    /* renamed from: com.daaw.am1$a */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC0649a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC0649a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18935a0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14323t, false);
        }
    }

    /* renamed from: a */
    public static am1 m27342a(C0645al c0645al) {
        am1 am1Var = new am1();
        gr1.m21311x(am1Var, "TipReorderDialog", c0645al);
        return am1Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(View.inflate(getActivity(), R.layout.dialog_tip_reorder, null));
        builder.setTitle(R.string.dialog_tip);
        builder.setPositiveButton(R.string.dialog_hideTip, new DialogInterface$OnClickListenerC0649a());
        return builder.create();
    }
}
