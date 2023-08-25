.class public Lcom/daaw/avee/SettingsActivity$a$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


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

    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$a$h;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4

    iget-object p1, p0, Lcom/daaw/avee/SettingsActivity$a$h;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-virtual {p1}, Landroid/preference/PreferenceFragment;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x1

    const v1, 0x7f0f0025

    const v2, 0x7f100202

    const-string v3, ""

    invoke-static {p1, v0, v1, v2, v3}, Lcom/daaw/lj0;->e(Landroid/app/FragmentManager;ZIILjava/lang/String;)V

    return v0
.end method
