.class public abstract Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.super Ljava/lang/Object;
.source "ActionListenerBase.java"


# instance fields
.field private final actionBase:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->actionBase:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-void
.end method


# virtual methods
.method public execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->actionBase:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v0, p1, p2, p0}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->executeBase(Lcom/daaw/avee/ContextData;Ljava/lang/Object;Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    return-void
.end method

.method public getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->actionBase:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    return-object v0
.end method
