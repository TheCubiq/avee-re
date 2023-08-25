.class public Lcom/daaw/pt;
.super Lcom/daaw/ft;
.source ""


# instance fields
.field public m:I


# direct methods
.method public constructor <init>(Lcom/daaw/kx1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/ft;-><init>(Lcom/daaw/kx1;)V

    instance-of p1, p1, Lcom/daaw/sb0;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/ft$a;->q:Lcom/daaw/ft$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/ft$a;->r:Lcom/daaw/ft$a;

    :goto_0
    iput-object p1, p0, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ft;->j:Z

    iput p1, p0, Lcom/daaw/ft;->g:I

    iget-object p1, p0, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/zs;

    invoke-interface {v0, v0}, Lcom/daaw/zs;->a(Lcom/daaw/zs;)V

    goto :goto_0

    :cond_1
    return-void
.end method
