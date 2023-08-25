.class public final Lcom/daaw/zo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo0;
.implements Lcom/daaw/gb1$a;
.implements Lcom/daaw/if$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zo$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qo0;",
        "Lcom/daaw/gb1$a<",
        "Lcom/daaw/if<",
        "Lcom/daaw/vo;",
        ">;>;",
        "Lcom/daaw/if$b<",
        "Lcom/daaw/vo;",
        ">;"
    }
.end annotation


# instance fields
.field public final A:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;",
            "Lcom/daaw/ex0$c;",
            ">;"
        }
    .end annotation
.end field

.field public B:Lcom/daaw/qo0$a;

.field public C:[Lcom/daaw/if;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;"
        }
    .end annotation
.end field

.field public D:[Lcom/daaw/ky;

.field public E:Lcom/daaw/gb1;

.field public F:Lcom/daaw/wo;

.field public G:I

.field public H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/sy;",
            ">;"
        }
    .end annotation
.end field

.field public I:Z

.field public final p:I

.field public final q:Lcom/daaw/vo$a;

.field public final r:I

.field public final s:Lcom/daaw/cp0$a;

.field public final t:J

.field public final u:Lcom/daaw/lk0;

.field public final v:Lcom/daaw/l2;

.field public final w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public final x:[Lcom/daaw/zo$a;

.field public final y:Lcom/daaw/wi;

.field public final z:Lcom/daaw/ex0;


# direct methods
.method public constructor <init>(ILcom/daaw/wo;ILcom/daaw/vo$a;ILcom/daaw/cp0$a;JLcom/daaw/lk0;Lcom/daaw/l2;Lcom/daaw/wi;Lcom/daaw/ex0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/zo;->p:I

    iput-object p2, p0, Lcom/daaw/zo;->F:Lcom/daaw/wo;

    iput p3, p0, Lcom/daaw/zo;->G:I

    iput-object p4, p0, Lcom/daaw/zo;->q:Lcom/daaw/vo$a;

    iput p5, p0, Lcom/daaw/zo;->r:I

    iput-object p6, p0, Lcom/daaw/zo;->s:Lcom/daaw/cp0$a;

    iput-wide p7, p0, Lcom/daaw/zo;->t:J

    iput-object p9, p0, Lcom/daaw/zo;->u:Lcom/daaw/lk0;

    iput-object p10, p0, Lcom/daaw/zo;->v:Lcom/daaw/l2;

    iput-object p11, p0, Lcom/daaw/zo;->y:Lcom/daaw/wi;

    new-instance p1, Lcom/daaw/ex0;

    invoke-direct {p1, p2, p12, p10}, Lcom/daaw/ex0;-><init>(Lcom/daaw/wo;Lcom/daaw/ex0$b;Lcom/daaw/l2;)V

    iput-object p1, p0, Lcom/daaw/zo;->z:Lcom/daaw/ex0;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/zo;->A(I)[Lcom/daaw/if;

    move-result-object p4

    iput-object p4, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    new-array p1, p1, [Lcom/daaw/ky;

    iput-object p1, p0, Lcom/daaw/zo;->D:[Lcom/daaw/ky;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/zo;->A:Ljava/util/IdentityHashMap;

    iget-object p1, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    invoke-interface {p11, p1}, Lcom/daaw/wi;->a([Lcom/daaw/gb1;)Lcom/daaw/gb1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/zo;->E:Lcom/daaw/gb1;

    invoke-virtual {p2, p3}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object p1

    iget-object p2, p1, Lcom/daaw/gw0;->d:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/zo;->H:Ljava/util/List;

    iget-object p1, p1, Lcom/daaw/gw0;->c:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/daaw/zo;->u(Ljava/util/List;Ljava/util/List;)Landroid/util/Pair;

    move-result-object p1

    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iput-object p2, p0, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, [Lcom/daaw/zo$a;

    iput-object p1, p0, Lcom/daaw/zo;->x:[Lcom/daaw/zo$a;

    invoke-virtual {p6}, Lcom/daaw/cp0$a;->q()V

    return-void
.end method

.method public static A(I)[Lcom/daaw/if;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;"
        }
    .end annotation

    new-array p0, p0, [Lcom/daaw/if;

    return-object p0
.end method

.method public static D(Lcom/daaw/d81;)V
    .locals 1

    instance-of v0, p0, Lcom/daaw/if$a;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/if$a;

    invoke-virtual {p0}, Lcom/daaw/if$a;->c()V

    :cond_0
    return-void
.end method

.method public static h(Ljava/util/List;[Lcom/google/android/exoplayer2/source/TrackGroup;[Lcom/daaw/zo$a;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/sy;",
            ">;[",
            "Lcom/google/android/exoplayer2/source/TrackGroup;",
            "[",
            "Lcom/daaw/zo$a;",
            "I)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/sy;

    invoke-virtual {v2}, Lcom/daaw/sy;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const-string v4, "application/x-emsg"

    const/4 v5, 0x0

    invoke-static {v2, v4, v5, v3, v5}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v2

    new-instance v3, Lcom/google/android/exoplayer2/source/TrackGroup;

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/google/android/exoplayer2/Format;

    aput-object v2, v4, v0

    invoke-direct {v3, v4}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v3, p1, p3

    add-int/lit8 v2, p3, 0x1

    invoke-static {v1}, Lcom/daaw/zo$a;->c(I)Lcom/daaw/zo$a;

    move-result-object v3

    aput-object v3, p2, p3

    add-int/lit8 v1, v1, 0x1

    move p3, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static o(Ljava/util/List;[[II[Z[Z[Lcom/google/android/exoplayer2/source/TrackGroup;[Lcom/daaw/zo$a;)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/e1;",
            ">;[[II[Z[Z[",
            "Lcom/google/android/exoplayer2/source/TrackGroup;",
            "[",
            "Lcom/daaw/zo$a;",
            ")I"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move/from16 v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v5, p1, v3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v5

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_0

    aget v9, v5, v8

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/daaw/e1;

    iget-object v9, v9, Lcom/daaw/e1;->c:Ljava/util/List;

    invoke-interface {v6, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    new-array v8, v7, [Lcom/google/android/exoplayer2/Format;

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v7, :cond_1

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/daaw/j41;

    iget-object v10, v10, Lcom/daaw/j41;->c:Lcom/google/android/exoplayer2/Format;

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    aget v6, v5, v1

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/e1;

    add-int/lit8 v7, v4, 0x1

    aget-boolean v9, p3, v3

    const/4 v10, -0x1

    if-eqz v9, :cond_2

    add-int/lit8 v9, v7, 0x1

    goto :goto_3

    :cond_2
    move v9, v7

    const/4 v7, -0x1

    :goto_3
    aget-boolean v11, p4, v3

    if-eqz v11, :cond_3

    add-int/lit8 v11, v9, 0x1

    goto :goto_4

    :cond_3
    move v11, v9

    const/4 v9, -0x1

    :goto_4
    new-instance v12, Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v12, v8}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v12, p5, v4

    iget v8, v6, Lcom/daaw/e1;->b:I

    invoke-static {v8, v5, v4, v7, v9}, Lcom/daaw/zo$a;->d(I[IIII)Lcom/daaw/zo$a;

    move-result-object v8

    aput-object v8, p6, v4

    const/4 v8, 0x0

    const/4 v12, 0x1

    if-eq v7, v10, :cond_4

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    iget v14, v6, Lcom/daaw/e1;->a:I

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ":emsg"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v14, "application/x-emsg"

    invoke-static {v13, v14, v8, v10, v8}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v13

    new-instance v14, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v15, v12, [Lcom/google/android/exoplayer2/Format;

    aput-object v13, v15, v1

    invoke-direct {v14, v15}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v14, p5, v7

    invoke-static {v5, v4}, Lcom/daaw/zo$a;->b([II)Lcom/daaw/zo$a;

    move-result-object v13

    aput-object v13, p6, v7

    :cond_4
    if-eq v9, v10, :cond_5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, v6, Lcom/daaw/e1;->a:I

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ":cea608"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "application/cea-608"

    invoke-static {v6, v7, v1, v8}, Lcom/google/android/exoplayer2/Format;->B(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v6

    new-instance v7, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v8, v12, [Lcom/google/android/exoplayer2/Format;

    aput-object v6, v8, v1

    invoke-direct {v7, v8}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v7, p5, v9

    invoke-static {v5, v4}, Lcom/daaw/zo$a;->a([II)Lcom/daaw/zo$a;

    move-result-object v4

    aput-object v4, p6, v9

    :cond_5
    add-int/lit8 v3, v3, 0x1

    move v4, v11

    goto/16 :goto_0

    :cond_6
    return v4
.end method

.method public static u(Ljava/util/List;Ljava/util/List;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/e1;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/sy;",
            ">;)",
            "Landroid/util/Pair<",
            "Lcom/google/android/exoplayer2/source/TrackGroupArray;",
            "[",
            "Lcom/daaw/zo$a;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/daaw/zo;->w(Ljava/util/List;)[[I

    move-result-object v1

    array-length v2, v1

    new-array v3, v2, [Z

    new-array v4, v2, [Z

    invoke-static {v2, p0, v1, v3, v4}, Lcom/daaw/zo;->z(ILjava/util/List;[[I[Z[Z)I

    move-result v0

    add-int/2addr v0, v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v0, v5

    new-array v7, v0, [Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v8, v0, [Lcom/daaw/zo$a;

    move-object v0, p0

    move-object v5, v7

    move-object v6, v8

    invoke-static/range {v0 .. v6}, Lcom/daaw/zo;->o(Ljava/util/List;[[II[Z[Z[Lcom/google/android/exoplayer2/source/TrackGroup;[Lcom/daaw/zo$a;)I

    move-result p0

    invoke-static {p1, v7, v8, p0}, Lcom/daaw/zo;->h(Ljava/util/List;[Lcom/google/android/exoplayer2/source/TrackGroup;[Lcom/daaw/zo$a;I)V

    new-instance p0, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {p0, v7}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    invoke-static {p0, v8}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static v(Ljava/util/List;)Lcom/daaw/jt;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;)",
            "Lcom/daaw/jt;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/jt;

    iget-object v2, v1, Lcom/daaw/jt;->a:Ljava/lang/String;

    const-string v3, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static w(Ljava/util/List;)[[I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/e1;",
            ">;)[[I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1, v0}, Landroid/util/SparseIntArray;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/e1;

    iget v4, v4, Lcom/daaw/e1;->a:I

    invoke-virtual {v1, v4, v3}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array v3, v0, [[I

    new-array v4, v0, [Z

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v5, v0, :cond_4

    aget-boolean v7, v4, v5

    if-eqz v7, :cond_1

    goto :goto_3

    :cond_1
    const/4 v7, 0x1

    aput-boolean v7, v4, v5

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/e1;

    iget-object v8, v8, Lcom/daaw/e1;->e:Ljava/util/List;

    invoke-static {v8}, Lcom/daaw/zo;->v(Ljava/util/List;)Lcom/daaw/jt;

    move-result-object v8

    if-nez v8, :cond_2

    add-int/lit8 v8, v6, 0x1

    new-array v7, v7, [I

    aput v5, v7, v2

    aput-object v7, v3, v6

    move v6, v8

    goto :goto_3

    :cond_2
    iget-object v8, v8, Lcom/daaw/jt;->b:Ljava/lang/String;

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    add-int/2addr v9, v7

    new-array v9, v9, [I

    aput v5, v9, v2

    const/4 v10, 0x0

    :goto_2
    array-length v11, v8

    if-ge v10, v11, :cond_3

    aget-object v11, v8, v10

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v1, v11}, Landroid/util/SparseIntArray;->get(I)I

    move-result v11

    aput-boolean v7, v4, v11

    add-int/lit8 v10, v10, 0x1

    aput v11, v9, v10

    goto :goto_2

    :cond_3
    add-int/lit8 v7, v6, 0x1

    aput-object v9, v3, v6

    move v6, v7

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    if-ge v6, v0, :cond_5

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, [[I

    :cond_5
    return-object v3
.end method

.method public static x(Ljava/util/List;[I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/e1;",
            ">;[I)Z"
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, p1, v2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/e1;

    iget-object v3, v3, Lcom/daaw/e1;->d:Ljava/util/List;

    const/4 v4, 0x0

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/jt;

    iget-object v5, v5, Lcom/daaw/jt;->a:Ljava/lang/String;

    const-string v6, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static y(Ljava/util/List;[I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/e1;",
            ">;[I)Z"
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, p1, v2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/e1;

    iget-object v3, v3, Lcom/daaw/e1;->c:Ljava/util/List;

    const/4 v4, 0x0

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/j41;

    iget-object v5, v5, Lcom/daaw/j41;->f:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static z(ILjava/util/List;[[I[Z[Z)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/daaw/e1;",
            ">;[[I[Z[Z)I"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p0, :cond_2

    aget-object v2, p2, v0

    invoke-static {p1, v2}, Lcom/daaw/zo;->y(Ljava/util/List;[I)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    aput-boolean v3, p3, v0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    aget-object v2, p2, v0

    invoke-static {p1, v2}, Lcom/daaw/zo;->x(Ljava/util/List;[I)Z

    move-result v2

    if-eqz v2, :cond_1

    aput-boolean v3, p4, v0

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public B(Lcom/daaw/if;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/zo;->B:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return-void
.end method

.method public C()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/zo;->z:Lcom/daaw/ex0;

    invoke-virtual {v0}, Lcom/daaw/ex0;->r()V

    iget-object v0, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p0}, Lcom/daaw/if;->N(Lcom/daaw/if$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zo;->B:Lcom/daaw/qo0$a;

    iget-object v0, p0, Lcom/daaw/zo;->s:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->r()V

    return-void
.end method

.method public final E([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJLandroid/util/SparseArray;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/exoplayer2/trackselection/c;",
            "[Z[",
            "Lcom/daaw/d81;",
            "[ZJ",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_7

    aget-object v2, p3, v1

    instance-of v2, v2, Lcom/daaw/if$a;

    if-nez v2, :cond_0

    aget-object v2, p3, v1

    instance-of v2, v2, Lcom/daaw/sw;

    if-eqz v2, :cond_2

    :cond_0
    aget-object v2, p1, v1

    if-eqz v2, :cond_1

    aget-boolean v2, p2, v1

    if-nez v2, :cond_2

    :cond_1
    aget-object v2, p3, v1

    invoke-static {v2}, Lcom/daaw/zo;->D(Lcom/daaw/d81;)V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_2
    aget-object v2, p1, v1

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    aget-object v3, p1, v1

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/zo;->x:[Lcom/daaw/zo$a;

    aget-object v2, v3, v2

    iget v3, v2, Lcom/daaw/zo$a;->c:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    iget v3, v2, Lcom/daaw/zo$a;->e:I

    invoke-virtual {p7, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/if;

    aget-object v5, p3, v1

    if-nez v3, :cond_3

    instance-of v6, v5, Lcom/daaw/sw;

    goto :goto_1

    :cond_3
    instance-of v6, v5, Lcom/daaw/if$a;

    if-eqz v6, :cond_4

    move-object v6, v5

    check-cast v6, Lcom/daaw/if$a;

    iget-object v6, v6, Lcom/daaw/if$a;->p:Lcom/daaw/if;

    if-ne v6, v3, :cond_4

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_6

    invoke-static {v5}, Lcom/daaw/zo;->D(Lcom/daaw/d81;)V

    if-nez v3, :cond_5

    new-instance v2, Lcom/daaw/sw;

    invoke-direct {v2}, Lcom/daaw/sw;-><init>()V

    goto :goto_2

    :cond_5
    iget v2, v2, Lcom/daaw/zo$a;->b:I

    invoke-virtual {v3, p5, p6, v2}, Lcom/daaw/if;->P(JI)Lcom/daaw/if$a;

    move-result-object v2

    :goto_2
    aput-object v2, p3, v1

    aput-boolean v4, p4, v1

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final F([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZLjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/exoplayer2/trackselection/c;",
            "[Z[",
            "Lcom/daaw/d81;",
            "[Z",
            "Ljava/util/List<",
            "Lcom/daaw/ky;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_4

    aget-object v2, p3, v1

    instance-of v2, v2, Lcom/daaw/ky;

    if-eqz v2, :cond_2

    aget-object v2, p3, v1

    check-cast v2, Lcom/daaw/ky;

    aget-object v3, p1, v1

    if-eqz v3, :cond_1

    aget-boolean v3, p2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_2
    :goto_2
    aget-object v2, p3, v1

    if-nez v2, :cond_3

    aget-object v2, p1, v1

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    aget-object v3, p1, v1

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/zo;->x:[Lcom/daaw/zo$a;

    aget-object v2, v3, v2

    iget v3, v2, Lcom/daaw/zo$a;->c:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lcom/daaw/zo;->H:Ljava/util/List;

    iget v2, v2, Lcom/daaw/zo$a;->d:I

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/sy;

    aget-object v3, p1, v1

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    new-instance v4, Lcom/daaw/ky;

    iget-object v5, p0, Lcom/daaw/zo;->F:Lcom/daaw/wo;

    iget-boolean v5, v5, Lcom/daaw/wo;->d:Z

    invoke-direct {v4, v2, v3, v5}, Lcom/daaw/ky;-><init>(Lcom/daaw/sy;Lcom/google/android/exoplayer2/Format;Z)V

    aput-object v4, p3, v1

    const/4 v2, 0x1

    aput-boolean v2, p4, v1

    invoke-interface {p5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final G([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJLandroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/exoplayer2/trackselection/c;",
            "[Z[",
            "Lcom/daaw/d81;",
            "[ZJ",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    aget-object v1, p3, v0

    instance-of v1, v1, Lcom/daaw/if;

    if-eqz v1, :cond_2

    aget-object v1, p3, v0

    check-cast v1, Lcom/daaw/if;

    aget-object v2, p1, v0

    if-eqz v2, :cond_1

    aget-boolean v2, p2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    aget-object v3, p1, v0

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v2

    invoke-virtual {p7, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v1, p0}, Lcom/daaw/if;->N(Lcom/daaw/if$b;)V

    const/4 v1, 0x0

    aput-object v1, p3, v0

    :cond_2
    :goto_2
    aget-object v1, p3, v0

    if-nez v1, :cond_3

    aget-object v1, p1, v0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    aget-object v2, p1, v0

    invoke-interface {v2}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/zo;->x:[Lcom/daaw/zo$a;

    aget-object v2, v2, v1

    iget v3, v2, Lcom/daaw/zo$a;->c:I

    if-nez v3, :cond_3

    aget-object v3, p1, v0

    invoke-virtual {p0, v2, v3, p5, p6}, Lcom/daaw/zo;->r(Lcom/daaw/zo$a;Lcom/google/android/exoplayer2/trackselection/c;J)Lcom/daaw/if;

    move-result-object v2

    invoke-virtual {p7, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    aput-object v2, p3, v0

    const/4 v1, 0x1

    aput-boolean v1, p4, v0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public H(Lcom/daaw/wo;I)V
    .locals 7

    iput-object p1, p0, Lcom/daaw/zo;->F:Lcom/daaw/wo;

    iput p2, p0, Lcom/daaw/zo;->G:I

    iget-object v0, p0, Lcom/daaw/zo;->z:Lcom/daaw/ex0;

    invoke-virtual {v0, p1}, Lcom/daaw/ex0;->t(Lcom/daaw/wo;)V

    iget-object v0, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lcom/daaw/if;->B()Lcom/daaw/jf;

    move-result-object v4

    check-cast v4, Lcom/daaw/vo;

    invoke-interface {v4, p1, p2}, Lcom/daaw/vo;->c(Lcom/daaw/wo;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/zo;->B:Lcom/daaw/qo0$a;

    invoke-interface {v0, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :cond_1
    invoke-virtual {p1, p2}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/gw0;->d:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/zo;->H:Ljava/util/List;

    iget-object p2, p0, Lcom/daaw/zo;->D:[Lcom/daaw/ky;

    array-length v0, p2

    :goto_1
    if-ge v1, v0, :cond_4

    aget-object v2, p2, v1

    iget-object v3, p0, Lcom/daaw/zo;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/sy;

    invoke-virtual {v4}, Lcom/daaw/sy;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/daaw/ky;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-boolean v3, p1, Lcom/daaw/wo;->d:Z

    invoke-virtual {v2, v4, v3}, Lcom/daaw/ky;->e(Lcom/daaw/sy;Z)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/zo;->E:Lcom/daaw/gb1;

    invoke-interface {v0}, Lcom/daaw/gb1;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/zo;->E:Lcom/daaw/gb1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/gb1;->c(J)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized d(Lcom/daaw/if;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zo;->A:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ex0$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/ex0$c;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e(JLcom/daaw/ea1;)J
    .locals 6

    iget-object v0, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

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

    iget-object v0, p0, Lcom/daaw/zo;->E:Lcom/daaw/gb1;

    invoke-interface {v0}, Lcom/daaw/gb1;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zo;->E:Lcom/daaw/gb1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/gb1;->g(J)V

    return-void
.end method

.method public i([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJ)J
    .locals 11

    move-object v8, p0

    new-instance v9, Landroid/util/SparseArray;

    invoke-direct {v9}, Landroid/util/SparseArray;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-wide/from16 v5, p5

    move-object v7, v9

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/zo;->G([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJLandroid/util/SparseArray;)V

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/zo;->F([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZLjava/util/List;)V

    move-wide/from16 v5, p5

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/zo;->E([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJLandroid/util/SparseArray;)V

    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/zo;->A(I)[Lcom/daaw/if;

    move-result-object v0

    iput-object v0, v8, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, v8, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/if;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/ky;

    iput-object v0, v8, Lcom/daaw/zo;->D:[Lcom/daaw/ky;

    invoke-interface {v10, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object v0, v8, Lcom/daaw/zo;->y:Lcom/daaw/wi;

    iget-object v1, v8, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    invoke-interface {v0, v1}, Lcom/daaw/wi;->a([Lcom/daaw/gb1;)Lcom/daaw/gb1;

    move-result-object v0

    iput-object v0, v8, Lcom/daaw/zo;->E:Lcom/daaw/gb1;

    return-wide p5
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zo;->u:Lcom/daaw/lk0;

    invoke-interface {v0}, Lcom/daaw/lk0;->a()V

    return-void
.end method

.method public m(J)J
    .locals 5

    iget-object v0, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2}, Lcom/daaw/if;->O(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/zo;->D:[Lcom/daaw/ky;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lcom/daaw/ky;->c(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-wide p1
.end method

.method public bridge synthetic n(Lcom/daaw/gb1;)V
    .locals 0

    check-cast p1, Lcom/daaw/if;

    invoke-virtual {p0, p1}, Lcom/daaw/zo;->B(Lcom/daaw/if;)V

    return-void
.end method

.method public p(Lcom/daaw/qo0$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zo;->B:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/qo0$a;->j(Lcom/daaw/qo0;)V

    return-void
.end method

.method public q()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/zo;->I:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/zo;->s:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/zo;->I:Z

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final r(Lcom/daaw/zo$a;Lcom/google/android/exoplayer2/trackselection/c;J)Lcom/daaw/if;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zo$a;",
            "Lcom/google/android/exoplayer2/trackselection/c;",
            "J)",
            "Lcom/daaw/if<",
            "Lcom/daaw/vo;",
            ">;"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    const/4 v1, 0x2

    new-array v2, v1, [I

    new-array v3, v1, [Lcom/google/android/exoplayer2/Format;

    iget v4, v0, Lcom/daaw/zo$a;->f:I

    const/4 v5, -0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_0

    const/16 v22, 0x1

    goto :goto_0

    :cond_0
    const/16 v22, 0x0

    :goto_0
    if-eqz v22, :cond_1

    iget-object v8, v12, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v8, v4}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v4

    invoke-virtual {v4, v7}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    aput-object v4, v3, v7

    const/4 v4, 0x4

    aput v4, v2, v7

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget v8, v0, Lcom/daaw/zo$a;->g:I

    if-eq v8, v5, :cond_2

    const/16 v23, 0x1

    goto :goto_2

    :cond_2
    const/16 v23, 0x0

    :goto_2
    if-eqz v23, :cond_3

    iget-object v5, v12, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v5, v8}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/google/android/exoplayer2/source/TrackGroup;->a(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v5, v4, 0x1

    const/4 v6, 0x3

    aput v6, v2, v4

    move v4, v5

    :cond_3
    if-ge v4, v1, :cond_4

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/exoplayer2/Format;

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    move-object v4, v1

    goto :goto_3

    :cond_4
    move-object v4, v3

    :goto_3
    move-object v3, v2

    iget-object v1, v12, Lcom/daaw/zo;->F:Lcom/daaw/wo;

    iget-boolean v1, v1, Lcom/daaw/wo;->d:Z

    if-eqz v1, :cond_5

    if-eqz v22, :cond_5

    iget-object v1, v12, Lcom/daaw/zo;->z:Lcom/daaw/ex0;

    invoke-virtual {v1}, Lcom/daaw/ex0;->n()Lcom/daaw/ex0$c;

    move-result-object v1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    move-object v11, v1

    iget-object v13, v12, Lcom/daaw/zo;->q:Lcom/daaw/vo$a;

    iget-object v14, v12, Lcom/daaw/zo;->u:Lcom/daaw/lk0;

    iget-object v15, v12, Lcom/daaw/zo;->F:Lcom/daaw/wo;

    iget v1, v12, Lcom/daaw/zo;->G:I

    iget-object v2, v0, Lcom/daaw/zo$a;->a:[I

    iget v5, v0, Lcom/daaw/zo$a;->b:I

    iget-wide v6, v12, Lcom/daaw/zo;->t:J

    move/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, p2

    move/from16 v19, v5

    move-wide/from16 v20, v6

    move-object/from16 v24, v11

    invoke-interface/range {v13 .. v24}, Lcom/daaw/vo$a;->a(Lcom/daaw/lk0;Lcom/daaw/wo;I[ILcom/google/android/exoplayer2/trackselection/c;IJZZLcom/daaw/ex0$c;)Lcom/daaw/vo;

    move-result-object v5

    new-instance v13, Lcom/daaw/if;

    iget v2, v0, Lcom/daaw/zo$a;->b:I

    iget-object v7, v12, Lcom/daaw/zo;->v:Lcom/daaw/l2;

    iget v10, v12, Lcom/daaw/zo;->r:I

    iget-object v0, v12, Lcom/daaw/zo;->s:Lcom/daaw/cp0$a;

    move-object v1, v13

    move-object/from16 v6, p0

    move-wide/from16 v8, p3

    move-object v14, v11

    move-object v11, v0

    invoke-direct/range {v1 .. v11}, Lcom/daaw/if;-><init>(I[I[Lcom/google/android/exoplayer2/Format;Lcom/daaw/jf;Lcom/daaw/gb1$a;Lcom/daaw/l2;JILcom/daaw/cp0$a;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, v12, Lcom/daaw/zo;->A:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, v13, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p0

    return-object v13

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public s()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zo;->w:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/zo;->C:[Lcom/daaw/if;

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
