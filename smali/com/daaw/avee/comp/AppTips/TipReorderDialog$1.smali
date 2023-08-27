.class Lcom/daaw/avee/comp/AppTips/TipReorderDialog$1;
.super Ljava/lang/Object;
.source "TipReorderDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AppTips/TipReorderDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AppTips/TipReorderDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AppTips/TipReorderDialog;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/daaw/avee/comp/AppTips/TipReorderDialog$1;->this$0:Lcom/daaw/avee/comp/AppTips/TipReorderDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 39
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_tipShow_reorder:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method
