.class public final synthetic Lcom/daaw/q65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:D

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;DII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q65;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/daaw/q65;->b:D

    iput p4, p0, Lcom/daaw/q65;->c:I

    iput p5, p0, Lcom/daaw/q65;->d:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/q65;->a:Ljava/lang/String;

    iget-wide v4, p0, Lcom/daaw/q65;->b:D

    iget v6, p0, Lcom/daaw/q65;->c:I

    iget v7, p0, Lcom/daaw/q65;->d:I

    check-cast p1, Landroid/graphics/Bitmap;

    new-instance v8, Lcom/daaw/dc3;

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v2, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/daaw/dc3;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V

    return-object v8
.end method
