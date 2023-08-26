.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoveQueueItemAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction$RemoveQueueItemActionListener2;
    }
.end annotation


# static fields
.field public static itemActionBaseRemoveQueue:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction;->itemActionBaseRemoveQueue:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x5

    const/4 v1, 0x1

    const v2, 0x7f0800f9

    const v3, 0x7f1000c8

    .line 60
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZII)V

    return-void
.end method


# virtual methods
.method public executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
    .locals 6
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

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 68
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 69
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction$RemoveQueueItemActionListener2;

    .line 70
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$RemoveQueueItemAction$RemoveQueueItemActionListener2;->onRemove(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 72
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onRemoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
