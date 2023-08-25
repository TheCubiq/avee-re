.class public final Lcom/daaw/se0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# instance fields
.field public final a:Lcom/daaw/rv0;

.field public b:Lcom/daaw/sm1;

.field public c:Z

.field public d:J

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/se0;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/se0;->f:I

    const/16 v2, 0xa

    if-ge v1, v2, :cond_3

    rsub-int/lit8 v1, v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v3, p1, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v4

    iget-object v5, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    iget-object v5, v5, Lcom/daaw/rv0;->a:[B

    iget v6, p0, Lcom/daaw/se0;->f:I

    invoke-static {v3, v4, v5, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Lcom/daaw/se0;->f:I

    add-int/2addr v3, v1

    if-ne v3, v2, :cond_3

    iget-object v1, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/daaw/rv0;->J(I)V

    const/16 v1, 0x49

    iget-object v4, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    invoke-virtual {v4}, Lcom/daaw/rv0;->x()I

    move-result v4

    if-ne v1, v4, :cond_2

    const/16 v1, 0x44

    iget-object v4, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    invoke-virtual {v4}, Lcom/daaw/rv0;->x()I

    move-result v4

    if-ne v1, v4, :cond_2

    const/16 v1, 0x33

    iget-object v4, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    invoke-virtual {v4}, Lcom/daaw/rv0;->x()I

    move-result v4

    if-eq v1, v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Lcom/daaw/rv0;->K(I)V

    iget-object v1, p0, Lcom/daaw/se0;->a:Lcom/daaw/rv0;

    invoke-virtual {v1}, Lcom/daaw/rv0;->w()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/se0;->e:I

    goto :goto_1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Lcom/daaw/se0;->c:Z

    return-void

    :cond_3
    :goto_1
    iget v1, p0, Lcom/daaw/se0;->e:I

    iget v2, p0, Lcom/daaw/se0;->f:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/se0;->b:Lcom/daaw/sm1;

    invoke-interface {v1, p1, v0}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget p1, p0, Lcom/daaw/se0;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/se0;->f:I

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/se0;->c:Z

    return-void
.end method

.method public c()V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/se0;->c:Z

    if-eqz v0, :cond_1

    iget v5, p0, Lcom/daaw/se0;->e:I

    if-eqz v5, :cond_1

    iget v0, p0, Lcom/daaw/se0;->f:I

    if-eq v0, v5, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/se0;->b:Lcom/daaw/sm1;

    iget-wide v2, p0, Lcom/daaw/se0;->d:J

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/se0;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 3

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result v0

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/se0;->b:Lcom/daaw/sm1;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "application/id3"

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-static {p2, v0, v1, v2, v1}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method

.method public e(JZ)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/daaw/se0;->c:Z

    iput-wide p1, p0, Lcom/daaw/se0;->d:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/se0;->e:I

    iput p1, p0, Lcom/daaw/se0;->f:I

    return-void
.end method
