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
    String d(Context context);

    Collection<ov0<Long, Long>> e();

    int j(Context context);

    boolean m();

    Collection<Long> n();

    S o();

    View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, ju0<S> ju0Var);

    void r(long j);
}
