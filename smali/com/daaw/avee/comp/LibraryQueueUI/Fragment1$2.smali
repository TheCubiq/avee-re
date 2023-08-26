.class Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$2;
.super Ljava/lang/Object;
.source "Fragment1.java"

# interfaces
.implements Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemMoved(II)V
    .locals 2

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 123
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    invoke-static {v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    .line 125
    invoke-virtual {v1, p1, p2, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;->onItemsMoved(IILjava/util/List;)V

    return-void
.end method
