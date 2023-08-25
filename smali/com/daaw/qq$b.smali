.class public final Lcom/daaw/qq$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/ff;

.field public b:Lcom/daaw/j41;

.field public c:Lcom/daaw/bp;

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>(JILcom/daaw/j41;ZZLcom/daaw/sm1;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/qq$b;->d:J

    iput-object p4, p0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    iget-object p1, p4, Lcom/daaw/j41;->c:Lcom/google/android/exoplayer2/Format;

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->t:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/qq$b;->g(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iput-object v0, p0, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    goto :goto_3

    :cond_0
    const-string p2, "application/x-rawcc"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lcom/daaw/h31;

    iget-object p2, p4, Lcom/daaw/j41;->c:Lcom/google/android/exoplayer2/Format;

    invoke-direct {p1, p2}, Lcom/daaw/h31;-><init>(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lcom/daaw/qq$b;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/daaw/un0;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lcom/daaw/un0;-><init>(I)V

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    if-eqz p5, :cond_3

    const/4 p2, 0x4

    const/4 v2, 0x4

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz p6, :cond_4

    const-string p2, "application/cea-608"

    invoke-static {v0, p2, p1, v0}, Lcom/google/android/exoplayer2/Format;->B(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_1
    move-object v6, p1

    new-instance p1, Lcom/daaw/d40;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v7, p7

    invoke-direct/range {v1 .. v7}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/List;Lcom/daaw/sm1;)V

    :goto_2
    new-instance p2, Lcom/daaw/ff;

    iget-object p5, p4, Lcom/daaw/j41;->c:Lcom/google/android/exoplayer2/Format;

    invoke-direct {p2, p1, p3, p5}, Lcom/daaw/ff;-><init>(Lcom/daaw/zz;ILcom/google/android/exoplayer2/Format;)V

    iput-object p2, p0, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    :goto_3
    invoke-virtual {p4}, Lcom/daaw/j41;->i()Lcom/daaw/bp;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Lcom/daaw/hq0;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/ttml+xml"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "video/webm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "audio/webm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/webm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-object v0, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    invoke-interface {v0}, Lcom/daaw/bp;->g()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/qq$b;->e:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public b()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    iget-wide v1, p0, Lcom/daaw/qq$b;->d:J

    invoke-interface {v0, v1, v2}, Lcom/daaw/bp;->h(J)I

    move-result v0

    return v0
.end method

.method public c(J)J
    .locals 5

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qq$b;->e(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    iget-wide v3, p0, Lcom/daaw/qq$b;->e:J

    sub-long/2addr p1, v3

    iget-wide v3, p0, Lcom/daaw/qq$b;->d:J

    invoke-interface {v2, p1, p2, v3, v4}, Lcom/daaw/bp;->c(JJ)J

    move-result-wide p1

    add-long/2addr v0, p1

    return-wide v0
.end method

.method public d(J)J
    .locals 3

    iget-object v0, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    iget-wide v1, p0, Lcom/daaw/qq$b;->d:J

    invoke-interface {v0, p1, p2, v1, v2}, Lcom/daaw/bp;->e(JJ)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/daaw/qq$b;->e:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public e(J)J
    .locals 3

    iget-object v0, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    iget-wide v1, p0, Lcom/daaw/qq$b;->e:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/bp;->b(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f(J)Lcom/daaw/d31;
    .locals 3

    iget-object v0, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    iget-wide v1, p0, Lcom/daaw/qq$b;->e:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/daaw/bp;->d(J)Lcom/daaw/d31;

    move-result-object p1

    return-object p1
.end method

.method public i(JLcom/daaw/j41;)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    invoke-virtual {v0}, Lcom/daaw/j41;->i()Lcom/daaw/bp;

    move-result-object v0

    invoke-virtual {p3}, Lcom/daaw/j41;->i()Lcom/daaw/bp;

    move-result-object v1

    iput-wide p1, p0, Lcom/daaw/qq$b;->d:J

    iput-object p3, p0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object v1, p0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    invoke-interface {v0}, Lcom/daaw/bp;->f()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-wide p1, p0, Lcom/daaw/qq$b;->d:J

    invoke-interface {v0, p1, p2}, Lcom/daaw/bp;->h(J)I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, Lcom/daaw/bp;->g()J

    move-result-wide p2

    int-to-long v2, p1

    add-long/2addr p2, v2

    const-wide/16 v2, 0x1

    sub-long/2addr p2, v2

    invoke-interface {v0, p2, p3}, Lcom/daaw/bp;->b(J)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/qq$b;->d:J

    invoke-interface {v0, p2, p3, v6, v7}, Lcom/daaw/bp;->c(JJ)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-interface {v1}, Lcom/daaw/bp;->g()J

    move-result-wide v6

    invoke-interface {v1, v6, v7}, Lcom/daaw/bp;->b(J)J

    move-result-wide v8

    cmp-long p1, v4, v8

    if-nez p1, :cond_3

    iget-wide v0, p0, Lcom/daaw/qq$b;->e:J

    add-long/2addr p2, v2

    sub-long/2addr p2, v6

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/daaw/qq$b;->e:J

    goto :goto_0

    :cond_3
    cmp-long p1, v4, v8

    if-ltz p1, :cond_4

    iget-wide p1, p0, Lcom/daaw/qq$b;->e:J

    iget-wide v1, p0, Lcom/daaw/qq$b;->d:J

    invoke-interface {v0, v8, v9, v1, v2}, Lcom/daaw/bp;->e(JJ)J

    move-result-wide v0

    sub-long/2addr v0, v6

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/qq$b;->e:J

    :goto_0
    return-void

    :cond_4
    new-instance p1, Lcom/daaw/ob;

    invoke-direct {p1}, Lcom/daaw/ob;-><init>()V

    throw p1
.end method
