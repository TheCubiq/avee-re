.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;
.super Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.source "CustomItemActions.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DuplicateAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction$DuplicateActionListener;
    }
.end annotation


# static fields
.field public static baseInstance:Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;

    invoke-direct {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;->baseInstance:Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f0800b9

    const v5, 0x7f100192

    move-object v0, p0

    .line 56
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZII)V

    return-void
.end method


# virtual methods
.method public executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            ">;)V"
        }
    .end annotation

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 63
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 64
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction$DuplicateActionListener;

    .line 65
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction$DuplicateActionListener;->onAction(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 68
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 69
    sget-object p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions;->onActionDuplicate:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
