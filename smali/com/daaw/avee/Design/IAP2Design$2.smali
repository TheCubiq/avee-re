.class Lcom/daaw/avee/Design/IAP2Design$2;
.super Ljava/lang/Object;
.source "IAP2Design.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/IAP2Design;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR2$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/IAP2Design;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$2;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;)Ljava/lang/Boolean;
    .locals 0

    .line 117
    sget-boolean p2, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    if-nez p2, :cond_0

    .line 118
    iget-object p2, p0, Lcom/daaw/avee/Design/IAP2Design$2;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-static {p2, p1}, Lcom/daaw/avee/Design/IAP2Design;->access$200(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/ContextData;)V

    const/4 p1, 0x1

    .line 119
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 120
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 114
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/IAP2Design$2;->invoke(Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
