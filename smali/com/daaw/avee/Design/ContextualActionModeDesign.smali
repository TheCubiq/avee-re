.class public Lcom/daaw/avee/Design/ContextualActionModeDesign;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"


# instance fields
.field private itemSelectionContainers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private selectingEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->selectingEnabled:Z

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->itemSelectionContainers:Ljava/util/HashMap;

    .line 35
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    .line 39
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onRequestContextData:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$1;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 46
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onSelectModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$2;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 53
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onItemSelectionChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$3;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 70
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onContainerItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$4;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 77
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onAllItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$5;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 90
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$6;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 102
    sget-object v0, Lcom/daaw/avee/MainActivity;->onDestroy:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$7;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 111
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$8;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 121
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$9;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 128
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestContainsItemSelection:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/ContextualActionModeDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/ContextualActionModeDesign$10;-><init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Z
    .locals 0

    .line 30
    iget-boolean p0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->selectingEnabled:Z

    return p0
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/ContextualActionModeDesign;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->selectingEnabled:Z

    return p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/ContextualActionModeDesign;)Ljava/util/HashMap;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->itemSelectionContainers:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method containsItemSelection(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)Z
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign;->itemSelectionContainers:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getItemIdentifier()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;->containsItem(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
