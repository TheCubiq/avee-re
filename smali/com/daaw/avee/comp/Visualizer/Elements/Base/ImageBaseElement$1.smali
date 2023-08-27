.class Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$1;
.super Ljava/lang/Object;
.source "ImageBaseElement.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->initialize(Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public markNeedReCreateGLResources()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method
