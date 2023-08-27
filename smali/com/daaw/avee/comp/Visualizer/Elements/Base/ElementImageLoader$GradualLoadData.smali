.class Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;
.super Ljava/lang/Object;
.source "ElementImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GradualLoadData"
.end annotation


# instance fields
.field public array:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

.field public gradualLoadingIndex:I

.field public task:Lcom/daaw/avee/Common/VAsyncTask2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/VAsyncTask2<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 419
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    const/4 v0, 0x0

    .line 420
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->array:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    .line 421
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->task:Lcom/daaw/avee/Common/VAsyncTask2;

    return-void
.end method
