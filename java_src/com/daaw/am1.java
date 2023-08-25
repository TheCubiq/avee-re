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

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            j5.e().a0(j5.t, false);
        }
    }

    public static am1 a(al alVar) {
        am1 am1Var = new am1();
        gr1.x(am1Var, "TipReorderDialog", alVar);
        return am1Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(View.inflate(getActivity(), R.layout.dialog_tip_reorder, null));
        builder.setTitle(R.string.dialog_tip);
        builder.setPositiveButton(R.string.dialog_hideTip, new a());
        return builder.create();
    }
}
