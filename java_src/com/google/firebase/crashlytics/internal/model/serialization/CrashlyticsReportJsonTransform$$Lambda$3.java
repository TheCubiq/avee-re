package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
/* loaded from: classes2.dex */
final /* synthetic */ class CrashlyticsReportJsonTransform$$Lambda$3 implements CrashlyticsReportJsonTransform.ObjectParser {
    private static final CrashlyticsReportJsonTransform$$Lambda$3 instance = new CrashlyticsReportJsonTransform$$Lambda$3();

    private CrashlyticsReportJsonTransform$$Lambda$3() {
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.access$lambda$2(jsonReader);
    }
}
