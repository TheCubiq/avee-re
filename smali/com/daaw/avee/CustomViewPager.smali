.class public Lcom/daaw/avee/CustomViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/CustomViewPager$a;
    }
.end annotation


# instance fields
.field public A0:F

.field public B0:Lcom/daaw/avee/CustomViewPager$a;

.field public C0:Z

.field public D0:F

.field public E0:F

.field public F0:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/daaw/avee/CustomViewPager;->C0:Z

    const/4 p2, 0x0

    iput p2, p0, Lcom/daaw/avee/CustomViewPager;->D0:F

    iput p2, p0, Lcom/daaw/avee/CustomViewPager;->E0:F

    iput p2, p0, Lcom/daaw/avee/CustomViewPager;->F0:F

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f07019d

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/CustomViewPager;->D0:F

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    and-int/lit16 v0, v0, 0xff

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput v1, p0, Lcom/daaw/avee/CustomViewPager;->A0:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/avee/CustomViewPager;->C0:Z

    :goto_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    const/4 v4, 0x2

    if-eq v0, v4, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/avee/CustomViewPager;->C0:Z

    if-eqz v0, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/daaw/avee/CustomViewPager;->A0:F

    sub-float v0, v1, v0

    :goto_0
    iget v4, p0, Lcom/daaw/avee/CustomViewPager;->D0:F

    div-float/2addr v0, v4

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/kv0;->c()I

    move-result v4

    sub-int/2addr v4, v3

    if-ne v0, v4, :cond_3

    iget v0, p0, Lcom/daaw/avee/CustomViewPager;->A0:F

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget v4, p0, Lcom/daaw/avee/CustomViewPager;->F0:F

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/CustomViewPager;->F0:F

    iget-object v4, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    invoke-interface {v4, v0}, Lcom/daaw/avee/CustomViewPager$a;->a(F)V

    iget v0, p0, Lcom/daaw/avee/CustomViewPager;->A0:F

    sub-float v0, v1, v0

    iget v4, p0, Lcom/daaw/avee/CustomViewPager;->D0:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_4

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    if-nez v0, :cond_4

    iput v2, p0, Lcom/daaw/avee/CustomViewPager;->F0:F

    iget-object v0, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    invoke-interface {v0, v2}, Lcom/daaw/avee/CustomViewPager$a;->a(F)V

    iget-object v0, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    invoke-interface {v0}, Lcom/daaw/avee/CustomViewPager$a;->b()V

    :goto_2
    iput-boolean v3, p0, Lcom/daaw/avee/CustomViewPager;->C0:Z

    goto :goto_3

    :cond_4
    iget v0, p0, Lcom/daaw/avee/CustomViewPager;->A0:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/CustomViewPager;->D0:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lcom/daaw/kv0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/kv0;->c()I

    move-result v1

    sub-int/2addr v1, v3

    if-ne v0, v1, :cond_8

    iput v2, p0, Lcom/daaw/avee/CustomViewPager;->F0:F

    iget-object v0, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    invoke-interface {v0, v2}, Lcom/daaw/avee/CustomViewPager$a;->a(F)V

    iget-object v0, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    invoke-interface {v0}, Lcom/daaw/avee/CustomViewPager$a;->c()V

    goto :goto_2

    :cond_5
    iget-boolean v0, p0, Lcom/daaw/avee/CustomViewPager;->C0:Z

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_6
    iput v1, p0, Lcom/daaw/avee/CustomViewPager;->A0:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/avee/CustomViewPager;->C0:Z

    iput v2, p0, Lcom/daaw/avee/CustomViewPager;->E0:F

    :cond_7
    iput v2, p0, Lcom/daaw/avee/CustomViewPager;->F0:F

    iget-object v0, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    invoke-interface {v0, v2}, Lcom/daaw/avee/CustomViewPager$a;->a(F)V

    :cond_8
    :goto_3
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setOnSwipeOutListener(Lcom/daaw/avee/CustomViewPager$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/CustomViewPager;->B0:Lcom/daaw/avee/CustomViewPager$a;

    return-void
.end method
