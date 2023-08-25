.class public final Lcom/daaw/c01$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/c01;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/wv;

.field public final b:Lcom/daaw/ol1;

.field public final c:Lcom/daaw/qv0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:I

.field public h:J


# direct methods
.method public constructor <init>(Lcom/daaw/wv;Lcom/daaw/ol1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c01$b;->a:Lcom/daaw/wv;

    iput-object p2, p0, Lcom/daaw/c01$b;->b:Lcom/daaw/ol1;

    new-instance p1, Lcom/daaw/qv0;

    const/16 p2, 0x40

    new-array p2, p2, [B

    invoke-direct {p1, p2}, Lcom/daaw/qv0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    iget-object v0, v0, Lcom/daaw/qv0;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/rv0;->g([BII)V

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->m(I)V

    invoke-virtual {p0}, Lcom/daaw/c01$b;->b()V

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    iget-object v0, v0, Lcom/daaw/qv0;->a:[B

    iget v2, p0, Lcom/daaw/c01$b;->g:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/rv0;->g([BII)V

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->m(I)V

    invoke-virtual {p0}, Lcom/daaw/c01$b;->c()V

    iget-object v0, p0, Lcom/daaw/c01$b;->a:Lcom/daaw/wv;

    iget-wide v1, p0, Lcom/daaw/c01$b;->h:J

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/wv;->e(JZ)V

    iget-object v0, p0, Lcom/daaw/c01$b;->a:Lcom/daaw/wv;

    invoke-interface {v0, p1}, Lcom/daaw/wv;->a(Lcom/daaw/rv0;)V

    iget-object p1, p0, Lcom/daaw/c01$b;->a:Lcom/daaw/wv;

    invoke-interface {p1}, Lcom/daaw/wv;->c()V

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v0}, Lcom/daaw/qv0;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/c01$b;->d:Z

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v0}, Lcom/daaw/qv0;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/c01$b;->e:Z

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Lcom/daaw/qv0;->o(I)V

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    iput v0, p0, Lcom/daaw/c01$b;->g:I

    return-void
.end method

.method public final c()V
    .locals 10

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/c01$b;->h:J

    iget-boolean v0, p0, Lcom/daaw/c01$b;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v0, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    int-to-long v3, v0

    const/16 v0, 0x1e

    shl-long/2addr v3, v0

    iget-object v5, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v5, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    const/16 v7, 0xf

    invoke-virtual {v5, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    shl-int/2addr v5, v7

    int-to-long v8, v5

    or-long/2addr v3, v8

    iget-object v5, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v5, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v5, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    int-to-long v8, v5

    or-long/2addr v3, v8

    iget-object v5, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v5, v6}, Lcom/daaw/qv0;->o(I)V

    iget-boolean v5, p0, Lcom/daaw/c01$b;->f:Z

    if-nez v5, :cond_0

    iget-boolean v5, p0, Lcom/daaw/c01$b;->e:Z

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v5, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v1, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v1, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v1

    int-to-long v1, v1

    shl-long v0, v1, v0

    iget-object v2, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v2, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v2, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v2, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v2

    shl-int/2addr v2, v7

    int-to-long v8, v2

    or-long/2addr v0, v8

    iget-object v2, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v2, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v2, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v2, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v2

    int-to-long v7, v2

    or-long/2addr v0, v7

    iget-object v2, p0, Lcom/daaw/c01$b;->c:Lcom/daaw/qv0;

    invoke-virtual {v2, v6}, Lcom/daaw/qv0;->o(I)V

    iget-object v2, p0, Lcom/daaw/c01$b;->b:Lcom/daaw/ol1;

    invoke-virtual {v2, v0, v1}, Lcom/daaw/ol1;->b(J)J

    iput-boolean v6, p0, Lcom/daaw/c01$b;->f:Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/c01$b;->b:Lcom/daaw/ol1;

    invoke-virtual {v0, v3, v4}, Lcom/daaw/ol1;->b(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/c01$b;->h:J

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/c01$b;->f:Z

    iget-object v0, p0, Lcom/daaw/c01$b;->a:Lcom/daaw/wv;

    invoke-interface {v0}, Lcom/daaw/wv;->b()V

    return-void
.end method
