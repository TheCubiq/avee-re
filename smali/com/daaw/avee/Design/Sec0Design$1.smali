.class Lcom/daaw/avee/Design/Sec0Design$1;
.super Ljava/lang/Object;
.source "Sec0Design.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/Sec0Design;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Lcom/android/billingclient/api/Purchase;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/Sec0Design;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/Sec0Design;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/daaw/avee/Design/Sec0Design$1;->this$0:Lcom/daaw/avee/Design/Sec0Design;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/android/billingclient/api/Purchase;)Ljava/lang/Boolean;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 32
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 29
    check-cast p1, Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/Sec0Design$1;->invoke(Lcom/android/billingclient/api/Purchase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
