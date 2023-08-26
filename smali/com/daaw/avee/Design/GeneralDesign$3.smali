.class Lcom/daaw/avee/Design/GeneralDesign$3;
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

    .line 121
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$3;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Legal/EulaDialog;)V
    .locals 2

    .line 124
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    .line 125
    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_acceptedEula:I

    const v1, 0x313ed

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 121
    check-cast p1, Lcom/daaw/avee/comp/Legal/EulaDialog;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign$3;->invoke(Lcom/daaw/avee/comp/Legal/EulaDialog;)V

    return-void
.end method
