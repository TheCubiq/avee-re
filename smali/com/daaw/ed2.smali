.class public final Lcom/daaw/ed2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ac2;

.field public final b:Lcom/daaw/cr5;

.field public final c:Lcom/daaw/cj5;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/daaw/ac2;Lcom/daaw/cr5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ed2;->a:Lcom/daaw/ac2;

    iput-object p2, p0, Lcom/daaw/ed2;->b:Lcom/daaw/cr5;

    new-instance p1, Lcom/daaw/cj5;

    const/16 p2, 0x40

    new-array v0, p2, [B

    invoke-direct {p1, v0, p2}, Lcom/daaw/cj5;-><init>([BI)V

    iput-object p1, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 12

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    iget-object v0, v0, Lcom/daaw/cj5;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/ik5;->b([BII)V

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->h(I)V

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->j(I)V

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/ed2;->d:Z

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0}, Lcom/daaw/cj5;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/ed2;->e:Z

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    const/4 v4, 0x6

    invoke-virtual {v0, v4}, Lcom/daaw/cj5;->j(I)V

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->c(I)I

    move-result v0

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    iget-object v3, v3, Lcom/daaw/cj5;->a:[B

    invoke-virtual {p1, v3, v1, v0}, Lcom/daaw/ik5;->b([BII)V

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->h(I)V

    iget-boolean v0, p0, Lcom/daaw/ed2;->d:Z

    const/4 v1, 0x4

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0, v1}, Lcom/daaw/cj5;->j(I)V

    iget-object v0, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v0, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v0

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/daaw/cj5;->j(I)V

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    const/16 v5, 0xf

    invoke-virtual {v3, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    iget-object v6, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v6, v4}, Lcom/daaw/cj5;->j(I)V

    int-to-long v6, v0

    const/16 v0, 0x1e

    shl-long/2addr v6, v0

    shl-int/2addr v3, v5

    int-to-long v8, v3

    or-long/2addr v6, v8

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v3, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    int-to-long v8, v3

    or-long/2addr v6, v8

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v3, v4}, Lcom/daaw/cj5;->j(I)V

    iget-boolean v3, p0, Lcom/daaw/ed2;->f:Z

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lcom/daaw/ed2;->e:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v3, v1}, Lcom/daaw/cj5;->j(I)V

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v3, v2}, Lcom/daaw/cj5;->c(I)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v3, v4}, Lcom/daaw/cj5;->j(I)V

    iget-object v3, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v3, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v3

    iget-object v8, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v8, v4}, Lcom/daaw/cj5;->j(I)V

    iget-object v8, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v8, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v8

    iget-object v9, p0, Lcom/daaw/ed2;->c:Lcom/daaw/cj5;

    invoke-virtual {v9, v4}, Lcom/daaw/cj5;->j(I)V

    iget-object v9, p0, Lcom/daaw/ed2;->b:Lcom/daaw/cr5;

    int-to-long v10, v2

    shl-long/2addr v10, v0

    shl-int/lit8 v0, v3, 0xf

    int-to-long v2, v0

    or-long/2addr v2, v10

    int-to-long v10, v8

    or-long/2addr v2, v10

    invoke-virtual {v9, v2, v3}, Lcom/daaw/cr5;->b(J)J

    iput-boolean v4, p0, Lcom/daaw/ed2;->f:Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/ed2;->b:Lcom/daaw/cr5;

    invoke-virtual {v0, v6, v7}, Lcom/daaw/cr5;->b(J)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/ed2;->a:Lcom/daaw/ac2;

    invoke-interface {v0, v2, v3, v1}, Lcom/daaw/ac2;->c(JI)V

    iget-object v0, p0, Lcom/daaw/ed2;->a:Lcom/daaw/ac2;

    invoke-interface {v0, p1}, Lcom/daaw/ac2;->a(Lcom/daaw/ik5;)V

    iget-object p1, p0, Lcom/daaw/ed2;->a:Lcom/daaw/ac2;

    invoke-interface {p1}, Lcom/daaw/ac2;->zzc()V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ed2;->f:Z

    iget-object v0, p0, Lcom/daaw/ed2;->a:Lcom/daaw/ac2;

    invoke-interface {v0}, Lcom/daaw/ac2;->zze()V

    return-void
.end method
