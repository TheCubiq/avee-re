package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface NativeSessionFile {
    CrashlyticsReport.FilesPayload.File asFilePayload();

    String getReportsEndpointFilename();

    InputStream getStream();
}
