.class Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$3;
.super Ljava/lang/Object;
.source "ImageElement.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public markNeedReCreateGLResources()V
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V

    return-void
.end method
