package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;
/* loaded from: classes2.dex */
final /* synthetic */ class zzaqv {
    static final /* synthetic */ int[] zzdbn;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        zzdbn = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdbn[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdbn[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdbn[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzdbn[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
