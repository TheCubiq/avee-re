package com.daaw.avee.Design;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.android.billingclient.api.Purchase;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.PrControls.PrButton;
import com.daaw.avee.comp.Common.PrControls.PrCheckBox;
import com.daaw.avee.comp.Common.PrControls.PrEditText;
import com.daaw.avee.comp.Common.PrControls.PrImageButton;
import com.daaw.avee.comp.Common.PrControls.PrResources;
import com.daaw.avee.comp.InAppBilling.BSecLoad;
import com.daaw.avee.comp.InAppBilling.StoreDialog;
import com.daaw.avee.comp.InAppBilling.StoreNotAvailableVerDialog;
import com.daaw.avee.comp.InAppBilling.util2.BillingManager;
import com.daaw.avee.comp.Visualizer.Elements.Composition;
import com.daaw.avee.comp.Visualizer.Elements.LogoMark2;
import com.daaw.avee.comp.VisualizerCutomization.CustomSimpleViewHolder;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class IAP2Design {
    static final String SKU_ID_PREMIUM = "premium";
    private static final boolean enableDebugging = false;
    private BillingManager mBillingManager;
    static WeakEventR1<Purchase, Boolean> verifyDeveloperPayload = new WeakEventR1<>();
    static WeakEventR2<Purchase, Boolean, Boolean> onPremium = new WeakEventR2<>();
    static WeakEventR1<Boolean, Boolean> onPurchasedSuccessfully = new WeakEventR1<>();
    public static boolean premium = false;
    private final List<Object> listenerRefHolder = new LinkedList();
    private UpdateListener mUpdateListener = new UpdateListener();

    private void killHelperAfter(int i) {
    }

    private void setWaitScreen(boolean z) {
    }

    public void querySkuDetails() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void killHelper() {
        tlog.d("killHelper");
        onDestroy2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class UpdateListener implements BillingManager.BillingUpdatesListener {
        @Override // com.daaw.avee.comp.InAppBilling.util2.BillingManager.BillingUpdatesListener
        public void onConsumeFinished(String str, int i) {
        }

        private UpdateListener() {
        }

        @Override // com.daaw.avee.comp.InAppBilling.util2.BillingManager.BillingUpdatesListener
        public void onBillingClientSetupFinished() {
            IAP2Design.this.onBillingManagerSetupFinished();
        }

        @Override // com.daaw.avee.comp.InAppBilling.util2.BillingManager.BillingUpdatesListener
        public void onPurchasesUpdated(List<Purchase> list) {
            for (Purchase purchase : list) {
                String sku = purchase.getSku();
                char c = 65535;
                if (sku.hashCode() == -318452137 && sku.equals(IAP2Design.SKU_ID_PREMIUM)) {
                    c = 0;
                }
                if (c == 0) {
                    IAP2Design.premium = true;
                    IAP2Design.onPremium.invoke(purchase, false, false);
                }
            }
            IAP2Design.this.updateUi();
        }
    }

    public IAP2Design() {
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.IAP2Design.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                IAP2Design.this.createHelper(activity);
            }
        }, this.listenerRefHolder);
        PrCheckBox.onTouch.subscribeWeak(new WeakEventR2.Handler<ContextData, PrCheckBox, Boolean>() { // from class: com.daaw.avee.Design.IAP2Design.2
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public Boolean invoke(ContextData contextData, PrCheckBox prCheckBox) {
                if (!IAP2Design.premium) {
                    IAP2Design.this.showStore(contextData);
                    return true;
                }
                return false;
            }
        }, this.listenerRefHolder);
        PrEditText.onTouch.subscribeWeak(new WeakEventR2.Handler<ContextData, PrEditText, Boolean>() { // from class: com.daaw.avee.Design.IAP2Design.3
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public Boolean invoke(ContextData contextData, PrEditText prEditText) {
                if (!IAP2Design.premium) {
                    IAP2Design.this.showStore(contextData);
                    return true;
                }
                return false;
            }
        }, this.listenerRefHolder);
        PrButton.onTouch.subscribeWeak(new WeakEventR2.Handler<ContextData, PrButton, Boolean>() { // from class: com.daaw.avee.Design.IAP2Design.4
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public Boolean invoke(ContextData contextData, PrButton prButton) {
                if (!IAP2Design.premium) {
                    IAP2Design.this.showStore(contextData);
                    return true;
                }
                return false;
            }
        }, this.listenerRefHolder);
        MainActivity.onResume.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.IAP2Design.5
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                IAP2Design.this.createHelper(activity);
                IAP2Design.this.startSetup(activity, false);
            }
        }, this.listenerRefHolder);
        MainActivity.onDestroy.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.IAP2Design.6
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                IAP2Design.this.killHelper();
            }
        }, this.listenerRefHolder);
        StoreDialog.onBuyAction.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.IAP2Design.7
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                IAP2Design.this.doOnBuy(contextData);
            }
        }, this.listenerRefHolder);
        MainActivity.onMainUIAction.subscribeWeak(new WeakEvent2.Handler<Integer, ContextData>() { // from class: com.daaw.avee.Design.IAP2Design.8
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, ContextData contextData) {
                if (num.intValue() == 4) {
                    IAP2Design.this.showStore(contextData);
                }
            }
        }, this.listenerRefHolder);
        PrResources.onRequest.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$r3nlAJ7rGlF2pVYynPF_4JLPp2Q
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        PrCheckBox.onRequest.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$b0Czg3oJeIZvbZJFQDYvmheJheA
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        PrEditText.hasPremium.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$uWkSafkDqmYdI-UEs3_NljTDsrY
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        PrButton.hasPremium.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$SvDTyshre8iDPzCr2mMj4qzb10g
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        PrImageButton.onRequest.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$V1sXN681JfC7bpnPWsNp09haZMk
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        CustomSimpleViewHolder.onRequest.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$H39sRMCmKgYOGqgghrP8ajYXrJg
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        LogoMark2.onRequest.subscribeWeak(new WeakEventR1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$I9yYUUozWyMWInNYIuAtPcc0nnE
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public final Object invoke(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        Composition.onRequest.subscribeWeak(new WeakEventR1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$cEFyNTpOeYSV8uS0Y1Bi6NcxBbo
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public final Object invoke(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        VisualizerExporterDesign.isPremium.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$xQrBhkLZY6c24qLusiJ-xMVA338
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
        MainActivity.onRequestIsPremiumIsPremiumAvailable.subscribeWeak(new WeakEventR.Handler<Tuple2<Boolean, Boolean>>() { // from class: com.daaw.avee.Design.IAP2Design.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple2<Boolean, Boolean> invoke() {
                return new Tuple2<>(Boolean.valueOf(IAP2Design.premium), true);
            }
        }, this.listenerRefHolder);
        StoreDialog.onRequestIsPremium.subscribeWeak(new WeakEventR.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$IAP2Design$pqCsfkFhp2eJfmEuWmoIkeG3MAs
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public final Object invoke() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(IAP2Design.premium);
                return valueOf;
            }
        }, this.listenerRefHolder);
    }

    public Boolean isPremium() {
        return Boolean.valueOf(premium);
    }

    private void onResume2(Activity activity) {
        BillingManager billingManager = this.mBillingManager;
        if (billingManager == null || billingManager.getBillingClientResponseCode() != 0) {
            return;
        }
        this.mBillingManager.queryPurchases();
    }

    public void onDestroy2() {
        tlog.d("Destroying helper.");
        BillingManager billingManager = this.mBillingManager;
        if (billingManager != null) {
            billingManager.destroy();
        }
        this.mBillingManager = null;
    }

    private void displayAnErrorIfNeeded() {
        int billingClientResponseCode;
        BillingManager billingManager = this.mBillingManager;
        if (billingManager == null || (billingClientResponseCode = billingManager.getBillingClientResponseCode()) == 0) {
            return;
        }
        if (billingClientResponseCode == 3) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext != null) {
                WeakEvent1<String> weakEvent1 = EventsGlobalTextNotifier.onTextMsg;
                weakEvent1.invoke("" + ((Object) appContext.getText(R.string.error_billing_unavailable)));
                return;
            }
            return;
        }
        Context appContext2 = PlayerCore.s().getAppContext();
        if (appContext2 != null) {
            WeakEvent1<String> weakEvent12 = EventsGlobalTextNotifier.onTextMsg;
            weakEvent12.invoke("" + ((Object) appContext2.getText(R.string.error_billing_default)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createHelper(Activity activity) {
        if (this.mBillingManager == null) {
            this.mBillingManager = new BillingManager(activity, this.mUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startSetup(Activity activity, boolean z) {
        onResume2(activity);
        return false;
    }

    void onBillingManagerSetupFinished() {
        setWaitScreen(true);
        querySkuDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOnBuy(ContextData contextData) {
        Context appContext;
        BillingManager billingManager = this.mBillingManager;
        if (billingManager != null && billingManager.getBillingClientResponseCode() > -1) {
            if (3 == this.mBillingManager.getBillingClientResponseCode() && (appContext = PlayerCore.s().getAppContext()) != null) {
                WeakEvent1<String> weakEvent1 = EventsGlobalTextNotifier.onTextMsg;
                weakEvent1.invoke("" + ((Object) appContext.getText(R.string.error_billing_unavailable)));
            }
            onBillingManagerSetupFinished();
            setWaitScreen(true);
            BSecLoad.getLoad(new int[]{0});
            try {
                this.mBillingManager.initiatePurchaseFlow(SKU_ID_PREMIUM, "inapp");
            } catch (Exception e) {
                tlog.w("launchPurchaseFlow exception: " + e.getMessage());
            }
            onPremiumUpdated();
        } else if (PlayerCore.s().getAppContext() != null) {
            EventsGlobalTextNotifier.onTextMsg.invoke("Billing manager not initialized");
        }
    }

    private void onPremiumUpdated() {
        MainActivity mainActivity = MainActivity.getInstance();
        if (mainActivity != null) {
            mainActivity.updatePremiumMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showStore(ContextData contextData) {
        StoreDialog.createAndShowStoreDialog(contextData);
        killHelperAfter(15000);
    }

    void complain(String str) {
        alert(str);
    }

    void alert(String str) {
        Context activityContext = PlayerCore.s().getActivityContext();
        if (activityContext != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activityContext);
            builder.setMessage(str);
            builder.setNeutralButton("OK", (DialogInterface.OnClickListener) null);
            builder.create().show();
        }
    }

    public void updateUi() {
        onPremiumUpdated();
    }

    private void onPurchaseFinished(boolean z) {
        killHelperAfter(15000);
        if (z) {
            onPurchasedSuccessfully.invoke(Boolean.valueOf(z), false);
        }
    }

    private void showNotAvailableInVersion(ContextData contextData) {
        StoreNotAvailableVerDialog.createAndShowStoreNotAvailableVerDialog(contextData);
    }
}
