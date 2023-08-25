package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.daaw.p21;
import com.daaw.yx2;
import com.google.android.apps.common.proguard.UsedByReflection;
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver p;
    public ResultReceiver q;
    public boolean r;

    public final Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r8 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r8 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        r0 = r8.getExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        r7.send(r6, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L83
            com.daaw.xb r6 = com.daaw.yx2.g(r8, r2)
            int r6 = r6.b()
            r3 = -1
            if (r7 != r3) goto L1c
            if (r6 == 0) goto L1a
            r7 = -1
            goto L1c
        L1a:
            r6 = 0
            goto L38
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            com.daaw.yx2.l(r2, r7)
        L38:
            android.os.ResultReceiver r7 = r5.p
            if (r7 == 0) goto L3f
            if (r8 != 0) goto L92
            goto L96
        L3f:
            if (r8 == 0) goto L7b
            android.os.Bundle r6 = r8.getExtras()
            if (r6 == 0) goto L64
            android.os.Bundle r6 = r8.getExtras()
            java.lang.String r7 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L58
            android.content.Intent r6 = r5.a(r6)
            goto L7f
        L58:
            android.content.Intent r6 = r5.b()
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            goto L7f
        L64:
            android.content.Intent r6 = r5.b()
            java.lang.String r7 = "Got null bundle!"
            com.daaw.yx2.l(r2, r7)
            r7 = 6
            java.lang.String r8 = "RESPONSE_CODE"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "DEBUG_MESSAGE"
            java.lang.String r8 = "An internal error occurred."
            r6.putExtra(r7, r8)
            goto L7f
        L7b:
            android.content.Intent r6 = r5.b()
        L7f:
            r5.sendBroadcast(r6)
            goto Lb3
        L83:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L9a
            int r6 = com.daaw.yx2.a(r8, r2)
            android.os.ResultReceiver r7 = r5.q
            if (r7 == 0) goto Lb3
            if (r8 != 0) goto L92
            goto L96
        L92:
            android.os.Bundle r0 = r8.getExtras()
        L96:
            r7.send(r6, r0)
            goto Lb3
        L9a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.daaw.yx2.l(r2, r6)
        Lb3:
            r5.r = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            yx2.k("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.r = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.p = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.q = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                return;
            } else {
                return;
            }
        }
        yx2.k("ProxyBillingActivity", "Launching Play Store billing flow");
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.p = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.q = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i = p21.T0;
                this.r = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } else {
                pendingIntent = null;
            }
            this.r = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e) {
            yx2.m("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.p;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.q;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent b = b();
                    b.putExtra("RESPONSE_CODE", 6);
                    b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(b);
                }
            }
            this.r = false;
            finish();
            return;
        }
        i = 100;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.r) {
            Intent b = b();
            b.putExtra("RESPONSE_CODE", 1);
            b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(b);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.p;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.q;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.r);
    }
}
