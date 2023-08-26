.class Lcom/daaw/avee/Design/AdsDesign$2;
.super Ljava/lang/Object;
.source "AdsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AdsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AdsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AdsDesign;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/daaw/avee/Design/AdsDesign$2;->this$0:Lcom/daaw/avee/Design/AdsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/Design/AdsDesign$2;->this$0:Lcom/daaw/avee/Design/AdsDesign;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Design/AdsDesign;->onPurchasedSuccessfully(Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 73
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AdsDesign$2;->invoke(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
