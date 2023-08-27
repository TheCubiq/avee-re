.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createChildView(ZLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$childDataFinal:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$eventFromUser:[Z

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$selectorView:Z

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

.field final synthetic val$validValues:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;[Z[Ljava/lang/String;ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 510
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$eventFromUser:[Z

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$validValues:[Ljava/lang/String;

    iput-boolean p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$selectorView:Z

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$name:Ljava/lang/String;

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$childDataFinal:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

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

    .line 514
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->ApplySpinnerTheme(Landroid/widget/AdapterView;)V

    .line 516
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$eventFromUser:[Z

    const/4 p2, 0x0

    aget-boolean p1, p1, p2

    if-eqz p1, :cond_1

    if-ltz p3, :cond_1

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$validValues:[Ljava/lang/String;

    array-length p1, p1

    if-ge p3, p1, :cond_1

    .line 518
    iget-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$selectorView:Z

    if-eqz p1, :cond_0

    .line 520
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$name:Ljava/lang/String;

    const-string p4, ""

    invoke-virtual {p1, p2, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$validValues:[Ljava/lang/String;

    aget-object p2, p2, p3

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 521
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$name:Ljava/lang/String;

    iget-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$validValues:[Ljava/lang/String;

    aget-object p3, p4, p3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertySelectStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onChildPropertyChanged()V

    .line 524
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_1

    .line 525
    invoke-interface {p1, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 528
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$childDataFinal:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$validValues:[Ljava/lang/String;

    aget-object p2, p2, p3

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 529
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$childDataFinal:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$validValues:[Ljava/lang/String;

    aget-object p2, p2, p3

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putChildTypeValue(Ljava/lang/String;)V

    .line 530
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onChildPropertyChanged()V

    :cond_1
    :goto_0
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
