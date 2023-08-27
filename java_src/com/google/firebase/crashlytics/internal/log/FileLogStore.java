package com.google.firebase.crashlytics.internal.log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    String getLogAsString();

    void writeToLog(long j, String str);
}
