package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
/* loaded from: classes2.dex */
final /* synthetic */ class CrashlyticsCore$$Lambda$1 implements BreadcrumbHandler {
    private final CrashlyticsCore arg$1;

    private CrashlyticsCore$$Lambda$1(CrashlyticsCore crashlyticsCore) {
        this.arg$1 = crashlyticsCore;
    }

    public static BreadcrumbHandler lambdaFactory$(CrashlyticsCore crashlyticsCore) {
        return new CrashlyticsCore$$Lambda$1(crashlyticsCore);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
    public void handleBreadcrumb(String str) {
        this.arg$1.log(str);
    }
}
