.class Lcom/daaw/avee/SettingsActivity$SettingsFragment$5;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/SettingsActivity$SettingsFragment;->addMyResetListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;


# direct methods
.method constructor <init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$5;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4

    .line 186
    iget-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$5;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-virtual {p1}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x1

    const v1, 0x7f0f0020

    const v2, 0x7f100127

    const-string v3, ""

    invoke-static {p1, v0, v1, v2, v3}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    return v0
.end method
