package com.daaw.avee.comp.InAppBilling;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class StoreDialog extends DialogFragment {
    private Button btnBuy;
    private int colorOff;
    private int colorOn;
    private Runnable timerTask;
    public static WeakEvent1<ContextData> onBuyAction = new WeakEvent1<>();
    public static WeakEventR<Boolean> onRequestIsPremium = new WeakEventR<>();
    private static WeakReference<StoreDialog> instanceWeak = new WeakReference<>(null);
    private boolean timerOn = false;
    private int secondsRemaining = 0;

    public static StoreDialog createAndShowStoreDialog(ContextData contextData) {
        StoreDialog storeDialog = instanceWeak.get();
        if (storeDialog == null || storeDialog.getDialog() == null || !storeDialog.getDialog().isShowing()) {
            StoreDialog storeDialog2 = new StoreDialog();
            UtilsUI.showDialogSafe(storeDialog2, "StoreDialog", contextData);
            instanceWeak = new WeakReference<>(storeDialog2);
            return storeDialog2;
        }
        return storeDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_store, null);
        builder.setView(inflate);
        this.btnBuy = (Button) inflate.findViewById(R.id.btnBuy);
        if (onRequestIsPremium.invoke(false).booleanValue()) {
            this.btnBuy.setText(R.string.store_owned);
        } else {
            this.btnBuy.setText(R.string.store_buy);
        }
        this.btnBuy.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.InAppBilling.StoreDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UtilsUI.dismissSafe(StoreDialog.this);
                StoreDialog.onBuyAction.invoke(new ContextData(view));
            }
        });
        return builder.create();
    }
}
