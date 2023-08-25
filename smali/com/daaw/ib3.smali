.class public final Lcom/daaw/ib3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:log:verbose_enabled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ib3;->a:Lcom/daaw/ma3;

    return-void
.end method
