.class public final Lcom/daaw/ab3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;

.field public static final e:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "gads:js_flags:mf"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ab3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:js_flags:update_interval"

    const-wide/32 v2, 0x2932e00

    invoke-static {v0, v2, v3}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ab3;->b:Lcom/daaw/ma3;

    const-string v0, "gads:persist_js_flag:ars"

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ab3;->c:Lcom/daaw/ma3;

    const-string v0, "gads:persist_js_flag:as"

    invoke-static {v0, v2}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ab3;->d:Lcom/daaw/ma3;

    const-string v0, "gads:persist_js_flag:scar"

    invoke-static {v0, v1}, Lcom/daaw/ma3;->d(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ab3;->e:Lcom/daaw/ma3;

    return-void
.end method
