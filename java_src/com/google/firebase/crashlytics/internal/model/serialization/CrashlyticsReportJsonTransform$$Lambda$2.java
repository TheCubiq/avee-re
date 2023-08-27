package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
/* loaded from: classes2.dex */
final /* synthetic */ class CrashlyticsReportJsonTransform$$Lambda$2 implements CrashlyticsReportJsonTransform.ObjectParser {
    private static final CrashlyticsReportJsonTransform$$Lambda$2 instance = new CrashlyticsReportJsonTransform$$Lambda$2();

    private CrashlyticsReportJsonTransform$$Lambda$2() {
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.access$lambda$1(jsonReader);
    }
}
