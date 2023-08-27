.class public final synthetic Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/flask/colorpicker/OnColorChangedListener;


# instance fields
.field private final synthetic f$0:Z

.field private final synthetic f$1:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field private final synthetic f$2:Ljava/lang/String;

.field private final synthetic f$3:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field private final synthetic f$4:Lcom/daaw/avee/Common/Action1;

.field private final synthetic f$5:[Lcom/flask/colorpicker/ColorPickerView;

.field private final synthetic f$6:Lcom/daaw/avee/Common/Func/Func;


# direct methods
.method public synthetic constructor <init>(ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Lcom/flask/colorpicker/ColorPickerView;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$0:Z

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$1:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$3:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$4:Lcom/daaw/avee/Common/Action1;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$5:[Lcom/flask/colorpicker/ColorPickerView;

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$6:Lcom/daaw/avee/Common/Func/Func;

    return-void
.end method


# virtual methods
.method public final onColorChanged(I)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$0:Z

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$1:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$3:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$4:Lcom/daaw/avee/Common/Action1;

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$5:[Lcom/flask/colorpicker/ColorPickerView;

    iget-object v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I;->f$6:Lcom/daaw/avee/Common/Func/Func;

    move v7, p1

    invoke-static/range {v0 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->lambda$createPropertyViewRGBA$2(ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Lcom/flask/colorpicker/ColorPickerView;Lcom/daaw/avee/Common/Func/Func;I)V

    return-void
.end method
