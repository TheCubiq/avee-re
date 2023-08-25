package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class AdValue {

    /* renamed from: a */
    public final int f36018a;

    /* renamed from: b */
    public final String f36019b;

    /* renamed from: c */
    public final long f36020c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    public AdValue(int i, String str, long j) {
        this.f36018a = i;
        this.f36019b = str;
        this.f36020c = j;
    }

    public static AdValue zza(int i, String str, long j) {
        return new AdValue(i, str, j);
    }

    public String getCurrencyCode() {
        return this.f36019b;
    }

    public int getPrecisionType() {
        return this.f36018a;
    }

    public long getValueMicros() {
        return this.f36020c;
    }
}
