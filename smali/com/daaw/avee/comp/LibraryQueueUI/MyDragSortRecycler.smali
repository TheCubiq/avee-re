.class public Lcom/daaw/avee/comp/LibraryQueueUI/MyDragSortRecycler;
.super Lcom/emtronics/dragsortrecycler/DragSortRecycler;
.source "MyDragSortRecycler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 18
    invoke-super {p0, p1, p2, p3, p4}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->getSpanIndex()I

    return-void
.end method
