.class public Lcom/daaw/uk$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/uk;


# direct methods
.method public constructor <init>(Lcom/daaw/uk;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    iput-boolean p2, p0, Lcom/daaw/uk$f;->p:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/uk$f;->p:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/uk;->I:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/uk;->J:Lcom/daaw/qw1;

    iget-object v1, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    iget-object v1, v1, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    invoke-virtual {v1}, Lcom/daaw/jh0$a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/daaw/gy0;

    invoke-direct {v1, v0, p1}, Lcom/daaw/gy0;-><init>(Landroid/content/Context;Landroid/view/View;)V

    new-instance v0, Lcom/daaw/uk$f$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/uk$f$a;-><init>(Lcom/daaw/uk$f;Landroid/view/View;)V

    invoke-virtual {v1, v0}, Lcom/daaw/gy0;->b(Lcom/daaw/gy0$d;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    invoke-static {v2}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v2

    array-length v2, v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    invoke-static {v2}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v2

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ch0;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    invoke-static {v2}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v2

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ch0;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/daaw/gy0;->a()Landroid/view/Menu;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    invoke-static {v3}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v3

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/ch0;->c()I

    move-result v3

    iget-object v4, p0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    invoke-static {v4}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v4

    aget-object v4, v4, v0

    invoke-virtual {v4}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/ch0;->d()I

    move-result v4

    invoke-interface {v2, p1, v0, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/daaw/gy0;->c()V

    return-void
.end method
