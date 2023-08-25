.class public final Lcom/daaw/ex0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ex0$a;,
        Lcom/daaw/ex0$c;,
        Lcom/daaw/ex0$b;
    }
.end annotation


# instance fields
.field public A:Z

.field public final p:Lcom/daaw/l2;

.field public final q:Lcom/daaw/ex0$b;

.field public final r:Lcom/daaw/iy;

.field public final s:Landroid/os/Handler;

.field public final t:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lcom/daaw/wo;

.field public v:Z

.field public w:J

.field public x:J

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(Lcom/daaw/wo;Lcom/daaw/ex0$b;Lcom/daaw/l2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex0;->u:Lcom/daaw/wo;

    iput-object p2, p0, Lcom/daaw/ex0;->q:Lcom/daaw/ex0$b;

    iput-object p3, p0, Lcom/daaw/ex0;->p:Lcom/daaw/l2;

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex0;->t:Ljava/util/TreeMap;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/daaw/ex0;->s:Landroid/os/Handler;

    new-instance p1, Lcom/daaw/iy;

    invoke-direct {p1}, Lcom/daaw/iy;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex0;->r:Lcom/daaw/iy;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/ex0;->x:J

    iput-wide p1, p0, Lcom/daaw/ex0;->y:J

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ex0;)Lcom/daaw/iy;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ex0;->r:Lcom/daaw/iy;

    return-object p0
.end method

.method public static synthetic b(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)J
    .locals 2

    invoke-static {p0}, Lcom/daaw/ex0;->f(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic c(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/ex0;->i(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lcom/daaw/ex0;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ex0;->s:Landroid/os/Handler;

    return-object p0
.end method

.method public static f(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)J
    .locals 2

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object p0, p0, Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;->u:[B

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    invoke-static {v0}, Lcom/daaw/sq1;->O(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Lcom/daaw/tv0; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public static i(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;)Z
    .locals 5

    iget-wide v0, p0, Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;->s:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;->r:J

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "urn:mpeg:dash:event:2012"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "1"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "2"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "3"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final e(J)Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ex0;->t:Ljava/util/TreeMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final g(JJ)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ex0;->t:Ljava/util/TreeMap;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    :goto_0
    iget-object v0, p0, Lcom/daaw/ex0;->t:Ljava/util/TreeMap;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p3, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ex0;->v:Z

    invoke-virtual {p0}, Lcom/daaw/ex0;->p()V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/ex0;->A:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/ex0$a;

    iget-wide v2, p1, Lcom/daaw/ex0$a;->a:J

    iget-wide v4, p1, Lcom/daaw/ex0$a;->b:J

    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/daaw/ex0;->g(JJ)V

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/ex0;->h()V

    return v1
.end method

.method public final k()V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ex0;->y:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p0, Lcom/daaw/ex0;->x:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ex0;->z:Z

    iget-wide v0, p0, Lcom/daaw/ex0;->x:J

    iput-wide v0, p0, Lcom/daaw/ex0;->y:J

    iget-object v0, p0, Lcom/daaw/ex0;->q:Lcom/daaw/ex0$b;

    invoke-interface {v0}, Lcom/daaw/ex0$b;->a()V

    return-void
.end method

.method public l(J)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/ex0;->u:Lcom/daaw/wo;

    iget-boolean v1, v0, Lcom/daaw/wo;->d:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/ex0;->z:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    return v3

    :cond_1
    iget-boolean v1, p0, Lcom/daaw/ex0;->v:Z

    if-eqz v1, :cond_2

    :goto_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    iget-wide v0, v0, Lcom/daaw/wo;->h:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ex0;->e(J)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v1, v4, p1

    if-gez v1, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/ex0;->w:J

    invoke-virtual {p0}, Lcom/daaw/ex0;->o()V

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/daaw/ex0;->k()V

    :cond_4
    return v2
.end method

.method public m(Lcom/daaw/ef;)Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/ex0;->u:Lcom/daaw/wo;

    iget-boolean v0, v0, Lcom/daaw/wo;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/ex0;->z:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, Lcom/daaw/ex0;->x:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_2

    iget-wide v5, p1, Lcom/daaw/ef;->f:J

    cmp-long p1, v3, v5

    if-gez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/ex0;->k()V

    return v2

    :cond_3
    return v1
.end method

.method public n()Lcom/daaw/ex0$c;
    .locals 3

    new-instance v0, Lcom/daaw/ex0$c;

    new-instance v1, Lcom/daaw/b81;

    iget-object v2, p0, Lcom/daaw/ex0;->p:Lcom/daaw/l2;

    invoke-direct {v1, v2}, Lcom/daaw/b81;-><init>(Lcom/daaw/l2;)V

    invoke-direct {v0, p0, v1}, Lcom/daaw/ex0$c;-><init>(Lcom/daaw/ex0;Lcom/daaw/b81;)V

    return-object v0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ex0;->q:Lcom/daaw/ex0$b;

    iget-wide v1, p0, Lcom/daaw/ex0;->w:J

    invoke-interface {v0, v1, v2}, Lcom/daaw/ex0$b;->b(J)V

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ex0;->q:Lcom/daaw/ex0$b;

    invoke-interface {v0}, Lcom/daaw/ex0$b;->c()V

    return-void
.end method

.method public q(Lcom/daaw/ef;)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ex0;->x:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v2, p1, Lcom/daaw/ef;->g:J

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    :cond_0
    iget-wide v0, p1, Lcom/daaw/ef;->g:J

    iput-wide v0, p0, Lcom/daaw/ex0;->x:J

    :cond_1
    return-void
.end method

.method public r()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ex0;->A:Z

    iget-object v0, p0, Lcom/daaw/ex0;->s:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final s()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ex0;->t:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/ex0;->u:Lcom/daaw/wo;

    iget-wide v3, v3, Lcom/daaw/wo;->h:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public t(Lcom/daaw/wo;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ex0;->z:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/ex0;->w:J

    iput-object p1, p0, Lcom/daaw/ex0;->u:Lcom/daaw/wo;

    invoke-virtual {p0}, Lcom/daaw/ex0;->s()V

    return-void
.end method
