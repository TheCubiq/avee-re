package com.google.firebase.crashlytics.internal.report.model;

import java.io.File;
import java.util.Map;
/* loaded from: classes2.dex */
public interface Report {

    /* loaded from: classes2.dex */
    public enum Type {
        JAVA,
        NATIVE
    }

    Map<String, String> getCustomHeaders();

    File getFile();

    String getFileName();

    File[] getFiles();

    String getIdentifier();

    Type getType();

    void remove();
}
