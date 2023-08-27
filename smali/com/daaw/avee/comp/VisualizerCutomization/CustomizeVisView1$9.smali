.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyCommon(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/Common/Action1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$itemView:Landroid/view/View;

.field final synthetic val$key:Ljava/lang/String;

.field final synthetic val$propertiesList:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Landroid/view/View;Lcom/daaw/avee/Common/Action1;)V
    .locals 0

    .line 585
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$propertiesList:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$key:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$itemView:Landroid/view/View;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 588
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$propertiesList:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$key:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$itemView:Landroid/view/View;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$9;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertySelected(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Landroid/view/View;Lcom/daaw/avee/Common/Action1;)V

    return-void
.end method
