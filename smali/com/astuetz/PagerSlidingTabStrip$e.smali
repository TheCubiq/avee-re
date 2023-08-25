.class public Lcom/astuetz/PagerSlidingTabStrip$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/astuetz/PagerSlidingTabStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/astuetz/PagerSlidingTabStrip;


# direct methods
.method public constructor <init>(Lcom/astuetz/PagerSlidingTabStrip;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->f(Lcom/astuetz/PagerSlidingTabStrip;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v2}, Lcom/astuetz/PagerSlidingTabStrip;->g(Lcom/astuetz/PagerSlidingTabStrip;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/astuetz/PagerSlidingTabStrip;->k(Lcom/astuetz/PagerSlidingTabStrip;I)I

    move-result v0

    invoke-static {v2, v0}, Lcom/astuetz/PagerSlidingTabStrip;->i(Lcom/astuetz/PagerSlidingTabStrip;I)I

    :cond_0
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->h(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v2

    iget-object v3, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v3}, Landroid/widget/HorizontalScrollView;->getPaddingTop()I

    move-result v3

    iget-object v4, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v4}, Lcom/astuetz/PagerSlidingTabStrip;->j(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v4

    iget-object v5, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v5}, Landroid/widget/HorizontalScrollView;->getPaddingBottom()I

    move-result v5

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/HorizontalScrollView;->setPadding(IIII)V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->l(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v3}, Lcom/astuetz/PagerSlidingTabStrip;->h(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->m(Lcom/astuetz/PagerSlidingTabStrip;I)I

    :cond_1
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    iget v2, v0, Lcom/astuetz/PagerSlidingTabStrip;->d0:I

    invoke-static {v0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->o(Lcom/astuetz/PagerSlidingTabStrip;I)I

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->p(Lcom/astuetz/PagerSlidingTabStrip;F)F

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->n(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v2

    invoke-static {v0, v2, v1}, Lcom/astuetz/PagerSlidingTabStrip;->q(Lcom/astuetz/PagerSlidingTabStrip;II)V

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$e;->p:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->n(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/astuetz/PagerSlidingTabStrip;->a(Lcom/astuetz/PagerSlidingTabStrip;I)V

    return-void
.end method
