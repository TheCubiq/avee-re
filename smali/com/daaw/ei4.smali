.class public final Lcom/daaw/ei4;
.super Lcom/daaw/zl4;
.source ""


# instance fields
.field public final i:Landroid/view/View;

.field public final j:Lcom/daaw/a74;

.field public final k:Lcom/daaw/uh6;

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:Lcom/daaw/wh4;

.field public p:Lcom/daaw/t23;


# direct methods
.method public constructor <init>(Lcom/daaw/yl4;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/uh6;IZZLcom/daaw/wh4;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/zl4;-><init>(Lcom/daaw/yl4;)V

    iput-object p2, p0, Lcom/daaw/ei4;->i:Landroid/view/View;

    iput-object p3, p0, Lcom/daaw/ei4;->j:Lcom/daaw/a74;

    iput-object p4, p0, Lcom/daaw/ei4;->k:Lcom/daaw/uh6;

    iput p5, p0, Lcom/daaw/ei4;->l:I

    iput-boolean p6, p0, Lcom/daaw/ei4;->m:Z

    iput-boolean p7, p0, Lcom/daaw/ei4;->n:Z

    iput-object p8, p0, Lcom/daaw/ei4;->o:Lcom/daaw/wh4;

    return-void
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lcom/daaw/ei4;->l:I

    return v0
.end method

.method public final i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ei4;->i:Landroid/view/View;

    return-object v0
.end method

.method public final j()Lcom/daaw/uh6;
    .locals 2

    iget-object v0, p0, Lcom/daaw/zl4;->b:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->s:Ljava/util/List;

    iget-object v1, p0, Lcom/daaw/ei4;->k:Lcom/daaw/uh6;

    invoke-static {v0, v1}, Lcom/daaw/vi6;->b(Ljava/util/List;Lcom/daaw/uh6;)Lcom/daaw/uh6;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lcom/daaw/j23;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ei4;->j:Lcom/daaw/a74;

    invoke-interface {v0, p1}, Lcom/daaw/a74;->u0(Lcom/daaw/j23;)V

    return-void
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ei4;->m:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ei4;->n:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ei4;->j:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ei4;->j:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ei4;->j:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/t84;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p(JI)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ei4;->o:Lcom/daaw/wh4;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/wh4;->a(JI)V

    return-void
.end method

.method public final q()Lcom/daaw/t23;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ei4;->p:Lcom/daaw/t23;

    return-object v0
.end method

.method public final r(Lcom/daaw/t23;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ei4;->p:Lcom/daaw/t23;

    return-void
.end method
