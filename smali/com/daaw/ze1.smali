.class public final Lcom/daaw/ze1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo0;
.implements Lcom/daaw/gb1$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qo0;",
        "Lcom/daaw/gb1$a<",
        "Lcom/daaw/if<",
        "Lcom/daaw/we1;",
        ">;>;"
    }
.end annotation


# instance fields
.field public A:Lcom/daaw/gb1;

.field public B:Z

.field public final p:Lcom/daaw/we1$a;

.field public final q:Lcom/daaw/lk0;

.field public final r:I

.field public final s:Lcom/daaw/cp0$a;

.field public final t:Lcom/daaw/l2;

.field public final u:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public final v:[Lcom/daaw/pm1;

.field public final w:Lcom/daaw/wi;

.field public x:Lcom/daaw/qo0$a;

.field public y:Lcom/daaw/xe1;

.field public z:[Lcom/daaw/if;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/daaw/if<",
            "Lcom/daaw/we1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/xe1;Lcom/daaw/we1$a;Lcom/daaw/wi;ILcom/daaw/cp0$a;Lcom/daaw/lk0;Lcom/daaw/l2;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/ze1;->p:Lcom/daaw/we1$a;

    iput-object p6, p0, Lcom/daaw/ze1;->q:Lcom/daaw/lk0;

    iput p4, p0, Lcom/daaw/ze1;->r:I

    iput-object p5, p0, Lcom/daaw/ze1;->s:Lcom/daaw/cp0$a;

    iput-object p7, p0, Lcom/daaw/ze1;->t:Lcom/daaw/l2;

    iput-object p3, p0, Lcom/daaw/ze1;->w:Lcom/daaw/wi;

    invoke-static {p1}, Lcom/daaw/ze1;->h(Lcom/daaw/xe1;)Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/ze1;->u:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object p2, p1, Lcom/daaw/xe1;->e:Lcom/daaw/xe1$a;

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/daaw/xe1$a;->b:[B

    invoke-static {p2}, Lcom/daaw/ze1;->o([B)[B

    move-result-object v4

    const/4 p2, 0x1

    new-array p2, p2, [Lcom/daaw/pm1;

    new-instance p6, Lcom/daaw/pm1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p6

    invoke-direct/range {v0 .. v7}, Lcom/daaw/pm1;-><init>(ZLjava/lang/String;I[BII[B)V

    aput-object p6, p2, p4

    iput-object p2, p0, Lcom/daaw/ze1;->v:[Lcom/daaw/pm1;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/daaw/ze1;->v:[Lcom/daaw/pm1;

    :goto_0
    iput-object p1, p0, Lcom/daaw/ze1;->y:Lcom/daaw/xe1;

    invoke-static {p4}, Lcom/daaw/ze1;->r(I)[Lcom/daaw/if;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    invoke-interface {p3, p1}, Lcom/daaw/wi;->a([Lcom/daaw/gb1;)Lcom/daaw/gb1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ze1;->A:Lcom/daaw/gb1;

    invoke-virtual {p5}, Lcom/daaw/cp0$a;->q()V

    return-void
.end method

.method public static h(Lcom/daaw/xe1;)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 4

    iget-object v0, p0, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/exoplayer2/source/TrackGroup;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    new-instance v2, Lcom/google/android/exoplayer2/source/TrackGroup;

    iget-object v3, p0, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/daaw/xe1$b;->j:[Lcom/google/android/exoplayer2/Format;

    invoke-direct {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    return-object p0
.end method

.method public static o([B)[B
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    aget-byte v3, p0, v2

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "<KID>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x5

    add-int/2addr v0, v2

    const-string v3, "</KID>"

    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    const/4 v0, 0x3

    invoke-static {p0, v1, v0}, Lcom/daaw/ze1;->w([BII)V

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lcom/daaw/ze1;->w([BII)V

    const/4 v0, 0x4

    invoke-static {p0, v0, v2}, Lcom/daaw/ze1;->w([BII)V

    const/4 v0, 0x6

    const/4 v1, 0x7

    invoke-static {p0, v0, v1}, Lcom/daaw/ze1;->w([BII)V

    return-object p0
.end method

.method public static r(I)[Lcom/daaw/if;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/daaw/if<",
            "Lcom/daaw/we1;",
            ">;"
        }
    .end annotation

    new-array p0, p0, [Lcom/daaw/if;

    return-object p0
.end method

.method public static w([BII)V
    .locals 2

    aget-byte v0, p0, p1

    aget-byte v1, p0, p2

    aput-byte v1, p0, p1

    aput-byte v0, p0, p2

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ze1;->A:Lcom/daaw/gb1;

    invoke-interface {v0}, Lcom/daaw/gb1;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ze1;->A:Lcom/daaw/gb1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/gb1;->c(J)Z

    move-result p1

    return p1
.end method

.method public final d(Lcom/google/android/exoplayer2/trackselection/c;J)Lcom/daaw/if;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/trackselection/c;",
            "J)",
            "Lcom/daaw/if<",
            "Lcom/daaw/we1;",
            ">;"
        }
    .end annotation

    move-object v11, p0

    iget-object v0, v11, Lcom/daaw/ze1;->u:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v0

    iget-object v2, v11, Lcom/daaw/ze1;->p:Lcom/daaw/we1$a;

    iget-object v3, v11, Lcom/daaw/ze1;->q:Lcom/daaw/lk0;

    iget-object v4, v11, Lcom/daaw/ze1;->y:Lcom/daaw/xe1;

    iget-object v7, v11, Lcom/daaw/ze1;->v:[Lcom/daaw/pm1;

    move v5, v0

    move-object v6, p1

    invoke-interface/range {v2 .. v7}, Lcom/daaw/we1$a;->a(Lcom/daaw/lk0;Lcom/daaw/xe1;ILcom/google/android/exoplayer2/trackselection/c;[Lcom/daaw/pm1;)Lcom/daaw/we1;

    move-result-object v4

    new-instance v12, Lcom/daaw/if;

    iget-object v1, v11, Lcom/daaw/ze1;->y:Lcom/daaw/xe1;

    iget-object v1, v1, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    aget-object v0, v1, v0

    iget v1, v0, Lcom/daaw/xe1$b;->a:I

    iget-object v6, v11, Lcom/daaw/ze1;->t:Lcom/daaw/l2;

    iget v9, v11, Lcom/daaw/ze1;->r:I

    iget-object v10, v11, Lcom/daaw/ze1;->s:Lcom/daaw/cp0$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v12

    move-object v5, p0

    move-wide v7, p2

    invoke-direct/range {v0 .. v10}, Lcom/daaw/if;-><init>(I[I[Lcom/google/android/exoplayer2/Format;Lcom/daaw/jf;Lcom/daaw/gb1$a;Lcom/daaw/l2;JILcom/daaw/cp0$a;)V

    return-object v12
.end method

.method public e(JLcom/daaw/ea1;)J
    .locals 6

    iget-object v0, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lcom/daaw/if;->p:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Lcom/daaw/if;->e(JLcom/daaw/ea1;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ze1;->A:Lcom/daaw/gb1;

    invoke-interface {v0}, Lcom/daaw/gb1;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ze1;->A:Lcom/daaw/gb1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/gb1;->g(J)V

    return-void
.end method

.method public i([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJ)J
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_4

    aget-object v2, p3, v1

    if-eqz v2, :cond_2

    aget-object v2, p3, v1

    check-cast v2, Lcom/daaw/if;

    aget-object v3, p1, v1

    if-eqz v3, :cond_1

    aget-boolean v3, p2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v2}, Lcom/daaw/if;->M()V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_2
    :goto_2
    aget-object v2, p3, v1

    if-nez v2, :cond_3

    aget-object v2, p1, v1

    if-eqz v2, :cond_3

    aget-object v2, p1, v1

    invoke-virtual {p0, v2, p5, p6}, Lcom/daaw/ze1;->d(Lcom/google/android/exoplayer2/trackselection/c;J)Lcom/daaw/if;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aput-object v2, p3, v1

    const/4 v2, 0x1

    aput-boolean v2, p4, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/ze1;->r(I)[Lcom/daaw/if;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/ze1;->w:Lcom/daaw/wi;

    iget-object p2, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    invoke-interface {p1, p2}, Lcom/daaw/wi;->a([Lcom/daaw/gb1;)Lcom/daaw/gb1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ze1;->A:Lcom/daaw/gb1;

    return-wide p5
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ze1;->q:Lcom/daaw/lk0;

    invoke-interface {v0}, Lcom/daaw/lk0;->a()V

    return-void
.end method

.method public m(J)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lcom/daaw/if;->O(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public bridge synthetic n(Lcom/daaw/gb1;)V
    .locals 0

    check-cast p1, Lcom/daaw/if;

    invoke-virtual {p0, p1}, Lcom/daaw/ze1;->u(Lcom/daaw/if;)V

    return-void
.end method

.method public p(Lcom/daaw/qo0$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ze1;->x:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/qo0$a;->j(Lcom/daaw/qo0;)V

    return-void
.end method

.method public q()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ze1;->B:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ze1;->s:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ze1;->B:Z

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public s()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ze1;->u:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lcom/daaw/if;->t(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u(Lcom/daaw/if;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/if<",
            "Lcom/daaw/we1;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/ze1;->x:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return-void
.end method

.method public v()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/if;->M()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ze1;->x:Lcom/daaw/qo0$a;

    iget-object v0, p0, Lcom/daaw/ze1;->s:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->r()V

    return-void
.end method

.method public x(Lcom/daaw/xe1;)V
    .locals 4

    iput-object p1, p0, Lcom/daaw/ze1;->y:Lcom/daaw/xe1;

    iget-object v0, p0, Lcom/daaw/ze1;->z:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/if;->B()Lcom/daaw/jf;

    move-result-object v3

    check-cast v3, Lcom/daaw/we1;

    invoke-interface {v3, p1}, Lcom/daaw/we1;->b(Lcom/daaw/xe1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ze1;->x:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return-void
.end method
