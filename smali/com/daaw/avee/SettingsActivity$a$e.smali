.class public Lcom/daaw/avee/SettingsActivity$a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/SettingsActivity$a;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/avee/SettingsActivity$a;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/SettingsActivity$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$a$e;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    instance-of p1, p2, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/avee/SettingsActivity$a$e;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-virtual {v0}, Landroid/preference/PreferenceFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "pref_disableHeaderAds"

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/j5;->Q(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
