.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsStations2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PlaySingleItemAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$Listener;
    }
.end annotation


# static fields
.field public static itemActionInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;->itemActionInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f0800f9

    const v5, 0x7f1000c2

    move-object v0, p0

    .line 37
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZII)V

    return-void
.end method


# virtual methods
.method public executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
    .locals 4
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

    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 47
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$Listener;

    .line 48
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$Listener;->onExecute(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v1

    .line 50
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$1;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsStations2$PlaySingleItemAction;)V

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/VAsyncTask;->Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
