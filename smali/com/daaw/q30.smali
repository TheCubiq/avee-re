.class public Lcom/daaw/q30;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/q30$c;,
        Lcom/daaw/q30$b;,
        Lcom/daaw/q30$a;,
        Lcom/daaw/q30$d;,
        Lcom/daaw/q30$e;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final a:Lcom/daaw/q30$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/q30$c;

    invoke-direct {v0}, Lcom/daaw/q30$c;-><init>()V

    :goto_0
    sput-object v0, Lcom/daaw/q30;->a:Lcom/daaw/q30$e;

    goto :goto_1

    :cond_0
    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/daaw/q30$b;

    invoke-direct {v0}, Lcom/daaw/q30$b;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/q30$a;

    invoke-direct {v0}, Lcom/daaw/q30$a;-><init>()V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static a(Landroid/app/Fragment;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/daaw/q30;->a:Lcom/daaw/q30$e;

    invoke-interface {v0, p0, p1}, Lcom/daaw/q30$e;->a(Landroid/app/Fragment;Z)V

    return-void
.end method
