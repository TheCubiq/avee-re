.class public Lcom/daaw/uq0;
.super Lcom/daaw/l10;
.source ""


# instance fields
.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/jr0;",
            ">;"
        }
    .end annotation
.end field

.field public j:I

.field public k:D

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Ljava/lang/String;

.field public t:Lcom/daaw/bd0;

.field public u:Lcom/daaw/hd0;

.field public v:[B

.field public w:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/daaw/l10;-><init>(Ljava/lang/String;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/uq0;->e:I

    iput p1, p0, Lcom/daaw/uq0;->f:I

    iput p1, p0, Lcom/daaw/uq0;->g:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/uq0;->h:I

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/uq0;->i:Ljava/util/Map;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/uq0;->k:D

    const/high16 p1, 0x10000

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/uq0;->h(IZ)V

    return-void
.end method


# virtual methods
.method public final c(I)V
    .locals 5

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    iget-object v1, p0, Lcom/daaw/uq0;->i:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/jr0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/jr0;->a()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/uq0;->i:Ljava/util/Map;

    new-instance v2, Lcom/daaw/jr0;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/daaw/jr0;-><init>(I)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-wide v0, p0, Lcom/daaw/uq0;->k:D

    iget v2, p0, Lcom/daaw/uq0;->h:I

    add-int/lit8 v3, v2, -0x1

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v3

    int-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, v3

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/uq0;->k:D

    return-void
.end method

.method public d()Lcom/daaw/hd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/uq0;->u:Lcom/daaw/hd0;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/uq0;->t:Lcom/daaw/bd0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/uq0;->u:Lcom/daaw/hd0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Z
    .locals 1

    iget v0, p0, Lcom/daaw/uq0;->e:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h(IZ)V
    .locals 2

    const/16 v0, 0x29

    if-lt p1, v0, :cond_2

    iput p1, p0, Lcom/daaw/uq0;->d:I

    iput-boolean p2, p0, Lcom/daaw/uq0;->w:Z

    new-instance p1, Ljava/io/RandomAccessFile;

    iget-object v0, p0, Lcom/daaw/l10;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "r"

    invoke-direct {p1, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/uq0;->j(Ljava/io/RandomAccessFile;)V

    invoke-virtual {p0, p1}, Lcom/daaw/uq0;->r(Ljava/io/RandomAccessFile;)V

    iget v0, p0, Lcom/daaw/uq0;->f:I

    if-ltz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/uq0;->k(Ljava/io/RandomAccessFile;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/uq0;->i(Ljava/io/RandomAccessFile;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->close()V

    return-void

    :cond_1
    :try_start_1
    new-instance p2, Lcom/daaw/xg0;

    const-string v0, "No mpegs frames found"

    invoke-direct {p2, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    :try_start_2
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Buffer too small"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Ljava/io/RandomAccessFile;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/l10;->a()J

    move-result-wide v0

    iget v2, p0, Lcom/daaw/uq0;->g:I

    add-int/lit8 v2, v2, 0x1

    int-to-long v2, v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-virtual {p0}, Lcom/daaw/uq0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, -0x80

    :cond_0
    if-gtz v1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/uq0;->v:[B

    goto :goto_0

    :cond_1
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/daaw/uq0;->v:[B

    iget v0, p0, Lcom/daaw/uq0;->g:I

    add-int/lit8 v0, v0, 0x1

    int-to-long v2, v0

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, Lcom/daaw/uq0;->v:[B

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1

    if-lt p1, v1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Not enough bytes read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j(Ljava/io/RandomAccessFile;)V
    .locals 6

    const/16 v0, 0x80

    new-array v1, v0, [B

    invoke-virtual {p0}, Lcom/daaw/l10;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x80

    sub-long/2addr v2, v4

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1

    if-lt p1, v0, :cond_0

    :try_start_0
    new-instance p1, Lcom/daaw/cd0;

    invoke-direct {p1, v1}, Lcom/daaw/cd0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/uq0;->t:Lcom/daaw/bd0;
    :try_end_0
    .catch Lcom/daaw/xs0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/uq0;->t:Lcom/daaw/bd0;

    :goto_0
    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Not enough bytes read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Ljava/io/RandomAccessFile;)V
    .locals 5

    iget v0, p0, Lcom/daaw/uq0;->e:I

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/daaw/uq0;->f:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/uq0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/uq0;->e:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/daaw/uq0;->f:I

    :goto_0
    new-array v2, v0, [B

    const-wide/16 v3, 0x0

    invoke-virtual {p1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1

    if-lt p1, v0, :cond_2

    :try_start_0
    invoke-static {v2}, Lcom/daaw/nd0;->b([B)Lcom/daaw/l;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/uq0;->u:Lcom/daaw/hd0;
    :try_end_0
    .catch Lcom/daaw/xs0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Not enough bytes read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    :cond_3
    :goto_1
    iput-object v1, p0, Lcom/daaw/uq0;->u:Lcom/daaw/hd0;

    :goto_2
    return-void
.end method

.method public final l([BI)Z
    .locals 7

    array-length v0, p1

    add-int/lit8 v1, p2, 0xd

    add-int/lit8 v2, v1, 0x3

    if-lt v0, v2, :cond_5

    const/4 v0, 0x4

    invoke-static {p1, v1, v0}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Xing"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    return v4

    :cond_0
    invoke-static {p1, v1, v0}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Info"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v4

    :cond_1
    array-length v1, p1

    add-int/lit8 v5, p2, 0x15

    add-int/lit8 v6, v5, 0x3

    if-lt v1, v6, :cond_5

    invoke-static {p1, v5, v0}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v4

    :cond_2
    invoke-static {p1, v5, v0}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v4

    :cond_3
    array-length v1, p1

    add-int/lit8 p2, p2, 0x24

    add-int/lit8 v5, p2, 0x3

    if-lt v1, v5, :cond_5

    invoke-static {p1, p2, v0}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v4

    :cond_4
    invoke-static {p1, p2, v0}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v4

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public final m()I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/l10;->a()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p0}, Lcom/daaw/uq0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, -0x80

    :cond_0
    return v1
.end method

.method public n(Ljava/io/RandomAccessFile;)I
    .locals 6

    const/16 v0, 0xa

    new-array v1, v0, [B

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p1, v1, v4, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v0, :cond_0

    :try_start_1
    invoke-static {v1}, Lcom/daaw/nd0;->c([B)V

    const/4 p1, 0x6

    aget-byte p1, v1, p1

    const/4 v2, 0x7

    aget-byte v2, v1, v2

    const/16 v3, 0x8

    aget-byte v3, v1, v3

    const/16 v5, 0x9

    aget-byte v1, v1, v5

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/wc;->m(BBBB)I

    move-result p1
    :try_end_1
    .catch Lcom/daaw/xs0; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/daaw/sp1; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/2addr p1, v0

    return p1

    :catch_0
    :cond_0
    return v4
.end method

.method public final o(Lcom/daaw/ar0;I)V
    .locals 3

    iget v0, p0, Lcom/daaw/uq0;->p:I

    invoke-virtual {p1}, Lcom/daaw/ar0;->h()I

    move-result v1

    const-string v2, "Inconsistent frame header"

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/uq0;->n:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/ar0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/uq0;->s:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/ar0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/ar0;->f()I

    move-result p1

    add-int/2addr p2, p1

    int-to-long p1, p2

    invoke-virtual {p0}, Lcom/daaw/l10;->a()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/xg0;

    const-string p2, "Frame would extend beyond end of file"

    invoke-direct {p1, p2}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/daaw/xg0;

    invoke-direct {p1, v2}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/daaw/xg0;

    invoke-direct {p1, v2}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/daaw/xg0;

    invoke-direct {p1, v2}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p([BIII)I
    .locals 5

    :goto_0
    add-int/lit8 v0, p2, -0x28

    if-ge p4, v0, :cond_0

    new-instance v0, Lcom/daaw/ar0;

    aget-byte v1, p1, p4

    add-int/lit8 v2, p4, 0x1

    aget-byte v2, p1, v2

    add-int/lit8 v3, p4, 0x2

    aget-byte v3, p1, v3

    add-int/lit8 v4, p4, 0x3

    aget-byte v4, p1, v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/ar0;-><init>(BBBB)V

    add-int v1, p3, p4

    invoke-virtual {p0, v0, v1}, Lcom/daaw/uq0;->o(Lcom/daaw/ar0;I)V

    invoke-virtual {v0}, Lcom/daaw/ar0;->f()I

    move-result v2

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0}, Lcom/daaw/uq0;->m()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ar0;->f()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/daaw/uq0;->g:I

    iget v1, p0, Lcom/daaw/uq0;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/uq0;->h:I

    invoke-virtual {v0}, Lcom/daaw/ar0;->b()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/uq0;->c(I)V

    invoke-virtual {v0}, Lcom/daaw/ar0;->f()I

    move-result v0

    add-int/2addr p4, v0

    goto :goto_0

    :cond_0
    return p4
.end method

.method public final q([BIII)I
    .locals 6

    :goto_0
    add-int/lit8 v0, p2, -0x28

    if-ge p4, v0, :cond_2

    aget-byte v0, p1, p4

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p4, 0x1

    aget-byte v1, p1, v0

    const/16 v2, -0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    :try_start_0
    new-instance v1, Lcom/daaw/ar0;

    aget-byte v2, p1, p4

    aget-byte v3, p1, v0

    add-int/lit8 v4, p4, 0x2

    aget-byte v4, p1, v4

    add-int/lit8 v5, p4, 0x3

    aget-byte v5, p1, v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/daaw/ar0;-><init>(BBBB)V

    iget v2, p0, Lcom/daaw/uq0;->e:I

    if-gez v2, :cond_0

    invoke-virtual {p0, p1, p4}, Lcom/daaw/uq0;->l([BI)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int v2, p3, p4

    iput v2, p0, Lcom/daaw/uq0;->e:I

    invoke-virtual {v1}, Lcom/daaw/ar0;->b()I

    move-result v2

    iput v2, p0, Lcom/daaw/uq0;->j:I

    invoke-virtual {v1}, Lcom/daaw/ar0;->f()I

    move-result v0

    add-int/2addr p4, v0

    goto :goto_0

    :cond_0
    add-int v2, p3, p4

    iput v2, p0, Lcom/daaw/uq0;->f:I

    invoke-virtual {v1}, Lcom/daaw/ar0;->c()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/uq0;->l:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/daaw/ar0;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/uq0;->m:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/daaw/ar0;->e()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/uq0;->n:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/daaw/ar0;->g()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/uq0;->o:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/daaw/ar0;->h()I

    move-result v2

    iput v2, p0, Lcom/daaw/uq0;->p:I

    invoke-virtual {v1}, Lcom/daaw/ar0;->i()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/uq0;->s:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/daaw/ar0;->j()Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/uq0;->q:Z

    invoke-virtual {v1}, Lcom/daaw/ar0;->k()Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/uq0;->r:Z

    iget v2, p0, Lcom/daaw/uq0;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/daaw/uq0;->h:I

    invoke-virtual {v1}, Lcom/daaw/ar0;->b()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/uq0;->c(I)V

    invoke-virtual {v1}, Lcom/daaw/ar0;->f()I

    move-result p1
    :try_end_0
    .catch Lcom/daaw/xg0; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p4, p1

    return p4

    :catch_0
    move p4, v0

    goto/16 :goto_0

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto/16 :goto_0

    :cond_2
    return p4
.end method

.method public final r(Ljava/io/RandomAccessFile;)V
    .locals 8

    iget v0, p0, Lcom/daaw/uq0;->d:I

    new-array v0, v0, [B

    invoke-virtual {p0, p1}, Lcom/daaw/uq0;->n(Ljava/io/RandomAccessFile;)I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    const/4 v4, 0x0

    :cond_0
    :goto_1
    if-nez v4, :cond_5

    iget v5, p0, Lcom/daaw/uq0;->d:I

    invoke-virtual {p1, v0, v2, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v5

    iget v6, p0, Lcom/daaw/uq0;->d:I

    if-ge v5, v6, :cond_1

    const/4 v4, 0x1

    :cond_1
    const/16 v6, 0x28

    if-lt v5, v6, :cond_0

    :try_start_0
    iget v6, p0, Lcom/daaw/uq0;->f:I

    if-gez v6, :cond_3

    invoke-virtual {p0, v0, v5, v1, v2}, Lcom/daaw/uq0;->q([BIII)I

    move-result v6

    iget v7, p0, Lcom/daaw/uq0;->f:I

    if-ltz v7, :cond_2

    iget-boolean v3, p0, Lcom/daaw/uq0;->w:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    move v3, v7

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {p0, v0, v5, v1, v6}, Lcom/daaw/uq0;->p([BIII)I

    move-result v5

    add-int/2addr v1, v5

    int-to-long v5, v1

    invoke-virtual {p1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V
    :try_end_0
    .catch Lcom/daaw/xg0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    iget v4, p0, Lcom/daaw/uq0;->h:I

    const/4 v5, 0x2

    if-ge v4, v5, :cond_5

    const/4 v4, -0x1

    iput v4, p0, Lcom/daaw/uq0;->f:I

    iput v4, p0, Lcom/daaw/uq0;->e:I

    iput v2, p0, Lcom/daaw/uq0;->h:I

    iget-object v4, p0, Lcom/daaw/uq0;->i:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->clear()V

    add-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_4

    int-to-long v5, v4

    invoke-virtual {p1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    move v1, v4

    goto :goto_0

    :cond_4
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Valid start of mpeg frames not found"

    invoke-direct {p1, v0, v1}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_5
    return-void
.end method
