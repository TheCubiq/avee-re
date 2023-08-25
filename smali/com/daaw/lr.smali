.class public Lcom/daaw/lr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hk0;


# instance fields
.field public final a:Lcom/daaw/jq;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:I

.field public final g:Z

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lcom/daaw/jq;

    const/4 v1, 0x1

    const/high16 v2, 0x10000

    invoke-direct {v0, v1, v2}, Lcom/daaw/jq;-><init>(ZI)V

    invoke-direct {p0, v0}, Lcom/daaw/lr;-><init>(Lcom/daaw/jq;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/jq;)V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/16 v2, 0x3a98

    const v3, 0xc350

    const/16 v4, 0x9c4

    const/16 v5, 0x1388

    const/4 v6, -0x1

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/lr;-><init>(Lcom/daaw/jq;IIIIIZ)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/jq;IIIIIZ)V
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/daaw/lr;-><init>(Lcom/daaw/jq;IIIIIZLcom/daaw/gz0;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/jq;IIIIIZLcom/daaw/gz0;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p8, 0x0

    const-string v0, "bufferForPlaybackMs"

    const-string v1, "0"

    invoke-static {p4, p8, v0, v1}, Lcom/daaw/lr;->j(IILjava/lang/String;Ljava/lang/String;)V

    const-string v2, "bufferForPlaybackAfterRebufferMs"

    invoke-static {p5, p8, v2, v1}, Lcom/daaw/lr;->j(IILjava/lang/String;Ljava/lang/String;)V

    const-string p8, "minBufferMs"

    invoke-static {p2, p4, p8, v0}, Lcom/daaw/lr;->j(IILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p5, p8, v2}, Lcom/daaw/lr;->j(IILjava/lang/String;Ljava/lang/String;)V

    const-string v0, "maxBufferMs"

    invoke-static {p3, p2, v0, p8}, Lcom/daaw/lr;->j(IILjava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/lr;->a:Lcom/daaw/jq;

    int-to-long p1, p2

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/lr;->b:J

    int-to-long p1, p3

    mul-long p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/lr;->c:J

    int-to-long p1, p4

    mul-long p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/lr;->d:J

    int-to-long p1, p5

    mul-long p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/lr;->e:J

    iput p6, p0, Lcom/daaw/lr;->f:I

    iput-boolean p7, p0, Lcom/daaw/lr;->g:Z

    return-void
.end method

.method public static j(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-lt p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " cannot be less than "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/lr;->l(Z)V

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c([Lcom/daaw/a41;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/um1;)V
    .locals 1

    iget p2, p0, Lcom/daaw/lr;->f:I

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1, p3}, Lcom/daaw/lr;->k([Lcom/daaw/a41;Lcom/daaw/um1;)I

    move-result p2

    :cond_0
    iput p2, p0, Lcom/daaw/lr;->h:I

    iget-object p1, p0, Lcom/daaw/lr;->a:Lcom/daaw/jq;

    invoke-virtual {p1, p2}, Lcom/daaw/jq;->h(I)V

    return-void
.end method

.method public d()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public e(JFZ)Z
    .locals 3

    invoke-static {p1, p2, p3}, Lcom/daaw/sq1;->z(JF)J

    move-result-wide p1

    if-eqz p4, :cond_0

    iget-wide p3, p0, Lcom/daaw/lr;->e:J

    goto :goto_0

    :cond_0
    iget-wide p3, p0, Lcom/daaw/lr;->d:J

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-lez v2, :cond_2

    cmp-long v0, p1, p3

    if-gez v0, :cond_2

    iget-boolean p1, p0, Lcom/daaw/lr;->g:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/lr;->a:Lcom/daaw/jq;

    invoke-virtual {p1}, Lcom/daaw/jq;->f()I

    move-result p1

    iget p2, p0, Lcom/daaw/lr;->h:I

    if-lt p1, p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1
.end method

.method public f(JF)Z
    .locals 8

    iget-object v0, p0, Lcom/daaw/lr;->a:Lcom/daaw/jq;

    invoke-virtual {v0}, Lcom/daaw/jq;->f()I

    move-result v0

    iget v1, p0, Lcom/daaw/lr;->h:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-wide v4, p0, Lcom/daaw/lr;->b:J

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p3, v1

    if-lez v1, :cond_1

    invoke-static {v4, v5, p3}, Lcom/daaw/sq1;->w(JF)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/lr;->c:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    :cond_1
    cmp-long p3, p1, v4

    if-gez p3, :cond_4

    iget-boolean p1, p0, Lcom/daaw/lr;->g:Z

    if-nez p1, :cond_3

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_1
    iput-boolean v2, p0, Lcom/daaw/lr;->i:Z

    goto :goto_2

    :cond_4
    iget-wide v1, p0, Lcom/daaw/lr;->c:J

    cmp-long p3, p1, v1

    if-gtz p3, :cond_5

    if-eqz v0, :cond_6

    :cond_5
    iput-boolean v3, p0, Lcom/daaw/lr;->i:Z

    :cond_6
    :goto_2
    iget-boolean p1, p0, Lcom/daaw/lr;->i:Z

    return p1
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/lr;->l(Z)V

    return-void
.end method

.method public h()Lcom/daaw/l2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lr;->a:Lcom/daaw/jq;

    return-object v0
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/lr;->l(Z)V

    return-void
.end method

.method public k([Lcom/daaw/a41;Lcom/daaw/um1;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    invoke-virtual {p2, v0}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v2

    if-eqz v2, :cond_0

    aget-object v2, p1, v0

    invoke-interface {v2}, Lcom/daaw/a41;->i()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/sq1;->u(I)I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final l(Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/lr;->h:I

    iput-boolean v0, p0, Lcom/daaw/lr;->i:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/lr;->a:Lcom/daaw/jq;

    invoke-virtual {p1}, Lcom/daaw/jq;->g()V

    :cond_0
    return-void
.end method
