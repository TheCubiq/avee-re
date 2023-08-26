.class public abstract Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;
.super Landroid/widget/FrameLayout;
.source "AbsRecyclerViewFastScroller.java"

# interfaces
.implements Lxyz/danoz/recyclerviewfastscroller/RecyclerViewScroller;


# static fields
.field private static final STYLEABLE:[I


# instance fields
.field protected final mBar:Landroid/view/View;

.field protected final mHandle:Landroid/view/View;

.field protected mOnScrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private mSectionIndicator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    sget-object v0, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsRecyclerViewFastScroller:[I

    sput-object v0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->STYLEABLE:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 52
    invoke-direct {p0, p1, v0, v1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, v0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 60
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget-object v0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->STYLEABLE:[I

    const/4 v1, 0x0

    invoke-virtual {p3, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 65
    :try_start_0
    sget p3, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsRecyclerViewFastScroller_rfs_fast_scroller_layout:I

    .line 66
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getLayoutResourceId()I

    move-result v0

    .line 65
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    const-string v0, "layout_inflater"

    .line 67
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const/4 v0, 0x1

    .line 68
    invoke-virtual {p1, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 70
    sget p1, Lxyz/danoz/recyclerviewfastscroller/R$id;->scroll_bar:I

    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mBar:Landroid/view/View;

    .line 71
    sget p1, Lxyz/danoz/recyclerviewfastscroller/R$id;->scroll_handle:I

    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mHandle:Landroid/view/View;

    .line 73
    sget p1, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsRecyclerViewFastScroller_rfs_barBackground:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 74
    sget p3, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsRecyclerViewFastScroller_rfs_barColor:I

    const v0, -0x777778

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    .line 75
    iget-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mBar:Landroid/view/View;

    invoke-direct {p0, v1, p1, p3}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->applyCustomAttributesToView(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V

    .line 77
    sget p1, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsRecyclerViewFastScroller_rfs_handleBackground:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 78
    sget p3, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsRecyclerViewFastScroller_rfs_handleColor:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    .line 79
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mHandle:Landroid/view/View;

    invoke-direct {p0, v0, p1, p3}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->applyCustomAttributesToView(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    new-instance p1, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;

    invoke-direct {p1, p0}, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;-><init>(Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;)V

    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void

    :catchall_0
    move-exception p1

    .line 81
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method private applyCustomAttributesToView(Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    if-eqz p2, :cond_0

    .line 89
    invoke-direct {p0, p1, p2}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->setViewBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_0
    return-void
.end method

.method private getPositionFromScrollProgress(F)I
    .locals 2

    .line 176
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p1

    float-to-int p1, v0

    return p1
.end method

.method private setViewBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 129
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 130
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method private updateSectionIndicator(IF)V
    .locals 1

    .line 164
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mSectionIndicator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;

    if-eqz v0, :cond_0

    .line 165
    invoke-interface {v0, p2}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;->setProgress(F)V

    .line 166
    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/SectionIndexer;

    if-eqz p2, :cond_0

    .line 167
    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p2

    check-cast p2, Landroid/widget/SectionIndexer;

    .line 168
    invoke-interface {p2, p1}, Landroid/widget/SectionIndexer;->getSectionForPosition(I)I

    move-result p1

    .line 169
    invoke-interface {p2}, Landroid/widget/SectionIndexer;->getSections()[Ljava/lang/Object;

    move-result-object p2

    .line 170
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mSectionIndicator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;

    aget-object p1, p2, p1

    invoke-interface {v0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;->setSection(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract getLayoutResourceId()I
.end method

.method public getOnScrollListener()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
    .locals 1

    .line 187
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mOnScrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    if-nez v0, :cond_0

    .line 188
    new-instance v0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller$1;

    invoke-direct {v0, p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller$1;-><init>(Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;)V

    iput-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mOnScrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    .line 200
    :cond_0
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mOnScrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-object v0
.end method

.method public getScrollProgress(Landroid/view/MotionEvent;)F
    .locals 1

    .line 227
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;

    move-result-object v0

    invoke-interface {v0, p1}, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;->calculateScrollProgress(Landroid/view/MotionEvent;)F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected abstract getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;
.end method

.method public getSectionIndicator()Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;
    .locals 1

    .line 148
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mSectionIndicator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;

    return-object v0
.end method

.method public abstract moveHandleToPosition(F)V
.end method

.method protected abstract onCreateScrollProgressCalculator()V
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 205
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 207
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;

    move-result-object p1

    if-nez p1, :cond_0

    .line 208
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->onCreateScrollProgressCalculator()V

    .line 212
    :cond_0
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;

    move-result-object p1

    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-interface {p1, p2}, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;->calculateScrollProgress(Landroidx/recyclerview/widget/RecyclerView;)F

    move-result p1

    .line 213
    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->moveHandleToPosition(F)V

    return-void
.end method

.method public scrollTo(FZ)V
    .locals 1

    .line 154
    invoke-direct {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getPositionFromScrollProgress(F)I

    move-result p2

    .line 158
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 160
    invoke-direct {p0, p2, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->updateSectionIndicator(IF)V

    return-void
.end method

.method public setBarBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 124
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mBar:Landroid/view/View;

    invoke-direct {p0, v0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->setViewBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBarColor(I)V
    .locals 1

    .line 116
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mBar:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public setHandleBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mHandle:Landroid/view/View;

    invoke-direct {p0, v0, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->setViewBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setHandleColor(I)V
    .locals 1

    .line 100
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mHandle:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public setSectionIndicator(Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->mSectionIndicator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;

    return-void
.end method
