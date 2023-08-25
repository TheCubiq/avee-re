.class public final Lcom/daaw/rp6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/sp6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sp6;

    invoke-direct {v0}, Lcom/daaw/sp6;-><init>()V

    sput-object v0, Lcom/daaw/rp6;->a:Lcom/daaw/sp6;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/daaw/rp6;->a:Lcom/daaw/sp6;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/sp6;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/daaw/rp6;->a:Lcom/daaw/sp6;

    invoke-virtual {v0}, Lcom/daaw/sp6;->b()Z

    move-result v0

    return v0
.end method
