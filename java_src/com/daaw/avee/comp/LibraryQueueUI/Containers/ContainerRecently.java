package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerRecently extends ContainerSongs {

    /* loaded from: classes.dex */
    private static class ContentAccessor implements Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> {
        private ContentAccessor() {
        }

        @Override // com.daaw.avee.Common.Func.Func1
        public MultiList<PlaylistSong, IItemIdentifier> onInvoke(ContainerBase containerBase) {
            return MultiList.fromList1FillWith2(ContainerRecently.getTrackList(PlayerCore.s().getAppContext(), containerBase.getPageIndex(), containerBase.getSelectionContainerIdentifier()), null);
        }
    }

    public ContainerRecently(Context context, String str, String str2, int i, int i2) {
        super(context, new ContentAccessor(), str, str2, i, i2, false);
    }

    static List<PlaylistSong> getTrackList(Context context, int i, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        Cursor querySafe;
        int i2 = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_recentlyAddedWeeks);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] strArr = {"_id", "_data"};
        String orderBy = MediaStoreUtils.getOrderBy(onRequestCurrentSortDesc.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, null), 4);
        while (true) {
            querySafe = MediaStoreUtils.querySafe(contentResolver, uri, strArr, "date_added>" + ((System.currentTimeMillis() / 1000) - (604800 * i2)), null, orderBy);
            i2++;
            if (i2 <= 8 && (querySafe == null || querySafe.getCount() <= 0)) {
            }
        }
        if (querySafe != null) {
            List<PlaylistSong> songListFromCursor = UtilsMusic.songListFromCursor(querySafe);
            querySafe.close();
            return songListFromCursor;
        }
        return new ArrayList();
    }
}
