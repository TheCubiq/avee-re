.class public final Lcom/daaw/ot2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:J

.field public final e:Z

.field public final f:Lcom/daaw/iz2;

.field public final g:Lcom/daaw/iz2;

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>(Lcom/daaw/iz2;Lcom/daaw/iz2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ot2;->g:Lcom/daaw/iz2;

    iput-object p2, p0, Lcom/daaw/ot2;->f:Lcom/daaw/iz2;

    iput-boolean p3, p0, Lcom/daaw/ot2;->e:Z

    const/16 p3, 0xc

    invoke-virtual {p2, p3}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p2}, Lcom/daaw/iz2;->i()I

    move-result p2

    iput p2, p0, Lcom/daaw/ot2;->a:I

    invoke-virtual {p1, p3}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p1}, Lcom/daaw/iz2;->i()I

    move-result p2

    iput p2, p0, Lcom/daaw/ot2;->i:I

    invoke-virtual {p1}, Lcom/daaw/iz2;->e()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string p1, "first_chunk must be 1"

    invoke-static {p2, p1}, Lcom/daaw/az2;->f(ZLjava/lang/Object;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/ot2;->b:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget v0, p0, Lcom/daaw/ot2;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ot2;->b:I

    iget v2, p0, Lcom/daaw/ot2;->a:I

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/ot2;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ot2;->f:Lcom/daaw/iz2;

    invoke-virtual {v0}, Lcom/daaw/iz2;->n()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/ot2;->f:Lcom/daaw/iz2;

    invoke-virtual {v0}, Lcom/daaw/iz2;->m()J

    move-result-wide v2

    :goto_0
    iput-wide v2, p0, Lcom/daaw/ot2;->d:J

    iget v0, p0, Lcom/daaw/ot2;->b:I

    iget v2, p0, Lcom/daaw/ot2;->h:I

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/daaw/ot2;->g:Lcom/daaw/iz2;

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v0

    iput v0, p0, Lcom/daaw/ot2;->c:I

    iget-object v0, p0, Lcom/daaw/ot2;->g:Lcom/daaw/iz2;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/daaw/iz2;->w(I)V

    iget v0, p0, Lcom/daaw/ot2;->i:I

    const/4 v2, -0x1

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/ot2;->i:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ot2;->g:Lcom/daaw/iz2;

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v0

    add-int/2addr v2, v0

    :cond_2
    iput v2, p0, Lcom/daaw/ot2;->h:I

    :cond_3
    return v1
.end method
