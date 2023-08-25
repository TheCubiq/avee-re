package com.google.android.gms.ads.rewarded;
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    public final String a;
    public final String b;

    /* loaded from: classes.dex */
    public static final class Builder {
        public String a = "";
        public String b = "";

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.b = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.a = builder.a;
        this.b = builder.b;
    }

    public String getCustomData() {
        return this.b;
    }

    public String getUserId() {
        return this.a;
    }
}
