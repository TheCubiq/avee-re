.class Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller$1;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "AbsRecyclerViewFastScroller.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getOnScrollListener()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;


# direct methods
.method constructor <init>(Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller$1;->this$0:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 192
    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller$1;->this$0:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    invoke-virtual {p2}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 194
    invoke-interface {p2, p1}, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/ScrollProgressCalculator;->calculateScrollProgress(Landroidx/recyclerview/widget/RecyclerView;)F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 196
    :goto_0
    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller$1;->this$0:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    invoke-virtual {p2, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->moveHandleToPosition(F)V

    return-void
.end method
