.class Lcom/daaw/avee/SettingsActivity$SettingsFragment$3;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


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

    .line 157
    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$3;->this$0:Lcom/daaw/avee/SettingsActivity$SettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 0

    .line 161
    sget-object p1, Lcom/daaw/avee/SettingsActivity;->onPrefAppThemeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
