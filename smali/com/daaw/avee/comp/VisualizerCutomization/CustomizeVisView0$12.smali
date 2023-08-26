.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$12;
.super Ljava/lang/Object;
.source "CustomizeVisView0.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeReset()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$12;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 403
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$12;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iget-object v0, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandReset:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
