.class public Lcom/daaw/j70;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/i51<",
        "Landroid/graphics/Bitmap;",
        "Lcom/daaw/h70;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;

.field public final b:Lcom/daaw/bc;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/daaw/bc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j70;->a:Landroid/content/res/Resources;

    iput-object p2, p0, Lcom/daaw/j70;->b:Lcom/daaw/bc;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/h70;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/h70;

    iget-object v1, p0, Lcom/daaw/j70;->a:Landroid/content/res/Resources;

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, p1}, Lcom/daaw/h70;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    new-instance p1, Lcom/daaw/i70;

    iget-object v1, p0, Lcom/daaw/j70;->b:Lcom/daaw/bc;

    invoke-direct {p1, v0, v1}, Lcom/daaw/i70;-><init>(Lcom/daaw/h70;Lcom/daaw/bc;)V

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode"

    return-object v0
.end method
