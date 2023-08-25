.class public final Lcom/daaw/op;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field public final p:Lcom/daaw/mp;

.field public final q:Lcom/daaw/pp;

.field public final r:[B

.field public s:Z

.field public t:Z

.field public u:J


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/op;->s:Z

    iput-boolean v0, p0, Lcom/daaw/op;->t:Z

    iput-object p1, p0, Lcom/daaw/op;->p:Lcom/daaw/mp;

    iput-object p2, p0, Lcom/daaw/op;->q:Lcom/daaw/pp;

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/op;->r:[B

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/op;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/op;->p:Lcom/daaw/mp;

    invoke-interface {v0}, Lcom/daaw/mp;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/op;->t:Z

    :cond_0
    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/op;->u:J

    return-wide v0
.end method

.method public final n()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/op;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/op;->p:Lcom/daaw/mp;

    iget-object v1, p0, Lcom/daaw/op;->q:Lcom/daaw/pp;

    invoke-interface {v0, v1}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/op;->s:Z

    :cond_0
    return-void
.end method

.method public q()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/op;->n()V

    return-void
.end method

.method public read()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/op;->r:[B

    invoke-virtual {p0, v0}, Lcom/daaw/op;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/op;->r:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v1, v0, 0xff

    :goto_0
    return v1
.end method

.method public read([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/op;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/op;->t:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    invoke-virtual {p0}, Lcom/daaw/op;->n()V

    iget-object v0, p0, Lcom/daaw/op;->p:Lcom/daaw/mp;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mp;->b([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-wide p2, p0, Lcom/daaw/op;->u:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/daaw/op;->u:J

    return p1
.end method
