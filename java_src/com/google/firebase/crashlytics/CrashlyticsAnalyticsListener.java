package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {
    static final String CRASHLYTICS_ORIGIN = "clx";
    static final String EVENT_NAME_KEY = "name";
    static final String EVENT_ORIGIN_KEY = "_o";
    static final String EVENT_PARAMS_KEY = "params";
    private AnalyticsEventReceiver breadcrumbEventReceiver;
    private AnalyticsEventReceiver crashlyticsOriginEventReceiver;

    public void setCrashlyticsOriginEventReceiver(AnalyticsEventReceiver analyticsEventReceiver) {
        this.crashlyticsOriginEventReceiver = analyticsEventReceiver;
    }

    public void setBreadcrumbEventReceiver(AnalyticsEventReceiver analyticsEventReceiver) {
        this.breadcrumbEventReceiver = analyticsEventReceiver;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, Bundle bundle) {
        String string;
        Logger logger = Logger.getLogger();
        logger.d("Received Analytics message: " + i + " " + bundle);
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle(EVENT_PARAMS_KEY);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        notifyEventReceivers(string, bundle2);
    }

    private void notifyEventReceivers(String str, Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if (CRASHLYTICS_ORIGIN.equals(bundle.getString(EVENT_ORIGIN_KEY))) {
            analyticsEventReceiver = this.crashlyticsOriginEventReceiver;
        } else {
            analyticsEventReceiver = this.breadcrumbEventReceiver;
        }
        notifyEventReceiver(analyticsEventReceiver, str, bundle);
    }

    private static void notifyEventReceiver(AnalyticsEventReceiver analyticsEventReceiver, String str, Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }
}
