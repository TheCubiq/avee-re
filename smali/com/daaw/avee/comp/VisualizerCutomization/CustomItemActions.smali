.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions;
.super Ljava/lang/Object;
.source "CustomItemActions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveCompositionAction;,
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$DuplicateAction;,
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions$RemoveAction;
    }
.end annotation


# static fields
.field public static onActionDuplicate:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onActionRemove:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions;->onActionRemove:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 23
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomItemActions;->onActionDuplicate:Lcom/daaw/avee/Common/Events/WeakEvent2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
