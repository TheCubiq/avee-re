.class public final Lcom/daaw/pa3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "gads:timeout_for_app_set_id_info_gmscore:enabled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/pa3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:timeout_for_app_set_id_info_gmscore:millis"

    const-wide/16 v1, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/pa3;->b:Lcom/daaw/ma3;

    return-void
.end method
