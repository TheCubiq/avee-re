.class public final Lcom/daaw/xi3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x2000000

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput v0, Lcom/daaw/xi3;->a:I

    return-void
.end method
