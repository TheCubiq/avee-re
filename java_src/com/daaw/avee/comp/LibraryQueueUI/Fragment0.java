package com.daaw.avee.comp.LibraryQueueUI;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.astuetz.PagerSlidingTabStrip;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.GlobalSearch.SearchEntryOptions;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerRootLocal;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class Fragment0 extends LibraryQueueFragmentBase {
    private View backSwipeProgress;
    private ViewAdapter libraryRootAdapter;
    private PagerSlidingTabStrip pathTabStrip;
    private RecyclerView recyclerViewItems;
    private HashMap<String, ContainerScrollData> pathContainerData = new HashMap<>();
    private String currentAbsoluteLibraryAddress = "";

    public static Fragment0 newInstance() {
        Fragment0 fragment0 = new Fragment0();
        fragment0.setArguments(new Bundle());
        return fragment0;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String string = AppPreferences.createOrGetInstance().getString(AppPreferences.PREF_String_currentAbsoluteLibraryAddress);
        this.currentAbsoluteLibraryAddress = string;
        if (string == null) {
            this.currentAbsoluteLibraryAddress = "";
        }
        navigateLibraryAddress(null, this.currentAbsoluteLibraryAddress);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = AppPreferences.createOrGetInstance().getString(AppPreferences.PREF_String_currentAbsoluteLibraryAddress);
        this.currentAbsoluteLibraryAddress = string;
        if (string == null) {
            this.currentAbsoluteLibraryAddress = "";
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_0, viewGroup, false);
        UtilsUI.setStatusBarDimensions(inflate.findViewById(R.id.viewStatusBarBg));
        onCreateView.invoke(0, inflate.findViewById(R.id.viewActionBarBgSkin));
        this.backSwipeProgress = inflate.findViewById(R.id.backSwipeProgress);
        navigateForBackwardProgress(0.0f);
        this.pathTabStrip = (PagerSlidingTabStrip) inflate.findViewById(R.id.tabStripPath);
        int color = getResources().getColor(R.color.action_bar_fg);
        this.pathTabStrip.setTextColor(color);
        this.pathTabStrip.setTextColorSelected(color);
        this.pathTabStrip.setDividerColor(color);
        this.pathTabStrip.setUnderlineColor(color);
        this.pathTabStrip.setIndicatorColor(color);
        this.pathTabStrip.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Fragment0.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Fragment0.this.navigateLibraryAddress(null, (String) view.getTag());
            }
        });
        this.recyclerViewItems = (RecyclerView) inflate.findViewById(R.id.recyclerViewItems);
        this.recyclerViewItems.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView = this.recyclerViewItems;
        recyclerView.addItemDecoration(new SpacesItemDecoration(1, UtilsUI.getAttrColor(recyclerView, (int) R.attr.containerBackgroundDark)));
        View findViewById = inflate.findViewById(R.id.tabStripPathGroup);
        UtilsUI.disallowInterceptTouchEventRecursive(findViewById, findViewById.getParent());
        this.libraryRootAdapter = new ContainerRootLocal(getActivity(), 0, new WeakReference(this)).createOrGetAdapter(getActivity());
        navigateLibraryAddress(null, this.currentAbsoluteLibraryAddress);
        updateTrackInfo();
        updateSearchInfo();
        return inflate;
    }

    boolean isViewCreated() {
        return this.pathTabStrip != null;
    }

    public void updateTrackInfo() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.recyclerViewItems;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.recyclerViewItems.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition instanceof ContentItemViewHolder) {
                ((ContentItemViewHolder) findViewHolderForAdapterPosition).refreshSelection();
            }
        }
    }

    public void updateLibraryItems() {
        IContainerData containerData;
        if (isViewCreated()) {
            boolean z = false;
            ViewAdapter viewAdapter = (ViewAdapter) this.recyclerViewItems.getAdapter();
            if (viewAdapter != null && (containerData = viewAdapter.getContainerData()) != null) {
                z = containerData.RefreshContent(true);
            }
            if (z) {
                return;
            }
            navigateLibraryAddress(null, this.currentAbsoluteLibraryAddress, true);
        }
    }

    public void refreshAdapter(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        ViewAdapter viewAdapter;
        RecyclerView recyclerView = this.recyclerViewItems;
        if (recyclerView == null || (viewAdapter = (ViewAdapter) recyclerView.getAdapter()) == null || !viewAdapter.getContainerData().containsContainerIdentifier(iGeneralItemContainerIdentifier)) {
            return;
        }
        viewAdapter.notifyDataSetChanged();
    }

    public void navigateForBackwardProgress(float f) {
        View view = this.backSwipeProgress;
        if (view == null) {
            return;
        }
        view.setPivotX(1.0f);
        this.backSwipeProgress.setScaleX(f);
    }

    public void navigateForBackwardLibraryAddress() {
        int lastIndexOf;
        String str = this.currentAbsoluteLibraryAddress;
        if (str.charAt(str.length() - 1) == '/') {
            lastIndexOf = str.lastIndexOf(47, str.length() - 2);
        } else {
            lastIndexOf = str.lastIndexOf(47);
        }
        navigateLibraryAddress(null, lastIndexOf <= 0 ? "/" : str.substring(0, lastIndexOf));
    }

    public void navigateLibraryAddress(ViewAdapter viewAdapter, String str) {
        navigateLibraryAddress(viewAdapter, str, false);
    }

    public void navigateLibraryAddress(ViewAdapter viewAdapter, String str, boolean z) {
        RecyclerView recyclerView;
        ViewAdapter viewAdapter2;
        str = (str.length() <= 0 || str.charAt(0) != '/') ? "/" : "/";
        if (viewAdapter == null) {
            viewAdapter = this.libraryRootAdapter;
        }
        if (z || viewAdapter == null || (recyclerView = this.recyclerViewItems) == null || (viewAdapter2 = (ViewAdapter) recyclerView.getAdapter()) == null || !viewAdapter.getContainerData().makeChildAddress(str).equals(viewAdapter2.getContainerData().getLibraryAddress())) {
            if (str.length() > 0 && str.charAt(0) == '/') {
                if (viewAdapter == null) {
                    viewAdapter = this.libraryRootAdapter;
                }
                this.pathTabStrip.myClearTabs();
                this.pathTabStrip.myAddTab(viewAdapter.getContainerData().getDisplayName(), viewAdapter.getContainerData().getDisplayIconResId(), viewAdapter.getContainerData().getLibraryAddress());
                str = str.substring(1, str.length());
            }
            ViewAdapter navigateLibraryAddressRecursive = navigateLibraryAddressRecursive(viewAdapter, str);
            this.currentAbsoluteLibraryAddress = navigateLibraryAddressRecursive.getContainerData().getLibraryAddress();
            AppPreferences.createOrGetInstance().setString(AppPreferences.PREF_String_currentAbsoluteLibraryAddress, this.currentAbsoluteLibraryAddress);
            setLibraryAdapter(navigateLibraryAddressRecursive);
        }
    }

    public void navigateForwardLibraryAddress(ViewAdapter viewAdapter, String str) {
        if (viewAdapter == null) {
            viewAdapter = (ViewAdapter) this.recyclerViewItems.getAdapter();
        }
        if (viewAdapter == null) {
            return;
        }
        ViewAdapter navigateLibraryAddressRecursive = navigateLibraryAddressRecursive(viewAdapter, str);
        this.currentAbsoluteLibraryAddress = navigateLibraryAddressRecursive.getContainerData().getLibraryAddress();
        AppPreferences.createOrGetInstance().setString(AppPreferences.PREF_String_currentAbsoluteLibraryAddress, this.currentAbsoluteLibraryAddress);
        setLibraryAdapter(navigateLibraryAddressRecursive);
    }

    ViewAdapter navigateLibraryAddressRecursive(ViewAdapter viewAdapter, String str) {
        String substring;
        if (str == null || str.isEmpty()) {
            return viewAdapter;
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            substring = "";
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = str.substring(indexOf + 1, str.length());
            str = substring2;
        }
        ViewAdapter createChildAdapter = viewAdapter.getContainerData().createChildAdapter(getActivity(), str);
        if (createChildAdapter != null) {
            this.pathTabStrip.myAddTab(createChildAdapter.getContainerData().getDisplayName(), createChildAdapter.getContainerData().getDisplayIconResId(), createChildAdapter.getContainerData().getLibraryAddress());
            return navigateLibraryAddressRecursive(createChildAdapter, substring);
        }
        return viewAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r2.equals(r3) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void setLibraryAdapter(ViewAdapter viewAdapter) {
        boolean z;
        ContainerScrollData containerScrollData;
        ViewAdapter viewAdapter2 = (ViewAdapter) this.recyclerViewItems.getAdapter();
        boolean z2 = false;
        if (viewAdapter2 != null) {
            String libraryAddress = viewAdapter2.getContainerData().getLibraryAddress();
            String libraryAddress2 = viewAdapter.getContainerData().getLibraryAddress();
            z = true;
            if (libraryAddress2.length() < libraryAddress.length() && libraryAddress.contains(libraryAddress2)) {
                z2 = true;
            }
            z = false;
            if (z2) {
                this.pathContainerData.remove(libraryAddress);
            } else {
                ContainerScrollData containerScrollData2 = new ContainerScrollData();
                containerScrollData2.scrollPosition = getScrollPosition();
                this.pathContainerData.put(viewAdapter2.getContainerData().getLibraryAddress(), containerScrollData2);
            }
        } else {
            z = false;
        }
        if (viewAdapter2 != viewAdapter) {
            if (viewAdapter2 != null) {
                viewAdapter2.dispose();
            }
            updateSearchInfo(viewAdapter);
            this.recyclerViewItems.setAdapter(viewAdapter);
            if ((z2 || z) && (containerScrollData = this.pathContainerData.get(viewAdapter.getContainerData().getLibraryAddress())) != null) {
                setScrollPosition(containerScrollData.scrollPosition);
            }
        }
    }

    public void updateSearchQuery(Context context, String str) {
        ViewAdapter viewAdapter;
        RecyclerView recyclerView = this.recyclerViewItems;
        if (recyclerView == null || (viewAdapter = (ViewAdapter) recyclerView.getAdapter()) == null) {
            return;
        }
        viewAdapter.getContainerData().updateSearchQuery(context, str);
    }

    private void updateSearchInfo(ViewAdapter viewAdapter) {
        Assert.assertNotNull(getActivity());
        SearchEntryOptions searchEntryOptions = getSearchEntryOptions(viewAdapter);
        onUpdateSearchOptions.invoke(0, Boolean.valueOf(searchEntryOptions.enabled), searchEntryOptions.hint, searchEntryOptions.containerIdentifier);
    }

    private SearchEntryOptions getSearchEntryOptions(ViewAdapter viewAdapter) {
        Activity activity = getActivity();
        if (activity == null) {
            return SearchEntryOptions.refuse;
        }
        return getSearchEntryOptions(activity, viewAdapter);
    }

    public SearchEntryOptions getSearchEntryOptions() {
        RecyclerView recyclerView = this.recyclerViewItems;
        return getSearchEntryOptions(recyclerView != null ? (ViewAdapter) recyclerView.getAdapter() : null);
    }

    public void updateSearchInfo() {
        RecyclerView recyclerView = this.recyclerViewItems;
        updateSearchInfo(recyclerView != null ? (ViewAdapter) recyclerView.getAdapter() : null);
    }

    int getScrollPosition() {
        RecyclerView.LayoutManager layoutManager = this.recyclerViewItems.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    void setScrollPosition(int i) {
        RecyclerView.LayoutManager layoutManager = this.recyclerViewItems.getLayoutManager();
        if (layoutManager == null || i == -1) {
            return;
        }
        layoutManager.scrollToPosition(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ContainerScrollData {
        public int scrollPosition = 0;

        ContainerScrollData() {
        }
    }
}
