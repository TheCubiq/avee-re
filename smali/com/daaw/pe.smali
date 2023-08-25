.class public Lcom/daaw/pe;
.super Lcom/daaw/ec;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/bc;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/ec;-><init>(Lcom/daaw/bc;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/bc;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    invoke-interface {p1, p3, p4, v0}, Lcom/daaw/bc;->b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0, p2, p3, p4}, Lcom/daaw/gn1;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz v0, :cond_1

    if-eq v0, p2, :cond_1

    invoke-interface {p1, v0}, Lcom/daaw/bc;->a(Landroid/graphics/Bitmap;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return-object p2
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "CenterCrop.com.bumptech.glide.load.resource.bitmap"

    return-object v0
.end method
