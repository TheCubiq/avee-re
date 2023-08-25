.class public final Lcom/daaw/pb3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:pan:experiment_id"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/pb3;->a:Lcom/daaw/ma3;

    return-void
.end method
