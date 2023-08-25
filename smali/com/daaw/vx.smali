.class public Lcom/daaw/vx;
.super Lcom/daaw/lj0;
.source ""


# static fields
.field public static v:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/vx;",
            ">;"
        }
    .end annotation
.end field

.field public static w:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/vx;",
            ">;"
        }
    .end annotation
.end field

.field public static x:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/vx;",
            ">;"
        }
    .end annotation
.end field

.field public static y:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/vx;->v:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/vx;->w:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/vx;->x:Lcom/daaw/qw1;

    const-string v0, "EulaDialog"

    sput-object v0, Lcom/daaw/vx;->y:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lj0;-><init>()V

    return-void
.end method

.method public static i(Lcom/daaw/al;Z)V
    .locals 4

    new-instance p1, Lcom/daaw/vx;

    invoke-direct {p1}, Lcom/daaw/vx;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "keyShowCloseButton"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "licenseResId"

    const v3, 0x7f0f001e

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "titleResId"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "extraUrl"

    const-string v3, ""

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p1, v2}, Landroid/app/DialogFragment;->setCancelable(Z)V

    sget-object v0, Lcom/daaw/vx;->y:Ljava/lang/String;

    invoke-static {p0, p1, v0}, Lcom/daaw/gr1;->l(Lcom/daaw/al;Landroid/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public h(Landroid/app/AlertDialog$Builder;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/lj0;->h(Landroid/app/AlertDialog$Builder;)V

    new-instance v0, Lcom/daaw/vx$a;

    invoke-direct {v0, p0}, Lcom/daaw/vx$a;-><init>(Lcom/daaw/vx;)V

    const v1, 0x7f1000cc

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance v0, Lcom/daaw/vx$b;

    invoke-direct {v0, p0}, Lcom/daaw/vx$b;-><init>(Lcom/daaw/vx;)V

    const v1, 0x7f1000cb

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    sget-object p1, Lcom/daaw/vx;->x:Lcom/daaw/qw1;

    invoke-virtual {p1, p0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method
