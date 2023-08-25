.class public final Lcom/daaw/d92;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:J

.field public final e:Z

.field public final f:Lcom/daaw/ik5;

.field public final g:Lcom/daaw/ik5;

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>(Lcom/daaw/ik5;Lcom/daaw/ik5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d92;->g:Lcom/daaw/ik5;

    iput-object p2, p0, Lcom/daaw/d92;->f:Lcom/daaw/ik5;

    iput-boolean p3, p0, Lcom/daaw/d92;->e:Z

    const/16 p3, 0xc

    invoke-virtual {p2, p3}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p2}, Lcom/daaw/ik5;->v()I

    move-result p2

    iput p2, p0, Lcom/daaw/d92;->a:I

    invoke-virtual {p1, p3}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p1}, Lcom/daaw/ik5;->v()I

    move-result p2

    iput p2, p0, Lcom/daaw/d92;->i:I

    invoke-virtual {p1}, Lcom/daaw/ik5;->m()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string p1, "first_chunk must be 1"

    invoke-static {p2, p1}, Lcom/daaw/n09;->b(ZLjava/lang/String;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/d92;->b:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget v0, p0, Lcom/daaw/d92;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/d92;->b:I

    iget v2, p0, Lcom/daaw/d92;->a:I

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/d92;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/d92;->f:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->B()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/d92;->f:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->A()J

    move-result-wide v2

    :goto_0
    iput-wide v2, p0, Lcom/daaw/d92;->d:J

    iget v0, p0, Lcom/daaw/d92;->b:I

    iget v2, p0, Lcom/daaw/d92;->h:I

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/daaw/d92;->g:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->v()I

    move-result v0

    iput v0, p0, Lcom/daaw/d92;->c:I

    iget-object v0, p0, Lcom/daaw/d92;->g:Lcom/daaw/ik5;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->g(I)V

    iget v0, p0, Lcom/daaw/d92;->i:I

    const/4 v2, -0x1

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/d92;->i:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/d92;->g:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->v()I

    move-result v0

    add-int/2addr v2, v0

    :cond_2
    iput v2, p0, Lcom/daaw/d92;->h:I

    :cond_3
    return v1
.end method
