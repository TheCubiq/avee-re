.class public Lcom/daaw/bz7;
.super Lcom/daaw/hz7;
.source ""

# interfaces
.implements Lcom/daaw/ih2;


# instance fields
.field public x:Lcom/daaw/jh2;

.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/hz7;-><init>()V

    const-string p1, "moov"

    iput-object p1, p0, Lcom/daaw/bz7;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final d(Lcom/daaw/iz7;Ljava/nio/ByteBuffer;JLcom/daaw/fh2;)V
    .locals 2

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    iput-object p1, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/hz7;->s:J

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, v0, v1}, Lcom/daaw/iz7;->b(J)V

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/hz7;->t:J

    iput-object p5, p0, Lcom/daaw/hz7;->p:Lcom/daaw/fh2;

    return-void
.end method

.method public final n(Lcom/daaw/jh2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bz7;->x:Lcom/daaw/jh2;

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bz7;->y:Ljava/lang/String;

    return-object v0
.end method
