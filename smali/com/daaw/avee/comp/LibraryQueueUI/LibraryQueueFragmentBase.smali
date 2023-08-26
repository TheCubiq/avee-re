.class public Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;
.super Landroid/app/Fragment;
.source "LibraryQueueFragmentBase.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;


# static fields
.field public static final ACTION_AddByLink:I = 0x6e

.field public static final ACTION_AddFolder:I = 0x78

.field public static final ACTION_ClearQueue:I = 0x6f

.field public static final ACTION_ClearQueue_Long:I = 0x456

.field public static final ACTION_FollowCurrent:I = 0x72

.field public static final ACTION_SaveAs:I = 0x70

.field public static final ACTION_ShowAlbumArt:I = 0x73

.field public static final ACTION_Shuffle:I = 0x71

.field public static final ACTION_SwitchView:I = 0x7d

.field private static internalOnFollowCurrentValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static internalOnShowAlbumArtValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static internalOnShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onAction:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionAddToFolders:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onActionChooseSort:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/ContextData;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionChooseSortFiles:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/ContextData;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionChooseSortStations:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/ContextData;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionRemoveFolder:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionShowReorderTip:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionViewDetails:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Landroid/os/AsyncTask;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onContainerDataSetChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static onEnqueue:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/util/Collection<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "[",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueue2UI_ActionScanStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueueUI_ActionDeletePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueueUI_ActionRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueueUI_ActionSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onNavigateLibraryAddress:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onOpen2:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onOpenOnly2:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate3<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onQueuePositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRemoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Lcom/daaw/avee/Design/SortDesign$SortDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR3<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/io/File;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestRootContainerItemsVisible:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShowTipState:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSongContainerIdentifier:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetAsRingtone:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/Collection<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onSetCurrentQueueItem:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR3<",
            "Lcom/daaw/avee/comp/Common/AdViewHolder;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onStartingSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Landroid/os/AsyncTask;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static onUIRequestFollowCurrentValue:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onUpdateSearchOptions:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 72
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onNavigateLibraryAddress:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 73
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onUpdateSearchOptions:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 74
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestRootContainerItemsVisible:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 75
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 78
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onRequestSongContainerIdentifier:Lcom/daaw/avee/Common/Events/WeakEventR;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestSongContainerIdentifier:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 79
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 80
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onQueuePositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onQueuePositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 81
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onLibraryQueueUI_ActionSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueueUI_ActionSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 82
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onEnqueue:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onEnqueue:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 83
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onOpen2:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onOpen2:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 84
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onActionViewDetails:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionViewDetails:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 85
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onSetAsRingtone:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onSetAsRingtone:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 87
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onSetCurrentQueueItem:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onSetCurrentQueueItem:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 88
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onRemoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRemoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 89
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onRequestShowTipState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShowTipState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 90
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onActionShowReorderTip:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionShowReorderTip:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 92
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations;->onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 93
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2;->onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onOpenOnly2:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 96
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 97
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueueUI_ActionRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueueUI_ActionRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 98
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueueUI_ActionDeletePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueueUI_ActionDeletePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 101
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders;->onActionRemoveFolder:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionRemoveFolder:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 102
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders;->onActionAddToFolders:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionAddToFolders:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 105
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 106
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 107
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 110
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 111
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onLibraryQueue2UI_ActionScanStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueue2UI_ActionScanStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 112
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 113
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onUIRequestFollowCurrentValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onUIRequestFollowCurrentValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 114
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onActionChooseSortStations:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionChooseSortStations:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 115
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onActionChooseSortFiles:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionChooseSortFiles:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 116
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onActionChooseSort:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionChooseSort:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 117
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseAdsCore;->onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onShowAdView:Lcom/daaw/avee/Common/Events/WeakEventR3;

    .line 120
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 121
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 122
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;

    .line 123
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 124
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 125
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 127
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 128
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 129
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 130
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 131
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onStartSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onStartingSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 132
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onContainerDataSetChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onContainerDataSetChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 133
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 136
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    .line 138
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 139
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnFollowCurrentValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 140
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnShowAlbumArtValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static getSearchEntryOptions(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;)Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;
    .locals 3

    if-nez p1, :cond_0

    .line 174
    sget-object p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    new-array v2, v0, [Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    .line 178
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->getContainerData()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    move-result-object p1

    invoke-interface {p1, p0, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    const/4 p0, 0x0

    .line 180
    aget-object p1, v1, p0

    if-eqz p1, :cond_2

    aget-object p1, v1, p0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 190
    :cond_1
    aget-object p1, v2, p0

    .line 191
    aget-object p0, v1, p0

    .line 193
    new-instance v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    invoke-direct {v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;-><init>()V

    .line 194
    iput-boolean v0, v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->enabled:Z

    .line 195
    iput-object p0, v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->hint:Ljava/lang/String;

    .line 196
    iput-object p1, v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-object v1

    .line 182
    :cond_2
    :goto_0
    new-instance p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    invoke-direct {p1}, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;-><init>()V

    .line 183
    iput-boolean p0, p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->enabled:Z

    const-string p0, ""

    .line 184
    iput-object p0, p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->hint:Ljava/lang/String;

    const/4 p0, 0x0

    .line 185
    iput-object p0, p1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-object p1
.end method

.method public static onFollowCurrentValueChanged(Z)V
    .locals 1

    .line 150
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnFollowCurrentValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public static onShowAlbumArtValueChanged(Z)V
    .locals 1

    .line 154
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnShowAlbumArtValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public static onShuffleModeChanged(I)V
    .locals 1

    .line 146
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public makeChildAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 209
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    return-object p1

    .line 212
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 217
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 218
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const-string v2, "/"

    const/4 v3, 0x0

    const/16 v4, 0x2f

    if-ne v0, v4, :cond_3

    .line 219
    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v4, :cond_2

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 222
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 224
    :cond_3
    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v4, :cond_4

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 227
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 230
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_5

    sub-int/2addr p2, v1

    .line 231
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    if-ne p2, v4, :cond_5

    return-object p1

    .line 234
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onNavigateForward(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 204
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onNavigateLibraryAddress:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onRequestRootContainerItemsVisible()I
    .locals 2

    .line 244
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestRootContainerItemsVisible:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public onRequestShuffleMode()I
    .locals 2

    .line 239
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public subscribeWeakFollowCurrentValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 164
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnFollowCurrentValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public subscribeWeakShowAlbumArtValueChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 169
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnShowAlbumArtValueChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public subscribeWeakShuffleModeChanged(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 159
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->internalOnShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method
