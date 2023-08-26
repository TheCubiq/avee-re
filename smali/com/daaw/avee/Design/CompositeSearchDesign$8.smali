.class Lcom/daaw/avee/Design/CompositeSearchDesign$8;
.super Ljava/lang/Object;
.source "CompositeSearchDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/CompositeSearchDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/daaw/avee/Design/CompositeSearchDesign$8;->this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 154
    invoke-static {}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->getInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 157
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->onUpdateSearchOptions(IZLjava/lang/String;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 151
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/CompositeSearchDesign$8;->invoke(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method
