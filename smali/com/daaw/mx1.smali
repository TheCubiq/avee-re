.class public Lcom/daaw/mx1;
.super Lcom/daaw/i0;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/ActionBarOverlayLayout$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mx1$d;
    }
.end annotation


# static fields
.field public static final E:Landroid/view/animation/Interpolator;

.field public static final F:Landroid/view/animation/Interpolator;


# instance fields
.field public A:Z

.field public final B:Lcom/daaw/wt1;

.field public final C:Lcom/daaw/wt1;

.field public final D:Lcom/daaw/yt1;

.field public a:Landroid/content/Context;

.field public b:Landroid/content/Context;

.field public c:Landroid/app/Activity;

.field public d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public e:Landroidx/appcompat/widget/ActionBarContainer;

.field public f:Lcom/daaw/iq;

.field public g:Landroidx/appcompat/widget/ActionBarContextView;

.field public h:Landroid/view/View;

.field public i:Landroidx/appcompat/widget/c;

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public k:I

.field public l:Z

.field public m:Lcom/daaw/mx1$d;

.field public n:Lcom/daaw/n0;

.field public o:Lcom/daaw/n0$a;

.field public p:Z

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/i0$b;",
            ">;"
        }
    .end annotation
.end field

.field public r:Z

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Lcom/daaw/vt1;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Lcom/daaw/mx1;->E:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lcom/daaw/mx1;->F:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/i0;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/mx1;->j:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/mx1;->k:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/mx1;->q:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/mx1;->s:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mx1;->t:Z

    iput-boolean v0, p0, Lcom/daaw/mx1;->x:Z

    new-instance v0, Lcom/daaw/mx1$a;

    invoke-direct {v0, p0}, Lcom/daaw/mx1$a;-><init>(Lcom/daaw/mx1;)V

    iput-object v0, p0, Lcom/daaw/mx1;->B:Lcom/daaw/wt1;

    new-instance v0, Lcom/daaw/mx1$b;

    invoke-direct {v0, p0}, Lcom/daaw/mx1$b;-><init>(Lcom/daaw/mx1;)V

    iput-object v0, p0, Lcom/daaw/mx1;->C:Lcom/daaw/wt1;

    new-instance v0, Lcom/daaw/mx1$c;

    invoke-direct {v0, p0}, Lcom/daaw/mx1$c;-><init>(Lcom/daaw/mx1;)V

    iput-object v0, p0, Lcom/daaw/mx1;->D:Lcom/daaw/yt1;

    iput-object p1, p0, Lcom/daaw/mx1;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->K(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/mx1;->h:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/i0;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/mx1;->j:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/mx1;->k:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/mx1;->q:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/mx1;->s:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mx1;->t:Z

    iput-boolean v0, p0, Lcom/daaw/mx1;->x:Z

    new-instance v0, Lcom/daaw/mx1$a;

    invoke-direct {v0, p0}, Lcom/daaw/mx1$a;-><init>(Lcom/daaw/mx1;)V

    iput-object v0, p0, Lcom/daaw/mx1;->B:Lcom/daaw/wt1;

    new-instance v0, Lcom/daaw/mx1$b;

    invoke-direct {v0, p0}, Lcom/daaw/mx1$b;-><init>(Lcom/daaw/mx1;)V

    iput-object v0, p0, Lcom/daaw/mx1;->C:Lcom/daaw/wt1;

    new-instance v0, Lcom/daaw/mx1$c;

    invoke-direct {v0, p0}, Lcom/daaw/mx1$c;-><init>(Lcom/daaw/mx1;)V

    iput-object v0, p0, Lcom/daaw/mx1;->D:Lcom/daaw/yt1;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->K(Landroid/view/View;)V

    return-void
.end method

.method public static B(ZZZ)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public A(Z)V
    .locals 8

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/mx1;->R()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/mx1;->J()V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/mx1;->Q()Z

    move-result v0

    const/4 v1, 0x4

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-wide/16 v4, 0x64

    const-wide/16 v6, 0xc8

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {p1, v1, v4, v5}, Lcom/daaw/iq;->q(IJ)Lcom/daaw/ut1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3, v6, v7}, Landroidx/appcompat/widget/ActionBarContextView;->f(IJ)Lcom/daaw/ut1;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {p1, v3, v6, v7}, Lcom/daaw/iq;->q(IJ)Lcom/daaw/ut1;

    move-result-object v0

    iget-object p1, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2, v4, v5}, Landroidx/appcompat/widget/ActionBarContextView;->f(IJ)Lcom/daaw/ut1;

    move-result-object p1

    :goto_1
    new-instance v1, Lcom/daaw/vt1;

    invoke-direct {v1}, Lcom/daaw/vt1;-><init>()V

    invoke-virtual {v1, p1, v0}, Lcom/daaw/vt1;->d(Lcom/daaw/ut1;Lcom/daaw/ut1;)Lcom/daaw/vt1;

    invoke-virtual {v1}, Lcom/daaw/vt1;->h()V

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {p1, v1}, Lcom/daaw/iq;->s(I)V

    iget-object p1, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {p1, v3}, Lcom/daaw/iq;->s(I)V

    iget-object p1, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public C()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mx1;->o:Lcom/daaw/n0$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/mx1;->n:Lcom/daaw/n0;

    invoke-interface {v0, v1}, Lcom/daaw/n0$a;->c(Lcom/daaw/n0;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/mx1;->n:Lcom/daaw/n0;

    iput-object v0, p0, Lcom/daaw/mx1;->o:Lcom/daaw/n0$a;

    :cond_0
    return-void
.end method

.method public D(Z)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vt1;->a()V

    :cond_0
    iget v0, p0, Lcom/daaw/mx1;->s:I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/daaw/mx1;->z:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setAlpha(F)V

    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, Lcom/daaw/vt1;

    invoke-direct {v0}, Lcom/daaw/vt1;-><init>()V

    iget-object v2, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v3, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    aget p1, p1, v1

    int-to-float p1, p1

    sub-float/2addr v2, p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {p1}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/daaw/ut1;->m(F)Lcom/daaw/ut1;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/mx1;->D:Lcom/daaw/yt1;

    invoke-virtual {p1, v1}, Lcom/daaw/ut1;->k(Lcom/daaw/yt1;)Lcom/daaw/ut1;

    invoke-virtual {v0, p1}, Lcom/daaw/vt1;->c(Lcom/daaw/ut1;)Lcom/daaw/vt1;

    iget-boolean p1, p0, Lcom/daaw/mx1;->t:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/mx1;->h:Landroid/view/View;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/daaw/ut1;->m(F)Lcom/daaw/ut1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/vt1;->c(Lcom/daaw/ut1;)Lcom/daaw/vt1;

    :cond_3
    sget-object p1, Lcom/daaw/mx1;->E:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Lcom/daaw/vt1;->f(Landroid/view/animation/Interpolator;)Lcom/daaw/vt1;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vt1;->e(J)Lcom/daaw/vt1;

    iget-object p1, p0, Lcom/daaw/mx1;->B:Lcom/daaw/wt1;

    invoke-virtual {v0, p1}, Lcom/daaw/vt1;->g(Lcom/daaw/wt1;)Lcom/daaw/vt1;

    iput-object v0, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    invoke-virtual {v0}, Lcom/daaw/vt1;->h()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/daaw/mx1;->B:Lcom/daaw/wt1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/daaw/wt1;->b(Landroid/view/View;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public E(Z)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vt1;->a()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, Lcom/daaw/mx1;->s:I

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/daaw/mx1;->z:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v2, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    const/4 v2, 0x1

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_2
    iget-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    new-instance p1, Lcom/daaw/vt1;

    invoke-direct {p1}, Lcom/daaw/vt1;-><init>()V

    iget-object v2, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v2}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/ut1;->m(F)Lcom/daaw/ut1;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/mx1;->D:Lcom/daaw/yt1;

    invoke-virtual {v2, v3}, Lcom/daaw/ut1;->k(Lcom/daaw/yt1;)Lcom/daaw/ut1;

    invoke-virtual {p1, v2}, Lcom/daaw/vt1;->c(Lcom/daaw/ut1;)Lcom/daaw/vt1;

    iget-boolean v2, p0, Lcom/daaw/mx1;->t:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/daaw/mx1;->h:Landroid/view/View;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Lcom/daaw/mx1;->h:Landroid/view/View;

    invoke-static {v0}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/ut1;->m(F)Lcom/daaw/ut1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/vt1;->c(Lcom/daaw/ut1;)Lcom/daaw/vt1;

    :cond_3
    sget-object v0, Lcom/daaw/mx1;->F:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, Lcom/daaw/vt1;->f(Landroid/view/animation/Interpolator;)Lcom/daaw/vt1;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vt1;->e(J)Lcom/daaw/vt1;

    iget-object v0, p0, Lcom/daaw/mx1;->C:Lcom/daaw/wt1;

    invoke-virtual {p1, v0}, Lcom/daaw/vt1;->g(Lcom/daaw/wt1;)Lcom/daaw/vt1;

    iput-object p1, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    invoke-virtual {p1}, Lcom/daaw/vt1;->h()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setAlpha(F)V

    iget-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    iget-boolean p1, p0, Lcom/daaw/mx1;->t:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/daaw/mx1;->h:Landroid/view/View;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    :cond_5
    iget-object p1, p0, Lcom/daaw/mx1;->C:Lcom/daaw/wt1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/daaw/wt1;->b(Landroid/view/View;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    :cond_6
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public final F(Landroid/view/View;)Lcom/daaw/iq;
    .locals 3

    instance-of v0, p1, Lcom/daaw/iq;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/iq;

    return-object p1

    :cond_0
    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lcom/daaw/iq;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t make a decor toolbar out of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string p1, "null"

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public G()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    return v0
.end method

.method public H()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I

    move-result v0

    return v0
.end method

.method public I()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->p()I

    move-result v0

    return v0
.end method

.method public final J()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/mx1;->w:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mx1;->w:Z

    iget-object v1, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->S(Z)V

    :cond_1
    return-void
.end method

.method public final K(Landroid/view/View;)V
    .locals 5

    sget v0, Lcom/daaw/o11;->p:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$d;)V

    :cond_0
    sget v0, Lcom/daaw/o11;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->F(Landroid/view/View;)Lcom/daaw/iq;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    sget v0, Lcom/daaw/o11;->f:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    sget v0, Lcom/daaw/o11;->c:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    invoke-interface {v0}, Lcom/daaw/iq;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {p1}, Lcom/daaw/iq;->v()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iput-boolean v0, p0, Lcom/daaw/mx1;->l:Z

    :cond_2
    iget-object v2, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/k0;->b(Landroid/content/Context;)Lcom/daaw/k0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/k0;->a()Z

    move-result v3

    if-nez v3, :cond_4

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x1

    :goto_2
    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->P(Z)V

    invoke-virtual {v2}, Lcom/daaw/k0;->g()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->N(Z)V

    iget-object p1, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    const/4 v2, 0x0

    sget-object v3, Lcom/daaw/x21;->a:[I

    sget v4, Lcom/daaw/x01;->c:I

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v2, Lcom/daaw/x21;->k:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->O(Z)V

    :cond_5
    sget v0, Lcom/daaw/x21;->i:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->M(F)V

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " can only be used with a compatible window decor layout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public L(II)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->v()I

    move-result v0

    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/mx1;->l:Z

    :cond_0
    iget-object v1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    and-int/2addr p1, p2

    xor-int/lit8 p2, p2, -0x1

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Lcom/daaw/iq;->l(I)V

    return-void
.end method

.method public M(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v0, p1}, Lcom/daaw/xs1;->z0(Landroid/view/View;F)V

    return-void
.end method

.method public final N(Z)V
    .locals 4

    iput-boolean p1, p0, Lcom/daaw/mx1;->r:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {p1, v0}, Lcom/daaw/iq;->i(Landroidx/appcompat/widget/c;)V

    iget-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Lcom/daaw/mx1;->i:Landroidx/appcompat/widget/c;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/c;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/c;)V

    iget-object p1, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    iget-object v0, p0, Lcom/daaw/mx1;->i:Landroidx/appcompat/widget/c;

    invoke-interface {p1, v0}, Lcom/daaw/iq;->i(Landroidx/appcompat/widget/c;)V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/mx1;->I()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object v0, p0, Lcom/daaw/mx1;->i:Landroidx/appcompat/widget/c;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {v0, v2}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    iget-boolean v3, p0, Lcom/daaw/mx1;->r:Z

    if-nez v3, :cond_4

    if-eqz p1, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-interface {v0, v3}, Lcom/daaw/iq;->y(Z)V

    iget-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, p0, Lcom/daaw/mx1;->r:Z

    if-nez v3, :cond_5

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method public O(Z)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-boolean p1, p0, Lcom/daaw/mx1;->A:Z

    iget-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    return-void
.end method

.method public P(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->u(Z)V

    return-void
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v0}, Lcom/daaw/xs1;->V(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public final R()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/mx1;->w:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mx1;->w:Z

    iget-object v1, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->S(Z)V

    :cond_1
    return-void
.end method

.method public final S(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/mx1;->u:Z

    iget-boolean v1, p0, Lcom/daaw/mx1;->v:Z

    iget-boolean v2, p0, Lcom/daaw/mx1;->w:Z

    invoke-static {v0, v1, v2}, Lcom/daaw/mx1;->B(ZZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/mx1;->x:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mx1;->x:Z

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->E(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/mx1;->x:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mx1;->x:Z

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->D(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/mx1;->v:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mx1;->v:Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->S(Z)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/mx1;->t:Z

    return-void
.end method

.method public d()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/mx1;->v:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mx1;->v:Z

    invoke-virtual {p0, v0}, Lcom/daaw/mx1;->S(Z)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vt1;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    :cond_0
    return-void
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/iq;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/mx1;->p:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/mx1;->p:Z

    iget-object v0, p0, Lcom/daaw/mx1;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/daaw/mx1;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/i0$b;

    invoke-interface {v2, p1}, Lcom/daaw/i0$b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->v()I

    move-result v0

    return v0
.end method

.method public j()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, Lcom/daaw/mx1;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Lcom/daaw/x01;->g:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/daaw/mx1;->b:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/daaw/mx1;->b:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/mx1;->b:Landroid/content/Context;

    return-object v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/mx1;->G()I

    move-result v0

    iget-boolean v1, p0, Lcom/daaw/mx1;->x:Z

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/mx1;->H()I

    move-result v1

    if-ge v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/mx1;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/k0;->b(Landroid/content/Context;)Lcom/daaw/k0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/k0;->g()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->N(Z)V

    return-void
.end method

.method public o(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/mx1;->m:Lcom/daaw/mx1$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/mx1$d;->e()Landroid/view/Menu;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/mx1;->s:I

    return-void
.end method

.method public r(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/mx1;->l:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->s(Z)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/mx1;->L(II)V

    return-void
.end method

.method public t(Z)V
    .locals 1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/mx1;->L(II)V

    return-void
.end method

.method public u(Z)V
    .locals 1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/mx1;->L(II)V

    return-void
.end method

.method public v(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/mx1;->z:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/vt1;->a()V

    :cond_0
    return-void
.end method

.method public w(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public x(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public y(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mx1;->f:Lcom/daaw/iq;

    invoke-interface {v0, p1}, Lcom/daaw/iq;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public z(Lcom/daaw/n0$a;)Lcom/daaw/n0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/mx1;->m:Lcom/daaw/mx1$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/mx1$d;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    new-instance v0, Lcom/daaw/mx1$d;

    iget-object v1, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/daaw/mx1$d;-><init>(Lcom/daaw/mx1;Landroid/content/Context;Lcom/daaw/n0$a;)V

    invoke-virtual {v0}, Lcom/daaw/mx1$d;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Lcom/daaw/mx1;->m:Lcom/daaw/mx1$d;

    invoke-virtual {v0}, Lcom/daaw/mx1$d;->k()V

    iget-object p1, p0, Lcom/daaw/mx1;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->h(Lcom/daaw/n0;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/mx1;->A(Z)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
