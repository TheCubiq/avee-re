package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.ju0;
import com.daaw.ov0;
import java.util.Collection;
/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: d */
    String m604d(Context context);

    /* renamed from: e */
    Collection<ov0<Long, Long>> m603e();

    /* renamed from: j */
    int m602j(Context context);

    /* renamed from: m */
    boolean m601m();

    /* renamed from: n */
    Collection<Long> m600n();

    /* renamed from: o */
    S m599o();

    /* renamed from: p */
    View m598p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, ju0<S> ju0Var);

    /* renamed from: r */
    void m597r(long j);
}
