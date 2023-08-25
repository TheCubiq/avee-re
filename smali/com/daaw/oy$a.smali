.class public final Lcom/daaw/oy$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/oy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/daaw/oy;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/oy;

    invoke-direct {v0}, Lcom/daaw/oy;-><init>()V

    sput-object v0, Lcom/daaw/oy$a;->a:Lcom/daaw/oy;

    return-void
.end method

.method public static synthetic a()Lcom/daaw/oy;
    .locals 1

    sget-object v0, Lcom/daaw/oy$a;->a:Lcom/daaw/oy;

    return-object v0
.end method
