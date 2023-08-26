.class public abstract Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
.super Ljava/lang/Object;
.source "ItemActionBase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase$OnClickListener;
    }
.end annotation


# instance fields
.field private final actionId:I

.field private final allowMultiple:Z

.field private final allowSingle:Z

.field private final iconResId:I

.field private final nameStrResId:I

.field private final stayPressedHint:Z


# direct methods
.method public constructor <init>(IZII)V
    .locals 6

    const/4 v3, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    .line 26
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZII)V

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 31
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;-><init>(IZZIIZ)V

    return-void
.end method

.method public constructor <init>(IZZIIZ)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-boolean p2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->allowMultiple:Z

    .line 37
    iput-boolean p3, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->allowSingle:Z

    .line 38
    iput p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->actionId:I

    .line 39
    iput p4, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->iconResId:I

    .line 40
    iput p5, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->nameStrResId:I

    .line 41
    iput-boolean p6, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->stayPressedHint:Z

    return-void
.end method


# virtual methods
.method public executeBase(Lcom/daaw/avee/ContextData;Ljava/lang/Object;Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
    .locals 2

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public abstract executeListBase(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/util/List;)V
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
.end method

.method public getActionId()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->actionId:I

    return v0
.end method

.method public getIconResId()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->iconResId:I

    return v0
.end method

.method public getNameStrResId()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->nameStrResId:I

    return v0
.end method

.method public getShouldShow()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isAllowMultiple()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->allowMultiple:Z

    return v0
.end method

.method public isAllowSingle()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->allowSingle:Z

    return v0
.end method

.method public isStayPressedHint()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->stayPressedHint:Z

    return v0
.end method
