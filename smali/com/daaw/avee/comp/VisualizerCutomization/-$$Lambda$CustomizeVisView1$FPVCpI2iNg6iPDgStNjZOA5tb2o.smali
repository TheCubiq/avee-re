.class public final synthetic Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field private final synthetic f$1:Ljava/lang/String;

.field private final synthetic f$2:Z

.field private final synthetic f$3:Z

.field private final synthetic f$4:[Lcom/flask/colorpicker/slider/AlphaSlider;

.field private final synthetic f$5:[Lcom/flask/colorpicker/ColorPickerView;

.field private final synthetic f$6:Landroid/widget/TextView;

.field private final synthetic f$7:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ZZ[Lcom/flask/colorpicker/slider/AlphaSlider;[Lcom/flask/colorpicker/ColorPickerView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$0:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$1:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$2:Z

    iput-boolean p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$3:Z

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$4:[Lcom/flask/colorpicker/slider/AlphaSlider;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$5:[Lcom/flask/colorpicker/ColorPickerView;

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$6:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$7:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$0:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$1:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$2:Z

    iget-boolean v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$3:Z

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$4:[Lcom/flask/colorpicker/slider/AlphaSlider;

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$5:[Lcom/flask/colorpicker/ColorPickerView;

    iget-object v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$6:Landroid/widget/TextView;

    iget-object v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o;->f$7:Landroid/view/View;

    move-object v8, p1

    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->lambda$createPropertyViewRGBA$0(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ZZ[Lcom/flask/colorpicker/slider/AlphaSlider;[Lcom/flask/colorpicker/ColorPickerView;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method
