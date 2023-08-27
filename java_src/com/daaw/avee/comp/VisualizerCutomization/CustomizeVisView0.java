package com.daaw.avee.comp.VisualizerCutomization;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.CustomComposition;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.CustomScene;
import com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter;
import com.daaw.avee.comp.VisualizerCutomization.CustomSimpleSectionedAdapter;
import com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog;
import com.emtronics.dragsortrecycler.DragSortRecycler;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CustomizeVisView0 {
    View actionsElements;
    ImageButton btnExpandAdd;
    ImageButton btnExpandReset;
    private CustomizeVisDialog customizeVisDialog;
    View expandAddElements;
    View expandReset;
    GridLayout gridAddElements;
    CustomSimpleAdapter mAdapter;
    CustomSimpleSectionedAdapter mSectionedAdapter;
    RecyclerView recyclerViewItems;
    ScrollView scrollView1;
    private final List<CustomizeVisDialog.ThreeEntry> treeElements = new ArrayList();
    public int selectedElementInTree = -1;

    public CustomizeVisView0(CustomizeVisDialog customizeVisDialog) {
        this.customizeVisDialog = customizeVisDialog;
    }

    boolean isViewCreated() {
        return this.btnExpandAdd != null;
    }

    public void onCreatedView0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, final Activity activity, final String[] strArr) {
        View inflate;
        this.actionsElements = viewGroup.findViewById(R.id.actionsElements);
        this.expandAddElements = viewGroup.findViewById(R.id.expandAddElements);
        this.expandReset = viewGroup.findViewById(R.id.expandReset);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.btnExpandAdd);
        this.btnExpandAdd = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomizeVisView0.this.closeReset();
                CustomizeVisView0.this.toggleAddElements();
            }
        });
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.btnExpandReset);
        this.btnExpandReset = imageButton2;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomizeVisView0.this.closeAddElements();
                CustomizeVisView0.this.toggleReset();
            }
        });
        ((Button) viewGroup.findViewById(R.id.btnReset)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomizeVisDialog.onResetAction.invoke(new ContextData(activity), Integer.valueOf(CustomizeVisView0.this.customizeVisDialog.rootIdentifier), CustomizeVisView0.this.customizeVisDialog.customizationScene);
            }
        });
        GridLayout gridLayout = (GridLayout) this.expandAddElements;
        this.gridAddElements = gridLayout;
        gridLayout.removeAllViews();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int intValue = ((Integer) view.getTag()).intValue();
                String[] strArr2 = strArr;
                if (intValue < strArr2.length) {
                    CustomizeVisDialog.onAddElementAction.invoke(new ContextData(view), Integer.valueOf(CustomizeVisView0.this.customizeVisDialog.rootIdentifier), Integer.valueOf(CustomizeVisView0.this.selectedElementInTree), CustomizeVisView0.this.customizeVisDialog.customizationScene, strArr2[intValue]);
                }
            }
        };
        for (int i = 0; i < strArr.length; i++) {
            if (this.customizeVisDialog.isElementTypePr(strArr[i])) {
                inflate = View.inflate(activity, R.layout.dialog_custom_vis_add_element_pr, null);
            } else {
                inflate = View.inflate(activity, R.layout.dialog_custom_vis_add_element, null);
            }
            Button button = (Button) inflate.findViewById(R.id.btnElement);
            button.setOnClickListener(onClickListener);
            button.setText(strArr[i]);
            button.setTag(Integer.valueOf(i));
            this.gridAddElements.addView(inflate);
        }
        this.scrollView1 = (ScrollView) viewGroup.findViewById(R.id.scrollView1);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recyclerViewItems);
        this.recyclerViewItems = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        CustomSimpleAdapter customSimpleAdapter = new CustomSimpleAdapter(activity, null, this.scrollView1);
        this.mAdapter = customSimpleAdapter;
        CustomSimpleSectionedAdapter customSimpleSectionedAdapter = new CustomSimpleSectionedAdapter(activity, R.layout.custom_section, 0, customSimpleAdapter, new Func<Boolean>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Func.Func
            public Boolean onInvoke() {
                return Boolean.valueOf(CustomizeVisView0.this.mAdapter.getCollapsed());
            }
        });
        this.mSectionedAdapter = customSimpleSectionedAdapter;
        this.recyclerViewItems.setAdapter(customSimpleSectionedAdapter);
        final DragSortRecycler dragSortRecycler = new DragSortRecycler();
        dragSortRecycler.setViewHandleId(R.id.btnItemMore);
        dragSortRecycler.setFloatingAlpha(0.4f);
        dragSortRecycler.setFloatingBgColor(activity.getResources().getColor(R.color.white_alpha_1));
        dragSortRecycler.setAutoScrollSpeed(0.3f);
        dragSortRecycler.setAutoScrollWindow(0.1f);
        dragSortRecycler.setOnItemMovedListener(new DragSortRecycler.OnItemMovedListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.6
            @Override // com.emtronics.dragsortrecycler.DragSortRecycler.OnItemMovedListener
            public void onItemMoved(int i2, int i3) {
                int min = Math.min(CustomizeVisView0.this.treeElements.size() - 1, Math.max(i3, 1));
                if (i2 == min) {
                    return;
                }
                CustomizeVisDialog.ThreeEntry threeEntry = null;
                if (CustomizeVisView0.this.selectedElementInTree >= 0 && CustomizeVisView0.this.selectedElementInTree < CustomizeVisView0.this.treeElements.size()) {
                    threeEntry = (CustomizeVisDialog.ThreeEntry) CustomizeVisView0.this.treeElements.get(CustomizeVisView0.this.selectedElementInTree);
                }
                CustomizeVisView0.this.treeElements.remove(i2);
                CustomizeVisView0.this.treeElements.add(min, (CustomizeVisDialog.ThreeEntry) CustomizeVisView0.this.treeElements.get(i2));
                CustomizeVisView0 customizeVisView0 = CustomizeVisView0.this;
                customizeVisView0.selectedElementInTree = threeEntry != null ? customizeVisView0.treeElements.indexOf(threeEntry) : -1;
                CustomizeVisView0 customizeVisView02 = CustomizeVisView0.this;
                customizeVisView02.updateCompositionFromTreeElements(customizeVisView02.treeElements, true);
            }
        });
        this.recyclerViewItems.addItemDecoration(dragSortRecycler);
        this.recyclerViewItems.addOnItemTouchListener(dragSortRecycler);
        this.recyclerViewItems.addOnScrollListener(dragSortRecycler.getScrollListener());
        this.mAdapter.setOnDraggingListener(new CustomSimpleAdapter.IOnDraggingListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.7
            @Override // com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter.IOnDraggingListener
            public void onStartDragging(View view) {
                dragSortRecycler.StartDragging(view);
            }
        });
        this.mAdapter.setOnItemClickListener(new CustomSimpleAdapter.IOnItemClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.8
            @Override // com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter.IOnItemClickListener
            public boolean onItemClick(int i2, View view) {
                CustomizeVisView0.this.customizeVisDialog.goToView(1);
                CustomizeVisView0.this.parsePropertyDataByIndex(i2, true);
                CustomizeVisView0.this.mSectionedAdapter.setSelectedItem(i2, view);
                return true;
            }
        });
        this.mSectionedAdapter.setOnItemClickListener(new CustomSimpleAdapter.IOnItemClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.9
            @Override // com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter.IOnItemClickListener
            public boolean onItemClick(int i2, View view) {
                CustomizeVisView0.this.customizeVisDialog.goToView(1);
                CustomizeVisView0.this.parsePropertyDataByIndex(i2, true);
                CustomizeVisView0.this.mSectionedAdapter.setSelectedItem(i2, view);
                return true;
            }
        });
    }

    public boolean isCollapsed() {
        View view = this.actionsElements;
        boolean z = view == null || view.getVisibility() == 8;
        CustomSimpleAdapter customSimpleAdapter = this.mAdapter;
        return z && (customSimpleAdapter == null || customSimpleAdapter.getCollapsed());
    }

    public void setCollapsed(boolean z) {
        View view = this.actionsElements;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        CustomSimpleAdapter customSimpleAdapter = this.mAdapter;
        if (customSimpleAdapter != null) {
            customSimpleAdapter.setCollapsed(z);
        }
        if (z) {
            closeReset();
            closeAddElements();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void parseCustomizationData(CustomScene customScene) {
        String quantityString;
        if (this.customizeVisDialog.isView1Created() && isViewCreated()) {
            int entryCount = customScene.getEntryCount();
            this.treeElements.clear();
            for (int i = 0; i < entryCount; i++) {
                CustomComposition entry = customScene.getEntry(i);
                if (entry == null) {
                    tlog.w("CustomPropertiesList is null");
                } else {
                    if (i == 0) {
                        quantityString = this.customizeVisDialog.getString(R.string.vis_customization_composition_final);
                    } else {
                        quantityString = this.customizeVisDialog.getResources().getQuantityString(R.plurals.vis_customization_composition_x, i, Integer.valueOf(i));
                    }
                    this.treeElements.add(new CustomizeVisDialog.ThreeEntry(quantityString, entry, entry.getPropertyInt("_id", -1), true));
                    parseCompositionData(entry, this.treeElements);
                }
            }
            setTreeData(this.selectedElementInTree);
        }
    }

    private static void parseCompositionData(CustomComposition customComposition, List<CustomizeVisDialog.ThreeEntry> list) {
        int entryCount = customComposition.getEntryCount();
        for (int i = 0; i < entryCount; i++) {
            CustomPropertiesList entry = customComposition.getEntry(i);
            if (entry == null) {
                tlog.w("CustomPropertiesList is null");
            } else {
                list.add(new CustomizeVisDialog.ThreeEntry(entry.getTypeName(), entry, entry.getPropertyInt("_id", -1)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleAddElements() {
        if (this.expandAddElements.getVisibility() == 0) {
            closeAddElements();
        } else {
            openAddElements();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAddElements() {
        this.btnExpandAdd.animate().rotation(0.0f).setDuration(this.customizeVisDialog.shortAnimTime);
        this.expandAddElements.animate().alpha(0.0f).setDuration(this.customizeVisDialog.shortAnimTime).withEndAction(new Runnable() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.10
            @Override // java.lang.Runnable
            public void run() {
                CustomizeVisView0.this.expandAddElements.setVisibility(8);
            }
        });
    }

    private void openAddElements() {
        this.btnExpandAdd.animate().rotation(-45.0f).setDuration(this.customizeVisDialog.shortAnimTime);
        this.expandAddElements.setVisibility(0);
        this.expandAddElements.animate().alpha(1.0f).setDuration(this.customizeVisDialog.shortAnimTime);
        this.scrollView1.post(new Runnable() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.11
            @Override // java.lang.Runnable
            public void run() {
                CustomizeVisView0.this.scrollView1.fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleReset() {
        if (this.expandReset.getVisibility() == 0) {
            closeReset();
        } else {
            openReset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeReset() {
        this.btnExpandReset.animate().rotation(0.0f).setDuration(this.customizeVisDialog.shortAnimTime);
        this.expandReset.animate().alpha(0.0f).setDuration(this.customizeVisDialog.shortAnimTime).withEndAction(new Runnable() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.12
            @Override // java.lang.Runnable
            public void run() {
                CustomizeVisView0.this.expandReset.setVisibility(8);
            }
        });
    }

    private void openReset() {
        this.btnExpandReset.animate().rotation(-45.0f).setDuration(this.customizeVisDialog.shortAnimTime);
        this.expandReset.setVisibility(0);
        this.expandReset.animate().alpha(1.0f).setDuration(this.customizeVisDialog.shortAnimTime);
        this.scrollView1.post(new Runnable() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView0.13
            @Override // java.lang.Runnable
            public void run() {
                CustomizeVisView0.this.scrollView1.fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCompositionFromTreeElements(List<CustomizeVisDialog.ThreeEntry> list, boolean z) {
        rebuildSceneFromTreeData(this.customizeVisDialog.customizationScene, list);
        setTreeData(this.selectedElementInTree);
        this.customizeVisDialog.onCompositionChanged(z);
    }

    private void updateCompositionFromScene(CustomScene customScene, boolean z) {
        parseCustomizationData(customScene);
        this.customizeVisDialog.onCompositionChanged(z);
    }

    void rebuildSceneFromTreeData(CustomScene customScene, List<CustomizeVisDialog.ThreeEntry> list) {
        customScene.removeAllEntries();
        CustomComposition customComposition = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            CustomizeVisDialog.ThreeEntry threeEntry = list.get(i3);
            CustomComposition composition = threeEntry.getComposition();
            CustomPropertiesList element = threeEntry.getElement();
            if (composition != null) {
                composition.removeAllEntries();
                customScene.setEntry(i, composition);
                i++;
                customComposition = composition;
                i2 = 0;
            } else if (element != null && customComposition != null) {
                customComposition.setEntry(i2, element);
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateSelectedItemThreeView(int i) {
        if (i < 0 || i >= this.treeElements.size()) {
            return;
        }
        CustomizeVisDialog.ThreeEntry threeEntry = this.treeElements.get(i);
        this.mSectionedAdapter.baseAdapterSetDataAt(i, new Tuple2<>(threeEntry.name, threeEntry.getSubName()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTreeData(int i) {
        setTreeData(this.treeElements, i);
    }

    void setTreeData(List<CustomizeVisDialog.ThreeEntry> list, int i) {
        if (this.mAdapter == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            CustomizeVisDialog.ThreeEntry threeEntry = list.get(i2);
            if (threeEntry.isSection()) {
                arrayList2.add(new CustomSimpleSectionedAdapter.Section(arrayList.size(), threeEntry.name));
            } else {
                arrayList.add(new Tuple2(threeEntry.name, threeEntry.getSubName()));
            }
        }
        this.mAdapter.setAllData(arrayList);
        this.mSectionedAdapter.setSections(arrayList2);
        this.mSectionedAdapter.setSelectedItem(i);
        this.customizeVisDialog.onSelectedElementChanged(this.selectedElementInTree, false);
    }

    public void removeTreeItem(int i) {
        if (this.customizeVisDialog.isView1Created() && isViewCreated()) {
            if (i < this.treeElements.size()) {
                this.treeElements.remove(i);
                updateCompositionFromTreeElements(this.treeElements, false);
            }
            int i2 = this.selectedElementInTree;
            if (i == i2) {
                parsePropertyDataByIndex(-1);
            } else {
                parsePropertyDataByIndex(i2);
            }
        }
    }

    public CustomizeVisDialog.ThreeEntry getThreeItem(int i) {
        if (i < 0 || i >= this.treeElements.size()) {
            return null;
        }
        return this.treeElements.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void parsePropertyDataByIndex(int i) {
        parsePropertyDataByIndex(i, false);
    }

    void parsePropertyDataByIndex(int i, boolean z) {
        this.selectedElementInTree = i;
        this.customizeVisDialog.onSelectedElementChanged(i, z);
        CustomSimpleSectionedAdapter customSimpleSectionedAdapter = this.mSectionedAdapter;
        if (customSimpleSectionedAdapter != null) {
            customSimpleSectionedAdapter.setSelectedItem(i);
        }
        if (i >= 0 && i < this.treeElements.size()) {
            CustomizeVisDialog.ThreeEntry threeEntry = this.treeElements.get(i);
            CustomPropertiesList element = threeEntry.getElement();
            CustomComposition composition = threeEntry.getComposition();
            if (element != null) {
                this.customizeVisDialog.parsePropertyData(element);
                return;
            } else {
                this.customizeVisDialog.parsePropertyData(composition);
                return;
            }
        }
        this.customizeVisDialog.parsePropertyData(null);
    }

    public void selectAndScrollToLast() {
        if (this.customizeVisDialog.isView1Created() && isViewCreated() && this.treeElements.size() > 0) {
            this.recyclerViewItems.scrollToPosition(this.treeElements.size() - 1);
            parsePropertyDataByIndex(this.treeElements.size() - 1);
        }
    }

    public void selectAndScrollToLast(int i) {
        if (this.customizeVisDialog.isView1Created() && isViewCreated()) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < this.treeElements.size(); i4++) {
                if (this.treeElements.get(i4).getComposition() != null) {
                    i2++;
                }
                if (i2 > i) {
                    break;
                }
                i3 = i4;
            }
            if (i3 <= 0 || this.treeElements.size() <= i3) {
                return;
            }
            this.recyclerViewItems.scrollToPosition(i3);
            parsePropertyDataByIndex(i3);
        }
    }
}
