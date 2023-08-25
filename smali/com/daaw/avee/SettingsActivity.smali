.class public Lcom/daaw/avee/SettingsActivity;
.super Lcom/daaw/m4;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/SettingsActivity$a;
    }
.end annotation


# static fields
.field public static q:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static r:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static s:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static t:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static u:Lcom/daaw/pw1;

.field public static v:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/SettingsActivity;->q:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/SettingsActivity;->r:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/SettingsActivity;->s:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/SettingsActivity;->t:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/SettingsActivity;->u:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/SettingsActivity;->v:Lcom/daaw/qw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/m4;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/m4;->b()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x7f100046

    invoke-virtual {p0, v1}, Landroid/preference/PreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/i0;->x(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/i0;->s(Z)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/m4;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c00cf

    invoke-virtual {p0, p1}, Lcom/daaw/m4;->setContentView(I)V

    const p1, 0x7f0902b7

    invoke-virtual {p0, p1}, Landroid/preference/PreferenceActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/daaw/m4;->c(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Lcom/daaw/avee/SettingsActivity;->d()V

    invoke-virtual {p0}, Landroid/preference/PreferenceActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    new-instance v0, Lcom/daaw/avee/SettingsActivity$a;

    invoke-direct {v0}, Lcom/daaw/avee/SettingsActivity$a;-><init>()V

    const v1, 0x7f0900d4

    invoke-virtual {p1, v1, v0}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    invoke-static {p0}, Lcom/daaw/as0;->e(Landroid/app/Activity;)V

    const/4 p1, 0x1

    return p1
.end method
