.class public Lcom/daaw/j60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r60$a;


# instance fields
.field public final a:Lcom/daaw/bc;


# direct methods
.method public constructor <init>(Lcom/daaw/bc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j60;->a:Lcom/daaw/bc;

    return-void
.end method


# virtual methods
.method public a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j60;->a:Lcom/daaw/bc;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/bc;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j60;->a:Lcom/daaw/bc;

    invoke-interface {v0, p1}, Lcom/daaw/bc;->a(Landroid/graphics/Bitmap;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method
