.class public final Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;
.super Lcom/google/android/exoplayer2/metadata/scte35/SpliceCommand;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:J

.field public final q:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand$a;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand$a;-><init>()V

    sput-object v0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/metadata/scte35/SpliceCommand;-><init>()V

    iput-wide p1, p0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->p:J

    iput-wide p3, p0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->q:J

    return-void
.end method

.method public synthetic constructor <init>(JJLcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;-><init>(JJ)V

    return-void
.end method

.method public static a(Lcom/daaw/rv0;JLcom/daaw/ol1;)Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->b(Lcom/daaw/rv0;J)J

    move-result-wide p0

    invoke-virtual {p3, p0, p1}, Lcom/daaw/ol1;->b(J)J

    move-result-wide p2

    new-instance v0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;-><init>(JJ)V

    return-object v0
.end method

.method public static b(Lcom/daaw/rv0;J)J
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v2

    or-long/2addr v0, v2

    add-long/2addr v0, p1

    const-wide p0, 0x1ffffffffL

    and-long/2addr p0, v0

    goto :goto_0

    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide p0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->p:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/google/android/exoplayer2/metadata/scte35/TimeSignalCommand;->q:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
