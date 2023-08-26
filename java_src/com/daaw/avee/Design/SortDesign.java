package com.daaw.avee.Design;

import android.view.View;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.ContextData;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Dialog.SortDialog;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class SortDesign {
    public static final String SortDialogArg_Files = "files";
    public static final String SortDialogArg_Regular = "regular";
    public static final String SortDialogArg_Stations = "stations";
    public static final int Sort_Descending = 1;
    public static final int Sort_Mode_Album = 2;
    public static final int Sort_Mode_Artist = 1;
    public static final int Sort_Mode_Bitrate = 9;
    public static final int Sort_Mode_DateAdded = 4;
    public static final int Sort_Mode_DateModified = 5;
    public static final int Sort_Mode_Default = 8;
    public static final int Sort_Mode_Duration = 6;
    public static final int Sort_Mode_Path = 3;
    public static final int Sort_Mode_Size = 7;
    public static final int Sort_Mode_Title = 0;
    public static final int Sort_Mode_Unsorted = 10;
    public static final Tuple2<Integer, String> Sort_Mode_Default_ = new Tuple2<>(8, "Default");
    public static final Tuple2<Integer, String> Sort_Mode_Title_ = new Tuple2<>(0, "Title/Name");
    public static final Tuple2<Integer, String> Sort_Mode_Path_ = new Tuple2<>(3, "Path/Url");
    public static final Tuple2<Integer, String> Sort_Mode_Bitrate_ = new Tuple2<>(9, "Bitrate");
    public static final Tuple2<Integer, String> Sort_Mode_Unsorted_ = new Tuple2<>(10, "Unsorted");
    private MultiList<Integer, String> radioOptions = new MultiList<>();
    private MultiList<Integer, String> checkOptions = new MultiList<>();
    private List<Object> listenerRefHolder = new LinkedList();

    /* loaded from: classes.dex */
    public static class SortDesc {
        public boolean sortDescending;
        public int sortModeIndex;
    }

    public SortDesign() {
        this.radioOptions.add((MultiList<Integer, String>) 8, (int) "Default");
        this.radioOptions.add((MultiList<Integer, String>) 0, (int) "Title/Name");
        this.radioOptions.add((MultiList<Integer, String>) 1, (int) "Artist");
        this.radioOptions.add((MultiList<Integer, String>) 2, (int) "Album");
        this.radioOptions.add((MultiList<Integer, String>) 3, (int) "File Path");
        this.radioOptions.add((MultiList<Integer, String>) 4, (int) "Date Added");
        this.radioOptions.add((MultiList<Integer, String>) 5, (int) "Date Modified");
        this.radioOptions.add((MultiList<Integer, String>) 6, (int) "Duration");
        this.radioOptions.add((MultiList<Integer, String>) 7, (int) "Size");
        this.checkOptions.add((MultiList<Integer, String>) 1, (int) "Descending");
        LibraryQueueFragmentBase.onActionChooseSort.subscribeWeak(new WeakEvent2.Handler<ContextData, View>() { // from class: com.daaw.avee.Design.SortDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ContextData contextData, View view) {
                SortDialog.createAndShowDialog(contextData, view, SortDesign.SortDialogArg_Regular);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionChooseSortFiles.subscribeWeak(new WeakEvent2.Handler<ContextData, View>() { // from class: com.daaw.avee.Design.SortDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ContextData contextData, View view) {
                SortDialog.createAndShowDialog(contextData, view, SortDesign.SortDialogArg_Files);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionChooseSortStations.subscribeWeak(new WeakEvent2.Handler<ContextData, View>() { // from class: com.daaw.avee.Design.SortDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ContextData contextData, View view) {
                SortDialog.createAndShowDialog(contextData, view, SortDesign.SortDialogArg_Stations);
            }
        }, this.listenerRefHolder);
        SortDialog.onRequestSortOptions.subscribeWeak(new WeakEventR3.Handler<Integer, IGeneralItemContainerIdentifier, String, SortOptions>() { // from class: com.daaw.avee.Design.SortDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEventR3.Handler
            public SortOptions invoke(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, String str) {
                SortOptions sortOptions = SortDesign.this.getSortOptions();
                if (str.equals(SortDesign.SortDialogArg_Regular)) {
                    return sortOptions;
                }
                if (str.equals(SortDesign.SortDialogArg_Files)) {
                    return sortOptions.getRefined(8, 0, 3, 5, 7);
                }
                if (str.equals(SortDesign.SortDialogArg_Stations)) {
                    sortOptions.setRadioOptions(SortDesign.Sort_Mode_Default_, SortDesign.Sort_Mode_Title_, SortDesign.Sort_Mode_Path_, SortDesign.Sort_Mode_Bitrate_);
                }
                return sortOptions;
            }
        }, this.listenerRefHolder);
        SortDialog.onSubmitSortOptions.subscribeWeak(new WeakEvent4.Handler<Integer, IGeneralItemContainerIdentifier, Integer, Integer>() { // from class: com.daaw.avee.Design.SortDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, Integer num2, Integer num3) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_SortSelectedRadioOption, num2.intValue());
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_SortMaskCheckOptions, num3.intValue());
                SortDesign.this.updateLibraryItems();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestCurrentSortDesc.subscribeWeak(new WeakEventR2.Handler<Integer, IGeneralItemContainerIdentifier, SortDesc>() { // from class: com.daaw.avee.Design.SortDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public SortDesc invoke(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
                int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_SortSelectedRadioOption);
                int i2 = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_SortMaskCheckOptions);
                SortDesc sortDesc = new SortDesc();
                sortDesc.sortModeIndex = i;
                sortDesc.sortDescending = (i2 & 1) != 0;
                return sortDesc;
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestFilterFileResult.subscribeWeak(new WeakEventR3.Handler<Integer, IGeneralItemContainerIdentifier, File, Boolean>() { // from class: com.daaw.avee.Design.SortDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEventR3.Handler
            public Boolean invoke(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, File file) {
                if (file.isDirectory()) {
                    return true;
                }
                String extractFilenameExt = UtilsFileSys.extractFilenameExt(file);
                if (extractFilenameExt.equals("mp3") || extractFilenameExt.equals("wav") || extractFilenameExt.equals("mp4") || extractFilenameExt.equals("m4a") || extractFilenameExt.equals("m4p") || extractFilenameExt.equals("m4b") || extractFilenameExt.equals("m4r") || extractFilenameExt.equals("m4v") || extractFilenameExt.equals("mp4v") || extractFilenameExt.equals("3gp") || extractFilenameExt.equals("3g2") || extractFilenameExt.equals("3gp2") || extractFilenameExt.equals("3gpp") || extractFilenameExt.equals("3ga") || extractFilenameExt.equals("webm") || extractFilenameExt.equals("flv") || extractFilenameExt.equals("aac") || extractFilenameExt.equals("mkv") || extractFilenameExt.equals("fmp4") || extractFilenameExt.equals("ts") || extractFilenameExt.equals("tsv") || extractFilenameExt.equals("tsa") || extractFilenameExt.equals("flac") || extractFilenameExt.equals("mid") || extractFilenameExt.equals("midi") || extractFilenameExt.equals("rmi") || extractFilenameExt.equals("xmf") || extractFilenameExt.equals("mxmf") || extractFilenameExt.equals("rtttl") || extractFilenameExt.equals("rtx") || extractFilenameExt.equals("ota") || extractFilenameExt.equals("imy") || extractFilenameExt.equals("ogg") || extractFilenameExt.equals("asf") || extractFilenameExt.equals("wma") || extractFilenameExt.equals("wmv") || extractFilenameExt.equals("wm") || extractFilenameExt.equals("asx") || extractFilenameExt.equals("wax") || extractFilenameExt.equals("wvx") || extractFilenameExt.equals("wmx") || extractFilenameExt.equals("wpl") || extractFilenameExt.equals("dvr-ms") || extractFilenameExt.equals("wmd") || extractFilenameExt.equals("avi") || extractFilenameExt.equals("mpg") || extractFilenameExt.equals("mpeg") || extractFilenameExt.equals("m1v") || extractFilenameExt.equals("mp2") || extractFilenameExt.equals("mpa") || extractFilenameExt.equals("mpe") || extractFilenameExt.equals("mpga") || extractFilenameExt.equals("aif") || extractFilenameExt.equals("aifc") || extractFilenameExt.equals("aiff") || extractFilenameExt.equals("au") || extractFilenameExt.equals("snd") || extractFilenameExt.equals("cda") || extractFilenameExt.equals("ivf") || extractFilenameExt.equals("mov") || extractFilenameExt.equals("adt") || extractFilenameExt.equals("adts") || extractFilenameExt.equals("m2ts") || extractFilenameExt.equals("amr") || extractFilenameExt.equals("aup") || extractFilenameExt.equals("caf") || extractFilenameExt.equals("kar") || extractFilenameExt.equals("mmf") || extractFilenameExt.equals("oma") || extractFilenameExt.equals("opus") || extractFilenameExt.equals("qcp") || extractFilenameExt.equals("ra") || extractFilenameExt.equals("ram") || extractFilenameExt.equals("xspf") || extractFilenameExt.equals("m3u") || extractFilenameExt.equals("m3u8")) {
                    return true;
                }
                return false;
            }
        }, this.listenerRefHolder);
    }

    public static <T> boolean contains(T[] tArr, T t) {
        for (Object obj : tArr) {
            if (obj == t) {
                return true;
            }
            if (t != null && t.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public SortOptions getSortOptions() {
        int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_SortSelectedRadioOption);
        int i2 = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_SortMaskCheckOptions);
        SortOptions sortOptions = new SortOptions();
        sortOptions.radioOptions = this.radioOptions;
        sortOptions.checkOptions = this.checkOptions;
        sortOptions.selectedRadioOption = i;
        sortOptions.maskCheckOptions = i2;
        return sortOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLibraryItems() {
        Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
        if (fragment0Instance != null) {
            fragment0Instance.updateLibraryItems();
        }
    }

    /* loaded from: classes.dex */
    public static class SortOptions {
        public MultiList<Integer, String> checkOptions;
        public int maskCheckOptions;
        public MultiList<Integer, String> radioOptions;
        public int selectedRadioOption;

        public SortOptions getRefined(int... iArr) {
            SortOptions sortOptions = new SortOptions();
            sortOptions.radioOptions = new MultiList<>();
            Iterator<Tuple2<Integer, String>> it = this.radioOptions.iterator();
            while (it.hasNext()) {
                Tuple2<Integer, String> next = it.next();
                if (SortDesign.contains(iArr, next.obj1.intValue())) {
                    sortOptions.radioOptions.add(next);
                }
            }
            sortOptions.checkOptions = this.checkOptions;
            sortOptions.selectedRadioOption = this.selectedRadioOption;
            sortOptions.maskCheckOptions = this.maskCheckOptions;
            return sortOptions;
        }

        public void setRadioOptions(Tuple2<Integer, String>... tuple2Arr) {
            this.radioOptions = new MultiList<>();
            for (Tuple2<Integer, String> tuple2 : tuple2Arr) {
                this.radioOptions.add(tuple2);
            }
        }
    }
}
