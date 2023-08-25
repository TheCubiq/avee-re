.class public final Lcom/daaw/yf$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d81;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final p:Lcom/daaw/d81;

.field public q:Z

.field public final synthetic r:Lcom/daaw/yf;


# direct methods
.method public constructor <init>(Lcom/daaw/yf;Lcom/daaw/d81;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yf$a;->r:Lcom/daaw/yf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/yf$a;->p:Lcom/daaw/d81;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yf$a;->p:Lcom/daaw/d81;

    invoke-interface {v0}, Lcom/daaw/d81;->a()V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/yf$a;->q:Z

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/yf$a;->r:Lcom/daaw/yf;

    invoke-virtual {v0}, Lcom/daaw/yf;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yf$a;->p:Lcom/daaw/d81;

    invoke-interface {v0}, Lcom/daaw/d81;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 10

    iget-object v0, p0, Lcom/daaw/yf$a;->r:Lcom/daaw/yf;

    invoke-virtual {v0}, Lcom/daaw/yf;->h()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/yf$a;->q:Z

    const/4 v2, 0x4

    const/4 v3, -0x4

    if-eqz v0, :cond_1

    invoke-virtual {p2, v2}, Lcom/daaw/rc;->l(I)V

    return v3

    :cond_1
    iget-object v0, p0, Lcom/daaw/yf$a;->p:Lcom/daaw/d81;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/d81;->j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p3

    const/4 v0, -0x5

    const-wide/high16 v4, -0x8000000000000000L

    if-ne p3, v0, :cond_6

    iget-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    iget p3, p2, Lcom/google/android/exoplayer2/Format;->J:I

    if-nez p3, :cond_2

    iget v1, p2, Lcom/google/android/exoplayer2/Format;->K:I

    if-eqz v1, :cond_5

    :cond_2
    iget-object v1, p0, Lcom/daaw/yf$a;->r:Lcom/daaw/yf;

    iget-wide v2, v1, Lcom/daaw/yf;->t:J

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    cmp-long v9, v2, v6

    if-eqz v9, :cond_3

    const/4 p3, 0x0

    :cond_3
    iget-wide v1, v1, Lcom/daaw/yf;->u:J

    cmp-long v3, v1, v4

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    iget v8, p2, Lcom/google/android/exoplayer2/Format;->K:I

    :goto_0
    invoke-virtual {p2, p3, v8}, Lcom/google/android/exoplayer2/Format;->c(II)Lcom/google/android/exoplayer2/Format;

    move-result-object p2

    iput-object p2, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    :cond_5
    return v0

    :cond_6
    iget-object p1, p0, Lcom/daaw/yf$a;->r:Lcom/daaw/yf;

    iget-wide v6, p1, Lcom/daaw/yf;->u:J

    cmp-long v0, v6, v4

    if-eqz v0, :cond_9

    if-ne p3, v3, :cond_7

    iget-wide v8, p2, Lcom/daaw/gq;->s:J

    cmp-long v0, v8, v6

    if-gez v0, :cond_8

    :cond_7
    if-ne p3, v1, :cond_9

    invoke-virtual {p1}, Lcom/daaw/yf;->f()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-nez p1, :cond_9

    :cond_8
    invoke-virtual {p2}, Lcom/daaw/gq;->f()V

    invoke-virtual {p2, v2}, Lcom/daaw/rc;->l(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/yf$a;->q:Z

    return v3

    :cond_9
    return p3
.end method

.method public n(J)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/yf$a;->r:Lcom/daaw/yf;

    invoke-virtual {v0}, Lcom/daaw/yf;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/yf$a;->p:Lcom/daaw/d81;

    invoke-interface {v0, p1, p2}, Lcom/daaw/d81;->n(J)I

    move-result p1

    return p1
.end method
