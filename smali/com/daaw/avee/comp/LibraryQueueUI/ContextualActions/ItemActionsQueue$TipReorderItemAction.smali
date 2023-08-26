.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TipReorderItemAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction$TipReorderItemActionListener2;
    }
.end annotation


# static fields
.field private static baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 86
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;->baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x5

    const/4 v1, 0x1

    const v2, 0x7f0800d8

    const v3, 0x7f1000cd

    .line 89
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZII)V

    return-void
.end method

.method static synthetic access$000()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
    .locals 1

    .line 85
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue$TipReorderItemAction;->baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-object v0
.end method


# virtual methods
.method public executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
    .locals 0
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

    .line 94
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onActionShowReorderTip:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public getShouldShow()Z
    .locals 3

    .line 99
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsQueue;->onRequestShowTipState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_tipShow_reorder:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
