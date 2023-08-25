.class public final Lcom/daaw/mb3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:safe_browsing:api_key"

    const-string v1, "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/mb3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:safe_browsing:debug"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/mb3;->b:Lcom/daaw/ma3;

    return-void
.end method
