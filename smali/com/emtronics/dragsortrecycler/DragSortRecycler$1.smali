.class Lcom/emtronics/dragsortrecycler/DragSortRecycler$1;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "DragSortRecycler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/emtronics/dragsortrecycler/DragSortRecycler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/emtronics/dragsortrecycler/DragSortRecycler;


# direct methods
.method constructor <init>(Lcom/emtronics/dragsortrecycler/DragSortRecycler;)V
    .locals 0

    .line 442
    iput-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler$1;->this$0:Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 445
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 450
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 451
    iget-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler$1;->this$0:Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scrolled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->access$000(Lcom/emtronics/dragsortrecycler/DragSortRecycler;Ljava/lang/String;)V

    .line 452
    iget-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler$1;->this$0:Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    invoke-static {p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->access$100(Lcom/emtronics/dragsortrecycler/DragSortRecycler;)I

    move-result p2

    sub-int/2addr p2, p3

    invoke-static {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->access$102(Lcom/emtronics/dragsortrecycler/DragSortRecycler;I)I

    return-void
.end method
