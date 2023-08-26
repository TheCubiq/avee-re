.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PlayAllContainerItemAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;
    }
.end annotation


# static fields
.field private static playAllContainerItemAction:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 272
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;->playAllContainerItemAction:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f0800f9

    const v5, 0x7f1000c3

    const/4 v6, 0x1

    move-object v0, p0

    .line 274
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZIIZ)V

    return-void
.end method

.method static synthetic access$000()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
    .locals 1

    .line 271
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction;->playAllContainerItemAction:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-object v0
.end method


# virtual methods
.method public executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            ">;)V"
        }
    .end annotation

    .line 279
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 281
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onRequestSongContainerIdentifier:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    .line 283
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v1}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/avee/Common/MultiList;

    const/4 v10, 0x0

    move-object v2, v7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v11, 0x0

    .line 289
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v11, v3, :cond_0

    .line 290
    invoke-interface {p3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;

    .line 291
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v6

    move-object v4, v8

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlayAllContainerItemAction$PlayAllContainerActionListener2;->onPlayAllContainer(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Lcom/daaw/avee/Common/MultiList;)Lcom/daaw/avee/Common/Tuple3;

    move-result-object v0

    .line 292
    iget-object v1, v0, Lcom/daaw/avee/Common/Tuple3;->obj1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 293
    iget-object v2, v0, Lcom/daaw/avee/Common/Tuple3;->obj2:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;

    .line 294
    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple3;->obj3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 297
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x1

    if-le p1, p2, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move v10, v0

    move-object v7, v2

    :goto_1
    if-eqz v10, :cond_2

    .line 304
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onQueuePositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_2

    .line 306
    :cond_2
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onOpen2:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v6, p2, v7}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
