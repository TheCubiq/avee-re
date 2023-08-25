.class public final Lcom/daaw/bi4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ci4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ci4;

    invoke-direct {v0}, Lcom/daaw/ci4;-><init>()V

    sput-object v0, Lcom/daaw/bi4;->a:Lcom/daaw/ci4;

    return-void
.end method

.method public static bridge synthetic a()Lcom/daaw/ci4;
    .locals 1

    sget-object v0, Lcom/daaw/bi4;->a:Lcom/daaw/ci4;

    return-object v0
.end method
