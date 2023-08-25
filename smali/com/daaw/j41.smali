.class public abstract Lcom/daaw/j41;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/j41$b;,
        Lcom/daaw/j41$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Lcom/google/android/exoplayer2/Format;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lcom/daaw/d31;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/String;",
            "Lcom/daaw/ka1;",
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j41;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/daaw/j41;->b:J

    iput-object p4, p0, Lcom/daaw/j41;->c:Lcom/google/android/exoplayer2/Format;

    iput-object p5, p0, Lcom/daaw/j41;->d:Ljava/lang/String;

    if-nez p7, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/j41;->f:Ljava/util/List;

    invoke-virtual {p6, p0}, Lcom/daaw/ka1;->a(Lcom/daaw/j41;)Lcom/daaw/d31;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/j41;->g:Lcom/daaw/d31;

    invoke-virtual {p6}, Lcom/daaw/ka1;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/j41;->e:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;Lcom/daaw/j41$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/daaw/j41;-><init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;)V

    return-void
.end method

.method public static l(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;)Lcom/daaw/j41;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/String;",
            "Lcom/daaw/ka1;",
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;)",
            "Lcom/daaw/j41;"
        }
    .end annotation

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v7}, Lcom/daaw/j41;->m(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;Ljava/lang/String;)Lcom/daaw/j41;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;Ljava/lang/String;)Lcom/daaw/j41;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/String;",
            "Lcom/daaw/ka1;",
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/j41;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/daaw/ka1$e;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/j41$c;

    move-object v8, v0

    check-cast v8, Lcom/daaw/ka1$e;

    const-wide/16 v11, -0x1

    move-object v2, v1

    move-object v3, p0

    move-wide v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v12}, Lcom/daaw/j41$c;-><init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1$e;Ljava/util/List;Ljava/lang/String;J)V

    return-object v1

    :cond_0
    instance-of v1, v0, Lcom/daaw/ka1$a;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/daaw/j41$b;

    move-object v8, v0

    check-cast v8, Lcom/daaw/ka1$a;

    move-object v2, v1

    move-object v3, p0

    move-wide v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v9}, Lcom/daaw/j41$b;-><init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1$a;Ljava/util/List;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract i()Lcom/daaw/bp;
.end method

.method public abstract j()Lcom/daaw/d31;
.end method

.method public k()Lcom/daaw/d31;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41;->g:Lcom/daaw/d31;

    return-object v0
.end method
