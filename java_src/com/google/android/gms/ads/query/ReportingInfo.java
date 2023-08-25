package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.ys3;
import com.daaw.zs3;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ReportingInfo {
    public final zs3 a;

    /* loaded from: classes.dex */
    public static final class Builder {
        public final ys3 a;

        public Builder(View view) {
            ys3 ys3Var = new ys3();
            this.a = ys3Var;
            ys3Var.b(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.a.c(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.a = new zs3(builder.a);
    }

    public void recordClick(List<Uri> list) {
        this.a.a(list);
    }

    public void recordImpression(List<Uri> list) {
        this.a.b(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.a.c(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.a.d(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.a.e(list, updateImpressionUrlsCallback);
    }
}
