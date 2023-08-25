package com.google.android.gms.ads.rewarded;
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {

    /* renamed from: a */
    public final String f36542a;

    /* renamed from: b */
    public final String f36543b;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f36544a = "";

        /* renamed from: b */
        public String f36545b = "";

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.f36545b = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.f36544a = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.f36542a = builder.f36544a;
        this.f36543b = builder.f36545b;
    }

    public String getCustomData() {
        return this.f36543b;
    }

    public String getUserId() {
        return this.f36542a;
    }
}
