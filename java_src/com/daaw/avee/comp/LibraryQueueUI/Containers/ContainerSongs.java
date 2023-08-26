package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakDelegate3;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Tuple3;
import com.daaw.avee.Common.VTaskResult;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.Design.PlaybackControlsDesign;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterableListContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsQueue;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class ContainerSongs extends FilterableListContainerBase<Tuple2<PlaylistSong, IItemIdentifier>, MultiList<PlaylistSong, IItemIdentifier>> {
    private static final int primaryActionIndex = 0;
    private static final int primaryActionPLNowIndex = 0;
    ActionListenerBase[] itemListenerActionsPLNow;
    ActionListenerBase[] itemListenerActionsSongs;
    ActionListenerBase[] itemListenerActionsSongsHeader;
    private final boolean playnowList;
    public static WeakDelegate3<ContentItemViewHolder, PlaylistSong.Data, Boolean> onPlaylistSongDataAvailableToViewHolder = new WeakDelegate3<>();
    static Handler mainTreadHandler = new Handler(Looper.getMainLooper());

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        return "";
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ListContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    public ContainerSongs(Context context, Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> func1, String str, String str2, boolean z, int i) {
        super(context, func1, new MultiList.Factory(), str, new VTaskResult(str2), 0, new SearchFilter(context), i);
        this.itemListenerActionsSongs = new ActionListenerBase[]{new ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2
            protected Tuple3<Integer, IPlaylistSongContainerIdentifier, Boolean> onPlayAllContainer(Context context2, Object obj, List<PlaylistSong> list, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, MultiList<PlaylistSong, IItemIdentifier> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier2 = (IPlaylistSongContainerIdentifier) ContainerSongs.this.getSelectionContainerIdentifier();
                if (iPlaylistSongContainerIdentifier != null && iPlaylistSongContainerIdentifier.equals(ContainerSongs.this.getSelectionContainerIdentifier())) {
                    PlaylistSong playlistSong = null;
                    PlaylistSong playlistSong2 = (thisItemIdentifier.itemPosition < 0 || thisItemIdentifier.itemPosition >= ((MultiList) ContainerSongs.this.getList()).size()) ? null : (PlaylistSong) ((MultiList) ContainerSongs.this.getList()).get1(thisItemIdentifier.itemPosition);
                    if (thisItemIdentifier.itemPosition >= 0 && thisItemIdentifier.itemPosition < multiList.size()) {
                        playlistSong = multiList.get1(thisItemIdentifier.itemPosition);
                    }
                    if (playlistSong2 != null && playlistSong2.equals(playlistSong)) {
                        return new Tuple3<>(Integer.valueOf(thisItemIdentifier.itemPosition), iPlaylistSongContainerIdentifier2, true);
                    }
                }
                Iterator it = ((MultiList) ContainerSongs.this.getList()).iterator();
                while (it.hasNext()) {
                    list.add(((Tuple2) it.next()).obj1);
                }
                return new Tuple3<>(Integer.valueOf(thisItemIdentifier.itemPosition), iPlaylistSongContainerIdentifier2, false);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2
            protected ItemActionsSongs.ItemsDetails onDetails(Context context2, Object obj) {
                return new ItemActionsSongs.ItemsDetails(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.7
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener
            protected void onSetAsRingtone(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }};
        this.itemListenerActionsSongsHeader = new ActionListenerBase[]{new ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2
            protected Tuple3<Integer, IPlaylistSongContainerIdentifier, Boolean> onPlayAllContainer(Context context2, Object obj, List<PlaylistSong> list, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, MultiList<PlaylistSong, IItemIdentifier> multiList) {
                IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier2 = (IPlaylistSongContainerIdentifier) ContainerSongs.this.getSelectionContainerIdentifier();
                Iterator it = ((MultiList) ContainerSongs.this.getList()).iterator();
                while (it.hasNext()) {
                    list.add(((Tuple2) it.next()).obj1);
                }
                return new Tuple3<>(0, iPlaylistSongContainerIdentifier2, false);
            }
        }, new ItemActionsSongs.EnqueueAllContainerItemAction.EnqueueAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.EnqueueAllContainerItemAction.EnqueueAllContainerActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                Iterator it = ((MultiList) ContainerSongs.this.getList()).iterator();
                while (it.hasNext()) {
                    list.add(((Tuple2) it.next()).obj1);
                }
            }
        }};
        this.itemListenerActionsPLNow = new ActionListenerBase[]{new ItemActionsQueue.PlayQueueItemAction.PlayQueueItemActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.10
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsQueue.PlayQueueItemAction.PlayQueueItemActionListener2
            protected IItemIdentifier onPlay(Context context2, Object obj) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                if (thisItemIdentifier.itemIdent == null) {
                    tlog.w("ThisItemIdentifier is null, in Queue");
                }
                return thisItemIdentifier.itemIdent;
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.11
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.12
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.13
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.14
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsQueue.RemoveQueueItemAction.RemoveQueueItemActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.15
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsQueue.RemoveQueueItemAction.RemoveQueueItemActionListener2
            protected void onRemove(Context context2, Object obj, List<Integer> list, List<IItemIdentifier> list2) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                list.add(Integer.valueOf(thisItemIdentifier.itemPosition));
                list2.add(thisItemIdentifier.itemIdent);
            }
        }, new ItemActionsQueue.TipReorderItemAction.TipReorderItemActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.16
        }, new ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.17
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2
            protected ItemActionsSongs.ItemsDetails onDetails(Context context2, Object obj) {
                return new ItemActionsSongs.ItemsDetails(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.18
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener
            protected void onSetAsRingtone(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }};
        this.playnowList = z;
    }

    public ContainerSongs(Context context, Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> func1, String str, String str2, int i, int i2, boolean z) {
        super(context, func1, new MultiList.Factory(), str, new VTaskResult(str2), i, new SearchFilter(context), i2);
        this.itemListenerActionsSongs = new ActionListenerBase[]{new ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2
            protected Tuple3<Integer, IPlaylistSongContainerIdentifier, Boolean> onPlayAllContainer(Context context2, Object obj, List<PlaylistSong> list, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, MultiList<PlaylistSong, IItemIdentifier> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier2 = (IPlaylistSongContainerIdentifier) ContainerSongs.this.getSelectionContainerIdentifier();
                if (iPlaylistSongContainerIdentifier != null && iPlaylistSongContainerIdentifier.equals(ContainerSongs.this.getSelectionContainerIdentifier())) {
                    PlaylistSong playlistSong = null;
                    PlaylistSong playlistSong2 = (thisItemIdentifier.itemPosition < 0 || thisItemIdentifier.itemPosition >= ((MultiList) ContainerSongs.this.getList()).size()) ? null : (PlaylistSong) ((MultiList) ContainerSongs.this.getList()).get1(thisItemIdentifier.itemPosition);
                    if (thisItemIdentifier.itemPosition >= 0 && thisItemIdentifier.itemPosition < multiList.size()) {
                        playlistSong = multiList.get1(thisItemIdentifier.itemPosition);
                    }
                    if (playlistSong2 != null && playlistSong2.equals(playlistSong)) {
                        return new Tuple3<>(Integer.valueOf(thisItemIdentifier.itemPosition), iPlaylistSongContainerIdentifier2, true);
                    }
                }
                Iterator it = ((MultiList) ContainerSongs.this.getList()).iterator();
                while (it.hasNext()) {
                    list.add(((Tuple2) it.next()).obj1);
                }
                return new Tuple3<>(Integer.valueOf(thisItemIdentifier.itemPosition), iPlaylistSongContainerIdentifier2, false);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2
            protected ItemActionsSongs.ItemsDetails onDetails(Context context2, Object obj) {
                return new ItemActionsSongs.ItemsDetails(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.7
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener
            protected void onSetAsRingtone(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }};
        this.itemListenerActionsSongsHeader = new ActionListenerBase[]{new ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2
            protected Tuple3<Integer, IPlaylistSongContainerIdentifier, Boolean> onPlayAllContainer(Context context2, Object obj, List<PlaylistSong> list, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, MultiList<PlaylistSong, IItemIdentifier> multiList) {
                IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier2 = (IPlaylistSongContainerIdentifier) ContainerSongs.this.getSelectionContainerIdentifier();
                Iterator it = ((MultiList) ContainerSongs.this.getList()).iterator();
                while (it.hasNext()) {
                    list.add(((Tuple2) it.next()).obj1);
                }
                return new Tuple3<>(0, iPlaylistSongContainerIdentifier2, false);
            }
        }, new ItemActionsSongs.EnqueueAllContainerItemAction.EnqueueAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.EnqueueAllContainerItemAction.EnqueueAllContainerActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                Iterator it = ((MultiList) ContainerSongs.this.getList()).iterator();
                while (it.hasNext()) {
                    list.add(((Tuple2) it.next()).obj1);
                }
            }
        }};
        this.itemListenerActionsPLNow = new ActionListenerBase[]{new ItemActionsQueue.PlayQueueItemAction.PlayQueueItemActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.10
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsQueue.PlayQueueItemAction.PlayQueueItemActionListener2
            protected IItemIdentifier onPlay(Context context2, Object obj) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                if (thisItemIdentifier.itemIdent == null) {
                    tlog.w("ThisItemIdentifier is null, in Queue");
                }
                return thisItemIdentifier.itemIdent;
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.11
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.12
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.13
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.14
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsQueue.RemoveQueueItemAction.RemoveQueueItemActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.15
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsQueue.RemoveQueueItemAction.RemoveQueueItemActionListener2
            protected void onRemove(Context context2, Object obj, List<Integer> list, List<IItemIdentifier> list2) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                list.add(Integer.valueOf(thisItemIdentifier.itemPosition));
                list2.add(thisItemIdentifier.itemIdent);
            }
        }, new ItemActionsQueue.TipReorderItemAction.TipReorderItemActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.16
        }, new ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.17
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2
            protected ItemActionsSongs.ItemsDetails onDetails(Context context2, Object obj) {
                return new ItemActionsSongs.ItemsDetails(((ThisItemIdentifier) obj).song);
            }
        }, new ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.18
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener
            protected void onSetAsRingtone(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).song);
            }
        }};
        this.playnowList = z;
    }

    public static void getViewStatic(ContainerBase containerBase, Object obj, PlaylistSong playlistSong, IItemIdentifier iItemIdentifier, int i, int i2, ContentItemViewHolder contentItemViewHolder, ActionListenerBase[] actionListenerBaseArr, int i3) {
        getViewStatic(containerBase, obj, playlistSong, iItemIdentifier, i, i2, contentItemViewHolder, actionListenerBaseArr, i3, false, false);
    }

    public static void getViewStatic(ContainerBase containerBase, Object obj, final PlaylistSong playlistSong, final IItemIdentifier iItemIdentifier, int i, int i2, final ContentItemViewHolder contentItemViewHolder, ActionListenerBase[] actionListenerBaseArr, int i3, final boolean z, boolean z2) {
        boolean booleanValue = ContainerBase.onRequestShowAlbumArtValue.invoke(false).booleanValue();
        contentItemViewHolder.setToDefault(containerBase, obj, containerBase.getSelectionContainerIdentifier());
        contentItemViewHolder.dataId = playlistSong.getConstrucPath();
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(actionListenerBaseArr, i3, containerBase, z, z2, new Action1<ContentItemViewHolder>() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.19
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(ContentItemViewHolder contentItemViewHolder2) {
                if (z) {
                    IItemIdentifier iItemIdentifier2 = PlaybackControlsDesign.currentItemIdent;
                    if (iItemIdentifier2 != null && iItemIdentifier2.equals(iItemIdentifier)) {
                        contentItemViewHolder.viewItemBg.setActivated(true);
                    } else {
                        contentItemViewHolder.viewItemBg.setActivated(false);
                    }
                } else if (PlaybackControlsDesign.currentTrack.compare(playlistSong)) {
                    contentItemViewHolder.viewItemBg.setActivated(true);
                } else {
                    contentItemViewHolder.viewItemBg.setActivated(false);
                }
            }
        });
        if (z2) {
            contentItemViewHolder.setBtnItemMoreImage(R.drawable.ic_feather);
        }
        if (booleanValue) {
            contentItemViewHolder.txtNum.setVisibility(8);
        } else {
            contentItemViewHolder.txtNum.setVisibility(0);
            TextView textView = contentItemViewHolder.txtNum;
            textView.setText((i + 1) + ".");
        }
        contentItemViewHolder.refreshSelection();
        PlaylistSong.Data data = playlistSong.getData(mainTreadHandler, new PlaylistSong.OnDataReadyListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs.20
            @Override // com.daaw.avee.comp.playback.Song.PlaylistSong.OnDataReadyListener
            public void onDataReady(PlaylistSong.Data data2, Object obj2, Object obj3) {
                boolean booleanValue2 = ContainerBase.onRequestShowAlbumArtValue.invoke(false).booleanValue();
                ContentItemViewHolder contentItemViewHolder2 = (ContentItemViewHolder) obj2;
                if (ContentItemViewHolder.this.dataId == null || !ContentItemViewHolder.this.dataId.equals(obj3)) {
                    return;
                }
                ContainerSongs.onPlaylistSongDataAvailableToViewHolder.invoke(contentItemViewHolder2, data2, Boolean.valueOf(booleanValue2));
            }
        }, contentItemViewHolder, contentItemViewHolder.dataId);
        if (data == PlaylistSong.emptyData) {
            if (booleanValue) {
                contentItemViewHolder.imgArt.setVisibility(0);
                contentItemViewHolder.setImgColorFilter(-1);
                contentItemViewHolder.setImgResource(R.drawable.placeholderart4);
            } else {
                contentItemViewHolder.imgArt.setVisibility(8);
                contentItemViewHolder.setImageDrawable(null);
            }
            contentItemViewHolder.txtItemLine1.setText("...");
            contentItemViewHolder.setTxtItemLine2Visibility(8);
            contentItemViewHolder.txtItemDuration.setText("");
            return;
        }
        onPlaylistSongDataAvailableToViewHolder.invoke(contentItemViewHolder, data, Boolean.valueOf(booleanValue));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        if (i == 0) {
            return new ViewAdapter(new HeaderFooterAdapterData(this, this, 10, 1), this);
        }
        if (i != 1) {
            Assert.fail();
            return null;
        }
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 4, 13), this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Tuple2 tuple2 = ((MultiList) getList()).get(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        if (this.playnowList) {
            getViewStatic(this, new ThisItemIdentifier((PlaylistSong) tuple2.obj1, (IItemIdentifier) tuple2.obj2, i), (PlaylistSong) tuple2.obj1, (IItemIdentifier) tuple2.obj2, ((IItemIdentifier) ((MultiList) getList()).get2(i)).getQueueIndex(), i, contentItemViewHolder, this.itemListenerActionsPLNow, 0, true, ((IItemIdentifier) ((MultiList) getList()).get2(i)).getQueueSlot() == -1);
        } else {
            getViewStatic(this, new ThisItemIdentifier((PlaylistSong) tuple2.obj1, (IItemIdentifier) tuple2.obj2, i), (PlaylistSong) tuple2.obj1, null, i, i, contentItemViewHolder, this.itemListenerActionsSongs, 0, false, false);
        }
    }

    public int getPositionByIItemIdentifier(IItemIdentifier iItemIdentifier) {
        MultiList multiList = (MultiList) getList();
        for (int i = 0; i < multiList.size(); i++) {
            if (((IItemIdentifier) multiList.get2(i)).equals(iItemIdentifier)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ListContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onItemsMoved(int i, int i2, List<Integer> list) {
        onMoveQueueItems.invoke(Integer.valueOf(i), Integer.valueOf(i2), list);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        if (this.playnowList) {
            strArr[0] = context.getResources().getString(R.string.libContainer_Queue_search);
        } else {
            strArr[0] = context.getResources().getString(R.string.libContainer_Songs_search);
        }
        iGeneralItemContainerIdentifierArr[0] = getSelectionContainerIdentifier();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        updateSearchQuery(context, str, new SearchFilter(context));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void executeItemActionHeader(ContextData contextData, int i) {
        ActionListenerBase[] actionListenerBaseArr = this.itemListenerActionsSongsHeader;
        if (i < actionListenerBaseArr.length) {
            actionListenerBaseArr[i].execute(contextData, null);
        }
    }

    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        public IItemIdentifier itemIdent;
        public final int itemPosition;
        public final PlaylistSong song;

        public ThisItemIdentifier(PlaylistSong playlistSong, IItemIdentifier iItemIdentifier, int i) {
            this.song = playlistSong;
            this.itemIdent = iItemIdentifier;
            this.itemPosition = i;
        }

        public int hashCode() {
            return this.itemPosition;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.itemPosition == ((ThisItemIdentifier) obj).itemPosition;
        }
    }
}
