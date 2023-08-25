.class public final Lcom/daaw/z52;
.super Lcom/daaw/y52;
.source ""


# instance fields
.field public final b:Lcom/daaw/ik5;

.field public final c:Lcom/daaw/ik5;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>(Lcom/daaw/m42;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/y52;-><init>(Lcom/daaw/m42;)V

    new-instance p1, Lcom/daaw/ik5;

    sget-object v0, Lcom/daaw/c42;->a:[B

    invoke-direct {p1, v0}, Lcom/daaw/ik5;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/z52;->b:Lcom/daaw/ik5;

    new-instance p1, Lcom/daaw/ik5;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/daaw/ik5;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/z52;->c:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    iput v0, p0, Lcom/daaw/z52;->g:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance v0, Lcom/daaw/x52;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/x52;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lcom/daaw/ik5;J)Z
    .locals 10

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/ik5;->n()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    add-long v4, p2, v1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/z52;->e:Z

    if-nez v0, :cond_5

    new-instance v0, Lcom/daaw/ik5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v1

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>([B)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {v0}, Lcom/daaw/gz8;->a(Lcom/daaw/ik5;)Lcom/daaw/gz8;

    move-result-object p1

    iget v0, p1, Lcom/daaw/gz8;->b:I

    iput v0, p0, Lcom/daaw/z52;->d:I

    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    const-string v1, "video/avc"

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    iget-object v1, p1, Lcom/daaw/gz8;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    iget v1, p1, Lcom/daaw/gz8;->c:I

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    iget v1, p1, Lcom/daaw/gz8;->d:I

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    iget v1, p1, Lcom/daaw/gz8;->e:F

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->p(F)Lcom/daaw/b72;

    iget-object p1, p1, Lcom/daaw/gz8;->a:Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    invoke-interface {v0, p1}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    iput-boolean p2, p0, Lcom/daaw/z52;->e:Z

    return p3

    :cond_0
    if-ne v0, p2, :cond_5

    iget-boolean v0, p0, Lcom/daaw/z52;->e:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/daaw/z52;->g:I

    if-ne v0, p2, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    iget-boolean v0, p0, Lcom/daaw/z52;->f:Z

    if-nez v0, :cond_3

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    return p3

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/z52;->c:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    aput-byte p3, v0, p3

    aput-byte p3, v0, p2

    const/4 v1, 0x2

    aput-byte p3, v0, v1

    iget v0, p0, Lcom/daaw/z52;->d:I

    const/4 v1, 0x4

    rsub-int/lit8 v0, v0, 0x4

    const/4 v7, 0x0

    :goto_2
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    if-lez v2, :cond_4

    iget-object v2, p0, Lcom/daaw/z52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    iget v3, p0, Lcom/daaw/z52;->d:I

    invoke-virtual {p1, v2, v0, v3}, Lcom/daaw/ik5;->b([BII)V

    iget-object v2, p0, Lcom/daaw/z52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2, p3}, Lcom/daaw/ik5;->f(I)V

    iget-object v2, p0, Lcom/daaw/z52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->v()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/z52;->b:Lcom/daaw/ik5;

    invoke-virtual {v3, p3}, Lcom/daaw/ik5;->f(I)V

    iget-object v3, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    iget-object v8, p0, Lcom/daaw/z52;->b:Lcom/daaw/ik5;

    invoke-interface {v3, v8, v1}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget-object v3, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    invoke-interface {v3, p1, v2}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    add-int/lit8 v7, v7, 0x4

    add-int/2addr v7, v2

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iput-boolean p2, p0, Lcom/daaw/z52;->f:Z

    return p2

    :cond_5
    return p3
.end method
