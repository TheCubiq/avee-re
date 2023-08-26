.class Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory$BitmapGlideAnimation;
.super Ljava/lang/Object;
.source "BitmapContainerCrossFadeFactory.java"

# interfaces
.implements Lcom/bumptech/glide/request/animation/GlideAnimation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BitmapGlideAnimation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/animation/GlideAnimation<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory;

.field private final transition:Lcom/bumptech/glide/request/animation/GlideAnimation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/request/animation/GlideAnimation<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory;Lcom/bumptech/glide/request/animation/GlideAnimation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/request/animation/GlideAnimation<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)V"
        }
    .end annotation

    .line 61
    iput-object p1, p0, Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory$BitmapGlideAnimation;->this$0:Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p2, p0, Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory$BitmapGlideAnimation;->transition:Lcom/bumptech/glide/request/animation/GlideAnimation;

    return-void
.end method


# virtual methods
.method public animate(Ljava/lang/Object;Lcom/bumptech/glide/request/animation/GlideAnimation$ViewAdapter;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/bumptech/glide/request/animation/GlideAnimation$ViewAdapter;",
            ")Z"
        }
    .end annotation

    .line 67
    invoke-interface {p2}, Lcom/bumptech/glide/request/animation/GlideAnimation$ViewAdapter;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 68
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory$BitmapGlideAnimation;->this$0:Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory;

    invoke-virtual {v2, p1}, Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory;->getBitmap(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 69
    iget-object p1, p0, Lcom/bumptech/glide/request/animation/BitmapContainerCrossFadeFactory$BitmapGlideAnimation;->transition:Lcom/bumptech/glide/request/animation/GlideAnimation;

    invoke-interface {p1, v1, p2}, Lcom/bumptech/glide/request/animation/GlideAnimation;->animate(Ljava/lang/Object;Lcom/bumptech/glide/request/animation/GlideAnimation$ViewAdapter;)Z

    move-result p1

    return p1
.end method
