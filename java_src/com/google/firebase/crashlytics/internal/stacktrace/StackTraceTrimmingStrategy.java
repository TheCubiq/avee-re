package com.google.firebase.crashlytics.internal.stacktrace;
/* loaded from: classes2.dex */
public interface StackTraceTrimmingStrategy {
    StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr);
}
