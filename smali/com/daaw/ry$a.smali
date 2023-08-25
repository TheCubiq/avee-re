.class public final Lcom/daaw/ry$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/daaw/ry;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ry;

    invoke-direct {v0}, Lcom/daaw/ry;-><init>()V

    sput-object v0, Lcom/daaw/ry$a;->a:Lcom/daaw/ry;

    return-void
.end method

.method public static synthetic a()Lcom/daaw/ry;
    .locals 1

    sget-object v0, Lcom/daaw/ry$a;->a:Lcom/daaw/ry;

    return-object v0
.end method
