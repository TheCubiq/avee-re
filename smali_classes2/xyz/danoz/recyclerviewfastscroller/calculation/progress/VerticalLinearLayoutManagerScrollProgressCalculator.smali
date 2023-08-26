.class public Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalLinearLayoutManagerScrollProgressCalculator;
.super Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;
.source "VerticalLinearLayoutManagerScrollProgressCalculator.java"


# direct methods
.method public constructor <init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;-><init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V

    return-void
.end method


# virtual methods
.method public calculateScrollProgress(Landroidx/recyclerview/widget/RecyclerView;)F
    .locals 3

    .line 26
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 27
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 33
    :cond_0
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v1

    .line 34
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 35
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getHeight()I

    move-result v2

    .line 36
    div-int/2addr v2, v1

    .line 38
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p1

    sub-int v1, p1, v2

    sub-int/2addr p1, v1

    add-int/lit8 p1, p1, -0x1

    sub-int/2addr v0, p1

    int-to-float p1, v0

    int-to-float v0, v1

    div-float/2addr p1, v0

    return p1
.end method
