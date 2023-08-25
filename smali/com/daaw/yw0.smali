.class public final Lcom/daaw/yw0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/nl1;

.field public final b:Ljava/lang/Object;

.field public final c:Lcom/daaw/bp0$a;

.field public final d:J

.field public final e:J

.field public final f:I

.field public final g:Z

.field public final h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public final i:Lcom/daaw/xm1;

.field public volatile j:J

.field public volatile k:J


# direct methods
.method public constructor <init>(Lcom/daaw/nl1;JLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V
    .locals 12

    new-instance v3, Lcom/daaw/bp0$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/daaw/bp0$a;-><init>(I)V

    const/4 v2, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-direct/range {v0 .. v11}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iput-object p2, p0, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iput-wide p4, p0, Lcom/daaw/yw0;->d:J

    iput-wide p6, p0, Lcom/daaw/yw0;->e:J

    iput-wide p4, p0, Lcom/daaw/yw0;->j:J

    iput-wide p4, p0, Lcom/daaw/yw0;->k:J

    iput p8, p0, Lcom/daaw/yw0;->f:I

    iput-boolean p9, p0, Lcom/daaw/yw0;->g:Z

    iput-object p10, p0, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iput-object p11, p0, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    return-void
.end method

.method public static a(Lcom/daaw/yw0;Lcom/daaw/yw0;)V
    .locals 2

    iget-wide v0, p0, Lcom/daaw/yw0;->j:J

    iput-wide v0, p1, Lcom/daaw/yw0;->j:J

    iget-wide v0, p0, Lcom/daaw/yw0;->k:J

    iput-wide v0, p1, Lcom/daaw/yw0;->k:J

    return-void
.end method


# virtual methods
.method public b(Z)Lcom/daaw/yw0;
    .locals 13

    new-instance v12, Lcom/daaw/yw0;

    iget-object v1, p0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v2, p0, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v4, p0, Lcom/daaw/yw0;->d:J

    iget-wide v6, p0, Lcom/daaw/yw0;->e:J

    iget v8, p0, Lcom/daaw/yw0;->f:I

    iget-object v10, p0, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v11, p0, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    move-object v0, v12

    move v9, p1

    invoke-direct/range {v0 .. v11}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    invoke-static {p0, v12}, Lcom/daaw/yw0;->a(Lcom/daaw/yw0;Lcom/daaw/yw0;)V

    return-object v12
.end method

.method public c(I)Lcom/daaw/yw0;
    .locals 13

    new-instance v12, Lcom/daaw/yw0;

    iget-object v1, p0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v2, p0, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    invoke-virtual {v0, p1}, Lcom/daaw/bp0$a;->a(I)Lcom/daaw/bp0$a;

    move-result-object v3

    iget-wide v4, p0, Lcom/daaw/yw0;->d:J

    iget-wide v6, p0, Lcom/daaw/yw0;->e:J

    iget v8, p0, Lcom/daaw/yw0;->f:I

    iget-boolean v9, p0, Lcom/daaw/yw0;->g:Z

    iget-object v10, p0, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v11, p0, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    invoke-static {p0, v12}, Lcom/daaw/yw0;->a(Lcom/daaw/yw0;Lcom/daaw/yw0;)V

    return-object v12
.end method

.method public d(I)Lcom/daaw/yw0;
    .locals 13

    new-instance v12, Lcom/daaw/yw0;

    iget-object v1, p0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v2, p0, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v4, p0, Lcom/daaw/yw0;->d:J

    iget-wide v6, p0, Lcom/daaw/yw0;->e:J

    iget-boolean v9, p0, Lcom/daaw/yw0;->g:Z

    iget-object v10, p0, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v11, p0, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    move-object v0, v12

    move v8, p1

    invoke-direct/range {v0 .. v11}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    invoke-static {p0, v12}, Lcom/daaw/yw0;->a(Lcom/daaw/yw0;Lcom/daaw/yw0;)V

    return-object v12
.end method

.method public e(Lcom/daaw/nl1;Ljava/lang/Object;)Lcom/daaw/yw0;
    .locals 13

    new-instance v12, Lcom/daaw/yw0;

    iget-object v3, p0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v4, p0, Lcom/daaw/yw0;->d:J

    iget-wide v6, p0, Lcom/daaw/yw0;->e:J

    iget v8, p0, Lcom/daaw/yw0;->f:I

    iget-boolean v9, p0, Lcom/daaw/yw0;->g:Z

    iget-object v10, p0, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v11, p0, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    move-object v0, v12

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v11}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    invoke-static {p0, v12}, Lcom/daaw/yw0;->a(Lcom/daaw/yw0;Lcom/daaw/yw0;)V

    return-object v12
.end method

.method public f(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)Lcom/daaw/yw0;
    .locals 13

    new-instance v12, Lcom/daaw/yw0;

    iget-object v1, p0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v2, p0, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v4, p0, Lcom/daaw/yw0;->d:J

    iget-wide v6, p0, Lcom/daaw/yw0;->e:J

    iget v8, p0, Lcom/daaw/yw0;->f:I

    iget-boolean v9, p0, Lcom/daaw/yw0;->g:Z

    move-object v0, v12

    move-object v10, p1

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    invoke-static {p0, v12}, Lcom/daaw/yw0;->a(Lcom/daaw/yw0;Lcom/daaw/yw0;)V

    return-object v12
.end method

.method public g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;
    .locals 14

    move-object v0, p0

    new-instance v13, Lcom/daaw/yw0;

    iget-object v2, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v3, v0, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/daaw/bp0$a;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    move-wide/from16 v7, p4

    goto :goto_0

    :cond_0
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v7, v4

    :goto_0
    iget v9, v0, Lcom/daaw/yw0;->f:I

    iget-boolean v10, v0, Lcom/daaw/yw0;->g:Z

    iget-object v11, v0, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v12, v0, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    move-object v1, v13

    move-object v4, p1

    move-wide/from16 v5, p2

    invoke-direct/range {v1 .. v12}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    return-object v13
.end method
