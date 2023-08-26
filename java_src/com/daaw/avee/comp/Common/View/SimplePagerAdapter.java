package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
/* loaded from: classes.dex */
public class SimplePagerAdapter extends PagerAdapter {
    int[] layoutPageResourceIds;
    private Context mContext;
    private OnPageCreateViewListener onPageCreateViewListener;
    String[] pageTitles;

    /* loaded from: classes.dex */
    public interface OnPageCreateViewListener {
        void onPageCreateView(int i, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public SimplePagerAdapter(Context context, int[] iArr, int[] iArr2, OnPageCreateViewListener onPageCreateViewListener) {
        this.onPageCreateViewListener = onPageCreateViewListener;
        this.mContext = context;
        this.layoutPageResourceIds = iArr;
        this.pageTitles = new String[iArr.length];
        for (int i = 0; i < iArr2.length; i++) {
            this.pageTitles[i] = this.mContext.getString(iArr2[i]);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(this.layoutPageResourceIds[i], viewGroup, false);
        viewGroup.addView(viewGroup2);
        this.onPageCreateViewListener.onPageCreateView(i, from, viewGroup2, null);
        return viewGroup2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.layoutPageResourceIds.length;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.pageTitles[i];
    }
}
