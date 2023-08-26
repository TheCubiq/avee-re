.class public Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;
.super Ljava/lang/Object;
.source "ImageColorKeyParams.java"


# instance fields
.field public autoDetect:Z

.field public colorKey:I

.field public opacityStrength:F

.field public transparencyStrength:F


# direct methods
.method public constructor <init>(IZFF)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->colorKey:I

    .line 16
    iput-boolean p2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->autoDetect:Z

    .line 17
    iput p3, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->transparencyStrength:F

    .line 18
    iput p4, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->opacityStrength:F

    return-void
.end method


# virtual methods
.method public getStrId()Ljava/lang/String;
    .locals 3

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ck:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->colorKey:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->autoDetect:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->transparencyStrength:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->opacityStrength:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
