.class public Lcom/daaw/avee/SettingsActivity$a$g;
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

    iput-object p1, p0, Lcom/daaw/avee/SettingsActivity$a$g;->a:Lcom/daaw/avee/SettingsActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 0

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/j5;->S()V

    const/4 p1, 0x1

    return p1
.end method
