.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;
.super Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;
.source "ContainerSongs.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;",
        "Lcom/daaw/avee/Common/MultiList<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;>;"
    }
.end annotation


# static fields
.field static mainTreadHandler:Landroid/os/Handler;

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

.field private static final primaryActionIndex:I

.field private static final primaryActionPLNowIndex:I


# instance fields
.field itemListenerActionsPLNow:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field private final playnowList:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 44
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    .line 46
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->mainTreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIZ)V"
        }
    .end annotation

    move-object v9, p0

    .line 271
    new-instance v3, Lcom/daaw/avee/Common/MultiList$Factory;

    invoke-direct {v3}, Lcom/daaw/avee/Common/MultiList$Factory;-><init>()V

    new-instance v5, Lcom/daaw/avee/Common/VTaskResult;

    move-object v0, p4

    invoke-direct {v5, p4}, Lcom/daaw/avee/Common/VTaskResult;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;

    move-object v1, p1

    invoke-direct {v7, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move/from16 v6, p5

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;I)V

    const/4 v0, 0x7

    new-array v1, v0, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 55
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v4, 0x1

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$3;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v5, 0x2

    aput-object v2, v1, v5

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$4;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v6, 0x3

    aput-object v2, v1, v6

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$5;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v7, 0x4

    aput-object v2, v1, v7

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$6;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v8, 0x5

    aput-object v2, v1, v8

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$7;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$7;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v10, 0x6

    aput-object v2, v1, v10

    iput-object v1, v9, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array v1, v5, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 134
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v4

    iput-object v1, v9, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/16 v1, 0x9

    new-array v1, v1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 162
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$10;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$10;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$11;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$11;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$12;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$12;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$13;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$13;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v6

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$14;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$14;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v7

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$15;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$15;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v8

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$16;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$16;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v10

    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$17;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$17;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object v2, v1, v0

    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$18;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$18;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/16 v2, 0x8

    aput-object v0, v1, v2

    iput-object v1, v9, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsPLNow:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    move/from16 v0, p7

    .line 280
    iput-boolean v0, v9, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->playnowList:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI)V"
        }
    .end annotation

    .line 258
    new-instance v3, Lcom/daaw/avee/Common/MultiList$Factory;

    invoke-direct {v3}, Lcom/daaw/avee/Common/MultiList$Factory;-><init>()V

    new-instance v5, Lcom/daaw/avee/Common/VTaskResult;

    invoke-direct {v5, p4}, Lcom/daaw/avee/Common/VTaskResult;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;

    invoke-direct {v7, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterableListContainerBase;-><init>(Landroid/content/Context;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func;Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;I)V

    const/4 p1, 0x7

    new-array p2, p1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 55
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 p6, 0x1

    aput-object p3, p2, p6

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$3;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v0, 0x2

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$4;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v1, 0x3

    aput-object p3, p2, v1

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$5;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v2, 0x4

    aput-object p3, p2, v2

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$6;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v3, 0x5

    aput-object p3, p2, v3

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$7;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$7;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/4 v4, 0x6

    aput-object p3, p2, v4

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array p2, v0, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 134
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$8;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$9;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, p6

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/16 p2, 0x9

    new-array p2, p2, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 162
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$10;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$10;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$11;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$11;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, p6

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$12;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$12;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$13;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$13;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, v1

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$14;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$14;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, v2

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$15;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$15;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, v3

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$16;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$16;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, v4

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$17;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$17;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    aput-object p3, p2, p1

    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$18;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$18;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)V

    const/16 p3, 0x8

    aput-object p1, p2, p3

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsPLNow:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 267
    iput-boolean p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->playnowList:Z

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;)Ljava/util/List;
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;I)V
    .locals 11

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    .line 307
    invoke-static/range {v0 .. v10}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V

    return-void
.end method

.method public static getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V
    .locals 11

    move-object v0, p2

    move-object/from16 v8, p6

    .line 322
    sget-object v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    .line 323
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    move-object v4, p0

    move-object v3, p1

    invoke-virtual {v8, p0, p1, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 324
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getConstrucPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    .line 325
    sget-object v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v3, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {v1, v3, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 326
    iget-object v2, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    .line 328
    new-instance v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;

    move-object v1, p3

    move/from16 v5, p9

    invoke-direct {v7, v5, p3, v8, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$19;-><init>(ZLcom/daaw/avee/comp/Common/IItemIdentifier;Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move/from16 v3, p8

    move/from16 v6, p10

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;ZZLcom/daaw/avee/Common/Action1;)V

    if-eqz p10, :cond_0

    const v1, 0x7f0800d1

    .line 369
    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setBtnItemMoreImage(I)V

    :cond_0
    const/16 v1, 0x8

    if-eqz v10, :cond_1

    .line 372
    iget-object v2, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 374
    :cond_1
    iget-object v2, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 375
    iget-object v2, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v4, p4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 378
    :goto_0
    invoke-virtual/range {p6 .. p6}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->refreshSelection()V

    .line 380
    sget-object v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->mainTreadHandler:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$20;

    invoke-direct {v3, v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$20;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    iget-object v4, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    invoke-virtual {p2, v2, v3, v8, v4}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getData(Landroid/os/Handler;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    .line 395
    sget-object v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-ne v0, v2, :cond_3

    if-eqz v10, :cond_2

    .line 398
    iget-object v0, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, -0x1

    .line 399
    invoke-virtual {v8, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    const v0, 0x7f080148

    .line 400
    invoke-virtual {v8, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgResource(I)V

    goto :goto_1

    .line 402
    :cond_2
    iget-object v0, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x0

    .line 403
    invoke-virtual {v8, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 406
    :goto_1
    iget-object v0, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    const-string v2, "..."

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 408
    iget-object v0, v8, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 416
    :cond_3
    sget-object v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v8, v0, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public createAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    const/4 p1, 0x1

    if-nez p2, :cond_0

    .line 423
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/16 v0, 0xa

    invoke-direct {p2, p0, p0, v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 424
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p1, p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p1

    :cond_0
    if-ne p2, p1, :cond_1

    .line 432
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 p2, 0x4

    const/16 v0, 0xd

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 433
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p2, p1, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p2

    .line 428
    :cond_1
    invoke-static {}, Ljunit/framework/Assert;->fail()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
    .locals 2

    .line 501
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsSongsHeader:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    .line 502
    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getItemPositionToItemAddress(I)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getPositionByIItemIdentifier(Lcom/daaw/avee/comp/Common/IItemIdentifier;)I
    .locals 3

    .line 460
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/MultiList;

    const/4 v1, 0x0

    .line 461
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 463
    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/MultiList;->get2(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 2

    .line 486
    iget-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->playnowList:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 487
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000b6

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    goto :goto_0

    .line 489
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000b9

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    .line 491
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getSelectionContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object p1

    aput-object p1, p3, v1

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 12

    .line 444
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    .line 446
    move-object v7, p1

    check-cast v7, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    .line 447
    iput p2, v7, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    .line 449
    iget-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->playnowList:Z

    if-eqz p1, :cond_1

    .line 450
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/MultiList;->get2(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->getQueueIndex()I

    move-result v5

    .line 451
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/MultiList;->get2(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Common/IItemIdentifier;->getQueueSlot()I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v11, 0x0

    .line 452
    :goto_0
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    iget-object p1, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object v1, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-direct {v2, p1, v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;I)V

    iget-object p1, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object p1, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    iget-object v8, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsPLNow:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v1, p0

    move v6, p2

    invoke-static/range {v1 .. v11}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V

    goto :goto_1

    .line 454
    :cond_1
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    iget-object p1, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object v1, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-direct {v2, p1, v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;I)V

    iget-object p1, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const/4 v4, 0x0

    iget-object v8, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->itemListenerActionsSongs:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v5, p2

    move v6, p2

    invoke-static/range {v1 .. v11}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V

    :goto_1
    return-void
.end method

.method public onItemsMoved(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 481
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 496
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;

    invoke-direct {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;)V

    return-void
.end method
