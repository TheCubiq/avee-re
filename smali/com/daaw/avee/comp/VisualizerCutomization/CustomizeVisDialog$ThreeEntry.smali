.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;
.super Ljava/lang/Object;
.source "CustomizeVisDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ThreeEntry"
.end annotation


# instance fields
.field composition:Lcom/daaw/avee/comp/Visualizer/CustomComposition;

.field element:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field elementId:I

.field name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomComposition;IZ)V
    .locals 0

    .line 681
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 682
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->name:Ljava/lang/String;

    .line 683
    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->elementId:I

    .line 684
    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->composition:Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;I)V
    .locals 0

    .line 688
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 689
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->name:Ljava/lang/String;

    .line 690
    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->elementId:I

    .line 691
    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->element:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    return-void
.end method


# virtual methods
.method public getComposition()Lcom/daaw/avee/comp/Visualizer/CustomComposition;
    .locals 1

    .line 708
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->composition:Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    return-object v0
.end method

.method public getElement()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
    .locals 1

    .line 713
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->element:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    return-object v0
.end method

.method public getSubName()Ljava/lang/String;
    .locals 1

    .line 676
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->element:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 677
    :cond_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTagName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isSection()Z
    .locals 1

    .line 703
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->composition:Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
