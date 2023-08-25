.class public final Lcom/daaw/xv4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/yv4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/yv4;

    invoke-direct {v0}, Lcom/daaw/yv4;-><init>()V

    sput-object v0, Lcom/daaw/xv4;->a:Lcom/daaw/yv4;

    return-void
.end method

.method public static bridge synthetic a()Lcom/daaw/yv4;
    .locals 1

    sget-object v0, Lcom/daaw/xv4;->a:Lcom/daaw/yv4;

    return-object v0
.end method
