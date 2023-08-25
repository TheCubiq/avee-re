.class public Lcom/daaw/px1$d;
.super Lcom/daaw/px1$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/px1$f;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/px1$f;-><init>(Lcom/daaw/px1;)V

    invoke-virtual {p1}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lcom/daaw/px1;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/px1$f;->a()V

    iget-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/px1;->w(Landroid/view/WindowInsets;)Lcom/daaw/px1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    invoke-virtual {v0, v1}, Lcom/daaw/px1;->r([Lcom/daaw/gg0;)V

    return-object v0
.end method

.method public c(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lcom/daaw/gg0;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public d(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lcom/daaw/gg0;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public e(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lcom/daaw/gg0;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public f(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lcom/daaw/gg0;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public g(Lcom/daaw/gg0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lcom/daaw/gg0;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
