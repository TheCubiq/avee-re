.class Lcom/daaw/avee/Design/GeneralDesign$4;
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
        "Lcom/daaw/avee/comp/Legal/EulaDialog;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/GeneralDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$4;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Legal/EulaDialog;)V
    .locals 3

    .line 132
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 133
    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_acceptedEula:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 135
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->doExit()V

    .line 140
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Legal/EulaDialog;->getActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 142
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 129
    check-cast p1, Lcom/daaw/avee/comp/Legal/EulaDialog;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign$4;->invoke(Lcom/daaw/avee/comp/Legal/EulaDialog;)V

    return-void
.end method
