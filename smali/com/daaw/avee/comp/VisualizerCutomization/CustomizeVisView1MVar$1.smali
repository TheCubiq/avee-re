.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;
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

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;FLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$min:F

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 90
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$name:Ljava/lang/String;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p1

    .line 91
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    iget v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$min:F

    const-string v3, "Constant"

    invoke-direct {v1, v3, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 92
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$name:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 94
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$1;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onChildPropertyChanged()V

    return-void
.end method
