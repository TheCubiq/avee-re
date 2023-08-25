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

    /* renamed from: a */
    public final zs3 f36540a;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public final ys3 f36541a;

        public Builder(View view) {
            ys3 ys3Var = new ys3();
            this.f36541a = ys3Var;
            ys3Var.m3341b(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.f36541a.m3340c(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.f36540a = new zs3(builder.f36541a);
    }

    public void recordClick(List<Uri> list) {
        this.f36540a.m1940a(list);
    }

    public void recordImpression(List<Uri> list) {
        this.f36540a.m1939b(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.f36540a.m1938c(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.f36540a.m1937d(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f36540a.m1936e(list, updateImpressionUrlsCallback);
    }
}
