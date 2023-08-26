.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;
.super Ljava/lang/Object;
.source "CustomizeVisView1MVar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;->createPropertyViewMVarFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 104
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$name:Ljava/lang/String;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 106
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-direct {v0, p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;II)V

    .line 108
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$name:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 110
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$2;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onChildPropertyChanged()V

    :cond_0
    return-void
.end method
