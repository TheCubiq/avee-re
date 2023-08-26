.class public Lcom/daaw/avee/Design/PlaylistsDesign;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;,
        Lcom/daaw/avee/Design/PlaylistsDesign$ScanCompleteDialogClickListener;,
        Lcom/daaw/avee/Design/PlaylistsDesign$SearchFilter;,
        Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;
    }
.end annotation


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private playlistScanningStatus:Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

.field private resultReceiver:Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;

.field private taskManager:Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    invoke-direct {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->taskManager:Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    .line 50
    new-instance v0, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    invoke-direct {v0}, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->playlistScanningStatus:Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    .line 51
    new-instance v0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->resultReceiver:Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    .line 56
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onRequestPlaylistScanStatus:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$1;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 63
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onStopPlaylistScan:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$2;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 70
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueue2UI_ActionScanStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$3;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 96
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$4;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 104
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$5;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 111
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$6;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 118
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onSubmitCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$7;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 141
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onSubmitCreateStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$8;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 172
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueueUI_ActionSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$9;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 179
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onLibraryQueueUI_SubmitSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$10;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 200
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onLibraryQueueUI_SubmitSongSendToStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$11;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 232
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueueUI_ActionRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$12;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$12;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 242
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;->onSubmitRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$13;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$13;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 251
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onLibraryQueueUI_ActionDeletePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$14;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$14;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 258
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onRequestStandalonePlaylists:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/PlaylistsDesign$15;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaylistsDesign$15;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->playlistScanningStatus:Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->taskManager:Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/daaw/avee/Design/PlaylistsDesign;->resultReceiver:Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/PlaylistsDesign;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/PlaylistsDesign;->onLibraryQueue2UI_SubmitRemoveStandalonePlaylist(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaylistsDesign;->updateLibraryItems()V

    return-void
.end method

.method static synthetic access$500(Lcom/daaw/avee/Design/PlaylistsDesign;Landroid/content/Context;Ljava/lang/Long;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/PlaylistsDesign;->onLibraryQueueUI_SubmitDeletePlaylist(Landroid/content/Context;Ljava/lang/Long;)V

    return-void
.end method

.method static synthetic access$600(Lcom/daaw/avee/Design/PlaylistsDesign;Ljava/util/List;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->onLibraryQueue2UI_SubmitScanStandalonePlaylist(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$700(Lcom/daaw/avee/Design/PlaylistsDesign;Lcom/daaw/avee/ContextData;Ljava/util/List;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/PlaylistsDesign;->onScanCompleteResults(Lcom/daaw/avee/ContextData;Ljava/util/List;)V

    return-void
.end method

.method private onLibraryQueue2UI_SubmitRemoveStandalonePlaylist(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 317
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefRemoveStandalonePlaylist(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 318
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaylistsDesign;->updateLibraryItems()V

    return-void
.end method

.method private onLibraryQueue2UI_SubmitScanStandalonePlaylist(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 309
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 312
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefAddStandalonePlaylistGenerateHash(Landroid/content/Context;Ljava/util/List;Z)V

    .line 313
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaylistsDesign;->updateLibraryItems()V

    return-void
.end method

.method private onLibraryQueueUI_SubmitDeletePlaylist(Landroid/content/Context;Ljava/lang/Long;)V
    .locals 2

    .line 322
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;->deletePlaylist(Landroid/content/Context;J)I

    move-result p2

    if-lez p2, :cond_0

    .line 325
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f100113

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 326
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 329
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaylistsDesign;->updateLibraryItems()V

    return-void
.end method

.method private onScanCompleteResults(Lcom/daaw/avee/ContextData;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 271
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 275
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefGetStandalonePlaylists(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    .line 277
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 279
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 281
    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/MultiList;->contains2(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 283
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 286
    :cond_2
    new-instance p2, Lcom/daaw/avee/Design/PlaylistsDesign$ScanCompleteDialogClickListener;

    invoke-direct {p2, p0, v1}, Lcom/daaw/avee/Design/PlaylistsDesign$ScanCompleteDialogClickListener;-><init>(Lcom/daaw/avee/Design/PlaylistsDesign;Ljava/util/List;)V

    .line 288
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    .line 289
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e000d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 290
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    .line 289
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 292
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_3

    .line 293
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p1, 0x7f100053

    .line 294
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 295
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f10004f

    .line 296
    invoke-virtual {v1, p1, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 298
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :cond_3
    return-void
.end method

.method private updateLibraryItems()V
    .locals 1

    .line 303
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateLibraryItems()V

    :cond_0
    return-void
.end method
