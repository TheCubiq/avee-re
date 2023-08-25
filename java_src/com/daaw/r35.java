package com.daaw;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public interface r35 {
    void a(View view, MotionEvent motionEvent, View view2);

    void b(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void c(View view, Map map);

    boolean d(Bundle bundle);

    void e(View view);

    void f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType);

    void h(Bundle bundle);

    void i(Bundle bundle);

    JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void k(zzcs zzcsVar);

    void l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i);

    void m(ve3 ve3Var);

    void n(String str);

    void o(zzcw zzcwVar);

    JSONObject p(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean zzA();

    boolean zzB();

    int zza();

    void zzg();

    void zzh();

    void zzi();

    void zzp();

    void zzr();

    void zzv();
}
