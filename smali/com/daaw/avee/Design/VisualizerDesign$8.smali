.class Lcom/daaw/avee/Design/VisualizerDesign$8;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Float;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 3

    .line 209
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {p2}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 210
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$800(Lcom/daaw/avee/Design/VisualizerDesign;)F

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    add-float/2addr v0, p1

    invoke-static {p2, v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$802(Lcom/daaw/avee/Design/VisualizerDesign;F)F

    .line 222
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$900(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Vec2f;->distance(Lcom/daaw/avee/Common/Vec2f;)F

    move-result p1

    const p2, 0x3dcccccd    # 0.1f

    cmpg-float p1, p1, p2

    if-gez p1, :cond_1

    .line 223
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$900(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object p2, p2, Lcom/daaw/avee/Design/VisualizerDesign;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p2}, Ljava/util/Random;->nextFloat()F

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr p2, v1

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 224
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$900(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object p2, p2, Lcom/daaw/avee/Design/VisualizerDesign;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p2}, Ljava/util/Random;->nextFloat()F

    move-result p2

    mul-float p2, p2, v0

    sub-float/2addr p2, v1

    iput p2, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 225
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$900(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 228
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$8;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$900(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    const-wide v1, 0x3fecccccc0000000L    # 0.8999999761581421

    invoke-static {p1, p2, v0, v1, v2}, Lcom/daaw/avee/Common/Interpolate;->Lerp(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;D)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 205
    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign$8;->invoke(Ljava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method
