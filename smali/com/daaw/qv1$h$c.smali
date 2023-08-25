.class public Lcom/daaw/qv1$h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1$h;->b(Lcom/daaw/vk1;Ljava/lang/Boolean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/qv1$h;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1$h;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    new-instance v1, Lcom/daaw/dv1$f;

    invoke-direct {v1}, Lcom/daaw/dv1$f;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/qv1;->D(Lcom/daaw/qv1;Lcom/daaw/dv1$f;)Lcom/daaw/dv1$f;

    :cond_0
    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/dv1$f;->a:Z

    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/dv1$f;->b:Z

    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v2, v2, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->q(Lcom/daaw/qv1;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v3, v3, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->o(Lcom/daaw/qv1;)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Lcom/daaw/dv1$f;->d:I

    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v2, v2, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v3, v3, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->o(Lcom/daaw/qv1;)I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v3, v3, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v3

    iget v3, v3, Lcom/daaw/dv1$f;->d:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/dv1$f;->c:I

    iget-object v0, p0, Lcom/daaw/qv1$h$c;->p:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/dv1;->K(Lcom/daaw/dv1$f;)V

    return-void
.end method
