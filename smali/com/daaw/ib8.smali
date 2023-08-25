.class public final Lcom/daaw/ib8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/l64;

.field public final c:I

.field public final d:Lcom/daaw/pr8;

.field public final e:J

.field public final f:Lcom/daaw/l64;

.field public final g:I

.field public final h:Lcom/daaw/pr8;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(JLcom/daaw/l64;ILcom/daaw/pr8;JLcom/daaw/l64;ILcom/daaw/pr8;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/ib8;->a:J

    iput-object p3, p0, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    iput p4, p0, Lcom/daaw/ib8;->c:I

    iput-object p5, p0, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iput-wide p6, p0, Lcom/daaw/ib8;->e:J

    iput-object p8, p0, Lcom/daaw/ib8;->f:Lcom/daaw/l64;

    iput p9, p0, Lcom/daaw/ib8;->g:I

    iput-object p10, p0, Lcom/daaw/ib8;->h:Lcom/daaw/pr8;

    iput-wide p11, p0, Lcom/daaw/ib8;->i:J

    iput-wide p13, p0, Lcom/daaw/ib8;->j:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lcom/daaw/ib8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/ib8;

    iget-wide v2, p0, Lcom/daaw/ib8;->a:J

    iget-wide v4, p1, Lcom/daaw/ib8;->a:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Lcom/daaw/ib8;->c:I

    iget v3, p1, Lcom/daaw/ib8;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lcom/daaw/ib8;->e:J

    iget-wide v4, p1, Lcom/daaw/ib8;->e:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Lcom/daaw/ib8;->g:I

    iget v3, p1, Lcom/daaw/ib8;->g:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lcom/daaw/ib8;->i:J

    iget-wide v4, p1, Lcom/daaw/ib8;->i:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Lcom/daaw/ib8;->j:J

    iget-wide v4, p1, Lcom/daaw/ib8;->j:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-object v2, p0, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    iget-object v3, p1, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    invoke-static {v2, v3}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    iget-object v3, p1, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    invoke-static {v2, v3}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/ib8;->f:Lcom/daaw/l64;

    iget-object v3, p1, Lcom/daaw/ib8;->f:Lcom/daaw/l64;

    invoke-static {v2, v3}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/ib8;->h:Lcom/daaw/pr8;

    iget-object p1, p1, Lcom/daaw/ib8;->h:Lcom/daaw/pr8;

    invoke-static {v2, p1}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Lcom/daaw/ib8;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/ib8;->b:Lcom/daaw/l64;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lcom/daaw/ib8;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/ib8;->d:Lcom/daaw/pr8;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/daaw/ib8;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/ib8;->f:Lcom/daaw/l64;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget v1, p0, Lcom/daaw/ib8;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/ib8;->h:Lcom/daaw/pr8;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/daaw/ib8;->i:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/daaw/ib8;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
