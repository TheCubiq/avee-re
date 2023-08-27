package com.daaw.avee.comp.AppTips;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
/* loaded from: classes.dex */
public class TipReorderDialog extends DialogFragment {
    public static TipReorderDialog createAndShowTipReorderDialog(ContextData contextData) {
        TipReorderDialog tipReorderDialog = new TipReorderDialog();
        UtilsUI.showDialogSafe(tipReorderDialog, "TipReorderDialog", contextData);
        return tipReorderDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(View.inflate(getActivity(), R.layout.dialog_tip_reorder, null));
        builder.setTitle(R.string.dialog_tip);
        builder.setPositiveButton(R.string.dialog_hideTip, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.AppTips.TipReorderDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_tipShow_reorder, false);
            }
        });
        return builder.create();
    }
}
