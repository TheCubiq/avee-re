.class public Lcom/daaw/mx1$a;
.super Lcom/daaw/xt1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mx1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/mx1;


# direct methods
.method public constructor <init>(Lcom/daaw/mx1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    invoke-direct {p0}, Lcom/daaw/xt1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    iget-boolean v0, p1, Lcom/daaw/mx1;->t:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/daaw/mx1;->h:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    iget-object p1, p1, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    iget-object p1, p1, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    iget-object p1, p1, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    invoke-virtual {p1}, Lcom/daaw/mx1;->C()V

    iget-object p1, p0, Lcom/daaw/mx1$a;->a:Lcom/daaw/mx1;

    iget-object p1, p1, Lcom/daaw/mx1;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    :cond_1
    return-void
.end method
