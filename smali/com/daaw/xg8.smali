.class public final Lcom/daaw/xg8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:J

.field public d:Lcom/daaw/pr8;

.field public e:Z

.field public f:Z

.field public final synthetic g:Lcom/daaw/zg8;


# direct methods
.method public constructor <init>(Lcom/daaw/zg8;Ljava/lang/String;ILcom/daaw/pr8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xg8;->g:Lcom/daaw/zg8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/xg8;->a:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/xg8;->b:I

    if-nez p4, :cond_0

    const-wide/16 p1, -0x1

    goto :goto_0

    :cond_0
    iget-wide p1, p4, Lcom/daaw/md3;->d:J

    :goto_0
    iput-wide p1, p0, Lcom/daaw/xg8;->c:J

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Lcom/daaw/md3;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object p4, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    :cond_1
    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/xg8;)I
    .locals 0

    iget p0, p0, Lcom/daaw/xg8;->b:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/xg8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/xg8;->c:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/xg8;)Lcom/daaw/pr8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/xg8;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xg8;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/xg8;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/xg8;->f:Z

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/xg8;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/xg8;->e:Z

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/xg8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/xg8;->f:Z

    return p0
.end method

.method public static bridge synthetic i(Lcom/daaw/xg8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/xg8;->e:Z

    return p0
.end method


# virtual methods
.method public final g(ILcom/daaw/pr8;)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/xg8;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget v0, p0, Lcom/daaw/xg8;->b:I

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    iget-wide p1, p2, Lcom/daaw/md3;->d:J

    iput-wide p1, p0, Lcom/daaw/xg8;->c:J

    :cond_0
    return-void
.end method

.method public final j(ILcom/daaw/pr8;)Z
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_1

    iget p2, p0, Lcom/daaw/xg8;->b:I

    if-ne p1, p2, :cond_0

    return v0

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    if-nez p1, :cond_3

    invoke-virtual {p2}, Lcom/daaw/md3;->b()Z

    move-result p1

    if-nez p1, :cond_2

    iget-wide p1, p2, Lcom/daaw/md3;->d:J

    iget-wide v2, p0, Lcom/daaw/xg8;->c:J

    cmp-long v4, p1, v2

    if-nez v4, :cond_2

    return v0

    :cond_2
    return v1

    :cond_3
    iget-wide v2, p2, Lcom/daaw/md3;->d:J

    iget-wide v4, p1, Lcom/daaw/md3;->d:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_4

    iget v2, p2, Lcom/daaw/md3;->b:I

    iget v3, p1, Lcom/daaw/md3;->b:I

    if-ne v2, v3, :cond_4

    iget p2, p2, Lcom/daaw/md3;->c:I

    iget p1, p1, Lcom/daaw/md3;->c:I

    if-ne p2, p1, :cond_4

    return v0

    :cond_4
    return v1
.end method

.method public final k(Lcom/daaw/ib8;)Z
    .locals 10

    iget-object v0, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/xg8;->b:I

    iget p1, p1, Lcom/daaw/ib8;->c:I

    if-eq v0, p1, :cond_0

    return v1

    :cond_0
    return v2

    :cond_1
    iget-wide v3, p0, Lcom/daaw/xg8;->c:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-nez v7, :cond_2

    return v2

    :cond_2
    iget-wide v5, v0, Lcom/daaw/md3;->d:J

    cmp-long v7, v5, v3

    if-lez v7, :cond_3

    return v1

    :cond_3
    iget-object v3, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    iget-object v0, v0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    iget-object v4, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    iget-object v4, v4, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v3

    iget-object v4, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget-wide v5, v4, Lcom/daaw/md3;->d:J

    iget-object v7, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    iget-wide v7, v7, Lcom/daaw/md3;->d:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_d

    if-ge v0, v3, :cond_5

    goto :goto_2

    :cond_5
    if-le v0, v3, :cond_6

    return v1

    :cond_6
    invoke-virtual {v4}, Lcom/daaw/md3;->b()Z

    move-result v0

    iget-object p1, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    if-eqz v0, :cond_a

    iget v0, p1, Lcom/daaw/md3;->b:I

    iget p1, p1, Lcom/daaw/md3;->c:I

    iget-object v3, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    iget v4, v3, Lcom/daaw/md3;->b:I

    if-gt v0, v4, :cond_9

    if-ne v0, v4, :cond_8

    iget v0, v3, Lcom/daaw/md3;->c:I

    if-le p1, v0, :cond_7

    goto :goto_0

    :cond_7
    return v2

    :cond_8
    const/4 v1, 0x0

    :cond_9
    :goto_0
    return v1

    :cond_a
    iget p1, p1, Lcom/daaw/md3;->e:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_c

    iget-object v0, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    iget v0, v0, Lcom/daaw/md3;->b:I

    if-le p1, v0, :cond_b

    goto :goto_1

    :cond_b
    return v2

    :cond_c
    :goto_1
    return v1

    :cond_d
    :goto_2
    return v2
.end method

.method public final l(Lcom/daaw/l64;Lcom/daaw/l64;)Z
    .locals 6

    iget v0, p0, Lcom/daaw/xg8;->b:I

    invoke-virtual {p1}, Lcom/daaw/l64;->c()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/daaw/l64;->c()I

    move-result p1

    if-ge v0, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/daaw/xg8;->g:Lcom/daaw/zg8;

    invoke-static {v1}, Lcom/daaw/zg8;->h(Lcom/daaw/zg8;)Lcom/daaw/i54;

    move-result-object v1

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v0, v1, v4, v5}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    iget-object v0, p0, Lcom/daaw/xg8;->g:Lcom/daaw/zg8;

    invoke-static {v0}, Lcom/daaw/zg8;->h(Lcom/daaw/zg8;)Lcom/daaw/i54;

    move-result-object v0

    iget v0, v0, Lcom/daaw/i54;->m:I

    :goto_0
    iget-object v1, p0, Lcom/daaw/xg8;->g:Lcom/daaw/zg8;

    invoke-static {v1}, Lcom/daaw/zg8;->h(Lcom/daaw/zg8;)Lcom/daaw/i54;

    move-result-object v1

    iget v1, v1, Lcom/daaw/i54;->n:I

    if-gt v0, v1, :cond_0

    invoke-virtual {p1, v0}, Lcom/daaw/l64;->f(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v3, :cond_2

    iget-object p1, p0, Lcom/daaw/xg8;->g:Lcom/daaw/zg8;

    invoke-static {p1}, Lcom/daaw/zg8;->g(Lcom/daaw/zg8;)Lcom/daaw/d34;

    move-result-object p1

    invoke-virtual {p2, v1, p1, v2}, Lcom/daaw/l64;->d(ILcom/daaw/d34;Z)Lcom/daaw/d34;

    move-result-object p1

    iget v0, p1, Lcom/daaw/d34;->c:I

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :goto_1
    iput v0, p0, Lcom/daaw/xg8;->b:I

    if-ne v0, v3, :cond_3

    return v2

    :cond_3
    iget-object p1, p0, Lcom/daaw/xg8;->d:Lcom/daaw/pr8;

    const/4 v0, 0x1

    if-nez p1, :cond_4

    return v0

    :cond_4
    iget-object p1, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {p2, p1}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result p1

    if-eq p1, v3, :cond_5

    return v0

    :cond_5
    return v2
.end method
