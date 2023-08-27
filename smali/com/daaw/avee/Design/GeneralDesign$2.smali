.class Lcom/daaw/avee/Design/GeneralDesign$2;
.super Ljava/lang/Object;
.source "GeneralDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/GeneralDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/GeneralDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$2;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 3

    .line 101
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 102
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_acceptedEula:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 104
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$2;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/GeneralDesign;->access$000(Lcom/daaw/avee/Design/GeneralDesign;Landroid/app/Activity;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 98
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign$2;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
