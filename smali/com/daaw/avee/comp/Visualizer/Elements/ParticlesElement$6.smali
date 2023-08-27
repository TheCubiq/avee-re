.class Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;
.super Ljava/lang/Object;
.source "ParticlesElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func3<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V
    .locals 0

    .line 939
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 7

    .line 942
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget-object p3, p3, v0

    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getPosition()Lcom/daaw/avee/Common/Vec3f;

    move-result-object p3

    .line 943
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    iget v2, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    iget v3, v3, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->drawRectCenterYTmp:F

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->drawRectCenterYTmp:F

    iget v5, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    sub-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p3, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    .line 947
    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-object p1, p3, p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getRot()F

    move-result p1

    neg-float v5, p1

    move-object v6, p2

    .line 943
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->renderParticle(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;FFFF[F)V

    const/4 p1, 0x1

    .line 974
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 939
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;->Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
