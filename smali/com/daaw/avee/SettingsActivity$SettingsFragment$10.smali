.class Lcom/daaw/avee/SettingsActivity$SettingsFragment$10;
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

    .line 274
    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$10;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 0

    .line 278
    sget-object p1, Lcom/daaw/avee/SettingsActivity;->onClearCacheAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    const/4 p1, 0x1

    return p1
.end method
