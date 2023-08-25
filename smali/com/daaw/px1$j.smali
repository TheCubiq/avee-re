.class public Lcom/daaw/px1$j;
.super Lcom/daaw/px1$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public n:Lcom/daaw/gg0;

.field public o:Lcom/daaw/gg0;

.field public p:Lcom/daaw/gg0;


# direct methods
.method public constructor <init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/px1$i;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/px1$j;->n:Lcom/daaw/gg0;

    iput-object p1, p0, Lcom/daaw/px1$j;->o:Lcom/daaw/gg0;

    iput-object p1, p0, Lcom/daaw/px1$j;->p:Lcom/daaw/gg0;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;Lcom/daaw/px1$j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/px1$i;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/px1$j;->n:Lcom/daaw/gg0;

    iput-object p1, p0, Lcom/daaw/px1$j;->o:Lcom/daaw/gg0;

    iput-object p1, p0, Lcom/daaw/px1$j;->p:Lcom/daaw/gg0;

    return-void
.end method


# virtual methods
.method public h()Lcom/daaw/gg0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$j;->o:Lcom/daaw/gg0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/gg0;->d(Landroid/graphics/Insets;)Lcom/daaw/gg0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/px1$j;->o:Lcom/daaw/gg0;

    :cond_0
    iget-object v0, p0, Lcom/daaw/px1$j;->o:Lcom/daaw/gg0;

    return-object v0
.end method

.method public j()Lcom/daaw/gg0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$j;->n:Lcom/daaw/gg0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/gg0;->d(Landroid/graphics/Insets;)Lcom/daaw/gg0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/px1$j;->n:Lcom/daaw/gg0;

    :cond_0
    iget-object v0, p0, Lcom/daaw/px1$j;->n:Lcom/daaw/gg0;

    return-object v0
.end method

.method public l()Lcom/daaw/gg0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$j;->p:Lcom/daaw/gg0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/gg0;->d(Landroid/graphics/Insets;)Lcom/daaw/gg0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/px1$j;->p:Lcom/daaw/gg0;

    :cond_0
    iget-object v0, p0, Lcom/daaw/px1$j;->p:Lcom/daaw/gg0;

    return-object v0
.end method

.method public m(IIII)Lcom/daaw/px1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/px1;->w(Landroid/view/WindowInsets;)Lcom/daaw/px1;

    move-result-object p1

    return-object p1
.end method

.method public s(Lcom/daaw/gg0;)V
    .locals 0

    return-void
.end method
