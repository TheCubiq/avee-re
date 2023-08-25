.class public final Lcom/daaw/ex0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sm1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ex0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/daaw/b81;

.field public final b:Lcom/daaw/k30;

.field public final c:Lcom/daaw/tp0;

.field public final synthetic d:Lcom/daaw/ex0;


# direct methods
.method public constructor <init>(Lcom/daaw/ex0;Lcom/daaw/b81;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    new-instance p1, Lcom/daaw/k30;

    invoke-direct {p1}, Lcom/daaw/k30;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex0$c;->b:Lcom/daaw/k30;

    new-instance p1, Lcom/daaw/tp0;

    invoke-direct {p1}, Lcom/daaw/tp0;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex0$c;->c:Lcom/daaw/tp0;

    return-void
.end method


# virtual methods
.method public a(JIIILcom/daaw/sm1$a;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/b81;->a(JIIILcom/daaw/sm1$a;)V

    invoke-virtual {p0}, Lcom/daaw/ex0$c;->k()V

    return-void
.end method

.method public b(Lcom/daaw/a00;IZ)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/b81;->b(Lcom/daaw/a00;IZ)I

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/rv0;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/b81;->c(Lcom/daaw/rv0;I)V

    return-void
.end method

.method public d(Lcom/google/android/exoplayer2/Format;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    invoke-virtual {v0, p1}, Lcom/daaw/b81;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method

.method public final e()Lcom/daaw/tp0;
    .locals 8

    iget-object v0, p0, Lcom/daaw/ex0$c;->c:Lcom/daaw/tp0;

    invoke-virtual {v0}, Lcom/daaw/gq;->f()V

    iget-object v1, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    iget-object v2, p0, Lcom/daaw/ex0$c;->b:Lcom/daaw/k30;

    iget-object v3, p0, Lcom/daaw/ex0$c;->c:Lcom/daaw/tp0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/b81;->y(Lcom/daaw/k30;Lcom/daaw/gq;ZZJ)I

    move-result v0

    const/4 v1, -0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/ex0$c;->c:Lcom/daaw/tp0;

    invoke-virtual {v0}, Lcom/daaw/gq;->o()V

    iget-object v0, p0, Lcom/daaw/ex0$c;->c:Lcom/daaw/tp0;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public f(J)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ex0;->l(J)Z

    move-result p1

    return p1
.end method

.method public g(Lcom/daaw/ef;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-virtual {v0, p1}, Lcom/daaw/ex0;->m(Lcom/daaw/ef;)Z

    move-result p1

    return p1
.end method

.method public h(Lcom/daaw/ef;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-virtual {v0, p1}, Lcom/daaw/ex0;->q(Lcom/daaw/ef;)V

    return-void
.end method

.method public final i(JJ)V
    .locals 1

    new-instance v0, Lcom/daaw/ex0$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/daaw/ex0$a;-><init>(JJ)V

    iget-object p1, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-static {p1}, Lcom/daaw/ex0;->d(Lcom/daaw/ex0;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-static {p2}, Lcom/daaw/ex0;->d(Lcom/daaw/ex0;)Landroid/os/Handler;

    move-result-object p2

    const/4 p3, 0x2

    invoke-virtual {p2, p3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-static {v0}, Lcom/daaw/ex0;->d(Lcom/daaw/ex0;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-static {v1}, Lcom/daaw/ex0;->d(Lcom/daaw/ex0;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final k()V
    .locals 5

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    invoke-virtual {v0}, Lcom/daaw/b81;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/ex0$c;->e()Lcom/daaw/tp0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v1, v0, Lcom/daaw/gq;->s:J

    iget-object v3, p0, Lcom/daaw/ex0$c;->d:Lcom/daaw/ex0;

    invoke-static {v3}, Lcom/daaw/ex0;->a(Lcom/daaw/ex0;)Lcom/daaw/iy;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/iy;->a(Lcom/daaw/tp0;)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/google/android/exoplayer2/metadata/Metadata;->a(I)Lcom/google/android/exoplayer2/metadata/Metadata$Entry;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;

    iget-object v3, v0, Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;->p:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;->q:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/daaw/ex0;->j(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/ex0$c;->l(JLcom/google/android/exoplayer2/metadata/emsg/EventMessage;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    invoke-virtual {v0}, Lcom/daaw/b81;->l()V

    return-void
.end method

.method public final l(JLcom/google/android/exoplayer2/metadata/emsg/EventMessage;)V
    .locals 5

    invoke-static {p3}, Lcom/daaw/ex0;->b(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    invoke-static {p3}, Lcom/daaw/ex0;->c(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ex0$c;->j()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ex0$c;->i(JJ)V

    :goto_0
    return-void
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0$c;->a:Lcom/daaw/b81;

    invoke-virtual {v0}, Lcom/daaw/b81;->C()V

    return-void
.end method
