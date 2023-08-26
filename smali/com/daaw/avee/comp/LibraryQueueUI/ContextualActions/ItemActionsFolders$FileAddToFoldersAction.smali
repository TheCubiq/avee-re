.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "ItemActionsFolders.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FileAddToFoldersAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction$Listener;
    }
.end annotation


# static fields
.field public static itemAction:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction;->itemAction:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x4

    const/4 v1, 0x1

    const v2, 0x7f0800b3

    const v3, 0x7f1000bb

    .line 69
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZII)V

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

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 76
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 77
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction$Listener;

    .line 78
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders$FileAddToFoldersAction$Listener;->onAddToFolders(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 80
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsFolders;->onActionAddToFolders:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
