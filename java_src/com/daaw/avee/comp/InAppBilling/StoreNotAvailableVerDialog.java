package com.daaw.avee.comp.InAppBilling;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class StoreNotAvailableVerDialog extends DialogFragment {
    private static WeakReference<StoreNotAvailableVerDialog> instanceWeak = new WeakReference<>(null);

    public static StoreNotAvailableVerDialog createAndShowStoreNotAvailableVerDialog(ContextData contextData) {
        StoreNotAvailableVerDialog storeNotAvailableVerDialog = instanceWeak.get();
        if (storeNotAvailableVerDialog == null || storeNotAvailableVerDialog.getDialog() == null || !storeNotAvailableVerDialog.getDialog().isShowing()) {
            StoreNotAvailableVerDialog storeNotAvailableVerDialog2 = new StoreNotAvailableVerDialog();
            UtilsUI.showDialogSafe(storeNotAvailableVerDialog2, "StoreNotAvailableVerDialog", contextData);
            instanceWeak = new WeakReference<>(storeNotAvailableVerDialog2);
            return storeNotAvailableVerDialog2;
        }
        return storeNotAvailableVerDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(View.inflate(getActivity(), R.layout.dialog_store_not_available_ver, null));
        return builder.create();
    }
}
