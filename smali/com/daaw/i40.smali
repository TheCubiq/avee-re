.class public final Lcom/daaw/i40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nz;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field public final a:Landroid/media/MediaCrypto;

.field public final b:Z


# virtual methods
.method public a()Landroid/media/MediaCrypto;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i40;->a:Landroid/media/MediaCrypto;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/i40;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/i40;->a:Landroid/media/MediaCrypto;

    invoke-virtual {v0, p1}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
