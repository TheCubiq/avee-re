package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public class zzbbu extends IOException {
    private zzbcu zzdut;

    public zzbbu(String str) {
        super(str);
        this.zzdut = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzadl() {
        return new zzbbu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzadm() {
        return new zzbbu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzadn() {
        return new zzbbu("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzado() {
        return new zzbbu("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzadp() {
        return new zzbbu("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbv zzadq() {
        return new zzbbv("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzadr() {
        return new zzbbu("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbbu zzads() {
        return new zzbbu("Protocol message had invalid UTF-8.");
    }

    public final zzbbu zzj(zzbcu zzbcuVar) {
        this.zzdut = zzbcuVar;
        return this;
    }
}
