.class public final Lcom/daaw/se1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/z91;


# instance fields
.field public a:Lcom/daaw/ol1;

.field public b:Lcom/daaw/sm1;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/se1;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/se1;->a:Lcom/daaw/ol1;

    invoke-virtual {v0}, Lcom/daaw/ol1;->e()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/se1;->b:Lcom/daaw/sm1;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/se1;->a:Lcom/daaw/ol1;

    invoke-virtual {v2}, Lcom/daaw/ol1;->e()J

    move-result-wide v2

    const-string v4, "application/x-scte35"

    invoke-static {v1, v4, v2, v3}, Lcom/google/android/exoplayer2/Format;->x(Ljava/lang/String;Ljava/lang/String;J)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/se1;->c:Z

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v5

    iget-object v0, p0, Lcom/daaw/se1;->b:Lcom/daaw/sm1;

    invoke-interface {v0, p1, v5}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v1, p0, Lcom/daaw/se1;->b:Lcom/daaw/sm1;

    iget-object p1, p0, Lcom/daaw/se1;->a:Lcom/daaw/ol1;

    invoke-virtual {p1}, Lcom/daaw/ol1;->d()J

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    return-void
.end method

.method public c(Lcom/daaw/ol1;Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/se1;->a:Lcom/daaw/ol1;

    invoke-virtual {p3}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p3}, Lcom/daaw/eo1$d;->c()I

    move-result p1

    const/4 v0, 0x4

    invoke-interface {p2, p1, v0}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/se1;->b:Lcom/daaw/sm1;

    invoke-virtual {p3}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object p2

    const-string p3, "application/x-scte35"

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-static {p2, p3, v0, v1, v0}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method
