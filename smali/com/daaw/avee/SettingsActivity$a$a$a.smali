.class public Lcom/daaw/avee/SettingsActivity$a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/SettingsActivity$a$a;->onPreferenceClick(Landroid/preference/Preference;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/SettingsActivity$a$a;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/SettingsActivity$a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$a$a$a;->p:Lcom/daaw/avee/SettingsActivity$a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/avee/SettingsActivity$a$a$a;->p:Lcom/daaw/avee/SettingsActivity$a$a;

    iget-object p1, p1, Lcom/daaw/avee/SettingsActivity$a$a;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-virtual {p1}, Landroid/preference/PreferenceFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/SettingsActivity$a;->d(Landroid/content/Context;)V

    return-void
.end method
