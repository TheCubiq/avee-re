.class Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;
.super Ljava/lang/Object;
.source "ImageElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func2<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Invoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 2

    .line 124
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/16 v0, 0x20

    .line 125
    invoke-static {p2, v0, v0, p1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 p2, 0x7

    .line 127
    :try_start_0
    invoke-static {p1, p2}, Lcom/yahel/FastBlur;->fastBlur(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p2, "Art blurring failed: OutOfMemoryError"

    .line 131
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p2

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Art blurring failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 121
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$2;->Invoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
