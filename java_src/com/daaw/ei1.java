package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes.dex */
public class ei1 extends DialogInterface$OnCancelListenerC2470ot {

    /* renamed from: G0 */
    public Dialog f8496G0;

    /* renamed from: H0 */
    public DialogInterface.OnCancelListener f8497H0;

    /* renamed from: I0 */
    public Dialog f8498I0;

    /* renamed from: V1 */
    public static ei1 m23466V1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ei1 ei1Var = new ei1();
        Dialog dialog2 = (Dialog) ry0.m10829k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        ei1Var.f8496G0 = dialog2;
        if (onCancelListener != null) {
            ei1Var.f8497H0 = onCancelListener;
        }
        return ei1Var;
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot
    /* renamed from: N1 */
    public Dialog mo546N1(Bundle bundle) {
        Dialog dialog = this.f8496G0;
        if (dialog == null) {
            m13991S1(false);
            if (this.f8498I0 == null) {
                this.f8498I0 = new AlertDialog.Builder((Context) ry0.m10830j(m29406u())).create();
            }
            return this.f8498I0;
        }
        return dialog;
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot
    /* renamed from: U1 */
    public void mo13989U1(FragmentManager fragmentManager, String str) {
        super.mo13989U1(fragmentManager, str);
    }

    @Override // com.daaw.DialogInterface$OnCancelListenerC2470ot, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8497H0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
