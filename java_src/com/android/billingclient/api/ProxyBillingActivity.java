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

    /* renamed from: p */
    public ResultReceiver f2582p;

    /* renamed from: q */
    public ResultReceiver f2583q;

    /* renamed from: r */
    public boolean f2584r;

    /* renamed from: a */
    public final Intent m27868a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* renamed from: b */
    public final Intent m27867b() {
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
    */
    public void onActivityResult(int i, int i2, Intent intent) {
        int m3105a;
        ResultReceiver resultReceiver;
        Intent m27867b;
        super.onActivityResult(i, i2, intent);
        Bundle bundle = null;
        if (i == 100) {
            m3105a = yx2.m3099g(intent, "ProxyBillingActivity").m5324b();
            if (i2 == -1) {
                if (m3105a != 0) {
                    i2 = -1;
                } else {
                    m3105a = 0;
                    resultReceiver = this.f2582p;
                    if (resultReceiver != null) {
                        if (intent == null) {
                            m27867b = m27867b();
                        } else if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                m27867b = m27868a(string);
                            } else {
                                m27867b = m27867b();
                                m27867b.putExtras(intent.getExtras());
                            }
                        } else {
                            m27867b = m27867b();
                            yx2.m3094l("ProxyBillingActivity", "Got null bundle!");
                            m27867b.putExtra("RESPONSE_CODE", 6);
                            m27867b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        }
                        sendBroadcast(m27867b);
                    }
                }
            }
            yx2.m3094l("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + m3105a);
            resultReceiver = this.f2582p;
            if (resultReceiver != null) {
            }
        } else if (i == 101) {
            m3105a = yx2.m3105a(intent, "ProxyBillingActivity");
            resultReceiver = this.f2583q;
            if (resultReceiver != null) {
            }
        } else {
            yx2.m3094l("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f2584r = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            yx2.m3095k("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2584r = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f2582p = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f2583q = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                return;
            } else {
                return;
            }
        }
        yx2.m3095k("ProxyBillingActivity", "Launching Play Store billing flow");
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f2582p = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f2583q = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i = p21.f22328T0;
                this.f2584r = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } else {
                pendingIntent = null;
            }
            this.f2584r = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e) {
            yx2.m3093m("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f2582p;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f2583q;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent m27867b = m27867b();
                    m27867b.putExtra("RESPONSE_CODE", 6);
                    m27867b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(m27867b);
                }
            }
            this.f2584r = false;
            finish();
            return;
        }
        i = 100;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2584r) {
            Intent m27867b = m27867b();
            m27867b.putExtra("RESPONSE_CODE", 1);
            m27867b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(m27867b);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f2582p;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2583q;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2584r);
    }
}
