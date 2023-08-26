.class public abstract Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveCompositionAction$RemoveCompositionActionListener;
.super Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.source "CustomItemActions.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveCompositionAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RemoveCompositionActionListener"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 104
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveCompositionAction;->baseInstance:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V

    return-void
.end method


# virtual methods
.method protected abstract onAction(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
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
.end method
