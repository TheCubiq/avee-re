.class public final Lcom/daaw/re1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rp0;


# instance fields
.field public final a:Lcom/daaw/rv0;

.field public final b:Lcom/daaw/qv0;

.field public c:Lcom/daaw/ol1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/rv0;

    invoke-direct {v0}, Lcom/daaw/rv0;-><init>()V

    iput-object v0, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/qv0;

    invoke-direct {v0}, Lcom/daaw/qv0;-><init>()V

    iput-object v0, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/tp0;)Lcom/google/android/exoplayer2/metadata/Metadata;
    .locals 7

    iget-object v0, p0, Lcom/daaw/re1;->c:Lcom/daaw/ol1;

    if-eqz v0, :cond_0

    iget-wide v1, p1, Lcom/daaw/tp0;->u:J

    invoke-virtual {v0}, Lcom/daaw/ol1;->e()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Lcom/daaw/ol1;

    iget-wide v1, p1, Lcom/daaw/gq;->s:J

    invoke-direct {v0, v1, v2}, Lcom/daaw/ol1;-><init>(J)V

    iput-object v0, p0, Lcom/daaw/re1;->c:Lcom/daaw/ol1;

    iget-wide v1, p1, Lcom/daaw/gq;->s:J

    iget-wide v3, p1, Lcom/daaw/tp0;->u:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ol1;->a(J)J

    :cond_1
    iget-object p1, p1, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    invoke-virtual {v1, v0, p1}, Lcom/daaw/rv0;->H([BI)V

    iget-object v1, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    invoke-virtual {v1, v0, p1}, Lcom/daaw/qv0;->l([BI)V

    iget-object p1, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Lcom/daaw/qv0;->o(I)V

    iget-object p1, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/qv0;->h(I)I

    move-result p1

    int-to-long v1, p1

    const/16 p1, 0x20

    shl-long/2addr v1, p1

    iget-object v3, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    invoke-virtual {v3, p1}, Lcom/daaw/qv0;->h(I)I

    move-result p1

    int-to-long v3, p1

    or-long/2addr v1, v3

    iget-object p1, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    const/16 v3, 0x14

    invoke-virtual {p1, v3}, Lcom/daaw/qv0;->o(I)V

    iget-object p1, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    const/16 v3, 0xc

    invoke-virtual {p1, v3}, Lcom/daaw/qv0;->h(I)I

    move-result p1

    iget-object v3, p0, Lcom/daaw/re1;->b:Lcom/daaw/qv0;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Lcom/daaw/qv0;->h(I)I

    move-result v3

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    const/16 v6, 0xe

    invoke-virtual {v5, v6}, Lcom/daaw/rv0;->K(I)V

    if-eqz v3, :cond_6

    const/16 v5, 0xff

    if-eq v3, v5, :cond_5

    const/4 p1, 0x4

    if-eq v3, p1, :cond_4

    const/4 p1, 0x5

    if-eq v3, p1, :cond_3

    const/4 p1, 0x6

    if-eq v3, p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    iget-object v3, p0, Lcom/daaw/re1;->c:Lcom/daaw/ol1;

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->a(Lcom/daaw/rv0;JLcom/daaw/ol1;)Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;

    move-result-object v4

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    iget-object v3, p0, Lcom/daaw/re1;->c:Lcom/daaw/ol1;

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/exoplayer2/metadata/scte35/SpliceInsertCommand;->a(Lcom/daaw/rv0;JLcom/daaw/ol1;)Lcom/google/android/exoplayer2/metadata/scte35/SpliceInsertCommand;

    move-result-object v4

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    invoke-static {p1}, Lcom/google/android/exoplayer2/metadata/scte35/SpliceScheduleCommand;->a(Lcom/daaw/rv0;)Lcom/google/android/exoplayer2/metadata/scte35/SpliceScheduleCommand;

    move-result-object v4

    goto :goto_0

    :cond_5
    iget-object v3, p0, Lcom/daaw/re1;->a:Lcom/daaw/rv0;

    invoke-static {v3, p1, v1, v2}, Lcom/google/android/exoplayer2/metadata/scte35/PrivateCommand;->a(Lcom/daaw/rv0;IJ)Lcom/google/android/exoplayer2/metadata/scte35/PrivateCommand;

    move-result-object v4

    goto :goto_0

    :cond_6
    new-instance v4, Lcom/google/android/exoplayer2/metadata/scte35/SpliceNullCommand;

    invoke-direct {v4}, Lcom/google/android/exoplayer2/metadata/scte35/SpliceNullCommand;-><init>()V

    :goto_0
    const/4 p1, 0x0

    if-nez v4, :cond_7

    new-instance v0, Lcom/google/android/exoplayer2/metadata/Metadata;

    new-array p1, p1, [Lcom/google/android/exoplayer2/metadata/Metadata$Entry;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/metadata/Metadata;-><init>([Lcom/google/android/exoplayer2/metadata/Metadata$Entry;)V

    goto :goto_1

    :cond_7
    new-instance v1, Lcom/google/android/exoplayer2/metadata/Metadata;

    new-array v0, v0, [Lcom/google/android/exoplayer2/metadata/Metadata$Entry;

    aput-object v4, v0, p1

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/metadata/Metadata;-><init>([Lcom/google/android/exoplayer2/metadata/Metadata$Entry;)V

    move-object v0, v1

    :goto_1
    return-object v0
.end method
