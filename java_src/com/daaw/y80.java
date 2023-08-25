package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.SearchView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class y80 extends qa implements SearchView.OnQueryTextListener {
    public y80(Context context, ViewGroup viewGroup, wc0 wc0Var) {
        super(gr1.p(context).inflate(R.layout.header_artists_item, viewGroup, false));
    }

    @Override // com.daaw.ma, com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        super.O(wc0Var, i);
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        return false;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
