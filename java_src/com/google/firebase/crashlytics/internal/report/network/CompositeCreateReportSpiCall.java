package com.google.firebase.crashlytics.internal.report.network;

import com.google.firebase.crashlytics.internal.report.model.CreateReportRequest;
import com.google.firebase.crashlytics.internal.report.model.Report;
/* loaded from: classes2.dex */
public class CompositeCreateReportSpiCall implements CreateReportSpiCall {
    private final DefaultCreateReportSpiCall javaReportSpiCall;
    private final NativeCreateReportSpiCall nativeReportSpiCall;

    public CompositeCreateReportSpiCall(DefaultCreateReportSpiCall defaultCreateReportSpiCall, NativeCreateReportSpiCall nativeCreateReportSpiCall) {
        this.javaReportSpiCall = defaultCreateReportSpiCall;
        this.nativeReportSpiCall = nativeCreateReportSpiCall;
    }

    /* renamed from: com.google.firebase.crashlytics.internal.report.network.CompositeCreateReportSpiCall$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$crashlytics$internal$report$model$Report$Type;

        static {
            int[] iArr = new int[Report.Type.values().length];
            $SwitchMap$com$google$firebase$crashlytics$internal$report$model$Report$Type = iArr;
            try {
                iArr[Report.Type.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$crashlytics$internal$report$model$Report$Type[Report.Type.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall
    public boolean invoke(CreateReportRequest createReportRequest, boolean z) {
        int i = AnonymousClass1.$SwitchMap$com$google$firebase$crashlytics$internal$report$model$Report$Type[createReportRequest.report.getType().ordinal()];
        if (i == 1) {
            this.javaReportSpiCall.invoke(createReportRequest, z);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.nativeReportSpiCall.invoke(createReportRequest, z);
            return true;
        }
    }
}
