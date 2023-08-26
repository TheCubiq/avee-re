.class Lcom/daaw/avee/Design/ContextualActionModeDesign$8;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/ContextualActionModeDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "[",
        "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
        "Ljava/lang/Boolean;",
        "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$8;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 111
    check-cast p1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/ContextualActionModeDesign$8;->invoke([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;Ljava/lang/Boolean;Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V

    return-void
.end method

.method public invoke([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;Ljava/lang/Boolean;Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 115
    invoke-static {}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->getInstance()Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onItemSelected([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;Ljava/lang/Boolean;Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)V

    :cond_0
    return-void
.end method
