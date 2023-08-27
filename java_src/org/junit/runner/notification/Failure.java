package org.junit.runner.notification;

import java.io.Serializable;
import org.junit.internal.Throwables;
import org.junit.runner.Description;
/* loaded from: classes2.dex */
public class Failure implements Serializable {
    private static final long serialVersionUID = 1;
    private final Description fDescription;
    private final Throwable fThrownException;

    public Failure(Description description, Throwable th) {
        this.fThrownException = th;
        this.fDescription = description;
    }

    public String getTestHeader() {
        return this.fDescription.getDisplayName();
    }

    public Description getDescription() {
        return this.fDescription;
    }

    public Throwable getException() {
        return this.fThrownException;
    }

    public String toString() {
        return getTestHeader() + ": " + this.fThrownException.getMessage();
    }

    public String getTrace() {
        return Throwables.getStacktrace(getException());
    }

    public String getTrimmedTrace() {
        return Throwables.getTrimmedStackTrace(getException());
    }

    public String getMessage() {
        return getException().getMessage();
    }
}
