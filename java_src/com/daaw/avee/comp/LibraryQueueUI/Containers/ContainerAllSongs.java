package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerAllSongs extends ContainerSongs {

    /* loaded from: classes.dex */
    private static class ContentAccessor implements Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> {
        private ContentAccessor() {
        }

        @Override // com.daaw.avee.Common.Func.Func1
        public MultiList<PlaylistSong, IItemIdentifier> onInvoke(ContainerBase containerBase) {
            return MultiList.fromList1FillWith2(ContainerAllSongs.getTrackList(PlayerCore.s().getAppContext(), containerBase.getPageIndex(), containerBase.getSelectionContainerIdentifier()), null);
        }
    }

    public ContainerAllSongs(Context context, String str, String str2, int i, int i2) {
        super(context, new ContentAccessor(), str, str2, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<PlaylistSong> getTrackList(Context context, int i, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        if (context == null) {
            return new ArrayList();
        }
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, MediaStoreUtils.getOrderBy(onRequestCurrentSortDesc.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, null), 0));
        ArrayList arrayList = new ArrayList();
        if (querySafe != null) {
            UtilsMusic.songListFromCursor(querySafe, arrayList);
        }
        return arrayList;
    }
}
