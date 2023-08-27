.class Lcom/daaw/avee/SettingsActivity$SettingsFragment$11;
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

    .line 287
    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$11;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .line 293
    sget-object p1, Lcom/daaw/avee/SettingsActivity;->onEulaAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/ContextData;

    iget-object v1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$11;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-virtual {v1}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
