package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class xs7 extends IOException {

    /* renamed from: p */
    public xt7 f32932p;

    /* renamed from: q */
    public boolean f32933q;

    public xs7(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f32932p = null;
    }

    public xs7(String str) {
        super(str);
        this.f32932p = null;
    }

    /* renamed from: a */
    public static ws7 m4543a() {
        return new ws7("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static xs7 m4542b() {
        return new xs7("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static xs7 m4541c() {
        return new xs7("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static xs7 m4540d() {
        return new xs7("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static xs7 m4539e() {
        return new xs7("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static xs7 m4538f() {
        return new xs7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static xs7 m4537g() {
        return new xs7("Failed to parse the message.");
    }

    /* renamed from: i */
    public static xs7 m4535i() {
        return new xs7("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    public static xs7 m4534j() {
        return new xs7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final xs7 m4536h(xt7 xt7Var) {
        this.f32932p = xt7Var;
        return this;
    }

    /* renamed from: k */
    public final void m4533k() {
        this.f32933q = true;
    }

    /* renamed from: l */
    public final boolean m4532l() {
        return this.f32933q;
    }
}
