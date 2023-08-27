.class Lcom/daaw/avee/Design/ContextualActionModeDesign$10;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$10;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)Ljava/lang/Boolean;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$10;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Design/ContextualActionModeDesign;->containsItemSelection(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 128
    check-cast p1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/ContextualActionModeDesign$10;->invoke(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
