package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class xs7 extends IOException {
    public xt7 p;
    public boolean q;

    public xs7(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.p = null;
    }

    public xs7(String str) {
        super(str);
        this.p = null;
    }

    public static ws7 a() {
        return new ws7("Protocol message tag had invalid wire type.");
    }

    public static xs7 b() {
        return new xs7("Protocol message end-group tag did not match expected tag.");
    }

    public static xs7 c() {
        return new xs7("Protocol message contained an invalid tag (zero).");
    }

    public static xs7 d() {
        return new xs7("Protocol message had invalid UTF-8.");
    }

    public static xs7 e() {
        return new xs7("CodedInputStream encountered a malformed varint.");
    }

    public static xs7 f() {
        return new xs7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static xs7 g() {
        return new xs7("Failed to parse the message.");
    }

    public static xs7 i() {
        return new xs7("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static xs7 j() {
        return new xs7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final xs7 h(xt7 xt7Var) {
        this.p = xt7Var;
        return this;
    }

    public final void k() {
        this.q = true;
    }

    public final boolean l() {
        return this.q;
    }
}
