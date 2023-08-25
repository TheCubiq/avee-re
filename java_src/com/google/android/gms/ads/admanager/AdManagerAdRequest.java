package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.query.AdInfo;
import java.util.List;
/* loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* loaded from: classes.dex */
    public static final class Builder extends AdRequest.Builder {
        public Builder addCategoryExclusion(String str) {
            this.f36009a.zzq(str);
            return this;
        }

        public Builder addCustomTargeting(String str, String str2) {
            this.f36009a.zzs(str, str2);
            return this;
        }

        public Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.f36009a.zzs(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @Deprecated
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdInfo(AdInfo adInfo) {
            setAdInfo(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @Deprecated
        public Builder setAdInfo(AdInfo adInfo) {
            this.f36009a.zzy(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdString(String str) {
            setAdString(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public Builder setAdString(String str) {
            this.f36009a.zzz(str);
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.f36009a.zzG(str);
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.f36008a.zze();
    }

    public String getPublisherProvidedId() {
        return this.f36008a.zzm();
    }

    @Override // com.google.android.gms.ads.AdRequest
    public final zzdx zza() {
        return this.f36008a;
    }
}
