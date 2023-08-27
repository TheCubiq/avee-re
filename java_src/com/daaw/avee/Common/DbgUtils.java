package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class DbgUtils {
    public static String getStackTrace() {
        StackTraceElement[] stackTrace;
        StringBuffer stringBuffer = new StringBuffer();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            stringBuffer.append("\tat " + stackTraceElement);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
