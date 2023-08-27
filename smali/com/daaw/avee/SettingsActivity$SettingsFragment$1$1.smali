.class Lcom/daaw/avee/SettingsActivity$SettingsFragment$1$1;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;->onPreferenceClick(Landroid/preference/Preference;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1$1;->this$1:Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 105
    iget-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1$1;->this$1:Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;

    iget-object p1, p1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    iget-object p2, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1$1;->this$1:Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;

    iget-object p2, p2, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-virtual {p2}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->resetSettings(Landroid/content/Context;)V

    return-void
.end method
