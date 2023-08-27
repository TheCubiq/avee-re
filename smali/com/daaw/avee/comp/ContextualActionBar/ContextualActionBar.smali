.class public Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;
.super Ljava/lang/Object;
.source "ContextualActionBar.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;,
        Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;
    }
.end annotation


# static fields
.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;",
            ">;"
        }
    .end annotation
.end field

.field public static onAllItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onContainerItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field public static onItemSelectionChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestContextData:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onSelectModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private actionMode:Landroidx/appcompat/view/ActionMode;

.field private actionModeShouldbeRecreated:Z

.field private availableActions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private selectedItems:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onRequestContextData:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 33
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onSelectModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 34
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onItemSelectionChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 35
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onContainerItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 36
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onAllItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->createInstanceLock:Ljava/lang/Object;

    .line 39
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionModeShouldbeRecreated:Z

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Z
    .locals 0

    .line 30
    iget-boolean p0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionModeShouldbeRecreated:Z

    return p0
.end method

.method static synthetic access$102(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionModeShouldbeRecreated:Z

    return p1
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Ljava/util/HashMap;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Ljava/util/HashMap;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$402(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;Landroidx/appcompat/view/ActionMode;)Landroidx/appcompat/view/ActionMode;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    return-object p1
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->deselectAllItems()V

    return-void
.end method

.method public static createInstance()Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;
    .locals 3

    .line 51
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    if-eqz v0, :cond_0

    return-object v0

    .line 54
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 55
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    if-nez v1, :cond_1

    .line 57
    new-instance v1, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-direct {v1}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;-><init>()V

    .line 58
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 61
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 62
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private deselectAllItems()V
    .locals 1

    .line 138
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onAllItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 139
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 140
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public static getInstance()Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;
    .locals 1

    .line 66
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    return-object v0
.end method


# virtual methods
.method deselectItem(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 113
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onItemSelectionChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;

    if-eqz p1, :cond_2

    .line 118
    iget-object p1, p1, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;->itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v0, p1

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 119
    invoke-virtual {v2}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v2

    .line 121
    iget-object v3, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_0

    goto :goto_1

    .line 125
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 127
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_1

    .line 128
    iget-object v4, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 130
    :cond_1
    iget-object v3, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 134
    :cond_2
    invoke-virtual {p0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->updateMenu()V

    return-void
.end method

.method executeAction(Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)Z
    .locals 9

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 180
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 182
    iget-object v2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;

    .line 183
    iget-object v5, v3, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;->itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v6, v5

    :goto_1
    if-ge v4, v6, :cond_0

    aget-object v7, v5, v4

    .line 184
    invoke-virtual {v7}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v8

    invoke-virtual {v8, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 185
    iget-object v3, v3, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;->itemActionObj:Ljava/lang/Object;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 192
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    .line 193
    invoke-virtual {p2, p1, v1, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v4
.end method

.method public onActivityDestroyed()V
    .locals 2

    .line 144
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 145
    iput-boolean v1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionModeShouldbeRecreated:Z

    .line 146
    invoke-virtual {v0}, Landroidx/appcompat/view/ActionMode;->finish()V

    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    :cond_0
    return-void
.end method

.method public onItemSelected([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;Ljava/lang/Boolean;Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-virtual {p3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->getItemIdentifier()Ljava/lang/Object;

    move-result-object v0

    .line 73
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 74
    new-instance p2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)V

    .line 75
    iput-object p1, p2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;->itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 76
    iput-object v0, p2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;->itemActionObj:Ljava/lang/Object;

    .line 78
    invoke-virtual {p0, p3, p2}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectItem(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;)V

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->deselectItem(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V

    :goto_0
    return-void
.end method

.method selectItem(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;",
            ")V"
        }
    .end annotation

    .line 86
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onItemSelectionChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 92
    iget-object p2, p2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ItemEntry;->itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length v0, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p2, v3

    .line 93
    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v4

    .line 96
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_0

    const-string v4, "There can only be unique ItemActionBase actions per item"

    .line 98
    invoke-static {v4}, Ljunit/framework/Assert;->fail(Ljava/lang/String;)V

    goto :goto_1

    .line 101
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object v5, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-nez v5, :cond_1

    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 106
    :cond_1
    iget-object v6, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->availableActions:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {p0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->updateMenu()V

    return-void
.end method

.method public updateMenu()V
    .locals 4

    .line 153
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 155
    iput-boolean v1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionModeShouldbeRecreated:Z

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    if-eqz v0, :cond_0

    .line 157
    invoke-virtual {v0}, Landroidx/appcompat/view/ActionMode;->finish()V

    :cond_0
    return-void

    .line 162
    :cond_1
    iget-object v2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 163
    iget-object v2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    if-nez v2, :cond_3

    .line 164
    new-instance v2, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$1;)V

    invoke-virtual {v0, v2}, Lcom/daaw/avee/MainActivity;->startSupportActionMode(Landroidx/appcompat/view/ActionMode$Callback;)Landroidx/appcompat/view/ActionMode;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    .line 165
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onSelectModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 169
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    if-eqz v0, :cond_3

    .line 170
    invoke-virtual {v0}, Landroidx/appcompat/view/ActionMode;->finish()V

    .line 173
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->actionMode:Landroidx/appcompat/view/ActionMode;

    if-eqz v0, :cond_4

    .line 174
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->selectedItems:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " selected"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/ActionMode;->setTitle(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method
