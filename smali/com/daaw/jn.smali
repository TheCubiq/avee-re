.class public final Lcom/daaw/jn;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jn$b;
    }
.end annotation


# instance fields
.field public a:[B

.field public b:[B

.field public c:I

.field public d:[I

.field public e:[I

.field public f:I

.field public g:I

.field public h:I

.field public final i:Landroid/media/MediaCodec$CryptoInfo;

.field public final j:Lcom/daaw/jn$b;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/daaw/sq1;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x10

    if-lt v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/jn;->b()Landroid/media/MediaCodec$CryptoInfo;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lcom/daaw/jn;->i:Landroid/media/MediaCodec$CryptoInfo;

    const/16 v3, 0x18

    if-lt v0, v3, :cond_1

    new-instance v0, Lcom/daaw/jn$b;

    invoke-direct {v0, v2, v1}, Lcom/daaw/jn$b;-><init>(Landroid/media/MediaCodec$CryptoInfo;Lcom/daaw/jn$a;)V

    move-object v1, v0

    :cond_1
    iput-object v1, p0, Lcom/daaw/jn;->j:Lcom/daaw/jn$b;

    return-void
.end method


# virtual methods
.method public a()Landroid/media/MediaCodec$CryptoInfo;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    iget-object v0, p0, Lcom/daaw/jn;->i:Landroid/media/MediaCodec$CryptoInfo;

    return-object v0
.end method

.method public final b()Landroid/media/MediaCodec$CryptoInfo;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    new-instance v0, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    return-object v0
.end method

.method public c(I[I[I[B[BIII)V
    .locals 0

    iput p1, p0, Lcom/daaw/jn;->f:I

    iput-object p2, p0, Lcom/daaw/jn;->d:[I

    iput-object p3, p0, Lcom/daaw/jn;->e:[I

    iput-object p4, p0, Lcom/daaw/jn;->b:[B

    iput-object p5, p0, Lcom/daaw/jn;->a:[B

    iput p6, p0, Lcom/daaw/jn;->c:I

    iput p7, p0, Lcom/daaw/jn;->g:I

    iput p8, p0, Lcom/daaw/jn;->h:I

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 p2, 0x10

    if-lt p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/jn;->d()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    iget-object v0, p0, Lcom/daaw/jn;->i:Landroid/media/MediaCodec$CryptoInfo;

    iget v1, p0, Lcom/daaw/jn;->f:I

    iput v1, v0, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    iget-object v1, p0, Lcom/daaw/jn;->d:[I

    iput-object v1, v0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    iget-object v1, p0, Lcom/daaw/jn;->e:[I

    iput-object v1, v0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    iget-object v1, p0, Lcom/daaw/jn;->b:[B

    iput-object v1, v0, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    iget-object v1, p0, Lcom/daaw/jn;->a:[B

    iput-object v1, v0, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    iget v1, p0, Lcom/daaw/jn;->c:I

    iput v1, v0, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/jn;->j:Lcom/daaw/jn$b;

    iget v1, p0, Lcom/daaw/jn;->g:I

    iget v2, p0, Lcom/daaw/jn;->h:I

    invoke-static {v0, v1, v2}, Lcom/daaw/jn$b;->a(Lcom/daaw/jn$b;II)V

    :cond_0
    return-void
.end method
