.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoveStandalonePlaylistAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction$RemoveStandalonePlaylistActionListener;
    }
.end annotation


# static fields
.field private static baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 101
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;->baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x1

    const v4, 0x7f0800b9

    const v5, 0x7f1000c9

    move-object v0, p0

    .line 104
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZII)V

    return-void
.end method

.method static synthetic access$200()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
    .locals 1

    .line 99
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;->baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-object v0
.end method


# virtual methods
.method public executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
    .locals 5
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

    .line 109
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    const/4 v1, 0x0

    .line 111
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 112
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction$RemoveStandalonePlaylistActionListener;

    .line 113
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction$RemoveStandalonePlaylistActionListener;->onRemoveStandalonePlaylist(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/avee/Common/MultiList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 117
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p3

    if-lez p3, :cond_1

    .line 118
    invoke-virtual {v0}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p2}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_2

    .line 121
    iget-object p3, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    .line 122
    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    .line 123
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p3, p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
