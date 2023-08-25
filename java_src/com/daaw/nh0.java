package com.daaw;

import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class nh0 extends CancellationException {

    /* renamed from: p */
    public final mh0 f20119p;

    public nh0(String str, Throwable th, mh0 mh0Var) {
        super(str);
        this.f20119p = mh0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof nh0) {
                nh0 nh0Var = (nh0) obj;
                if (!ug0.m8273a(nh0Var.getMessage(), getMessage()) || !ug0.m8273a(nh0Var.f20119p, this.f20119p) || !ug0.m8273a(nh0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        ug0.m8271c(message);
        int hashCode = ((message.hashCode() * 31) + this.f20119p.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f20119p;
    }
}
