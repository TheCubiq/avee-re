package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.billingclient.util.BillingHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BillingBroadcastManager {
    private static final String ACTION = "com.android.vending.billing.PURCHASES_UPDATED";
    private static final String TAG = "BillingBroadcastManager";
    private final Context mContext;
    private final BillingBroadcastReceiver mReceiver;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BillingBroadcastManager(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        this.mContext = context;
        this.mReceiver = new BillingBroadcastReceiver(purchasesUpdatedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void registerReceiver() {
        this.mReceiver.register(this.mContext, new IntentFilter(ACTION));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PurchasesUpdatedListener getListener() {
        return this.mReceiver.mListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void destroy() {
        this.mReceiver.unRegister(this.mContext);
    }

    /* loaded from: classes.dex */
    private class BillingBroadcastReceiver extends BroadcastReceiver {
        private boolean mIsRegistered;
        private final PurchasesUpdatedListener mListener;

        private BillingBroadcastReceiver(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.mListener = purchasesUpdatedListener;
        }

        public void register(Context context, IntentFilter intentFilter) {
            if (this.mIsRegistered) {
                return;
            }
            context.registerReceiver(BillingBroadcastManager.this.mReceiver, intentFilter);
            this.mIsRegistered = true;
        }

        public void unRegister(Context context) {
            if (this.mIsRegistered) {
                context.unregisterReceiver(BillingBroadcastManager.this.mReceiver);
                this.mIsRegistered = false;
                return;
            }
            BillingHelper.logWarn(BillingBroadcastManager.TAG, "Receiver is not registered.");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.mListener.onPurchasesUpdated(BillingHelper.getResponseCodeFromIntent(intent, BillingBroadcastManager.TAG), BillingHelper.extractPurchases(intent.getExtras()));
        }
    }
}
