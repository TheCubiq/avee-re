.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewImage(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$txtValue:Landroid/widget/TextView;

.field final synthetic val$value:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/widget/TextView;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1379
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$txtValue:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$name:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$value:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1386
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onImagePropertyPicking:Lcom/daaw/avee/Common/Events/WeakEvent5;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$txtValue:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getHierarchyPath()Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$name:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$28;->val$value:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
