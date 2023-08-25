.class public final Lcom/google/android/exoplayer2/trackselection/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/exoplayer2/trackselection/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/trackselection/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/ia;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:F

.field public final f:F

.field public final g:J

.field public final h:Lcom/daaw/zf;


# direct methods
.method public constructor <init>(Lcom/daaw/ia;)V
    .locals 10

    sget-object v9, Lcom/daaw/zf;->a:Lcom/daaw/zf;

    const/16 v2, 0x2710

    const/16 v3, 0x61a8

    const/16 v4, 0x61a8

    const/high16 v5, 0x3f400000    # 0.75f

    const/high16 v6, 0x3f400000    # 0.75f

    const-wide/16 v7, 0x7d0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/exoplayer2/trackselection/a$a;-><init>(Lcom/daaw/ia;IIIFFJLcom/daaw/zf;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ia;IIIFFJLcom/daaw/zf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->a:Lcom/daaw/ia;

    iput p2, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->b:I

    iput p3, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->c:I

    iput p4, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->d:I

    iput p5, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->e:F

    iput p6, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->f:F

    iput-wide p7, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->g:J

    iput-object p9, p0, Lcom/google/android/exoplayer2/trackselection/a$a;->h:Lcom/daaw/zf;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/exoplayer2/source/TrackGroup;[I)Lcom/google/android/exoplayer2/trackselection/c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/trackselection/a$a;->b(Lcom/google/android/exoplayer2/source/TrackGroup;[I)Lcom/google/android/exoplayer2/trackselection/a;

    move-result-object p1

    return-object p1
.end method

.method public varargs b(Lcom/google/android/exoplayer2/source/TrackGroup;[I)Lcom/google/android/exoplayer2/trackselection/a;
    .locals 17

    move-object/from16 v0, p0

    new-instance v16, Lcom/google/android/exoplayer2/trackselection/a;

    iget-object v4, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->a:Lcom/daaw/ia;

    iget v1, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->b:I

    int-to-long v5, v1

    iget v1, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->c:I

    int-to-long v7, v1

    iget v1, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->d:I

    int-to-long v9, v1

    iget v11, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->e:F

    iget v12, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->f:F

    iget-wide v13, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->g:J

    iget-object v15, v0, Lcom/google/android/exoplayer2/trackselection/a$a;->h:Lcom/daaw/zf;

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v15}, Lcom/google/android/exoplayer2/trackselection/a;-><init>(Lcom/google/android/exoplayer2/source/TrackGroup;[ILcom/daaw/ia;JJJFFJLcom/daaw/zf;)V

    return-object v16
.end method
