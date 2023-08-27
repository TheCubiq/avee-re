.class public Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderResourcesPreview;
.super Ljava/lang/Object;
.source "RenderResourcesPreview.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;


# instance fields
.field meter:Lcom/daaw/avee/comp/Visualizer/Meter;

.field visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderResourcesPreview;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    .line 20
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderResourcesPreview;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    return-void
.end method


# virtual methods
.method public getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAtlasTexSquareSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAtlasTexSquareYSidesSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderResourcesPreview;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    return-object v0
.end method

.method public getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderResourcesPreview;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    return-object v0
.end method
