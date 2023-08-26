.class public Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;
.super Landroid/app/DialogFragment;
.source "PlaylistPickerDialog.java"


# static fields
.field private static final arg1:Ljava/lang/String; = "arg1"

.field private static final arg2:Ljava/lang/String; = "arg2"

.field private static final arg3:Ljava/lang/String; = "arg3"

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

.field public static onLibraryQueueUI_SubmitSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueueUI_SubmitSongSendToStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestStandalonePlaylists:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field content:Landroid/widget/LinearLayout;

.field contentLoading:Landroid/widget/LinearLayout;

.field songDataSourceForPlaylistIsLoaded:Z

.field songDataSourceForPlaylistResultCb:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "[J",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;>;"
        }
    .end annotation
.end field

.field songDataSourceLoadingIsCanceled:Z

.field songDataSourceNativePL:[J

.field songDataSourcePL:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field songs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onLibraryQueueUI_SubmitSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    .line 46
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onLibraryQueueUI_SubmitSongSendToStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onRequestStandalonePlaylists:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 92
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceLoadingIsCanceled:Z

    .line 93
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistIsLoaded:Z

    const/4 v1, 0x0

    .line 94
    iput-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistResultCb:Lcom/daaw/avee/Common/Action3;

    .line 96
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songs:Ljava/util/ArrayList;

    new-array v1, v0, [J

    .line 97
    iput-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceNativePL:[J

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourcePL:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;Lcom/daaw/avee/Common/Action3;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getSongDataSourceForPlaylist(Lcom/daaw/avee/Common/Action3;)V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;Ljava/util/ArrayList;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onSongDataLoaded(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static createAndShowPlaylistPickerDialog(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/lang/Boolean;)Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;"
        }
    .end annotation

    .line 55
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->newInstance(Ljava/util/List;Z)Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    move-result-object p1

    const-string p2, "PlaylistPickerDialog"

    .line 56
    invoke-static {p1, p2, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object p1
.end method

.method private getSongDataSourceForPlaylist(Lcom/daaw/avee/Common/Action3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Action3<",
            "[J",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;>;)V"
        }
    .end annotation

    .line 301
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistIsLoaded:Z

    if-nez v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->contentLoading:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 303
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->content:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 304
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistResultCb:Lcom/daaw/avee/Common/Action3;

    goto :goto_0

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceNativePL:[J

    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourcePL:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songs:Ljava/util/ArrayList;

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/avee/Common/Action3;->onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static newInstance(Ljava/util/List;Z)Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;Z)",
            "Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;-><init>()V

    .line 72
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 74
    invoke-virtual {v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getConstrucPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 78
    :cond_0
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    .line 79
    invoke-virtual {p0, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "arg2"

    .line 83
    invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 84
    invoke-virtual {v0, p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private onSongDataLoaded(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)V"
        }
    .end annotation

    .line 312
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceNativePL:[J

    .line 316
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 318
    iget-object v5, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceNativePL:[J

    invoke-virtual {v3}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataSourceForNativePlaylist()J

    move-result-wide v6

    aput-wide v6, v5, v2

    add-int/2addr v2, v4

    goto :goto_0

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->contentLoading:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 323
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->content:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 325
    iput-boolean v4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistIsLoaded:Z

    .line 326
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceLoadingIsCanceled:Z

    if-nez v0, :cond_1

    .line 327
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistResultCb:Lcom/daaw/avee/Common/Action3;

    if-eqz v0, :cond_1

    .line 328
    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceNativePL:[J

    iget-object v2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourcePL:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2, p1}, Lcom/daaw/avee/Common/Action3;->onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private updateAdapter(Landroid/widget/ArrayAdapter;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 287
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 288
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 289
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100114

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    :cond_1
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 294
    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 295
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private updateAdapter(Landroid/widget/ArrayAdapter;[Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 277
    array-length v0, p2

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    new-array p2, v1, [Ljava/lang/String;

    const/4 v0, 0x0

    .line 278
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f100114

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v0

    .line 280
    :cond_0
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 281
    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->addAll([Ljava/lang/Object;)V

    .line 282
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 17

    move-object/from16 v6, p0

    .line 102
    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 104
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg1"

    .line 105
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v1, "arg2"

    .line 109
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    .line 114
    new-instance v11, Landroid/app/AlertDialog$Builder;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v11, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x7f10005a

    .line 115
    invoke-virtual {v11, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 117
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c003a

    const/4 v12, 0x0

    invoke-static {v0, v1, v12}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 118
    invoke-virtual {v11, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0900af

    .line 120
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->contentLoading:Landroid/widget/LinearLayout;

    const v1, 0x7f0900ae

    .line 121
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->content:Landroid/widget/LinearLayout;

    const v1, 0x7f0901f2

    .line 123
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TabHost;

    .line 124
    invoke-virtual {v1}, Landroid/widget/TabHost;->setup()V

    const-string v3, "Tab One"

    .line 126
    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v3

    const v4, 0x7f0901f0

    .line 127
    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    .line 128
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f10015a

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;)Landroid/widget/TabHost$TabSpec;

    .line 129
    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    const-string v3, "Tab Two"

    .line 131
    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v3

    const v4, 0x7f0901f1

    .line 132
    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setContent(I)Landroid/widget/TabHost$TabSpec;

    .line 133
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f100159

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;)Landroid/widget/TabHost$TabSpec;

    .line 134
    invoke-virtual {v1, v3}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    const v1, 0x7f090098

    .line 136
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/widget/CheckBox;

    const v1, 0x7f090099

    .line 138
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/CheckBox;

    .line 139
    invoke-virtual {v4, v9}, Landroid/widget/CheckBox;->setChecked(Z)V

    if-eqz v2, :cond_1

    .line 142
    invoke-virtual {v3, v8}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 143
    invoke-virtual {v3, v9}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    .line 145
    invoke-virtual {v3, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    :goto_1
    const v1, 0x7f09013f

    .line 148
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    .line 149
    invoke-virtual {v1, v9}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    .line 150
    new-instance v5, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v13

    const v14, 0x7f0c0020

    invoke-direct {v5, v13, v14}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 151
    invoke-virtual {v1, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const v13, 0x7f090140

    .line 153
    invoke-virtual {v0, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/ListView;

    .line 154
    invoke-virtual {v13, v9}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    .line 155
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v0, v15, v14}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 156
    invoke-virtual {v13, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 158
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 160
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 161
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v12

    invoke-static {v12, v14, v15}, Lcom/daaw/avee/Common/UtilsMusic;->getPlayLists(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V

    .line 163
    invoke-direct {v6, v5, v15}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->updateAdapter(Landroid/widget/ArrayAdapter;Ljava/util/Collection;)V

    .line 167
    sget-object v5, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onRequestStandalonePlaylists:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v12, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v12}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    invoke-virtual {v5, v12}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/Common/MultiList;

    .line 169
    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v15

    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    invoke-virtual {v5}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v8, v16

    check-cast v8, Lcom/daaw/avee/Common/Tuple2;

    .line 172
    iget-object v8, v8, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;->getPlaylistNameDesign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    goto :goto_2

    .line 174
    :cond_2
    invoke-direct {v6, v0, v12}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->updateAdapter(Landroid/widget/ArrayAdapter;Ljava/util/Collection;)V

    .line 177
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;

    invoke-direct {v0, v6, v2, v3, v14}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;ZLandroid/widget/CheckBox;Ljava/util/List;)V

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 197
    new-instance v8, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;

    move-object v0, v8

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;ZLandroid/widget/CheckBox;Landroid/widget/CheckBox;Lcom/daaw/avee/Common/MultiList;)V

    invoke-virtual {v13, v8}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f100058

    .line 217
    new-instance v1, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;

    invoke-direct {v1, v6}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;)V

    invoke-virtual {v11, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f100044

    .line 239
    new-instance v1, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$4;

    invoke-direct {v1, v6}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$4;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;)V

    invoke-virtual {v11, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 246
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songs:Ljava/util/ArrayList;

    .line 248
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songs:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourcePL:Ljava/util/ArrayList;

    new-array v0, v9, [I

    const/4 v1, 0x0

    aput v1, v0, v1

    .line 251
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 252
    new-instance v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v3, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/lang/String;)V

    .line 253
    iget-object v2, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songs:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    iget-object v2, v6, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourcePL:Ljava/util/ArrayList;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataSourceForPlaylist()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    new-instance v2, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;

    invoke-direct {v2, v6, v0, v10}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;[ILjava/util/ArrayList;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v7, v2, v4, v4}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getData(Landroid/os/Handler;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    goto :goto_3

    .line 273
    :cond_3
    invoke-virtual {v11}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
