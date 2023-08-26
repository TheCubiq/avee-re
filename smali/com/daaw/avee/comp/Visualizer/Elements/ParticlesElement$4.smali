.class Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$4;
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
        "[F[F",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V
    .locals 0

    .line 889
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Invoke(Ljava/lang/Integer;[F[F)Ljava/lang/Boolean;
    .locals 0

    const/4 p1, 0x0

    .line 892
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 889
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [F

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$4;->Invoke(Ljava/lang/Integer;[F[F)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
