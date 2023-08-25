.class public final Lcom/daaw/m20;
.super Lcom/daaw/za;
.source ""


# instance fields
.field public final g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/TrackGroup;I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/daaw/m20;-><init>(Lcom/google/android/exoplayer2/source/TrackGroup;IILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/TrackGroup;IILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    invoke-direct {p0, p1, v0}, Lcom/daaw/za;-><init>(Lcom/google/android/exoplayer2/source/TrackGroup;[I)V

    iput p3, p0, Lcom/daaw/m20;->g:I

    iput-object p4, p0, Lcom/daaw/m20;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/daaw/m20;->g:I

    return v0
.end method

.method public n(JJJ)V
    .locals 0

    return-void
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m20;->h:Ljava/lang/Object;

    return-object v0
.end method
