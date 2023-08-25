.class public abstract Lcom/daaw/va;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/daaw/cd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cd1<",
            "Lcom/daaw/hi1;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/cd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cd1<",
            "Lcom/daaw/oi1;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/va;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, Lcom/daaw/hi1;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/daaw/hi1;

    iget-object v0, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/cd1;

    invoke-direct {v0}, Lcom/daaw/cd1;-><init>()V

    iput-object v0, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    :cond_0
    iget-object v0, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/jp0;

    iget-object v1, p0, Lcom/daaw/va;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/daaw/jp0;-><init>(Landroid/content/Context;Lcom/daaw/hi1;)V

    iget-object v1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final d(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, Lcom/daaw/oi1;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/daaw/oi1;

    iget-object v0, p0, Lcom/daaw/va;->c:Lcom/daaw/cd1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/cd1;

    invoke-direct {v0}, Lcom/daaw/cd1;-><init>()V

    iput-object v0, p0, Lcom/daaw/va;->c:Lcom/daaw/cd1;

    :cond_0
    iget-object v0, p0, Lcom/daaw/va;->c:Lcom/daaw/cd1;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/ph1;

    iget-object v1, p0, Lcom/daaw/va;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/daaw/ph1;-><init>(Landroid/content/Context;Lcom/daaw/oi1;)V

    iget-object v1, p0, Lcom/daaw/va;->c:Lcom/daaw/cd1;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/cd1;->clear()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/va;->c:Lcom/daaw/cd1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/cd1;->clear()V

    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v1}, Lcom/daaw/cd1;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v1, v0}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/hi1;

    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object v1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v1, v0}, Lcom/daaw/cd1;->k(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v1}, Lcom/daaw/cd1;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {v1, v0}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/hi1;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/va;->b:Lcom/daaw/cd1;

    invoke-virtual {p1, v0}, Lcom/daaw/cd1;->k(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
