.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->onCreatedView1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 189
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->ApplySpinnerTheme(Landroid/widget/AdapterView;)V

    .line 191
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 192
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getCustomizationName()Ljava/lang/String;

    move-result-object p1

    .line 193
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getVersionId()Ljava/lang/String;

    move-result-object p2

    .line 195
    iget-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p4

    invoke-virtual {p4, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->InvokeOnRequestElementAvailableVersions(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    .line 196
    iget-object p4, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p4, [Ljava/lang/String;

    .line 198
    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-ltz p3, :cond_0

    .line 199
    array-length p5, p4

    if-ge p3, p5, :cond_0

    .line 200
    aget-object p1, p4, p3

    .line 203
    :cond_0
    invoke-static {p2, p1}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->CompareElementVersions(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    .line 206
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setVersionId(Ljava/lang/String;)V

    .line 208
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onChildPropertyChanged()V

    :cond_2
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
