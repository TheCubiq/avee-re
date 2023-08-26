.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewDetailsItemAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction$ViewDetailsActionListener2;
    }
.end annotation


# static fields
.field public static itemActionViewDetails:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 161
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction;->itemActionViewDetails:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f0800d5

    const v5, 0x7f1000be

    move-object v0, p0

    .line 164
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZII)V

    return-void
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

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 171
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 172
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction$ViewDetailsActionListener2;

    .line 173
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction$ViewDetailsActionListener2;->onDetails(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 175
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs;->onActionViewDetails:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
