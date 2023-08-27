.class Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;
.super Ljava/lang/Object;
.source "BufferRendererPreview.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview;->drawBatchRectangleEdges(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/Common/Func/Func4;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func3<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview;

.field final synthetic val$onGetRectangleCorners:Lcom/daaw/avee/Common/Func/Func4;

.field final synthetic val$outCorners:[F


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview;Lcom/daaw/avee/Common/Func/Func4;[F)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;->this$0:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;->val$onGetRectangleCorners:Lcom/daaw/avee/Common/Func/Func4;

    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;->val$outCorners:[F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 2

    .line 209
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;->val$onGetRectangleCorners:Lcom/daaw/avee/Common/Func/Func4;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;->val$outCorners:[F

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/daaw/avee/Common/Func/Func4;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 206
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/BufferRendererPreview$1;->Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
