.class public Lcom/daaw/j20;
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
    .locals 0

    invoke-static {p2, p1, p3, p4}, Lcom/daaw/gn1;->b(Landroid/graphics/Bitmap;Lcom/daaw/bc;II)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "FitCenter.com.bumptech.glide.load.resource.bitmap"

    return-object v0
.end method
