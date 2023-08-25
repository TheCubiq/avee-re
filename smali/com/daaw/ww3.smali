.class public final synthetic Lcom/daaw/ww3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/yw3;

.field public final synthetic q:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yw3;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ww3;->p:Lcom/daaw/yw3;

    iput-object p2, p0, Lcom/daaw/ww3;->q:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ww3;->p:Lcom/daaw/yw3;

    iget-object v1, p0, Lcom/daaw/ww3;->q:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/daaw/yw3;->e(Landroid/graphics/Bitmap;)V

    return-void
.end method
