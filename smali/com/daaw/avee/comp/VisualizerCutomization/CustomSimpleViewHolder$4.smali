.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$4;
.super Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveCompositionAction$RemoveCompositionActionListener;
.source "CustomSimpleViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveCompositionAction$RemoveCompositionActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onAction(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
